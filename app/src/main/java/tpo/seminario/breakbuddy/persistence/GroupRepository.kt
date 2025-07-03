package tpo.seminario.breakbuddy.persistence

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.functions.FirebaseFunctions
import com.google.firebase.functions.FirebaseFunctionsException
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.MembershipStatus
import java.util.UUID
import kotlin.random.Random

class GroupRepository {
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()

    private val userRepo = UserRepository()
    private val orgRepo = OrganizationRepository()

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
        val currentUser = FirebaseAuth.getInstance().currentUser
        if (currentUser == null) {
            onFailure("Usuario no autenticado")
            return
        }

        if (type == "organization") {

            orgRepo.createOrganization(name, emails, onSuccess, onFailure)
            return
        }


        val data = mapOf(
            "name" to name.trim(),
            "emails" to emails,
            "hobby" to (hobby?.trim())
        )

        FirebaseFunctions.getInstance()
            .getHttpsCallable("createPersonalGroup")
            .call(data)
            .addOnSuccessListener { res ->
                val result = res.data as? Map<*, *>
                val code = result?.get("code") as? String
                if (code != null) {
                    onSuccess(code)
                } else {
                    onFailure("Respuesta inválida del servidor")
                }
            }
            .addOnFailureListener { e ->
                val msg = (e as? com.google.firebase.functions.FirebaseFunctionsException)
                    ?.details
                    ?.let { (it as? Map<*, *>)?.get("message") as? String }
                    ?: e.message
                    ?: "Error creando grupo"
                onFailure(msg)
            }
    }




    private fun generateUniqueGroupCode(callback: (String?) -> Unit) {
        val code = generateRandomCode()


        db.collection("groups")
            .whereEqualTo("code", code)
            .get()
            .addOnSuccessListener { documents ->
                if (documents.isEmpty) {

                    callback(code)
                } else {

                    generateUniqueGroupCode(callback)
                }
            }
            .addOnFailureListener {
                callback(null)
            }
    }


    private fun generateRandomCode(): String {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
        return (1..6)
            .map { chars[Random.nextInt(chars.length)] }
            .joinToString("")
    }


    fun joinGroupByCode(
        code: String,
        onSuccess: (entityType: String, entityId: String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val user = auth.currentUser ?: return onFailure("Usuario no autenticado")
        val data = mapOf("code" to code.uppercase())
        FirebaseFunctions.getInstance()
            .getHttpsCallable("joinByCode")
            .call(data)
            .addOnSuccessListener { res ->
                val payload = res.data as? Map<*, *>
                val type = payload?.get("type") as? String
                val id   = payload?.get("id")   as? String
                if (type != null && id != null) {
                    onSuccess(type, id)
                } else {
                    onFailure("Respuesta inválida del servidor")
                }
            }
            .addOnFailureListener { e ->
                val msg = (e as? FirebaseFunctionsException)
                    ?.details
                    ?.let { (it as? Map<*, *>)?.get("message") as? String }
                    ?: e.message ?: "Error uniéndose"
                onFailure(msg)
            }
    }


    fun addMemberByEmail(
        groupId: String,
        email: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = FirebaseAuth.getInstance().currentUser
            ?: return onFailure("Usuario no autenticado")

        val data = mapOf(
            "groupId" to groupId,
            "email"   to email.trim().lowercase()
        )
        FirebaseFunctions.getInstance()
            .getHttpsCallable("addGroupMember")
            .call(data)
            .addOnSuccessListener { _ ->
                onSuccess()
            }
            .addOnFailureListener { e ->
                val msg = (e as? FirebaseFunctionsException)
                    ?.details
                    ?.let { (it as? Map<*, *>)?.get("message") as? String }
                    ?: e.message
                    ?: "Error agregando miembro"
                onFailure(msg)
            }
    }

    // GroupRepository.kt

    fun removeMemberFromGroup(
        groupId: String,
        memberUidToRemove: String,
        memberEmailToRemove: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = FirebaseAuth.getInstance().currentUser
            ?: return onFailure("Usuario no autenticado")

        val data = mapOf(
            "groupId"       to groupId,
            "memberUid"     to memberUidToRemove,
            "memberEmail"   to memberEmailToRemove.trim().lowercase()
        )

        FirebaseFunctions.getInstance()
            .getHttpsCallable("removeGroupMember")
            .call(data)
            .addOnSuccessListener { _ ->
                onSuccess()
            }
            .addOnFailureListener { e ->
                val msg = (e as? FirebaseFunctionsException)
                    ?.details
                    ?.let { (it as? Map<*, *>)?.get("message") as? String }
                    ?: e.message
                    ?: "Error removiendo miembro"
                onFailure(msg)
            }
    }



}

