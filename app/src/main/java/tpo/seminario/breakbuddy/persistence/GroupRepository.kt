package tpo.seminario.breakbuddy.persistence

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.MembershipStatus
import java.util.UUID
import kotlin.random.Random

class GroupRepository {
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()

    private val userRepo = UserRepository()

    // REEMPLAZAR la función createGroup con esta versión mejorada:
    fun createGroup(
        name: String,
        emails: List<String>,
        hobby: String?,
        type: String,
        orgId: String?,
        organizationName: String?,
        onSuccess: (String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser
        if (currentUser == null) {
            onFailure("Usuario no autenticado")
            return
        }
        val ownerUid = currentUser.uid
        val groupId = UUID.randomUUID().toString()

        // ── 1) Convertir emails en UIDs ────────────────────────────────────────────────────────────────

        userRepo.fetchUidsForEmails(
            emails = emails,
            onComplete = { emailToUidMap, missingEmails ->
                if (missingEmails.isNotEmpty()) {
                    // Abortamos si hay emails que no existen en /users
                    onFailure("Los siguientes correos no están registrados: ${missingEmails.joinToString(", ")}")
                    return@fetchUidsForEmails
                }

                // Si llegamos acá, TODOS los emails tienen UID. Construimos la lista de memberIds:
                val memberIdsFromEmails: List<String> = emails.map { email ->
                    // el map contiene siempre ese email porque validamos que no haya ninguno faltante
                    emailToUidMap[email]!!
                }

                // Asegurarnos de que el owner también esté en memberIds:
                val allMemberIds = (memberIdsFromEmails + ownerUid).distinct()
                val memberCount = allMemberIds.size

                // ── 2) Verificar unicidad de "organization" si aplica ───────────────────────────────────────
                val checkOrgTask = if (type == "organization") {
                    db.collection("groups")
                        .whereEqualTo("type", "organization")
                        .whereEqualTo("orgId", orgId)
                        .get()
                } else {
                    // Niñera: consulta que nunca devuelve documentos
                    db.collection("groups")
                        .whereEqualTo("dummy", "__none__")
                        .get()
                }

                checkOrgTask.addOnSuccessListener { snap ->
                    if (type == "organization" && !snap.isEmpty) {
                        onFailure("Ya existe un grupo para esta organización")
                        return@addOnSuccessListener
                    }

                    // ── 3) Generar código único ───────────────────────────────────────────────────────────
                    generateUniqueGroupCode { code ->
                        if (code == null) {
                            onFailure("Error generando código único")
                            return@generateUniqueGroupCode
                        }

                        // ── 4) Preparar timestamps ─────────────────────────────────────────────────────────
                        val nowMillis = System.currentTimeMillis()

                        val ownerEmail = currentUser.email ?: ""
                        val allEmailsWithOwner = (emails + ownerEmail).distinct()

                        // ── 5) Construir el objeto Group completo ─────────────────────────────────────────────
                        val newGroupData = hashMapOf(
                            "id"               to groupId,
                            "name"             to name.trim(),
                            "code"             to code,
                            "type"             to type,
                            "hobby"            to (hobby?.trim()),
                            "organizationName" to organizationName,
                            "organizationId"   to orgId,
                            "memberIds"        to allMemberIds,
                            "memberCount"      to memberCount,
                            "createdAt"        to FieldValue.serverTimestamp(),
                            "updatedAt"        to FieldValue.serverTimestamp(),
                            "isOwner"          to true,
                            "membershipStatus" to MembershipStatus.MEMBER.name, // o si lo guardas como String/enum
                            "ownerUid"         to ownerUid,
                            "emails"           to allEmailsWithOwner,
                            "orgId"            to orgId
                        )

                        // Y se guarda con:
                        db.collection("groups")
                            .document(groupId)
                            .set(newGroupData)
                            .addOnSuccessListener { onSuccess(code) }
                            .addOnFailureListener { e ->
                                val msg = when {
                                    e.message?.contains("permission", true) == true ->
                                        "No tienes permisos para crear este grupo"
                                    e.message?.contains("network", true) == true   ->
                                        "Error de conexión. Verifica tu internet"
                                    else ->
                                        "Error creando el grupo: ${e.message}"
                                }
                                onFailure(msg)
                            }
                    }
                }
                    .addOnFailureListener { e ->
                        onFailure("Error verificando organización: ${e.message}")
                    }
            },
            onError = { e ->
                onFailure("Error obteniendo UIDs de emails: ${e.message}")
            }
        )
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

    // AGREGAR esta función para generar códigos aleatorios:
    private fun generateRandomCode(): String {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
        return (1..6)
            .map { chars[Random.nextInt(chars.length)] }
            .joinToString("")
    }

    // ACTUALIZAR la función joinGroupByCode con mejor manejo de errores:
    fun joinGroupByCode(
        code: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser
        if (currentUser == null) {
            onFailure("Usuario no autenticado")
            return
        }

        if (code.isBlank()) {
            onFailure("El código no puede estar vacío")
            return
        }

        db.collection("groups")
            .whereEqualTo("code", code.uppercase())
            .get()
            .addOnSuccessListener { documents ->
                when {
                    documents.isEmpty -> {
                        onFailure("Código de grupo inválido")
                    }
                    documents.size() > 1 -> {
                        onFailure("Error: código duplicado encontrado")
                    }
                    else -> {
                        val groupDoc = documents.documents.first()
                        val group = groupDoc.toObject(Group::class.java)

                        if (group?.emails?.contains(currentUser.email) == true) {
                            onFailure("Ya eres miembro de este grupo")
                            return@addOnSuccessListener
                        }

                        // Agregar usuario al grupo
                        db.collection("groups").document(groupDoc.id)
                            .update("emails", FieldValue.arrayUnion(currentUser.email))
                            .addOnSuccessListener { onSuccess() }
                            .addOnFailureListener { exception ->
                                val errorMessage = when {
                                    exception.message?.contains("permission", ignoreCase = true) == true ->
                                        "No tienes permisos para unirte a este grupo"
                                    else -> "Error uniéndose al grupo: ${exception.message}"
                                }
                                onFailure(errorMessage)
                            }
                    }
                }
            }
            .addOnFailureListener { exception ->
                val errorMessage = when {
                    exception.message?.contains("network", ignoreCase = true) == true ->
                        "Error de conexión. Verifica tu internet"
                    else -> "Error buscando el grupo: ${exception.message}"
                }
                onFailure(errorMessage)
            }
    }


    /**
     * Agrega un nuevo miembro al grupo identificado por groupId, buscando primero su UID a través del email.
     */
    fun addMemberByEmail(
        groupId: String,
        email: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        // 1) Buscar en /users el doc con campo "email" == email
        db.collection("users")
            .whereEqualTo("email", email)
            .get()
            .addOnSuccessListener { snap ->
                if (snap.isEmpty) {
                    // No existe ningún usuario con ese email
                    onFailure("El email \"$email\" no está registrado.")
                    return@addOnSuccessListener
                }
                // Tomamos el primer documento (debería haber solo uno)
                val userDoc = snap.documents.first()
                val uid = userDoc.id

                // 2) Actualizamos el documento del grupo
                val groupRef = db.collection("groups").document(groupId)
                // Hacemos las dos actualizaciones en paralelo: emails y memberIds
                groupRef.update(
                    mapOf(
                        "emails" to FieldValue.arrayUnion(email),
                        "memberIds" to FieldValue.arrayUnion(uid)
                    )
                )
                    .addOnSuccessListener {
                        onSuccess()
                    }
                    .addOnFailureListener { e ->
                        val msg = when {
                            e.message?.contains("permission", true) == true ->
                                "No tienes permisos para modificar este grupo."
                            e.message?.contains("network", true) == true ->
                                "Error de conexión al intentar agregar miembro."
                            else ->
                                "Error agregando miembro: ${e.message}"
                        }
                        onFailure(msg)
                    }
            }
            .addOnFailureListener { e ->
                onFailure("Error buscando usuario: ${e.message}")
            }
    }
    /**
     * Quita un miembro (memberUidToRemove) de un grupo.
     * - Remueve su UID de "memberIds" y su email de "emails".
     * - Ajusta "memberCount".
     * - Si queda en 0, borra el documento.
     * - Si el miembro eliminado era el dueño (ownerUid), reasigna "ownerUid" a otro miembro.
     */
    fun removeMemberFromGroup(
        groupId: String,
        memberUidToRemove: String,
        memberEmailToRemove: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val groupRef = db.collection("groups").document(groupId)

        db.runTransaction { transaction ->
            // 1) Leemos el documento
            val snapshot = transaction.get(groupRef)
            if (!snapshot.exists()) {
                throw Exception("El grupo no existe.")
            }

            // 2) Extraemos listas actuales de memberIds y emails
            val currentMemberIds = (snapshot.get("memberIds") as? List<String>) ?: emptyList()
            val currentEmails    = (snapshot.get("emails")    as? List<String>) ?: emptyList()

            // 3) Obtenemos el ownerUid
            val currentOwnerUid  = snapshot.getString("ownerUid")
                ?: throw Exception("Falta el campo ownerUid en el grupo.")

            // 4) Verificamos que ese UID efectivamente permanezca en memberIds
            if (!currentMemberIds.contains(memberUidToRemove)) {
                throw Exception("El usuario no es miembro de este grupo.")
            }

            // 5) Generamos las nuevas listas quitando a este miembro
            val newMemberIds = currentMemberIds.filter { it != memberUidToRemove }
            val newEmailsMutable = currentEmails.toMutableList()
            val indexToRemove = currentMemberIds.indexOf(memberUidToRemove)
            if (indexToRemove in newEmailsMutable.indices) {
                newEmailsMutable.removeAt(indexToRemove)
            }
            val newEmails = newEmailsMutable.toList()

            // 6) Contamos cuántos miembros quedarían
            val newCount = newMemberIds.size

            // 7) Si después de quitar quedan 0 miembros, borramos el documento
            if (newCount == 0) {
                transaction.delete(groupRef)
                return@runTransaction null
            }

            // 8) Si aún quedan >0, y se eliminó al dueño, reasignamos un nuevo owner
            var newOwner = currentOwnerUid
            if (memberUidToRemove == currentOwnerUid) {
                // Como aquí newMemberIds no está vacío (newCount>0), sí podemos hacer first()
                newOwner = newMemberIds.first()
            }

            // 9) Armamos el mapa de actualizaciones (sin borrar, simplemente actualizamos campos)
            val updates = mapOf(
                "memberIds"   to newMemberIds,
                "emails"      to newEmails,
                "memberCount" to newCount,
                "ownerUid"    to newOwner,
                "updatedAt"   to FieldValue.serverTimestamp()
            )
            transaction.update(groupRef, updates)

            return@runTransaction null
        }
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { e ->
                onFailure(e.message ?: "Error al eliminar miembro")
            }
    }



}

