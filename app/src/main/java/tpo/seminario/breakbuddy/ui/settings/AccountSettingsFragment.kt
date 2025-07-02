package tpo.seminario.breakbuddy.ui.settings

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestoreException
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentAccountSettingsBinding
import tpo.seminario.breakbuddy.persistence.User
import tpo.seminario.breakbuddy.persistence.UserRepository




import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.LoadAdError
import android.os.Handler
import android.os.Looper
import com.google.android.gms.ads.AdView


class AccountSettingsFragment : Fragment() {
    private var _binding: FragmentAccountSettingsBinding? = null
    private val binding get() = _binding!!


    //AdMob banner
    private lateinit var adView: AdView
    private val retryDelayMs = 2000L

    private val auth = FirebaseAuth.getInstance()
    private val userRepo = UserRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAccountSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        // banner AdMob
        adView = view.findViewById(R.id.adViewAccount)
        adView.adListener = object : AdListener() {
            override fun onAdLoaded() {
                Log.d("AdMob", "Account banner loaded")
            }
            override fun onAdFailedToLoad(error: LoadAdError) {
                Log.e("AdMob", "Account banner failed: ${error.message}")
                Handler(Looper.getMainLooper()).postDelayed({
                    adView.loadAd(AdRequest.Builder().build())
                }, retryDelayMs)
            }
        }
        adView.loadAd(AdRequest.Builder().build())



        Log.d("AccountSettings", "ViewCreated: setting up UI and fetching user name")

        Glide.with(this)
            .load(R.drawable.ic_default_avatar)
            .into(binding.profileImageView)

        binding.cardEditProfile.setOnClickListener {
            findNavController().navigate(
                R.id.action_accountSettingsFragment_to_editProfileFragment
            )
        }

        binding.cardEditHobbies.setOnClickListener {
            findNavController().navigate(
                R.id.action_accountSettingsFragment_to_editHobbiesFragment
            )
        }

        binding.cardChangePassword.setOnClickListener {
            findNavController().navigate(
                R.id.action_accountSettingsFragment_to_changePasswordFragment
            )
        }

        binding.btnLogout.setOnClickListener {
            auth.signOut()
            val options = NavOptions.Builder()
                .setPopUpTo(R.id.mobile_navigation, true)
                .build()
            findNavController().navigate(
                R.id.action_accountSettingsFragment_to_WelcomeFragment,
                null,
                options
            )
        }

        fetchAndShowUserName()
    }

    override fun onResume() {
        super.onResume()
        Log.d("AccountSettings", "onResume: refreshing user name")
        fetchAndShowUserName()
    }

    private fun fetchAndShowUserName() {
        val currentUser = auth.currentUser
        if (currentUser == null) {
            Log.w("AccountSettings", "No user logged in, showing default greeting")
            binding.textGreeting.text = "¡Hola, usuario!"
            return
        }

        Log.d("AccountSettings", "Fetching profile for uid=${currentUser.uid}")
        userRepo.getUser(
            currentUser.uid,
            onSuccess = { profile: User ->
                if (!isAdded || _binding == null) return@getUser
                val nombre = profile.displayName.takeIf { it.isNotBlank() } ?: "usuario"
                Log.d("AccountSettings", "Profile loaded: displayName=$nombre")
                binding.textGreeting.text = "¡Hola, $nombre!"
            },
            onFailure = onFailure@{ exception: Exception ->
                if (!isAdded || _binding == null) return@onFailure
                Log.e("AccountSettings", "Error loading profile", exception)
                binding.textGreeting.text = "¡Hola, usuario!"
                val msg = when (exception) {
                    is FirebaseFirestoreException -> "Error de red"
                    else -> exception.message ?: "Error desconocido"
                }
                Toast.makeText(requireContext(), "Error cargando nombre: $msg", Toast.LENGTH_SHORT).show()
            }
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
