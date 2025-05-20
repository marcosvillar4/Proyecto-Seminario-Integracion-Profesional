package tpo.seminario.breakbuddy.messaging

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import tpo.seminario.breakbuddy.persistence.UserTokenRepository

class MyFirebaseMessagingService : FirebaseMessagingService() {
    private val TAG = "FCMService"

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d(TAG, "Nuevo token FCM: $token")
        // Llamamops al repositorio para guardarlo en Firestore
        UserTokenRepository().updateFcmToken(currentUserUid(), token)
    }

    // (dejamos onMessageReceived para más adelante)

    private fun currentUserUid(): String? {
        // Se obtiene el UID del usuario logueado
        return com.google.firebase.auth.FirebaseAuth.getInstance().currentUser?.uid
    }
}
