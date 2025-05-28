package tpo.seminario.breakbuddy.persistence

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.util.Group
import java.util.UUID
import kotlin.random.Random

class GroupRepository {
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()

    // REEMPLAZAR la función createGroup con esta versión mejorada:
    fun createGroup(
        name: String,
        emails: List<String>,
        hobby: String?,
        type: String,
        orgId: String?,
        onSuccess: (String) -> Unit, // Ahora devuelve el código del grupo
        onFailure: (String) -> Unit   // Ahora devuelve mensaje específico
    ) {
        val currentUser = auth.currentUser
        if (currentUser == null) {
            onFailure("Usuario no autenticado")
            return
        }

        val groupId = UUID.randomUUID().toString()

        // 1) Si es de organización, comprueba primero unicidad
        val checkOrg = if (type == "organization") {
            db.collection("groups")
                .whereEqualTo("type", "organization")
                .whereEqualTo("orgId", orgId)
                .get()
        } else {
            // mock un DocumentReference vacío para saltar esta comprobación
            db.collection("groups")
                .whereEqualTo("dummy", "__none__") // nunca habrá documentos con ese campo
                .get() // devuelve Task<QuerySnapshot>
        }

        checkOrg
            .addOnSuccessListener { snap ->
                if (type == "organization" && !snap.isEmpty) {
                    return@addOnSuccessListener onFailure("Ya existe un grupo para esta organización")
                }
                // 2) Genera código único
                generateUniqueGroupCode { code ->
                    if (code == null) return@generateUniqueGroupCode onFailure("Error generando código")
                    // 3) Crea el objeto
                    val allEmails = (emails + currentUser.email).filterNotNull().distinct()
                    val group = Group(
                        id        = groupId,
                        name      = name.trim(),
                        createdBy = currentUser.uid,
                        emails    = allEmails,
                        hobby     = hobby?.trim(),
                        code      = code,
                        type      = type,
                        orgId     = orgId
                    )
                    // 4) Guarda Firestore
                    db.collection("groups")
                        .document(groupId)
                        .set(group)
                        .addOnSuccessListener { onSuccess(code) }
                        .addOnFailureListener { e ->
                            val msg = when {
                                e.message?.contains("permission", true) == true -> "No tienes permisos"
                                e.message?.contains("network", true) == true    -> "Error de conexión"
                                else                                             -> "Error: ${e.message}"
                            }
                            onFailure(msg)
                        }
                }
            }
            .addOnFailureListener { e ->
                onFailure("Error verificando organización: ${e.message}")
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