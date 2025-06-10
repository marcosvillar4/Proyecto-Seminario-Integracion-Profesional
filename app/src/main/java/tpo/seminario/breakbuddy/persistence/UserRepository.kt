package tpo.seminario.breakbuddy.persistence

import android.util.Log
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.DocumentId
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.QuerySnapshot
import java.util.Date

// Modelo de datos de usuario
data class User(
    val uid: String = "",
    val displayName: String = "",
    val email: String = "",
    val photoUrl: String = "",
    val createdAt: Date? = null,
    val lastLogin: Date? = null,
    val fcmToken: String? = null,
    val description: String? = null
)

data class UserProfile(
    @DocumentId
    val uid: String = "",
    val hobbies: List<String> = emptyList(),
    val hobbiesCompletados: Boolean = false,
    val orgIds: List<String> = emptyList(),
    val personalGroupIds: List<String> = emptyList()
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
    private val profilesCollection = db.collection("userProfiles")
    private val TAG = "UserRepository"


    /**
     * Lee el perfil ligero completo de /userProfiles/{uid}.
     */
    fun getUserProfileLight(
        uid: String,
        onSuccess: (UserProfile) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        profilesCollection.document(uid)
            .get()
            .addOnSuccessListener { doc ->
                if (doc.exists()) {
                    // Mapear a UserProfile
                    try {
                        val profile = doc.toObject(UserProfile::class.java)
                        if (profile != null) {
                            onSuccess(profile)
                        } else {
                            onFailure(IllegalStateException("Perfil ligero inválido"))
                        }
                    } catch (e: Exception) {
                        onFailure(e)
                    }
                } else {
                    onFailure(IllegalStateException("Perfil ligero no encontrado"))
                }
            }
            .addOnFailureListener { e ->
                onFailure(e)
            }
    }

    // Asegurar existencia de perfil ligero:
    fun ensureUserProfileExists(uid: String) {
        profilesCollection.document(uid)
            .get()
            .addOnSuccessListener { doc ->
                if (!doc.exists()) {
                    createUserProfile(uid,
                        onSuccess = { /* no-op */ },
                        onFailure = { e ->
                            Log.w(TAG, "Error creando perfil ligero en ensureUserProfileExists", e)
                        }
                    )
                }
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error leyendo perfil ligero en ensureUserProfileExists", e)
            }
    }
    // 1) Crear perfil ligero al registrarse
    fun createUserProfile(
        uid: String,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val profile = mapOf(
            "hobbies" to emptyList<String>(),
            "hobbiesCompletados" to false,
            "orgIds" to emptyList<String>(),
            "personalGroupIds" to emptyList<String>()
        )
        db.collection("userProfiles")
            .document(uid)
            .set(profile)
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener { e -> onFailure(e) }
    }

    // 2) Leer hobbies desde userProfiles
    fun getUserHobbiesProfile(
        uid: String,
        onSuccess: (List<String>) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        db.collection("userProfiles")
            .document(uid)
            .get()
            .addOnSuccessListener { doc ->
                if (doc.exists()) {
                    @Suppress("UNCHECKED_CAST")
                    val list = doc.get("hobbies") as? List<String> ?: emptyList()
                    onSuccess(list)
                } else {
                    onFailure(IllegalStateException("Perfil ligero no encontrado"))
                }
            }
            .addOnFailureListener(onFailure)
    }

    // 3) Guardar hobbies en userProfiles
    fun saveUserHobbiesProfile(
        uid: String,
        hobbies: List<String>,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val data = mapOf(
            "hobbies" to hobbies,
            "hobbiesCompletados" to true
        )
        db.collection("userProfiles")
            .document(uid)
            .set(data, SetOptions.merge())
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener(onFailure)
    }




    /**
     *  Asegura que exista el documento de usuario.
     *  Si no existe, lo crea con los valores básicos. Si ya existe, solo actualiza lastLogin.
     */
    fun ensureUserDocumentExistsOrCreate(
        user: FirebaseUser,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val userId = user.uid
        usersCollection.document(userId)
            .get()
            .addOnSuccessListener { doc ->
                if (doc.exists()) {
                    // El documento ya existía, solo actualizamos lastLogin
                    val updateData = mapOf("lastLogin" to FieldValue.serverTimestamp())
                    usersCollection.document(userId)
                        .set(updateData, SetOptions.merge())
                        .addOnSuccessListener {
                            ensureUserProfileExists(userId)
                            onSuccess()
                        }
                        .addOnFailureListener { e ->
                            onFailure(e)
                        }
                } else {
                    // No existía: lo creamos completamente desde cero
                    val userEmail = user.email ?: ""
                    val userData = hashMapOf(
                        "displayName" to (user.displayName ?: ""),
                        "email" to userEmail,
                        "photoUrl" to (user.photoUrl?.toString() ?: ""),
                        "createdAt" to FieldValue.serverTimestamp(),
                        "lastLogin" to FieldValue.serverTimestamp(),
                        "fcmToken"  to "",
                        "orgID" to null
                    )
                    usersCollection.document(userId)
                        .set(userData)
                        .addOnSuccessListener {
                            createUserProfile(userId, { /*no-op*/ }, { /*log*/ })
                            onSuccess()
                        }
                        .addOnFailureListener { e ->
                            onFailure(e)
                        }
                }
            }
            .addOnFailureListener { e ->
                onFailure(e)
                Log.w(TAG, "Error obteniendo documento del usuario $userId.", e)
            }
    }

    /**
     * Crea un nuevo documento para un usuario recién registrado.
     */
    fun createUserDocument(
        user: FirebaseUser,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val userId = user.uid
        val userEmail = user.email ?: ""
        val userName = user.displayName ?: ""
        val userPhoto = user.photoUrl?.toString() ?: ""

        // Preparamos un mapa con los campos que queremos guardar/actualizar:
        val userData = hashMapOf<String, Any>(
            "displayName" to userName,
            "email" to userEmail,
            "photoUrl" to userPhoto,
            // Si el documento no existía, queremos guardar createdAt:
            "createdAt" to FieldValue.serverTimestamp(),
            // Siempre actualizamos lastLogin:
            "lastLogin" to FieldValue.serverTimestamp(),
            "fcmToken" to "", // Inicializamos fcmToken como null
            // Si quieres inicializar hobbiesCompletados = false:
            "description" to "",

        )

        // Hacemos un set con SetOptions.merge() para no sobrescribir
        usersCollection.document(userId)
            .set(userData, SetOptions.merge())
            .addOnSuccessListener {
                Log.d(TAG, "Documento del usuario $userId creado/actualizado con éxito.")
                onSuccess()
                createUserProfile(userId,
                    onSuccess = { onSuccess() },
                    onFailure = { e ->
                        Log.w(TAG, "No pude crear userProfile", e)
                        onFailure(e)
                    }
                )
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error creando/actualizando documento del usuario $userId.", e)
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
    fun getUser(
        userId: String,
        onSuccess: (User) -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        usersCollection.document(userId)
            .get()
            .addOnSuccessListener { doc ->
                if (doc != null && doc.exists()) {
                    val data = doc.data ?: emptyMap<String, Any>()
                    val profile = User(
                        uid = userId,
                        displayName = data["displayName"] as? String ?: "",
                        email = data["email"] as? String ?: "",
                        photoUrl = data["photoUrl"] as? String ?: "",
                        createdAt = doc.getTimestamp("createdAt")?.toDate(),
                        lastLogin = doc.getTimestamp("lastLogin")?.toDate(),
                        fcmToken = data["fcmToken"] as? String,    // <-- mapeo de fcmToken
                        description = data["description"] as? String ?: ""
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



    fun updateUser(
        userId: String,
        newName: String,
        newDescription: String,
        onSuccess: () -> Unit,
        onFailure: (Exception) -> Unit
    ) {
        val data = hashMapOf<String, Any>(
            "displayName" to newName,
            "description" to newDescription
        )
        usersCollection.document(userId)
            .set(data, SetOptions.merge())   // merge para no borrar los demás campos
            .addOnSuccessListener { onSuccess() }
            .addOnFailureListener { e -> onFailure(e) }
    }

    fun validateEmailsExist(
        emails: List<String>,
        onComplete: (existents: List<String>, notExistents: List<String>) -> Unit,
        onError: (Exception) -> Unit
    ) {
        if (emails.isEmpty()) {
            // Si la lista está vacía, devolvemos listas vacías inmediatamente
            onComplete(emptyList(), emptyList())
            return
        }

        // Firestore limit: dondeIn máximo 10 valores. Si emails.size > 10, hay que particionar.
        val partitions: List<List<String>> = if (emails.size <= 10) {
            listOf(emails)
        } else {
            // Dividir en grupos de 10
            emails.chunked(10)
        }

        val existentsMutable = mutableSetOf<String>()   // para recolectar emails encontrados
        val notExistentsMutable = mutableSetOf<String>()// para recolectar emails no encontrados

        // Llenamos inicialmente notExistentsMutable = todos los emails; luego eliminamos los que encontremos:
        notExistentsMutable.addAll(emails)

        // Contador de “peticiones pendientes” para saber cuándo finalizamos todas las sub-queries
        var pendingQueries = partitions.size

        for (batch in partitions) {
            usersCollection
                .whereIn("email", batch)
                .get()
                .addOnSuccessListener { snapshot: QuerySnapshot ->
                    // 1) Por cada documento => extraer el campo email
                    for (doc in snapshot.documents) {
                        val foundEmail = doc.getString("email")
                        if (foundEmail != null) {
                            existentsMutable.add(foundEmail)
                            notExistentsMutable.remove(foundEmail)
                        }
                    }
                    pendingQueries -= 1
                    if (pendingQueries == 0) {
                        // Todas las sub-queries han finalizado => devolvemos resultado
                        onComplete(existentsMutable.toList(), notExistentsMutable.toList())
                    }
                }
                .addOnFailureListener { exception ->
                    // Si alguna falla, podemos abortar todo
                    onError(exception)
                }
        }
    }
    /**
     * Devuelve un Map<email, uid> y la lista de emails no encontrados.
     */
    fun fetchUidsForEmails(
        emails: List<String>,
        onComplete: (Map<String,String>, List<String>) -> Unit,
        onError: (Exception) -> Unit
    ) {
        if (emails.isEmpty()) {
            onComplete(emptyMap(), emptyList())
            return
        }

        val chunks = emails.chunked(10)
        val result = mutableMapOf<String,String>()
        val notFound = mutableListOf<String>()
        var done = 0

        chunks.forEach { chunk ->
            db.collection("users")
                .whereIn("email", chunk)
                .get()
                .addOnSuccessListener { snap ->
                    // Recolectar UIDs encontrados:
                    snap.documents.forEach { doc ->
                        val emailFound = doc.getString("email") ?: ""
                        val uidFound   = doc.id
                        if (emailFound.isNotEmpty()) {
                            result[emailFound] = uidFound
                        }
                    }
                    // Detectar correos del chunk que no aparecieron en `result`:
                    chunk.forEach { em ->
                        if (!result.containsKey(em)) {
                            notFound.add(em)
                        }
                    }
                    done++
                    if (done == chunks.size) {
                        onComplete(result, notFound)
                    }
                }
                .addOnFailureListener { e ->
                    onError(e)
                }
        }
    }


}
