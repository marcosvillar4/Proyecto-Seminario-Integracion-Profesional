package tpo.seminario.breakbuddy.persistence

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.util.Organization
import tpo.seminario.breakbuddy.util.groups.MembershipStatus
import java.util.UUID

class OrganizationRepository {
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private val userRepo = UserRepository()
    private val TAG = "OrganizationRepository"

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
                                            onSuccess(code)
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
     * Agrega un miembro a una organización existente por email.
     * - Convierte email a UID, luego hace update arrayUnion en memberIds y emails.
     */
    fun addMemberByEmail(
        orgId: String,
        email: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser ?: run {
            onFailure("Usuario no autenticado"); return
        }
        val emailTrim = email.trim().lowercase()
        if (emailTrim.isEmpty()) {
            onFailure("Email vacío"); return
        }
        // Validar formato email
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(emailTrim).matches()) {
            onFailure("Email inválido: $emailTrim"); return
        }
        // Buscar UID del email
        db.collection("users")
            .whereEqualTo("email", emailTrim)
            .get()
            .addOnSuccessListener { snap ->
                if (snap.isEmpty) {
                    onFailure("El email \"$emailTrim\" no está registrado.")
                    return@addOnSuccessListener
                }
                val uid = snap.documents.first().id
                // Actualizar doc de org: arrayUnion
                db.collection("organizations")
                    .document(orgId)
                    .update(
                        "memberIds", FieldValue.arrayUnion(uid),
                        "emails", FieldValue.arrayUnion(emailTrim),
                        "memberCount", FieldValue.increment(1),
                        "updatedAt", FieldValue.serverTimestamp()
                    )
                    .addOnSuccessListener { onSuccess() }
                    .addOnFailureListener { e ->
                        onFailure("Error agregando miembro a organización: ${e.message}")
                    }
            }
            .addOnFailureListener { e ->
                onFailure("Error buscando usuario: ${e.message}")
            }
    }

    /**
     * Método para que un miembro salga de la organización.
     * (Ya tenías leaveOrganization; asegúrate de usar email del currentUser para remover de emails).
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
            .addOnSuccessListener { onSuccess() }
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
                        // Reusar addMemberByEmail para lógica uniforme
                        val email = currentUser.email ?: ""
                        addMemberByEmail(orgId, email, onSuccess, onFailure)
                    }
                }
            }
            .addOnFailureListener { e -> onFailure("Error buscando organización: ${e.message}") }
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
        db.runTransaction { trans ->
            val snap = trans.get(orgRef)
            if (!snap.exists()) throw Exception("Organización no existe")
            val ownerUid = snap.getString("ownerUid") ?: throw Exception("Falta ownerUid en organización")
            if (currentUid != ownerUid) {
                throw Exception("Solo el administrador puede remover a otro miembro")
            }
            val memberIds = (snap.get("memberIds") as? List<String>) ?: emptyList()
            if (!memberIds.contains(memberUidToRemove)) {
                throw Exception("El usuario a remover no es miembro de la organización")
            }
            // Construir nueva lista de memberIds sin el miembro a remover
            val newMemberIds = memberIds.filter { it != memberUidToRemove }
            // Emails actual
            val emailsList = (snap.get("emails") as? List<String>)?.toMutableList() ?: mutableListOf()
            // Remover email exacto (ignorando mayúsc/minúsc)
            emailsList.removeAll { it.equals(memberEmailToRemove, ignoreCase = true) }
            if (newMemberIds.isEmpty()) {
                // Si no quedan miembros, se puede decidir: eliminar la org o mantener con solo owner?
                // Pero aquí owner != memberUidToRemove (removemos a otro), y newMemberIds no estará vacío si owner permanece.
                // Esta rama no debería ocurrir si el miembro removido no es el único. Sin embargo, verificamos:
                trans.delete(orgRef)
                return@runTransaction null
            }
            // Si el miembro removido era owner (pero en este método no debería ser, porque currentUid==ownerUid y memberUidToRemove != currentUid)
            // No consideramos reasignar owner aquí porque no permitimos remover al owner en este método.
            // Actualizar campos:
            trans.update(orgRef, mapOf(
                "memberIds" to newMemberIds,
                "emails" to emailsList,
                "memberCount" to newMemberIds.size,
                "updatedAt" to FieldValue.serverTimestamp()
            ))
            null
        }
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener { e ->
                onFailure(e.message ?: "Error removiendo miembro de la organización")
            }
    }

}
