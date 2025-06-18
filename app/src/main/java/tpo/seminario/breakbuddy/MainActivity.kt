package tpo.seminario.breakbuddy

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import tpo.seminario.breakbuddy.databinding.ActivityMainBinding
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalTime
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* YA AGREGADO EN BreakBuddyApp
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
        // =============================

        */


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        findViewById<BottomNavigationView>(R.id.nav_view)
            .setupWithNavController(navController)

        val navView: BottomNavigationView = binding.navView


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_home, R.id.accountSettingsFragment,
                R.id.navigation_wheel, R.id.navigation_notifications,
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        // Comprobar si debe mostrar el Check-in
        lifecycleScope.launch {
            if (shouldNavigateToCheckin()) {
                navController.navigate(R.id.action_global_checkinFragment)
            }
        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.welcomeFragment || destination.id == R.id.loginFragment
                || destination.id == R.id.registerFragment || destination.id == R.id.hobbiesFragment
                || destination.id == R.id.challengeFragment || destination.id == R.id.passwordResetFragment
                || destination.id == R.id.testMBIFragment) {
                // Oculta action bar y menú inferior en pantalla de bienvenida
                supportActionBar?.hide()
                navView.visibility = android.view.View.GONE
            } else {
                // Muestra todo en el resto de las pantallas
                supportActionBar?.show()
                navView.visibility = android.view.View.VISIBLE
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    private suspend fun shouldNavigateToCheckin(): Boolean {
        // Obtener hora actual con Calendar (compat API 24)
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)

        if (hour < 21) return false

        // Obtener fecha como yyyy-MM-dd
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val today = dateFormat.format(calendar.time)

        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return false
        val db = FirebaseFirestore.getInstance()

        return try {
            val snapshot = db.collection("usuarios")
                .document(userId)
                .collection("checkins")
                .document(today)
                .get()
                .await()

            !snapshot.exists() // true si NO existe → debe mostrar check-in
        } catch (e: Exception) {
            Log.e("Checkin", "Error consultando checkin de hoy", e)
            false
        }
    }


}