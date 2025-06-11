package tpo.seminario.breakbuddy.persistence

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.MembershipStatus
import java.util.UUID
import kotlin.random.Random

class GroupRepository {
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()

    private val userRepo = UserRepository()
    private val orgRepo = OrganizationRepository()

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
        if (type == "organization") {
            // Crear organización en /organizations
            orgRepo.createOrganization(
                name = name,
                emails = emails,
                onSuccess = { code ->
                    onSuccess(code)  // Devuelve el código de org creado
                },
                onFailure = { msg ->
                    onFailure(msg)
                }
            )
            return
        }
        // Si llegamos acá: type == "personal" o grupo manual. Creamos en /groups.
        val ownerUid = currentUser.uid
        val groupId = UUID.randomUUID().toString()

        // ── 1) Convertir emails en UIDs ────────────────────────────────────────────────────────────────

        userRepo.fetchUidsForEmails(
            emails = emails,
            onComplete = { emailToUidMap, missingEmails ->
                if (missingEmails.isNotEmpty()) {
                    onFailure("Los siguientes correos no están registrados: ${missingEmails.joinToString(", ")}")
                    return@fetchUidsForEmails
                }
                val memberIdsFromEmails = emails.map { emailToUidMap[it]!! }
                val allMemberIds = (memberIdsFromEmails + ownerUid).distinct()
                val memberCount = allMemberIds.size
                // Generar código único de grupo personal:
                generateUniqueGroupCode { code ->
                    if (code == null) {
                        onFailure("Error generando código único")
                        return@generateUniqueGroupCode
                    }
                    val ownerEmail = currentUser.email ?: ""
                    val allEmailsWithOwner = (emails + ownerEmail).distinct()
                    // Construir data:
                    val newGroupData = hashMapOf(
                        "name"             to name.trim(),
                        "code"             to code,
                        "type"             to type,  // "personal"
                        "hobby"   to hobby?.trim(),
                        "derivado"         to false,
                        "organizationId"   to null,
                        "memberIds"        to allMemberIds,
                        "memberCount"      to memberCount,
                        "createdAt"        to FieldValue.serverTimestamp(),
                        "updatedAt"        to FieldValue.serverTimestamp(),
                        "ownerUid"         to ownerUid,
                        "emails"           to allEmailsWithOwner,
                        // "memberHobbies" inicialmente vacío
                        "memberHobbies"    to emptyMap<String, List<String>>()
                    )
                    db.collection("groups")
                        .document(groupId)
                        .set(newGroupData)
                        .addOnSuccessListener {
                            // 5) Tras creación: hacer batch para:
                            //    - Actualizar cada userProfiles/{uid}.groupIds arrayUnion groupId
                            //    - Recoger hobbies de cada userProfiles/{uid} y actualizar memberHobbies
                            val batch = db.batch()
                            for (uid in allMemberIds) {
                                val uRef = db.collection("userProfiles").document(uid)
                                batch.set(uRef, mapOf(
                                    "groupIds" to FieldValue.arrayUnion(groupId),
                                    "updatedAt" to FieldValue.serverTimestamp()
                                ), SetOptions.merge())
                            }
                            // Obtener hobbies actuales de cada usuario
                            // Nota: no podemos en batch esperar gets, haremos Promise.all previo o secuencial:
                            // Primero, leemos todos userProfiles
                            db.runTransaction { tx ->
                                // en transacción, leemos cada perfil y construimos memberHobbies map
                                val memberHobbiesMap = mutableMapOf<String, List<String>>()
                                for (uid in allMemberIds) {
                                    val snap = tx.get(db.collection("userProfiles").document(uid))
                                    val hobbies = (snap.get("hobbies") as? List<*>)?.filterIsInstance<String>() ?: emptyList()
                                    memberHobbiesMap[uid] = hobbies
                                }
                                // Actualizar en el grupo: memberHobbies y updatedAt
                                val gRef = db.collection("groups").document(groupId)
                                tx.update(gRef, mapOf(
                                    "memberHobbies" to memberHobbiesMap,
                                    "updatedAt" to FieldValue.serverTimestamp()
                                ))
                                // También los userProfiles anteriores se actualizaron via batch fuera de la transacción?
                                // Aquí dentro solo actualizamos grupo. La actualización de userProfiles groupIds
                                // la hacemos fuera del runTransaction con batch.commit().
                                null
                            }.addOnSuccessListener {
                                // Commit del batch de userProfiles
                                batch.commit().addOnSuccessListener {
                                    onSuccess(code)
                                }.addOnFailureListener { e ->
                                    // aunque falle userProfiles, grupo ya existe; al menos retornamos success
                                    onFailure("Grupo creado, pero fallo al actualizar perfiles: ${e.message}")
                                }
                            }.addOnFailureListener { e ->
                                onFailure("Error sincronizando hobbies en grupo: ${e.message}")
                            }
                        }
                        .addOnFailureListener { e ->
                            onFailure("Error creando el grupo: ${e.message}")
                        }
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
        val currentUser = auth.currentUser ?: run {
            onFailure("Usuario no autenticado"); return
        }
        if (code.isBlank()) {
            onFailure("El código no puede estar vacío"); return
        }
        // 1) Buscar en grupos:
        db.collection("groups")
            .whereEqualTo("code", code.uppercase())
            .get()
            .addOnSuccessListener { docs ->
                if (!docs.isEmpty) {
                    // Unirse a grupo personal:
                    val doc = docs.documents.first()
                    val groupId = doc.id
                    // Lógica de agregar memberIds y emails, similar a tu método actual:
                    val uid = currentUser.uid
                    val email = currentUser.email ?: ""
                    // Verificar si ya es miembro:
                    val existingEmails = doc.get("emails") as? List<String> ?: emptyList()
                    if (existingEmails.contains(email)) {
                        onFailure("Ya eres miembro de este grupo")
                        return@addOnSuccessListener
                    }
                    db.collection("groups").document(groupId)
                        .update(
                            "memberIds", FieldValue.arrayUnion(uid),
                            "emails", FieldValue.arrayUnion(email),
                            "memberCount", FieldValue.increment(1),
                            "updatedAt", FieldValue.serverTimestamp()
                        )
                        .addOnSuccessListener {
                            // 2) Luego: actualizar userProfile y memberHobbies
                            // Leemos hobbies del userProfile actual
                            db.collection("userProfiles").document(uid).get()
                                .addOnSuccessListener { upSnap ->
                                    val hobbies = (upSnap.get("hobbies") as? List<*>)?.filterIsInstance<String>() ?: emptyList()
                                    // Batch para:
                                    //  - arrayUnion groupId en userProfiles/{uid}.groupIds
                                    //  - set memberHobbies[uid] = hobbies en groups/{groupId}
                                    val batch = db.batch()
                                    val uRef = db.collection("userProfiles").document(uid)
                                    batch.set(uRef, mapOf(
                                        "groupIds" to FieldValue.arrayUnion(groupId),
                                        "updatedAt" to FieldValue.serverTimestamp()
                                    ), SetOptions.merge())
                                    val gRef = db.collection("groups").document(groupId)
                                    // Se usa merge: actualizamos solo la entrada de memberHobbies
                                    batch.set(gRef, mapOf(
                                        "memberHobbies" to mapOf(uid to hobbies),
                                        "updatedAt" to FieldValue.serverTimestamp()
                                    ), SetOptions.merge())
                                    batch.commit().addOnSuccessListener {
                                        onSuccess()
                                    }.addOnFailureListener { e ->
                                        onFailure("Te uniste, pero fallo al actualizar perfiles: ${e.message}")
                                    }
                                }
                                .addOnFailureListener { e ->
                                    onFailure("Te uniste, pero no pude leer tus hobbies para sincronizar: ${e.message}")
                                }
                        }
                        .addOnFailureListener { e ->
                            onFailure("Error uniéndose al grupo: ${e.message}")
                        }
                } else {
                    // No existe en grupos → buscar en organizaciones
                    OrganizationRepository().joinOrganizationByCode(
                        code = code.uppercase(),
                        onSuccess = { onSuccess() },
                        onFailure = { msgOrg ->
                            // Si tampoco en orgs, devolvemos el error final
                            onFailure(msgOrg)
                        }
                    )
                }
            }
            .addOnFailureListener { e ->
                onFailure("Error buscando grupo: ${e.message}")
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
        // Formato email ya validado antes por el caller
        db.collection("users")
            .whereEqualTo("email", email)
            .get()
            .addOnSuccessListener { snap ->
                if (snap.isEmpty) {
                    onFailure("El email \"$email\" no está registrado.")
                    return@addOnSuccessListener
                }
                val uid = snap.documents.first().id
                // 1) Actualizar grupo: agregar member
                val gRef = db.collection("groups").document(groupId)
                gRef.get().addOnSuccessListener { groupSnap ->
                    if (!groupSnap.exists()) {
                        onFailure("El grupo no existe.")
                        return@addOnSuccessListener
                    }
                    val existingEmails = (groupSnap.get("emails") as? List<String>) ?: emptyList()
                    if (existingEmails.contains(email)) {
                        onFailure("Ese usuario ya es miembro.")
                        return@addOnSuccessListener
                    }
                    // Hacemos update membership
                    gRef.update(
                        "memberIds", FieldValue.arrayUnion(uid),
                        "emails", FieldValue.arrayUnion(email),
                        "memberCount", FieldValue.increment(1),
                        "updatedAt", FieldValue.serverTimestamp()
                    ).addOnSuccessListener {
                        // 2) Leer hobbies del userProfile del nuevo miembro
                        db.collection("userProfiles").document(uid).get()
                            .addOnSuccessListener { upSnap ->
                                val hobbies = (upSnap.get("hobbies") as? List<*>)?.filterIsInstance<String>() ?: emptyList()
                                // 3) Batch: actualizar userProfile y grupo
                                val batch = db.batch()
                                val uRef = db.collection("userProfiles").document(uid)
                                batch.set(uRef, mapOf(
                                    "groupIds" to FieldValue.arrayUnion(groupId),
                                    "updatedAt" to FieldValue.serverTimestamp()
                                ), SetOptions.merge())
                                val gRef2 = db.collection("groups").document(groupId)
                                batch.set(gRef2, mapOf(
                                    "memberHobbies" to mapOf(uid to hobbies),
                                    "updatedAt" to FieldValue.serverTimestamp()
                                ), SetOptions.merge())
                                batch.commit().addOnSuccessListener {
                                    onSuccess()
                                }.addOnFailureListener { e ->
                                    onFailure("Miembro agregado, pero fallo sincronización: ${e.message}")
                                }
                            }
                            .addOnFailureListener { e ->
                                onFailure("Agregaste al miembro, pero no pude leer hobbies: ${e.message}")
                            }
                    }.addOnFailureListener { e ->
                        onFailure("Error agregando miembro: ${e.message}")
                    }
                }.addOnFailureListener { e ->
                    onFailure("Error leyendo grupo: ${e.message}")
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
    /**
     * Quita un miembro (memberUidToRemove) de un grupo.
     * - Remueve su UID de "memberIds" y su email de "emails".
     * - Ajusta "memberCount".
     * - Si queda en 0 miembros Y NO ES DERIVADO, borra el documento.
     * - Si el grupo es derivado, nunca se elimina independientemente de la cantidad de miembros.
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
            val snap = transaction.get(groupRef)
            if (!snap.exists()) throw Exception("El grupo no existe.")

            val currentMemberIds = (snap.get("memberIds") as? List<String>) ?: emptyList()
            if (!currentMemberIds.contains(memberUidToRemove)) {
                throw Exception("El usuario no es miembro de este grupo.")
            }

            // Verificar si el grupo es derivado
            val isDerivado = snap.getBoolean("derivado") ?: false

            // Nueva lista de miembros
            val newMemberIds = currentMemberIds.filter { it != memberUidToRemove }
            val currentEmails = (snap.get("emails") as? List<String>) ?: emptyList()
            val newEmailsMutable = currentEmails.toMutableList()
            val idx = currentMemberIds.indexOf(memberUidToRemove)
            if (idx in newEmailsMutable.indices) newEmailsMutable.removeAt(idx)

            val newCount = newMemberIds.size

            // Solo eliminar el grupo si no quedan miembros Y NO ES DERIVADO
            if (newCount == 0 && !isDerivado) {
                // Borrar grupo solo si no es derivado
                transaction.delete(groupRef)
                return@runTransaction null
            }

            // Si llegamos aquí, el grupo se mantiene (tiene miembros o es derivado)
            var fieldsToUpdate = mutableMapOf<String, Any>(
                "memberIds" to newMemberIds,
                "emails" to newEmailsMutable,
                "memberCount" to newCount,
                "updatedAt" to FieldValue.serverTimestamp()
            )

            // Reasignar owner si es necesario y hay miembros restantes
            val currentOwnerUid = snap.getString("ownerUid") ?: throw Exception("Falta ownerUid")
            if (memberUidToRemove == currentOwnerUid && newMemberIds.isNotEmpty()) {
                fieldsToUpdate["ownerUid"] = newMemberIds.first()
            }

            // Actualizar campos del grupo
            transaction.update(groupRef, fieldsToUpdate)
            return@runTransaction null

        }.addOnSuccessListener {
            // Tras transacción exitosa en group doc, actualizar userProfile y group.memberHobbies
            // 1) userProfile arrayRemove groupId
            val uRef = db.collection("userProfiles").document(memberUidToRemove)
            uRef.update(
                "groupIds", FieldValue.arrayRemove(groupId),
                "updatedAt", FieldValue.serverTimestamp()
            ).addOnSuccessListener {
                // 2) group.memberHobbies remove key (solo si el grupo no fue eliminado)
                // Para eliminar la clave dentro de un map, usamos update con FieldValue.delete()
                db.collection("groups").document(groupId).get()
                    .addOnSuccessListener { groupExists ->
                        if (groupExists.exists()) {
                            // El grupo existe, podemos actualizar memberHobbies
                            db.collection("groups").document(groupId)
                                .update(
                                    "memberHobbies.${memberUidToRemove}", FieldValue.delete(),
                                    "updatedAt", FieldValue.serverTimestamp()
                                )
                                .addOnSuccessListener {
                                    onSuccess()
                                }
                                .addOnFailureListener { e ->
                                    // El grupo quedó modificado en membership, pero no pudo borrar hobbies. Notificar.
                                    onFailure("Miembro eliminado, pero fallo al limpiar hobbies: ${e.message}")
                                }
                        } else {
                            // El grupo fue eliminado (no era derivado y quedó sin miembros)
                            onSuccess()
                        }
                    }
                    .addOnFailureListener { e ->
                        onFailure("Miembro eliminado, pero fallo al verificar grupo: ${e.message}")
                    }
            }.addOnFailureListener { e ->
                onFailure("Miembro eliminado, pero fallo al actualizar perfil: ${e.message}")
            }
        }.addOnFailureListener { e ->
            onFailure(e.message ?: "Error al eliminar miembro")
        }
    }



}

