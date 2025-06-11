package tpo.seminario.breakbuddy.persistence

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.WriteBatch
import tpo.seminario.breakbuddy.util.DerivedGroupEntry
import tpo.seminario.breakbuddy.util.Organization
import tpo.seminario.breakbuddy.util.UniqueHobbyEntry
import tpo.seminario.breakbuddy.util.groups.MembershipStatus
import java.util.UUID

class OrganizationRepository {
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private val userRepo = UserRepository()
    private val TAG = "OrganizationRepository"

    /**
     * Data class local para representar la creación de un nuevo grupo derivado pendiente.
     */
    private data class PendingNewGroup(
        val hobby: String,
        val ownerUid: String
    )

    /**
     * Crea una nueva organización en /organizations/{orgId}, incluyendo múltiples miembros iniciales.
     * - name: nombre de la organización (debe ser único; se valida antes).
     * - emails: lista de correos de usuarios a agregar además del owner. Deben existir en /users.
     * onSuccess devuelve el código de invitación generado.
     */
    fun createOrganization(
        name: String,
        emails: List<String>,
        onSuccess: (String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser ?: run {
            onFailure("Usuario no autenticado")
            return
        }
        val ownerUid = currentUser.uid
        val ownerEmail = currentUser.email ?: ""
        val orgNameTrim = name.trim()
        if (orgNameTrim.isEmpty()) {
            onFailure("El nombre de la organización no puede estar vacío")
            return
        }

        // 1) Validar unicidad de nombre: consultar si ya existe una org con ese nombre
        db.collection("organizations")
            .whereEqualTo("name", orgNameTrim)
            .get()
            .addOnSuccessListener { snap ->
                if (!snap.isEmpty) {
                    onFailure("Ya existe una organización con ese nombre")
                    return@addOnSuccessListener
                }
                // 2) Validar que todos los emails existen en /users
                // Excluimos ownerEmail de la lista para no validar dos veces si está incluido.
                val emailsToValidate = emails.map { it.trim().lowercase() }
                    .filter { it.isNotEmpty() && it != ownerEmail }
                // Si se ingresa ownerEmail en la lista, lo eliminamos para evitar duplicados.
                userRepo.validateEmailsExist(
                    emails = emailsToValidate,
                    onComplete = { existents, notExistents ->
                        if (notExistents.isNotEmpty()) {
                            onFailure("Los siguientes correos no están registrados: ${notExistents.joinToString(", ")}")
                            return@validateEmailsExist
                        }
                        // 3) Convertir esos emails a UIDs
                        userRepo.fetchUidsForEmails(
                            emails = emailsToValidate,
                            onComplete = { emailToUidMap, missing2 ->
                                // missing2 debería estar vacío porque ya validamos
                                if (missing2.isNotEmpty()) {
                                    onFailure("Error interno validando usuarios: ${missing2.joinToString(", ")}")
                                    return@fetchUidsForEmails
                                }
                                // 4) Generar código único para la organización
                                generateUniqueOrgCode { code ->
                                    if (code == null) {
                                        onFailure("Error generando código de organización")
                                        return@generateUniqueOrgCode
                                    }
                                    // 5) Construir listas memberIds y emails
                                    val otherUids = emailsToValidate.mapNotNull { email -> emailToUidMap[email] }
                                    val memberIds = (listOf(ownerUid) + otherUids).distinct()
                                    val emailsList = (listOf(ownerEmail) + emailsToValidate).distinct()

                                    val orgId = UUID.randomUUID().toString()
                                    val nowField = FieldValue.serverTimestamp()
                                    // 6) Preparar data map
                                    val orgData = hashMapOf<String, Any?>(
                                        "name" to orgNameTrim,
                                        "code" to code,
                                        "type" to "organization",
                                        "ownerUid" to ownerUid,
                                        "memberIds" to memberIds,
                                        "emails" to emailsList,
                                        "memberCount" to memberIds.size,
                                        "createdAt" to nowField,
                                        "updatedAt" to nowField,
                                        // Inicializar lógica futura
                                        "hobbiesUnicos" to emptyList<Map<String, Any>>(),
                                        "gruposDerivados" to emptyList<Map<String, Any>>()
                                    )
                                    // 7) Guardar en Firestore
                                    db.collection("organizations")
                                        .document(orgId)
                                        .set(orgData)
                                        .addOnSuccessListener {
                                            // 1) Batch userProfiles:
                                            val batch = db.batch()
                                            for (uid in memberIds) {
                                                val uRef = db.collection("userProfiles").document(uid)
                                                batch.set(uRef, mapOf(
                                                    "organizationIds" to FieldValue.arrayUnion(orgId),
                                                    "updatedAt" to FieldValue.serverTimestamp()
                                                ), SetOptions.merge())
                                            }
                                            batch.commit()
                                                .addOnSuccessListener {
                                                    // 1) Leer hobbies de cada miembro
                                                    fetchHobbiesForMembers(memberIds) { hobbiesMap, error ->
                                                        if (error != null || hobbiesMap == null) {
                                                            onFailure(error ?: "Error leyendo hobbies iniciales")
                                                            return@fetchHobbiesForMembers
                                                        }

                                                        // 2) Contar ocurrencias y mapear hobby → list<uid>
                                                        val hobbyToUids = mutableMapOf<String, MutableList<String>>()
                                                        hobbiesMap.forEach { (uid, hobbies) ->
                                                            hobbies.forEach { hobby ->
                                                                hobbyToUids.getOrPut(hobby) { mutableListOf() }.add(uid)
                                                            }
                                                        }

                                                        val derivedEntries = mutableListOf<DerivedGroupEntry>()
                                                        val uniqueEntries  = mutableListOf<UniqueHobbyEntry>()
                                                        val pendingCreations = mutableListOf<Pair<String, List<String>>>()

                                                        // Separar hobbies con ≥2 miembros y únicos
                                                        hobbyToUids.forEach { (hobby, uids) ->
                                                            if (uids.size >= 2) {
                                                                pendingCreations += hobby to uids
                                                            } else {
                                                                uniqueEntries += UniqueHobbyEntry(hobby = hobby, userId = uids.first())
                                                            }
                                                        }

                                                        // 3) Crear grupos derivados en paralelo
                                                        var remaining = pendingCreations.size
                                                        if (remaining == 0) {
                                                            // No hay grupos derivados que crear
                                                            commitOrgUpdate(orgId, derivedEntries, uniqueEntries, code, onSuccess, onFailure)
                                                        } else {
                                                            pendingCreations.forEach { (hobby, uids) ->
                                                                createDerivedGroup( orgId, orgData["name"] as String, hobby, uids, ownerUid) { groupId ->
                                                                    if (groupId != null) {
                                                                        derivedEntries += DerivedGroupEntry(hobby = hobby, groupId = groupId)
                                                                    }
                                                                    if (--remaining == 0) {
                                                                        commitOrgUpdate(orgId, derivedEntries, uniqueEntries, code, onSuccess, onFailure)
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                .addOnFailureListener { e ->
                                                    onFailure("Org creada, pero fallo al actualizar perfiles: ${e.message}")
                                                }

                                        }
                                        .addOnFailureListener { e ->
                                            onFailure("Error creando organización: ${e.message}")
                                        }
                                }
                            },
                            onError = { e2 ->
                                onFailure("Error obteniendo UIDs de usuarios: ${e2.message}")
                            }
                        )
                    },
                    onError = { e ->
                        onFailure("Error validando correos: ${e.message}")
                    }
                )
            }
            .addOnFailureListener { e ->
                onFailure("Error comprobando nombre de organización: ${e.message}")
            }
    }

    /**
     * Genera un código único para organizaciones. Reintenta si existe colisión.
     */
    private fun generateUniqueOrgCode(callback: (String?) -> Unit) {
        val code = generateRandomCode()
        db.collection("organizations")
            .whereEqualTo("code", code)
            .get()
            .addOnSuccessListener { docs ->
                if (docs.isEmpty) {
                    callback(code)
                } else {
                    // reintentar
                    generateUniqueOrgCode(callback)
                }
            }
            .addOnFailureListener {
                callback(null)
            }
    }

    private fun generateRandomCode(): String {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
        return (1..6).map { chars.random() }.joinToString("")
    }

    /**
     * Agrega un miembro a una organización existente por email,
     * y sincroniza sus hobbies con los grupos derivados y hobbies únicos.
     */
    /**
     * Agrega un miembro a una organización existente por email,
     * y sincroniza sus hobbies con los grupos derivados y hobbies únicos.
     */
    fun addMemberByEmail(
        orgId: String,
        email: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val newEmail = email.trim().lowercase()
        if (newEmail.isEmpty()) {
            onFailure("Email vacío"); return
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(newEmail).matches()) {
            onFailure("Email inválido: $newEmail"); return
        }

        // 0) Resolver UID del nuevo miembro
        userRepo.fetchUidsForEmails(
            emails = listOf(newEmail),
            onComplete = { emailToUid, missing ->
                if (missing.isNotEmpty()) {
                    onFailure("El email $newEmail no está registrado"); return@fetchUidsForEmails
                }
                val newUid = emailToUid[newEmail]!!

                // 1) Leer hobbies del nuevo miembro con tu método existente
                userRepo.getUserHobbiesProfile(
                    uid = newUid,
                    onSuccess = { newHobbies ->
                        // 2) Leer estado de la organización
                        val orgRef = db.collection("organizations").document(orgId)
                        orgRef.get().addOnSuccessListener { orgSnap ->
                            if (!orgSnap.exists()) {
                                onFailure("Organización no encontrada"); return@addOnSuccessListener
                            }
                            val orgName = orgSnap.getString("name").orEmpty()
                            @Suppress("UNCHECKED_CAST")
                            val derivedMaps = (orgSnap.get("gruposDerivados") as? List<Map<String, Any>>) ?: emptyList()
                            @Suppress("UNCHECKED_CAST")
                            val uniqueMaps  = (orgSnap.get("hobbiesUnicos")   as? List<Map<String, Any>>) ?: emptyList()

                            // Reconstruir listas mutables
                            val derived = derivedMaps.map {
                                DerivedGroupEntry(it["hobby"] as String, it["groupId"] as String)
                            }.toMutableList()
                            val unique = uniqueMaps.map {
                                UniqueHobbyEntry(it["hobby"] as String, it["userId"] as String)
                            }.toMutableList()

                            // 3) Arrancar batch para la org
                            val batch = db.batch()
                            batch.update(orgRef,
                                "memberIds",   FieldValue.arrayUnion(newUid),
                                "emails",      FieldValue.arrayUnion(newEmail),
                                "memberCount", FieldValue.increment(1),
                                "updatedAt",   FieldValue.serverTimestamp()
                            )

                            // 4) Procesar hobbies del nuevo miembro
                            data class PendingNewGroup(val hobby: String, val ownerUid: String)
                            val pending = mutableListOf<PendingNewGroup>()
                            for (hobby in newHobbies) {
                                // a) Grupo derivado existente?
                                val existing = derived.find { it.hobby == hobby }
                                if (existing != null) {
                                    val grpRef = db.collection("groups").document(existing.groupId)
                                    batch.update(grpRef,
                                        "memberIds",   FieldValue.arrayUnion(newUid),
                                        "emails",      FieldValue.arrayUnion(newEmail),
                                        "memberCount", FieldValue.increment(1),
                                        "updatedAt",   FieldValue.serverTimestamp()
                                    )
                                    continue
                                }
                                // b) Hobby en únicos?
                                val uEntry = unique.find { it.hobby == hobby }
                                if (uEntry != null) {
                                    pending += PendingNewGroup(hobby = hobby, ownerUid = uEntry.userId)
                                    unique.remove(uEntry)
                                    continue
                                }
                                // c) Hobby completamente nuevo
                                unique += UniqueHobbyEntry(hobby = hobby, userId = newUid)
                            }

                            // 5) Crear grupos pendientes y luego aplicar batch de org
                            if (pending.isEmpty()) {
                                applyOrgUpdates(orgRef, derived, unique, batch, newUid, newEmail, onSuccess, onFailure)
                            } else {
                                var remaining = pending.size
                                for (p in pending) {
                                    createDerivedGroup(
                                        orgId     = orgId,
                                        orgName   = orgName,
                                        hobby     = p.hobby,
                                        memberIds = listOf(p.ownerUid, newUid),
                                        ownerUid  = p.ownerUid
                                    ) { newGroupId ->
                                        if (newGroupId != null) {
                                            derived += DerivedGroupEntry(hobby = p.hobby, groupId = newGroupId)
                                        }
                                        if (--remaining == 0) {
                                            applyOrgUpdates(
                                                orgRef, derived, unique, batch,
                                                newUid, newEmail, onSuccess, onFailure
                                            )
                                        }
                                    }
                                }
                            }

                        }.addOnFailureListener { e ->
                            onFailure("Error leyendo organización: ${e.message}")
                        }
                    },
                    onFailure = { e ->
                        onFailure("Error leyendo hobbies del usuario: ${e.message}")
                    }
                )
            },
            onError = { e ->
                onFailure("Error buscando UID para $newEmail: ${e.message}")
            }
        )
    }


    /**
     * Aplica los cambios a /organizations/{orgId},
     * añade newUid y newEmail al array memberIds/emails,
     * y sincroniza los arreglos derived/unique.
     */
    private fun applyOrgUpdates(
        orgRef: DocumentReference,
        derived: List<DerivedGroupEntry>,
        unique: List<UniqueHobbyEntry>,
        batch: WriteBatch,
        newUid: String,
        newEmail: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        // 1) Actualizar arrays derivados
        val derivedMaps = derived.map { mapOf("hobby" to it.hobby, "groupId" to it.groupId) }
        batch.update(orgRef, "gruposDerivados", derivedMaps)

        // 2) Actualizar hobbiesUnicos
        val uniqueMaps = unique.map { mapOf("hobby" to it.hobby, "userId" to it.userId) }
        batch.update(orgRef, "hobbiesUnicos", uniqueMaps)

        // 3) Commit del batch de grupos y org
        batch.commit()
            .addOnSuccessListener {
                // 4) CORREGIDO: Actualizar userProfile del usuario AGREGADO (newUid), no del usuario actual
                db.collection("userProfiles").document(newUid)
                    .set(mapOf(
                        "organizationIds" to FieldValue.arrayUnion(orgRef.id),
                        "updatedAt" to FieldValue.serverTimestamp()
                    ), SetOptions.merge())
                    .addOnSuccessListener { onSuccess() }
                    .addOnFailureListener { e ->
                        onFailure("Usuario agregado a org, pero fallo actualizar su perfil: ${e.message}")
                    }
            }
            .addOnFailureListener { e ->
                onFailure("Error sincronizando organización: ${e.message}")
            }
    }

    /**
     * Método para que un miembro salga de la organización.
     */
    fun leaveOrganization(
        orgId: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser ?: run {
            onFailure("Usuario no autenticado"); return
        }
        val uid = currentUser.uid
        val email = currentUser.email ?: ""
        val orgRef = db.collection("organizations").document(orgId)

        db.runTransaction { trans ->
            val snap = trans.get(orgRef)
            if (!snap.exists()) throw Exception("Organización no existe")
            val memberIds = (snap.get("memberIds") as? List<String>) ?: emptyList()
            if (!memberIds.contains(uid)) throw Exception("No eres miembro de esta organización")
            val newMemberIds = memberIds.filter { it != uid }
            // emails list y eliminación por índice o valor:
            val emailsList = (snap.get("emails") as? List<String>)?.toMutableList() ?: mutableListOf()
            // Quitar email del usuario (por coincidencia exacta):
            emailsList.removeAll { it.equals(email, ignoreCase = true) }
            if (newMemberIds.isEmpty()) {
                trans.delete(orgRef)
                return@runTransaction null
            }
            var newOwnerUid = snap.getString("ownerUid")!!
            if (newOwnerUid == uid) {
                newOwnerUid = newMemberIds.first()
            }
            trans.update(orgRef, mapOf(
                "memberIds" to newMemberIds,
                "emails" to emailsList,
                "memberCount" to newMemberIds.size,
                "ownerUid" to newOwnerUid,
                "updatedAt" to FieldValue.serverTimestamp()
            ))
            null
        }
            .addOnSuccessListener {
                // CORREGIDO: Actualizar el perfil del usuario que sale (currentUser.uid)
                db.collection("userProfiles").document(uid)
                    .set(mapOf(
                        "organizationIds" to FieldValue.arrayRemove(orgId),
                        "updatedAt" to FieldValue.serverTimestamp()
                    ), SetOptions.merge())
                    .addOnSuccessListener {
                        // 2) Limpiar hobbiesUnicos en la organización
                        val uid = currentUser.uid
                        db.collection("organizations").document(orgId)
                            .get()
                            .addOnSuccessListener { orgSnap ->
                                @Suppress("UNCHECKED_CAST")
                                val uniqueMaps = (orgSnap.get("hobbiesUnicos") as? List<Map<String, Any>>)
                                    ?.filter { it["userId"] != uid }
                                    ?: emptyList()
                                // 3) Actualizamos solo ese campo
                                db.collection("organizations").document(orgId)
                                    .update(
                                        "hobbiesUnicos", uniqueMaps,
                                        "updatedAt", FieldValue.serverTimestamp()
                                    )
                                    .addOnSuccessListener { onSuccess() }
                                    .addOnFailureListener { e ->
                                        onFailure("Saliste, pero no limpio hobbiesUnicos: ${e.message}")
                                    }
                            }
                            .addOnFailureListener { e ->
                                onFailure("Saliste, pero no pude recargar org: ${e.message}")
                            }
                    }
                    .addOnFailureListener { e -> onFailure("Saliste de la organización, pero fallo actualizar perfil: ${e.message}") }
            }
            .addOnFailureListener { e -> onFailure("Error saliendo de organización: ${e.message}") }
    }

    /**
     * Obtener organizaciones del usuario (ya tenías getUserOrganizations).
     * Asegúrate de que use el mapeo correcto.
     */
    fun getUserOrganizations(
        onSuccess: (List<Organization>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser ?: run {
            onFailure("Usuario no autenticado"); return
        }
        val uid = currentUser.uid
        db.collection("organizations")
            .whereArrayContains("memberIds", uid)
            .get()
            .addOnSuccessListener { snap ->
                val list = snap.documents.mapNotNull { doc ->
                    try {
                        val org = doc.toObject(Organization::class.java)
                        if (org != null) {
                            val isOwner = (doc.getString("ownerUid") == uid)
                            val memberIds = (doc.get("memberIds") as? List<String>) ?: emptyList()
                            val membershipStatus = if (memberIds.contains(uid)) MembershipStatus.MEMBER else MembershipStatus.NOT_MEMBER
                            org.copy(
                                id = doc.id,
                                isOwner = isOwner,
                                membershipStatus = membershipStatus,
                                memberCount = memberIds.size
                            )
                        } else null
                    } catch (e: Exception) {
                        null
                    }
                }
                onSuccess(list)
            }
            .addOnFailureListener { e -> onFailure("Error cargando organizaciones: ${e.message}") }
    }

    /**
     * Obtener detalles de una organización por id (ya tenías getOrganizationById).
     * Revisa que se ajuste al nuevo esquema de campos.
     */
    fun getOrganizationById(
        orgId: String,
        onSuccess: (Organization) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser ?: run {
            onFailure("Usuario no autenticado"); return
        }
        val uid = currentUser.uid
        val docRef = db.collection("organizations").document(orgId)
        docRef.get().addOnSuccessListener { doc ->
            if (!doc.exists()) {
                onFailure("Organización no encontrada")
                return@addOnSuccessListener
            }
            val memberIds = (doc.get("memberIds") as? List<String>) ?: emptyList()
            if (!memberIds.contains(uid)) {
                onFailure("No eres miembro de esta organización")
                return@addOnSuccessListener
            }
            val org = doc.toObject(Organization::class.java)
            if (org != null) {
                val isOwner = (doc.getString("ownerUid") == uid)
                onSuccess(org.copy(id = doc.id, isOwner = isOwner, membershipStatus = MembershipStatus.MEMBER, memberCount = memberIds.size))
            } else {
                onFailure("Error mapeando organización")
            }
        }.addOnFailureListener { e -> onFailure("Error leyendo organización: ${e.message}") }
    }

    /**
     * Unirse a organización por código: ya tenías joinOrganizationByCode, ajústalo para usar addMemberByEmail si lo prefieres.
     */
    fun joinOrganizationByCode(
        code: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser ?: run {
            onFailure("Usuario no autenticado"); return
        }
        if (code.isBlank()) {
            onFailure("El código no puede estar vacío"); return
        }

        db.collection("organizations")
            .whereEqualTo("code", code)
            .get()
            .addOnSuccessListener { docs ->
                when {
                    docs.isEmpty -> onFailure("Código de organización inválido")
                    docs.size() > 1 -> onFailure("Error: código duplicado")
                    else -> {
                        val doc = docs.documents.first()
                        val orgId = doc.id
                        val email = currentUser.email ?: ""

                        // Usar addMemberByEmail para mantener consistencia en la lógica
                        // La actualización del userProfile ya se maneja dentro de addMemberByEmail -> applyOrgUpdates
                        addMemberByEmail(orgId, email, onSuccess, onFailure)
                    }
                }
            }
            .addOnFailureListener { e -> onFailure("Error buscando organización: ${e.message}") }
    }

    private fun updateOrgArrays(
        orgRef: DocumentReference,
        derived: List<DerivedGroupEntry>,
        unique: List<UniqueHobbyEntry>
    ) {
        val derivedMaps = derived.map { mapOf("hobby" to it.hobby, "groupId" to it.groupId) }
        val uniqueMaps = unique.map { mapOf("hobby" to it.hobby, "userId" to it.userId) }

        orgRef.update(
            mapOf(
                "gruposDerivados" to derivedMaps,
                "hobbiesUnicos" to uniqueMaps,
                "updatedAt" to FieldValue.serverTimestamp()
            )
        ).addOnSuccessListener {
            Log.d(TAG, "Arrays de organización actualizados correctamente")
        }.addOnFailureListener { e ->
            Log.e(TAG, "Error actualizando arrays: ${e.message}")
        }
    }

    /**
     * Actualizar nombre u otros campos si lo deseas.
     * Ten en cuenta validaciones de unicidad si cambias nombre.
     */
    fun updateOrganizationName(
        orgId: String,
        newName: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val nameTrim = newName.trim()
        if (nameTrim.isEmpty()) {
            onFailure("El nombre no puede estar vacío"); return
        }
        // Validar unicidad:
        db.collection("organizations")
            .whereEqualTo("name", nameTrim)
            .get()
            .addOnSuccessListener { snap ->
                // Si existe otro documento con ese nombre y distinto ID, rechazar
                val conflict = snap.documents.any { it.id != orgId }
                if (conflict) {
                    onFailure("Ya existe otra organización con ese nombre")
                    return@addOnSuccessListener
                }
                // Actualizar
                db.collection("organizations").document(orgId)
                    .update(
                        "name", nameTrim,
                        "updatedAt", FieldValue.serverTimestamp()
                    )
                    .addOnSuccessListener { onSuccess() }
                    .addOnFailureListener { e -> onFailure("Error actualizando nombre: ${e.message}") }
            }
            .addOnFailureListener { e -> onFailure("Error verificando nombre: ${e.message}") }
    }

    /**
     * Remueve a un miembro específico (memberUidToRemove) de la organización orgId.
     * Solo puede hacerlo el owner actual. memberEmailToRemove se usa para eliminar de la lista emails.
     */
    fun removeMemberFromOrganization(
        orgId: String,
        memberUidToRemove: String,
        memberEmailToRemove: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser ?: run {
            onFailure("Usuario no autenticado"); return
        }
        val currentUid = currentUser.uid
        val orgRef = db.collection("organizations").document(orgId)

        // 1) Transacción principal: remueve de memberIds, emails, memberCount, etc.
        db.runTransaction { trans ->
            val snap = trans.get(orgRef)
            if (!snap.exists()) throw Exception("Organización no existe")
            val ownerUid = snap.getString("ownerUid")
                ?: throw Exception("Falta ownerUid en organización")
            if (currentUid != ownerUid) throw Exception("Solo el administrador puede remover miembros")

            val memberIds = (snap.get("memberIds") as? List<String>) ?: emptyList()
            if (!memberIds.contains(memberUidToRemove))
                throw Exception("El usuario a remover no es miembro de la organización")

            // Nuevo array de IDs y emails
            val newMemberIds = memberIds.filter { it != memberUidToRemove }
            val newEmails = (snap.get("emails") as? List<String>)
                ?.filterNot { it.equals(memberEmailToRemove, ignoreCase = true) }
                ?: emptyList()

            // Actualizar o borrar doc si quedó vacío
            if (newMemberIds.isEmpty()) {
                trans.delete(orgRef)
            } else {
                trans.update(orgRef, mapOf(
                    "memberIds"    to newMemberIds,
                    "emails"       to newEmails,
                    "memberCount"  to newMemberIds.size,
                    "updatedAt"    to FieldValue.serverTimestamp()
                ))
            }
            null
        }
            .addOnSuccessListener {
                // 2) Actualiza userProfile del miembro removido
                db.collection("userProfiles").document(memberUidToRemove)
                    .set(mapOf(
                        "organizationIds" to FieldValue.arrayRemove(orgId),
                        "updatedAt"       to FieldValue.serverTimestamp()
                    ), SetOptions.merge())
                    .addOnSuccessListener {
                        // 3) Limpieza de hobbiesUnicos
                        db.collection("organizations").document(orgId)
                            .get()
                            .addOnSuccessListener { orgSnap ->
                                @Suppress("UNCHECKED_CAST")
                                val uniqueMaps = (orgSnap.get("hobbiesUnicos") as? List<Map<String, Any>>)
                                    ?.filter { it["userId"] != memberUidToRemove }
                                    ?: emptyList()
                                db.collection("organizations").document(orgId)
                                    .update(
                                        "hobbiesUnicos", uniqueMaps,
                                        "updatedAt", FieldValue.serverTimestamp()
                                    )
                                    .addOnSuccessListener { onSuccess() }
                                    .addOnFailureListener { e ->
                                        onFailure("Miembro removido, pero hobbiesUnicos no se limpió: ${e.message}")
                                    }
                            }
                            .addOnFailureListener { e ->
                                onFailure("Miembro removido, pero no pude recargar org: ${e.message}")
                            }
                    }
                    .addOnFailureListener { e ->
                        onFailure("Miembro removido, pero fallo actualizar perfil: ${e.message}")
                    }
            }
            .addOnFailureListener { e ->
                onFailure(e.message ?: "Error removiendo miembro de la organización")
            }
    }

    /**
     * Sincroniza los cambios de hobbies de un usuario en todas sus organizaciones.
     */
    fun syncUserHobbyChanges(
        uid: String,
        oldHobbies: List<String>,
        newHobbies: List<String>
    ) {
        val added   = newHobbies.filterNot { oldHobbies.contains(it) }
        val removed = oldHobbies.filterNot { newHobbies.contains(it) }

        getUserOrganizations(onSuccess = { orgs ->
            for (org in orgs) {
                // Reemplazamos dos llamadas por una sola que gestiona todo junto:
                processHobbyChangesInOrg(org.id, uid, added, removed)
            }
        }, onFailure = {
            Log.e("OrgRepo", "No pude obtener orgs para sync: $it")
        })
    }
    /**
     * Aplica en un solo flujo para una organización:
     * - Remueve de hobbiesUnicos los hobbies en `removed` para `uid`.
     * - Procesa todas las adiciones `added` (reusa la lógica de grupos derivados).
     *
     * Todo en un único snapshot de org y un único batch para actualizar la org.
     * Las creaciones de grupos derivados (nuevos) se hacen antes de ese batch,
     * y se recolectan en memoria para reescribir gruposDerivados.
     */
    private fun processHobbyChangesInOrg(
        orgId: String,
        uid: String,
        added: List<String>,
        removed: List<String>
    ) {
        val db = FirebaseFirestore.getInstance()
        val auth = FirebaseAuth.getInstance()
        val orgRef = db.collection("organizations").document(orgId)

        orgRef.get().addOnSuccessListener { snap ->
            val orgName = snap.getString("name").orEmpty()

            @Suppress("UNCHECKED_CAST")
            val derivedMaps = (snap.get("gruposDerivados") as? List<Map<String, Any>>) ?: emptyList()
            @Suppress("UNCHECKED_CAST")
            val uniqueMaps  = (snap.get("hobbiesUnicos")   as? List<Map<String, Any>>) ?: emptyList()

            // Reconstruir listas mutables
            val derivedList = derivedMaps.map {
                DerivedGroupEntry(it["hobby"] as String, it["groupId"] as String)
            }.toMutableList()
            val uniqueList  = uniqueMaps.map {
                UniqueHobbyEntry(it["hobby"] as String, it["userId"] as String)
            }.toMutableList()

            // 1) Remover hobbiesUnicos eliminados
            uniqueList.removeAll { it.userId == uid && removed.contains(it.hobby) }

            // 2) Preparar para procesar añadidos
            val batch = db.batch()
            val pendingCreations = mutableListOf<PendingNewGroup>()
            val userEmail = auth.currentUser?.email.orEmpty()

            // 3) Procesar cada hobby añadido
            for (hobby in added) {
                // 3.a) si ya hay grupo derivado
                val existing = derivedList.find { it.hobby == hobby }
                if (existing != null) {
                    val grpRef = db.collection("groups").document(existing.groupId)
                    batch.update(grpRef,
                        "memberIds",   FieldValue.arrayUnion(uid),
                        "emails",      FieldValue.arrayUnion(userEmail),
                        "memberCount", FieldValue.increment(1),
                        "updatedAt",   FieldValue.serverTimestamp()
                    )
                    continue
                }
                // 3.b) si estaba en únicos
                val uEntry = uniqueList.find { it.hobby == hobby }
                if (uEntry != null) {
                    pendingCreations += PendingNewGroup(hobby = hobby, ownerUid = uEntry.userId)
                    uniqueList.remove(uEntry)
                    continue
                }
                // 3.c) completamente nuevo → añadir a únicos
                uniqueList += UniqueHobbyEntry(hobby = hobby, userId = uid)
            }

            // 4) Crear todos los grupos pendientes
            if (pendingCreations.isEmpty()) {
                // no hay nuevos grupos → commit directo
                commitOrgAndGroupUpdates(orgRef, derivedList, uniqueList, batch)
            } else {
                var remaining = pendingCreations.size
                for (p in pendingCreations) {
                    createDerivedGroup(
                        orgId    = orgId,
                        orgName  = orgName,
                        hobby    = p.hobby,
                        memberIds= listOf(p.ownerUid, uid),
                        ownerUid = p.ownerUid
                    ) { newGroupId ->
                        if (newGroupId != null) {
                            derivedList += DerivedGroupEntry(p.hobby, newGroupId)
                        }
                        if (--remaining == 0) {
                            // cuando todas estén creadas, aplica el batch de la org
                            commitOrgAndGroupUpdates(orgRef, derivedList, uniqueList, batch)
                        }
                    }
                }
            }
        }
            .addOnFailureListener {
                Log.e("OrgRepo", "Error cargando org para sync hobbies: ${it.message}")
            }
    }

    /**
     * Procesa la adición de un hobby en una organización existente:
     * - Si ya existe grupo derivado, simplemente añade al usuario.
     * - Si estaba en hobbiesUnicos, encola la creación de un nuevo grupo con el owner anterior.
     * - Si es completamente nuevo, lo añade a hobbiesUnicos.
     *
     * Al final, hace commit atómico de la org (memberIds/emails ya asumidos fuera de este método).
     */
    fun processHobbyAdditionInOrg(
        orgId: String,
        orgName: String,
        uid: String,
        hobby: String  // Agregar este parámetro que falta
    ) {
        val newEmail = auth.currentUser?.email.orEmpty()
        val orgRef = db.collection("organizations").document(orgId)
        val batch = db.batch()

        // Leer estado actual de la org
        orgRef.get()
            .addOnSuccessListener { snap ->
                @Suppress("UNCHECKED_CAST")
                val derivedMaps = (snap.get("gruposDerivados") as? List<Map<String, Any>>) ?: emptyList()
                @Suppress("UNCHECKED_CAST")
                val uniqueMaps = (snap.get("hobbiesUnicos") as? List<Map<String, Any>>) ?: emptyList()

                val derived = derivedMaps.map {
                    DerivedGroupEntry(
                        hobby = it["hobby"] as String,
                        groupId = it["groupId"] as String
                    )
                }.toMutableList()

                val unique = uniqueMaps.map {
                    UniqueHobbyEntry(
                        hobby = it["hobby"] as String,
                        userId = it["userId"] as String
                    )
                }.toMutableList()

                val pending = mutableListOf<PendingNewGroup>()

                // Procesar el hobby específico
                val existingDerived = derived.find { it.hobby == hobby }
                if (existingDerived != null) {
                    // A) Grupo ya existe → actualizar con batch
                    val grpRef = db.collection("groups").document(existingDerived.groupId)
                    batch.update(grpRef,
                        "memberIds", FieldValue.arrayUnion(uid),
                        "emails", FieldValue.arrayUnion(newEmail),
                        "memberCount", FieldValue.increment(1),
                        "updatedAt", FieldValue.serverTimestamp()
                    )
                } else {
                    // B) ¿Estaba en uniques?
                    val uniqueEntry = unique.find { it.hobby == hobby }
                    if (uniqueEntry != null) {
                        // Encolar creación de grupo entre uniqueEntry.userId y uid
                        pending += PendingNewGroup(hobby = hobby, ownerUid = uniqueEntry.userId)
                        // Quitar de unique
                        unique.remove(uniqueEntry)
                    } else {
                        // C) Hobby totalmente nuevo → añadir a unique
                        unique += UniqueHobbyEntry(hobby = hobby, userId = uid)
                    }
                }

                // Si hay grupos pendientes, crearlos
                if (pending.isEmpty()) {
                    // Solo actualizar la organización con los arrays modificados
                    updateOrgArrays(orgRef, derived, unique)
                } else {
                    var remaining = pending.size
                    for (p in pending) {
                        processDerivedCreation(
                            orgId = orgId,
                            orgName = orgName,
                            hobby = p.hobby,
                            ownerUid = p.ownerUid,
                            newUid = uid
                        ) { newGroupId ->
                            if (newGroupId != null) {
                                derived += DerivedGroupEntry(hobby = p.hobby, groupId = newGroupId)
                            }
                            if (--remaining == 0) {
                                updateOrgArrays(orgRef, derived, unique)
                            }
                        }
                    }
                }
            }
            .addOnFailureListener { e ->
                Log.e(TAG, "Error leyendo organización: ${e.message}")
            }
    }
    /**
     * Crea un grupo derivado para un hobby entre dos usuarios:
     * - orgId: ID de la organización padre.
     * - hobby: nombre del hobby.
     * - ownerUid: UID del primer usuario (el que estaba en hobbiesUnicos).
     * - newUid: UID del usuario que acaba de añadir ese hobby.
     *
     * Invoca a createDerivedGroup y pasa el resultado al callback.
     */

    /**
     * Crea un grupo derivado reutilizando createDerivedGroup.
     */
    private fun processDerivedCreation(
        orgId: String,
        orgName: String,
        hobby: String,
        ownerUid: String,
        newUid: String,
        onResult: (String?) -> Unit
    ) {
        createDerivedGroup(
            orgId      = orgId,
            orgName = orgName,
            hobby      = hobby,
            memberIds  = listOf(ownerUid, newUid),
            ownerUid   = ownerUid
        ) { groupId ->
            onResult(groupId)
        }
    }
    /**
     * Lee el campo "hobbies" de cada userProfiles/{uid}
     * y devuelve un map uid → List<String> de hobbies.
     */
    private fun fetchHobbiesForMembers(
        memberIds: List<String>,
        onComplete: (Map<String, List<String>>?, String?) -> Unit
    ) {
        val db = FirebaseFirestore.getInstance()
        val result = mutableMapOf<String, List<String>>()
        var remaining = memberIds.size
        for (uid in memberIds) {
            db.collection("userProfiles").document(uid)
                .get()
                .addOnSuccessListener { snap ->
                    @Suppress("UNCHECKED_CAST")
                    val hobbies = (snap.get("hobbies") as? List<*>)?.filterIsInstance<String>() ?: emptyList()
                    result[uid] = hobbies
                    if (--remaining == 0) {
                        onComplete(result, null)
                    }
                }
                .addOnFailureListener { e ->
                    onComplete(null, "Error leyendo hobbies de $uid: ${e.message}")
                }
        }
    }

    /**
     * Crea un grupo derivado en /groups para un hobby compartido.
     * Retorna en el callback el nuevo groupId o null si hubo error.
     */
    private fun createDerivedGroup(
        orgId: String,
        orgName: String,
        hobby: String,
        memberIds: List<String>,
        ownerUid: String,
        onResult: (String?) -> Unit
    ) {
        val db = FirebaseFirestore.getInstance()
        // 1) Generar código único
        generateUniqueGroupCode { code ->
            if (code == null) {
                onResult(null)
                return@generateUniqueGroupCode
            }

            // 2) Obtener emails de los miembros
            userRepo.fetchEmailsForUids(memberIds,
                onComplete = { uidToEmail, missingEmails ->
                    if (missingEmails.isNotEmpty()) {
                        onResult(null)
                        return@fetchEmailsForUids
                    }
                    // 3) Leer hobbies de los miembros
                    fetchHobbiesForMembers(memberIds) { hobbiesMap, err ->
                        if (err != null || hobbiesMap == null) {
                            onResult(null)
                            return@fetchHobbiesForMembers
                        }

                        // 4) Construir el payload
                        val groupName = "$orgName – $hobby"
                        val data = hashMapOf<String, Any?>(
                            "name"            to groupName,
                            "code"            to code,
                            "type"            to "personal",
                            "derivado"        to true,
                            "hobby"           to hobby,
                            "organizationId"  to orgId,
                            "ownerUid"        to ownerUid,
                            "memberIds"       to memberIds,
                            "emails"          to memberIds.map { uidToEmail[it]!! },
                            "memberCount"     to memberIds.size,
                            "memberHobbies"   to hobbiesMap,                // uid → List<String>
                            "createdAt"       to FieldValue.serverTimestamp(),
                            "updatedAt"       to FieldValue.serverTimestamp()
                        )

                        // 5) Guardar en Firestore
                        val newGroupId = UUID.randomUUID().toString()
                        db.collection("groups").document(newGroupId)
                            .set(data)
                            .addOnSuccessListener { val batch = db.batch()
                                for (uid in memberIds) {
                                    val uRef = db.collection("userProfiles").document(uid)
                                    batch.set(
                                        uRef,
                                        mapOf(
                                            "groupIds"  to FieldValue.arrayUnion(newGroupId),
                                            "updatedAt" to FieldValue.serverTimestamp()
                                        ),
                                        SetOptions.merge()
                                    )
                                }
                                batch.commit()
                                    .addOnSuccessListener { onResult(newGroupId) }
                                    .addOnFailureListener { _ -> onResult(null) }
                            }
                            .addOnFailureListener { _ -> onResult(null) }
                    }
                }
            )
        }
    }



    // AGREGAR esta nueva función para generar códigos únicos:
    private fun generateUniqueGroupCode(callback: (String?) -> Unit) {
        val code = generateRandomCode()

        // Verificar si el código ya existe
        db.collection("groups")
            .whereEqualTo("code", code)
            .get()
            .addOnSuccessListener { documents ->
                if (documents.isEmpty) {
                    // Código único encontrado
                    callback(code)
                } else {
                    // Código ya existe, intentar de nuevo (máximo 3 intentos)
                    generateUniqueGroupCode(callback)
                }
            }
            .addOnFailureListener {
                callback(null)
            }
    }


    /**
     * Actualiza el documento organizations/{orgId} con los arrays derivados.
     */
    private fun commitOrgUpdate(
        orgId: String,
        derived: List<DerivedGroupEntry>,
        unique: List<UniqueHobbyEntry>,
        code: String,
        onSuccess: (String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val orgRef = db.collection("organizations").document(orgId)
        // Mapear a lista de mapas simples
        val derivedMaps = derived.map { mapOf("hobby" to it.hobby, "groupId" to it.groupId) }
        val uniqueMaps  = unique.map  { mapOf("hobby" to it.hobby, "userId" to it.userId) }

        orgRef.update(
            mapOf(
                "gruposDerivados" to derivedMaps,
                "hobbiesUnicos"   to uniqueMaps,
                "updatedAt"       to FieldValue.serverTimestamp()
            )
        )
            .addOnSuccessListener { onSuccess(code) }
            .addOnFailureListener { e -> onFailure("Error actualizando arrays derivados: ${e.message}") }
    }


    fun processMultipleHobbyAdditionsInOrg(
        orgId: String,
        uid: String,
        addedHobbies: List<String>
    ) {
        if (addedHobbies.isEmpty()) return

        val db = FirebaseFirestore.getInstance()
        val auth = FirebaseAuth.getInstance()
        val orgRef = db.collection("organizations").document(orgId)

        orgRef.get().addOnSuccessListener { snap ->
            val orgName = snap.getString("name").orEmpty()

            @Suppress("UNCHECKED_CAST")
            val derivedMaps = (snap.get("gruposDerivados") as? List<Map<String, Any>>) ?: emptyList()
            @Suppress("UNCHECKED_CAST")
            val uniqueMaps  = (snap.get("hobbiesUnicos")   as? List<Map<String, Any>>) ?: emptyList()

            val derivedList = derivedMaps.map {
                DerivedGroupEntry(it["hobby"] as String, it["groupId"] as String)
            }.toMutableList()
            val uniqueList  = uniqueMaps.map {
                UniqueHobbyEntry(it["hobby"] as String, it["userId"] as String)
            }.toMutableList()

            // Batch para actualizaciones a grupos existentes + al documento org
            val batch = db.batch()
            val pendingCreations = mutableListOf<PendingNewGroup>()
            val newEmail = auth.currentUser?.email.orEmpty()

            // 1) Decidir ruta para cada hobby añadido
            for (hobby in addedHobbies) {
                // a) Si ya hay grupo derivado → actualizarlo
                val existing = derivedList.find { it.hobby == hobby }
                if (existing != null) {
                    val grpRef = db.collection("groups").document(existing.groupId)
                    batch.update(grpRef,
                        "memberIds", FieldValue.arrayUnion(uid),
                        "emails",    FieldValue.arrayUnion(newEmail),
                        "memberCount", FieldValue.increment(1),
                        "updatedAt", FieldValue.serverTimestamp()
                    )
                    continue
                }
                // b) Si estaba en únicos → crear grupo
                val uniqueEntry = uniqueList.find { it.hobby == hobby }
                if (uniqueEntry != null) {
                    pendingCreations += PendingNewGroup(hobby, uniqueEntry.userId)
                    uniqueList.remove(uniqueEntry)
                    continue
                }
                // c) Completamente nuevo → añadir a únicos
                uniqueList += UniqueHobbyEntry(hobby, uid)
            }

            // 2) Crear grupos pendientes en paralelo
            if (pendingCreations.isEmpty()) {
                // No hay grupos nuevos → aplico sólo el batch de actualizaciones
                commitOrgAndGroupUpdates(orgRef, derivedList, uniqueList, batch)
            } else {
                var remaining = pendingCreations.size
                for (p in pendingCreations) {
                    // Usa tu helper extendido para crear grupo con name, code, type, memberHobbies…
                    createDerivedGroup(
                        orgId    = orgId,
                        orgName  = orgName,
                        hobby    = p.hobby,
                        memberIds= listOf(p.ownerUid, uid),
                        ownerUid = p.ownerUid
                    ) { newGroupId ->
                        if (newGroupId != null) {
                            derivedList += DerivedGroupEntry(hobby = p.hobby, groupId = newGroupId)
                            // createDerivedGroup ya habrá agregado newGroupId a userProfiles.groupIds
                        }
                        if (--remaining == 0) {
                            // 3) Cuando todos los grupos pendientes estén creados:
                            commitOrgAndGroupUpdates(orgRef, derivedList, uniqueList, batch)
                        }
                    }
                }
            }
        }
            .addOnFailureListener { /* log error */ }
    }

    /**
     * Termina de completar el batch con la actualización de la org
     * (arrays gruposDerivados y hobbiesUnicos) y lo commitea.
     */
    private fun commitOrgAndGroupUpdates(
        orgRef: DocumentReference,
        derived: List<DerivedGroupEntry>,
        unique:  List<UniqueHobbyEntry>,
        batch:   WriteBatch
    ) {
        // Prepara los mapas para Firestore
        val derivedMaps = derived.map { mapOf("hobby" to it.hobby, "groupId" to it.groupId) }
        val uniqueMaps  = unique.map  { mapOf("hobby" to it.hobby,  "userId" to it.userId) }

        // Añade al batch la actualización de la organización
        batch.update(orgRef,
            "gruposDerivados", derivedMaps,
            "hobbiesUnicos",   uniqueMaps,
            "updatedAt",       FieldValue.serverTimestamp()
        )

        // Guardar TODO de una vez
        batch.commit()
            .addOnSuccessListener { /* éxito */ }
            .addOnFailureListener { e ->
                Log.e("OrgRepo", "Error actualizando org: ${e.message}")
            }
    }

}