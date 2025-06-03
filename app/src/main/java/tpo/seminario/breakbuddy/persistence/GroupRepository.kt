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
                        val newGroup = Group(
                            id               = groupId,
                            name             = name.trim(),
                            code             = code,
                            type             = type,
                            hobby            = hobby?.trim(),
                            organizationName = organizationName,     // Lo recibimos desde el fragmento
                            organizationId   = orgId,                // ID de /organizations/{orgId}
                            ownerId          = ownerUid,
                            memberIds        = allMemberIds,
                            memberCount      = memberCount,
                            createdAt        = nowMillis,
                            updatedAt        = nowMillis,
                            isOwner          = true,                 // El creador siempre es dueño
                            membershipStatus = MembershipStatus.MEMBER,
                            createdBy        = ownerUid,
                            emails           = allEmailsWithOwner,               // Lista original de correos, con el dueño incluido
                            orgId            = orgId                 // redundante con organizationId, pero lo dejamos igual
                        )

                        // ── 6) Guardar en Firestore ───────────────────────────────────────────────────────────
                        db.collection("groups")
                            .document(groupId)
                            .set(newGroup)
                            .addOnSuccessListener {
                                onSuccess(code)  // devolvemos el código del grupo
                            }
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
}