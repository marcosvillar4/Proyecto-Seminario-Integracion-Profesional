package tpo.seminario.breakbuddy.persistence

import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.WriteBatch
import com.google.firebase.functions.FirebaseFunctions
import com.google.firebase.functions.FirebaseFunctionsException
import com.google.firebase.functions.functions
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

    private val functions: FirebaseFunctions = Firebase.functions


    fun createOrganization(
        name: String,
        emails: List<String>,
        onSuccess: (String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = FirebaseAuth.getInstance().currentUser
            ?: return onFailure("Usuario no autenticado")

        FirebaseFunctions.getInstance()
            .getHttpsCallable("createOrganization")
            .call(mapOf("name" to name, "emails" to emails))
            .addOnSuccessListener { res ->
                val data = res.data as? Map<*, *>
                val code = data?.get("code") as? String
                if (code != null) {
                    onSuccess(code)
                } else {
                    onFailure("Respuesta inválida del servidor")
                }
            }
            .addOnFailureListener { e ->
                val msg = (e as? FirebaseFunctionsException)
                    ?.details
                    ?.let { (it as? Map<*, *>)?.get("message") as? String }
                    ?: e.message
                    ?: "Error creando organización"
                onFailure(msg)
            }
    }




    fun addMemberByEmail(
        orgId: String,
        email: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val functions = FirebaseFunctions.getInstance()
        val payload = mapOf(
            "orgId" to orgId,
            "email" to email.trim().lowercase()
        )

        functions
            .getHttpsCallable("addOrganizationMember")
            .call(payload)
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { e ->

                val err = (e as? FirebaseFunctionsException)?.details
                    ?: e.message
                    ?: "Error inesperado"
                onFailure(err.toString())
            }
    }




    fun leaveOrganization(
        orgId: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        val functions = FirebaseFunctions.getInstance()
        functions
            .getHttpsCallable("leaveOrganization")
            .call(mapOf("orgId" to orgId))
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { e ->
                val err = (e as? FirebaseFunctionsException)?.details ?: e.message ?: "Error inesperado"
                onFailure(err.toString())
            }
    }


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


    fun getOrganizationById(
        orgId: String,
        onSuccess: (Organization) -> Unit,
        onFailure: (String) -> Unit
    ) {
        functions
            .getHttpsCallable("getOrganizationDetails")
            .call(mapOf("orgId" to orgId))
            .addOnSuccessListener { result ->
                val data = result.data as? Map<*, *> ?: run {
                    onFailure("Respuesta inesperada")
                    return@addOnSuccessListener
                }
                try {

                    val createdAt: Timestamp? = (data["createdAt"] as? Map<*, *>)?.let { tsMap ->
                        val seconds = (tsMap["_seconds"] as Number).toLong()
                        val nanos   = (tsMap["_nanoseconds"] as Number).toInt()
                        Timestamp(seconds, nanos)
                    }
                    val updatedAt: Timestamp? = (data["updatedAt"] as? Map<*, *>)?.let { tsMap ->
                        val seconds = (tsMap["_seconds"] as Number).toLong()
                        val nanos   = (tsMap["_nanoseconds"] as Number).toInt()
                        Timestamp(seconds, nanos)
                    }

                    val org = Organization(
                        id              = data["id"] as String,
                        name            = data["name"] as String,
                        code            = data["code"] as String,
                        type            = data["type"] as String,
                        ownerUid        = data["ownerUid"] as String,
                        memberIds       = (data["memberIds"] as List<*>).filterIsInstance<String>(),
                        memberCount     = (data["memberCount"] as Number).toInt(),
                        emails          = (data["emails"] as List<*>).filterIsInstance<String>(),
                        createdAt       = createdAt,
                        updatedAt       = updatedAt,
                        hobbiesUnicos   = (data["hobbiesUnicos"] as? List<Map<String,Any?>>)
                            ?.map { UniqueHobbyEntry(it["hobby"] as String, it["userId"] as String) }
                            ?: emptyList(),
                        gruposDerivados = (data["gruposDerivados"] as? List<Map<String,Any?>>)
                            ?.map { DerivedGroupEntry(it["hobby"] as String, it["groupId"] as String) }
                            ?: emptyList()
                    )
                    onSuccess(org)
                } catch (e: Exception) {
                    onFailure("Error mapeando organización: ${e.message}")
                }
            }
            .addOnFailureListener { exc ->
                val msg = if (exc is FirebaseFunctionsException) {
                    exc.message ?: "Error en función"
                } else {
                    exc.localizedMessage ?: "Error desconocido"
                }
                onFailure(msg)
            }
    }



    fun joinOrganizationByCode(
        code: String,
        onSuccess: (String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val functions = FirebaseFunctions.getInstance()
        functions
            .getHttpsCallable("joinOrganization")
            .call(mapOf("code" to code))
            .addOnSuccessListener { result ->

                val data = result.data as? Map<*,*> ?: run {
                    onFailure("Respuesta inesperada del servidor")
                    return@addOnSuccessListener
                }
                val orgId = data["orgId"] as? String ?: run {
                    onFailure("No recibí el orgId")
                    return@addOnSuccessListener
                }
                onSuccess(orgId)
            }
            .addOnFailureListener { e ->

                val msg = if (e is FirebaseFunctionsException) {
                    e.message ?: "Error al unirse a la org"
                } else {
                    e.localizedMessage ?: "Error de red"
                }
                onFailure(msg)
            }
    }





    fun removeMemberFromOrganization(
        orgId: String,
        memberUidToRemove: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {

        val functions = FirebaseFunctions.getInstance()
        functions
            .getHttpsCallable("removeOrganizationMember")
            .call(mapOf(
                "orgId" to orgId,
                "memberUid" to memberUidToRemove
            ))
            .addOnSuccessListener {
                onSuccess()
            }
            .addOnFailureListener { e ->
                val msg = if (e is FirebaseFunctionsException)
                    e.message
                else
                    e.localizedMessage
                onFailure(msg ?: "Error al remover miembro")
            }
    }














}