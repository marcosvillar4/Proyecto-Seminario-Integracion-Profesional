package tpo.seminario.breakbuddy.persistence

import android.util.Log
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.firestore.FieldValue
import java.util.Date

// Modelo de datos de usuario
data class UserProfile(
    val uid: String = "",
    val displayName: String = "",
    val email: String = "",
    val photoUrl: String = "",
    val createdAt: Date? = null,
    val lastLogin: Date? = null,
    val fcmToken: String? = null,
    val hobbiesCompletados: Boolean = false,
    val hobbies: List<String> = emptyList()
)

class UserTokenRepository {
    private val db = Firebase.firestore
    fun updateFcmToken(userId: String?, token: String) {
        userId ?: return
        db.collection("users")
            .document(userId)
            .set(mapOf("fcmToken" to token), SetOptions.merge())
            .addOnSuccessListener { Log.d("TokenRepo", "Token guardado") }
            .addOnFailureListener { e -> Log.w("TokenRepo", "Error guardando token", e) }
    }
}

class UserRepository {
    private val db = Firebase.firestore
    private val usersCollection = db.collection("users")
    private val TAG = "UserRepository"

    /**
     * Crea un nuevo documento para un usuario recién registrado.
     */
    fun createUserDocument(
        user: FirebaseUser,
        displayName: String,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val userId = user.uid
        val userEmail = user.email ?: ""

        val userData = hashMapOf(
            "displayName" to displayName,
            "email" to userEmail,
            "photoUrl" to (user.photoUrl?.toString() ?: ""),
            // Timestamps del servidor para evitar desincronización de reloj
            "createdAt" to FieldValue.serverTimestamp(),
            "lastLogin" to FieldValue.serverTimestamp(),
            "fcmToken"  to "",
            "hobbiesCompletados" to false, // ← inicializamos en false para luego activarlo al rellenar los hobbies
            "hobbies" to emptyList<String>()
            )

        usersCollection.document(userId)
            .set(userData)
            .addOnSuccessListener {
                Log.d(TAG, "Documento del usuario $userId creado con éxito.")
                onSuccess()
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error al crear documento del usuario $userId.", e)
                onFailure(e)
            }
    }

    /**
     * Crea o actualiza el campo lastLogin al iniciar sesión.
     */
    fun ensureUserDocumentExists(
        user: FirebaseUser,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val userId = user.uid

        val updateData = hashMapOf(
            "lastLogin" to FieldValue.serverTimestamp()
        )

        usersCollection.document(userId)
            .set(updateData, SetOptions.merge())
            .addOnSuccessListener {
                Log.d(TAG, "Documento del usuario $userId actualizado con éxito.")
                onSuccess()
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error al actualizar documento del usuario $userId.", e)
                onFailure(e)
            }
    }

    /**
     * Obtiene el perfil de usuario y lo mapea a UserProfile.
     */
    fun getUserProfile(
        userId: String,
        onSuccess: (UserProfile) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        usersCollection.document(userId)
            .get()
            .addOnSuccessListener { doc ->
                if (doc != null && doc.exists()) {
                    val data = doc.data ?: emptyMap<String, Any>()
                    val profile = UserProfile(
                        uid = userId,
                        displayName = data["displayName"] as? String ?: "",
                        email = data["email"] as? String ?: "",
                        photoUrl = data["photoUrl"] as? String ?: "",
                        createdAt = doc.getTimestamp("createdAt")?.toDate(),
                        lastLogin = doc.getTimestamp("lastLogin")?.toDate(),
                        fcmToken = data["fcmToken"] as? String,    // <-- mapeo de fcmToken
                        hobbiesCompletados = data["hobbiesCompletados"] as? Boolean ?: false,
                        hobbies = data["hobbies"] as? List<String> ?: emptyList()
                    )
                    onSuccess(profile)
                } else {
                    onFailure(IllegalStateException("Perfil de usuario no encontrado"))
                }
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error obteniendo perfil del usuario $userId.", e)
                onFailure(e)
            }
    }

    /**
     * Guarda la lista de hobbies y marca hobbiesCompletados = true.
     */
    fun saveHobbies(
        userId: String,
        hobbies: List<String>,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val data = mapOf(
            "hobbies" to hobbies,
            "hobbiesCompletados" to true
        )
        usersCollection.document(userId)
            .set(data, SetOptions.merge())
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener { e -> onFailure(e) }
    }
}
