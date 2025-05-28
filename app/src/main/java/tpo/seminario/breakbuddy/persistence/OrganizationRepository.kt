package tpo.seminario.breakbuddy.persistence

import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.util.Organization

class OrganizationRepository {
    private val db = FirebaseFirestore.getInstance()



    /** 1) Obtiene todas las organizaciones */
    fun fetchAll(
        onSuccess: (List<Organization>) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        db.collection("organizations")
            .get()
            .addOnSuccessListener { snap ->
                val list = snap.documents.mapNotNull { it.toObject(Organization::class.java)?.copy(id = it.id) }
                onSuccess(list)
            }
            .addOnFailureListener(onFailure)
    }

    /** 2) Crea una nueva organización */
    fun createOrganization(
        name: String,
        onSuccess: (Organization) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val ref = db.collection("organizations").document()
        val org = Organization(id = ref.id, name = name.trim())
        ref.set(org)
            .addOnSuccessListener { onSuccess(org) }
            .addOnFailureListener { e -> onFailure(e.message ?: "Error creando org") }
    }
}
