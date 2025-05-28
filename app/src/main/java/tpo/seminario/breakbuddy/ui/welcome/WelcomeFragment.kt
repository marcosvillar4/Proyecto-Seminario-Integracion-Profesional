package tpo.seminario.breakbuddy.ui.welcome

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.databinding.FragmentWelcomeBinding
import tpo.seminario.breakbuddy.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import tpo.seminario.breakbuddy.persistence.UserRepository
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.GoogleAuthProvider
import androidx.activity.result.contract.ActivityResultContracts
import android.app.Activity
import androidx.media3.common.util.Log

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null;
    private val binding get() = _binding!!

    // 1. Declara la variable auth
    private lateinit var auth: FirebaseAuth


    // Para Google Sign-In
    private lateinit var googleSignInClient: GoogleSignInClient
    private val userRepo = UserRepository()
    private val RC_GOOGLE_SIGN_IN = 9001

    // 1) Prepara el launcher
    private val googleSignInLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val task = GoogleSignIn.getSignedInAccountFromIntent(result.data)
                try {
                    val acct = task.getResult(ApiException::class.java)!!
                    firebaseAuthWithGoogle(acct.idToken!!)
                } catch (e: ApiException) {
                    Toast.makeText(requireContext(),
                        "Google Sign-In falló: ${e.localizedMessage}", Toast.LENGTH_LONG).show()
                }
            }
        }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        val welcomeViewModel =
            ViewModelProvider(this)[WelcomeViewModel::class.java]

        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        welcomeViewModel.text.observe(viewLifecycleOwner){
            binding.textWelcome.text = it
        }

        //Redireccion del botón iniciar sesión
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        //Redirección del link registrarse
        binding.textRegister.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_registerFragment)
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 2. Inicializa la instancia de Firebase Auth
        auth = Firebase.auth

        // 3. Verifica si hay un usuario logueado
        val currentUser = auth.currentUser

        if (currentUser != null) {
            // Si el usuario NO es nulo, significa que ya está logueado.
            // Navega directamente al dashboard.
            // Hace falta efinir la acción de navegación en nav_graph.xml???????
            findNavController().navigate(R.id.action_welcomeFragment_to_navigation_dashboard)
        } else {
            // Si el usuario es nulo, significa que no hay nadie logueado.
            // Configurar los listeners de los botones y ver WelcomeFragment?
            setupButtonClickListeners() // Creamos una función aparte para esto
        }

        // Si no hay usuario logueado, los listeners ya se configuran en setupButtonClickListeners()
        // Si sí hay usuario logueado, la navegación ocurrirá ANTES de llegar a este punto en una ejecución normal,
        // pero es más limpio separar la configuración de listeners.


        // Inicializa GSO y client
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        googleSignInClient = GoogleSignIn.getClient(requireContext(), gso)

        binding.btnGoogleSignIn.setOnClickListener {
            // 2) Lanza por el launcher en lugar de onActivityResult
            googleSignInLauncher.launch(googleSignInClient.signInIntent)
        }
    }



    // Creamos una función para configurar los listeners de los botones
    // Solo se llamará si no hay un usuario logueado
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


    private fun firebaseAuthWithGoogle(idToken: String) {
        Log.d("WelcomeFragment", "¡Entré a firebaseAuthWithGoogle con token: $idToken")
        Toast.makeText(requireContext(),
            "firebaseAuthWithGoogle() invoked",
            Toast.LENGTH_SHORT).show()

        val credential = GoogleAuthProvider.getCredential(idToken, null)
        auth.signInWithCredential(credential)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser!!
                    // 1) Asegura o crea su doc en Firestore
                    userRepo.ensureUserDocumentExists(user,
                        onSuccess = {
                            // 2) Recupera el perfil completo
                            userRepo.getUserProfile(user.uid,
                                onSuccess = { profile ->
                                    // 3) ¿completó hobbies?
                                    if (!profile.hobbiesCompletados) {
                                        findNavController().navigate(
                                            R.id.action_welcomeFragment_to_hobbiesFragment
                                        )
                                    } else {
                                        findNavController().navigate(
                                            R.id.action_welcomeFragment_to_navigation_dashboard
                                        )
                                    }
                                },
                                onFailure = { e ->
                                    Toast.makeText(requireContext(),
                                        "Error cargando perfil: ${e.message}",
                                        Toast.LENGTH_LONG).show()
                                }
                            )
                        },
                        onFailure = { e ->
                            Toast.makeText(requireContext(),
                                "Error creando perfil: ${e.message}",
                                Toast.LENGTH_LONG).show()
                        }
                    )
                } else {
                    Toast.makeText(requireContext(),
                        "Firebase Auth falló: ${task.exception?.message}",
                        Toast.LENGTH_LONG).show()
                }
            }
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }
}