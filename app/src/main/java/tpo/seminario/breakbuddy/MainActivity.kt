package tpo.seminario.breakbuddy

import android.content.pm.PackageManager
import android.os.Build
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
import java.util.TimeZone
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(
                    arrayOf(android.Manifest.permission.POST_NOTIFICATIONS),
                    1001
                )
            }
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        findViewById<BottomNavigationView>(R.id.nav_view)
            .setupWithNavController(navController)

        val navView: BottomNavigationView = binding.navView


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
                findNavController(R.id.nav_host_fragment_activity_main)
                    .navigate(R.id.action_global_checkinFragment)
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
        val calendar = Calendar.getInstance()
        calendar.timeZone = TimeZone.getDefault()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)
        val user2 = FirebaseAuth.getInstance().currentUser
        val userId2 = user2?.uid

        Log.d("CheckinDebug", "🆔 UID actual: $userId2")
        Log.d("CheckinDebug", "🕘 Hora actual: $hour:$minute")

        // Solo permitir entre 21:00 y 23:59
        if (hour < 0) {
            Log.d("CheckinDebug", "⛔ Fuera del horario de check-in")
            return false
        }

        val auth = FirebaseAuth.getInstance()
        val user = auth.currentUser
        if (user == null) {
            Log.d("CheckinDebug", "⛔ Usuario no logueado aún")
            return false
        }

        val userId = user.uid
        val db = FirebaseFirestore.getInstance()

        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val today = dateFormat.format(calendar.time)

        return try {
            val snapshot = db.collection("userProfiles")
                .document(userId)
                .collection("checkins")
                .document(today)
                .get()
                .await()

            if (snapshot.exists()) {
                Log.d("CheckinDebug", "✅ Check-in ya hecho hoy")
                false
            } else {
                Log.d("CheckinDebug", "🟢 Mostrar check-in (aún no hecho)")
                true
            }
        } catch (e: Exception) {
            Log.e("CheckinDebug", "❌ Error consultando check-in: ${e.message}")
            false
        }
    }

}