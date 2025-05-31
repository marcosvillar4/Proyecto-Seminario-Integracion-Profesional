package tpo.seminario.breakbuddy

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import tpo.seminario.breakbuddy.databinding.ActivityMainBinding

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
                R.id.navigation_home, R.id.navigation_dashboard, R.id.accountSettingsFragment,
                R.id.navigation_wheel
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.welcomeFragment || destination.id == R.id.loginFragment || destination.id == R.id.registerFragment || destination.id == R.id.hobbiesFragment) {
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
}