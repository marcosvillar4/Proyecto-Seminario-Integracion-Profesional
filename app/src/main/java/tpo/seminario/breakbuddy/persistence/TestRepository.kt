package tpo.seminario.breakbuddy.persistence

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import tpo.seminario.breakbuddy.ui.test.TestResult

class TestRepository {

    private val auth = FirebaseAuth.getInstance()
    private val db   = FirebaseFirestore.getInstance()

    fun saveTestResult(
        result: TestResult,
        onSuccess: (String) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val currentUser = auth.currentUser
        if (currentUser == null) {
            onFailure("Usuario no autenticado")
            return
        }
        val uid = currentUser.uid

        // Creamos un nuevo documento con id autogenerado
        val testDocsRef = db.collection("users")
            .document(uid)
            .collection("tests")
            .document() // .document() sin parámetro → autoID

        // Creamos un nuevo TestResult con el ID generado
        val newId = testDocsRef.id

        // Construimos el objeto a guardar (sobrescribimos id y confirmamos timestamp no sea 0)
        val toSave = result.copy(
            id = newId,
            timestamp = if (result.timestamp != 0L) result.timestamp else System.currentTimeMillis()
        )

        testDocsRef.set(toSave, SetOptions.merge())
            .addOnSuccessListener {
                onSuccess(newId)
            }
            .addOnFailureListener { exc ->
                val msg = exc.message ?: "Error desconocido guardando resultado"
                onFailure(msg)
            }
    }
}
