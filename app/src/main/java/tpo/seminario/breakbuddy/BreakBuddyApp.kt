package tpo.seminario.breakbuddy

import android.app.Application
import android.content.pm.ApplicationInfo
import android.util.Log
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings

class BreakBuddyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("BreakBuddyApp", "🛠️ Application.onCreate start")

        // 1) Inicializa FirebaseApp y AdMob
        MobileAds.initialize(this) { Log.d("BreakBuddyApp", "AdMob initialized") }
        FirebaseApp.initializeApp(this)
        Log.d("BreakBuddyApp", "FirebaseApp initialized")

        // 2) Detectar debug / emulador
        val isDebuggable = (applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE) != 0
        if (!isDebuggable) {
            Log.d("BreakBuddyApp", "🔌 DEBUG mode: conectando a Emuladores")
            FirebaseAuth.getInstance().useEmulator("10.0.2.2", 9099)
            // ¡Importante!: esta llamada precede a cualquier getInstance() de Firestore
            FirebaseFirestore.getInstance().useEmulator("10.0.2.2", 8080)
            Log.d("BreakBuddyApp", "✅ Conectado a Firebase Emulators")
        } else {
            Log.d("BreakBuddyApp", "⚠️ RELEASE mode: usando producción")
        }

        // 3) Ahora sí configuramos Firestore settings
        val settings = FirebaseFirestoreSettings.Builder()
            .setPersistenceEnabled(true)
            .build()
        FirebaseFirestore.getInstance().firestoreSettings = settings
        Log.d("BreakBuddyApp", "Firestore persistence enabled (emulator or prod)")

        // Configura Google Sign-In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        GoogleSignIn.getClient(this, gso)
        Log.d("BreakBuddyApp", "Google Sign-In configured")


    }
}
