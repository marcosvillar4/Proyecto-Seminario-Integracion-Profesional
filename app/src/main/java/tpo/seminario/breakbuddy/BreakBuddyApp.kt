package tpo.seminario.breakbuddy

import android.app.Application
import android.util.Log
import com.google.firebase.BuildConfig
import com.google.firebase.Firebase
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.google.firebase.firestore.firestore


class BreakBuddyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // 1) Inicializar Firebase
        FirebaseApp.initializeApp(this)

        //2)
        // === Configuración offline ===
        // No hace falta .setPersistenceEnabled(true)??????? — puede que ya esté activo por defecto en Android.
        // Se puede ajustar el tamaño de la caché local:
        val settings = FirebaseFirestoreSettings.Builder()
            .setPersistenceEnabled(true)
            // límite de caché local (por defecto 100 MB):
            // .setCacheSizeBytes(FirebaseFirestoreSettings.CACHE_SIZE_UNLIMITED)
            .build()

        /*
        * Todavía hace falta diseñar y escribir el código en la parte de app (en Fragments, Activities, ViewModels, etc.)
        * para que funcione fluidamente, mostrando datos de la caché cuando sea necesario y manejando las operaciones
        * de escritura offline de una manera que tenga sentido para el usuario, es decir, hace falta poder implementar
        * el funcionamiento de la app de manera que pueda escribir tambien en la caché local.
        */

        FirebaseFirestore.getInstance().firestoreSettings = settings

        // 3) Conectar al Emulator Suite solo en debug builds
        if (BuildConfig.DEBUG) {
            // Para Android emulator: localhost -> 10.0.2.2
            FirebaseAuth.getInstance().useEmulator("10.0.2.2", 9099)
            Firebase.firestore.useEmulator("10.0.2.2", 8080)
            Log.d("BreakBuddyApp", "Connected to Firebase Emulators")
        }
}
}


