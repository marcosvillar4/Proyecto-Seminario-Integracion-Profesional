package tpo.seminario.breakbuddy.ui.welcome

import android.app.Activity
import androidx.viewpager2.widget.ViewPager2
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.auth.api.signin.*
import com.google.android.gms.common.api.ApiException
import com.google.android.material.button.MaterialButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentWelcomeBinding
import tpo.seminario.breakbuddy.persistence.UserRepository
import androidx.media3.common.util.Log
import androidx.media3.common.util.UnstableApi

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var auth: FirebaseAuth
    private lateinit var googleSignInClient: GoogleSignInClient
    private val userRepo = UserRepository()

    private val googleSignInLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
                try {
                    val acct = task.getResult(ApiException::class.java)!!
                    firebaseAuthWithGoogle(acct.idToken!!)
                } catch (e: ApiException) {
                    Toast.makeText(
                        requireContext(),
                        "Google Sign-In falló: ${e.localizedMessage}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = Firebase.auth
        val currentUser = auth.currentUser

        if (currentUser != null) {
            findNavController().navigate(R.id.action_welcomeFragment_to_navigation_dashboard)
        } else {
            setupButtonClickListeners()
        }

        // ViewPager Setup
        val slides = listOf(
            R.layout.item_onboarding_slide_1,
            R.layout.item_onboarding_slide_2,
            R.layout.item_onboarding_slide_3
        )
        binding.viewPager.adapter = OnboardingAdapter(slides)


        val indicators = listOf(
            binding.indicator1,
            binding.indicator2,
            binding.indicator3
        )

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                indicators.forEachIndexed { index: Int, view: View ->
                    view.setBackgroundResource(
                        if (index == position) R.drawable.indicator_active else R.drawable.indicator_inactive
                    )
                }
            }
        })


        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(requireContext(), gso)

        binding.btnGoogleSignIn.setOnClickListener {
            googleSignInLauncher.launch(googleSignInClient.signInIntent)
        }
    }

    private fun setupButtonClickListeners() {
        // Botón para ir a Login
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        // Botón para ir a Register
        binding.textRegister.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_registerFragment)
        }
    }


    @OptIn(UnstableApi::class)
    private fun firebaseAuthWithGoogle(idToken: String) {
        Log.d("WelcomeFragment", "Entré a firebaseAuthWithGoogle con token: $idToken")
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        auth.signInWithCredential(credential)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser!!
                    userRepo.ensureUserDocumentExistsOrCreate(
                        user,
                        onSuccess = {
                            userRepo.getUserProfile(
                                user.uid,
                                onSuccess = { profile ->
                                    if (!profile.hobbiesCompletados) {
                                        findNavController().navigate(R.id.action_welcomeFragment_to_hobbiesFragment)
                                    } else {
                                        findNavController().navigate(R.id.action_welcomeFragment_to_navigation_dashboard)
                                    }
                                },
                                onFailure = { e ->
                                    Toast.makeText(
                                        requireContext(),
                                        "Error cargando perfil: ${e.message}",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                            )
                        },
                        onFailure = { e ->
                            Toast.makeText(
                                requireContext(),
                                "Error creando/actualizando perfil: ${e.message}",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    )
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Firebase Auth falló: ${task.exception?.message}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
    }

    class OnboardingAdapter(private val layouts: List<Int>) :
        RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>() {

        inner class OnboardingViewHolder(val view: View) : RecyclerView.ViewHolder(view)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(layouts[viewType], parent, false)
            return OnboardingViewHolder(view)
        }

        override fun getItemCount(): Int = layouts.size

        override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
            // Los layouts ya están diseñados individualmente
        }

        override fun getItemViewType(position: Int): Int = position
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
