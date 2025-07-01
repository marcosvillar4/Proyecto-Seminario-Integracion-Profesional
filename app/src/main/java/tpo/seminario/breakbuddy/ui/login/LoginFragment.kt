package tpo.seminario.breakbuddy.ui.login

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.databinding.FragmentLoginBinding
import tpo.seminario.breakbuddy.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import tpo.seminario.breakbuddy.persistence.UserRepository

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private lateinit var auth: FirebaseAuth
    private val TAG = "LoginFragment"

    private val userRepo = UserRepository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        auth = Firebase.auth

        // NOTA: no iniciamos listeners aquí que dependen de la UI; la lógica principal va en onViewCreated
        return binding.root
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            val email = binding.inputEmail.text.toString()
            val password = binding.inputPassword.text.toString()

            if (email.isBlank() || password.isBlank()) {
                context?.let { ctx ->
                    Toast.makeText(ctx, "Completá todos los campos", Toast.LENGTH_SHORT).show()
                }
            } else {
                context?.let { ctx ->
                    Toast.makeText(ctx, "Iniciando sesión...", Toast.LENGTH_SHORT).show()
                }
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (!isAdded) return@addOnCompleteListener
                        if (task.isSuccessful) {
                            val user = auth.currentUser!!
                            // Verifica email confirmado
                            if (!user.isEmailVerified) {
                                FirebaseAuth.getInstance().signOut()
                                context?.let { ctx2 ->
                                    Toast.makeText(
                                        ctx2,
                                        "Por favor, verificá tu email antes de iniciar sesión.",
                                        Toast.LENGTH_LONG
                                    ).show()
                                }
                                return@addOnCompleteListener
                            }

                            // Asegura/actualiza lastLogin en Firestore
                            userRepo.ensureUserDocumentExists(
                                user,
                                onSuccess = {
                                    if (!isAdded) return@ensureUserDocumentExists
                                    // Asegurar perfil ligero:
                                    userRepo.ensureUserProfileExists(user.uid)
                                    // Leer perfil ligero:
                                    userRepo.getUserProfileLight(
                                        user.uid,
                                        onSuccess = { profileLight ->
                                            if (!isAdded) return@getUserProfileLight
                                            val baseOptions = NavOptions.Builder()
                                                .setPopUpTo(R.id.mobile_navigation, true)
                                                .build()
                                            if (!profileLight.hobbiesCompletados) {
                                                findNavController().navigate(
                                                    R.id.action_loginFragment_to_hobbiesFragment,
                                                    null,
                                                    baseOptions
                                                )
                                            } else {
                                                findNavController().navigate(
                                                    R.id.action_loginFragment_to_homeFragment,
                                                    null,
                                                    baseOptions
                                                )
                                            }
                                        },
                                        onFailure = { e ->
                                            if (!isAdded)
                                            Log.w(TAG, "Error leyendo perfil ligero: ${e.message}")
                                            // Fallback: forzar a Hobbies
                                            findNavController().navigate(
                                                R.id.action_loginFragment_to_hobbiesFragment,
                                                null,
                                                NavOptions.Builder().setPopUpTo(R.id.mobile_navigation, true).build()
                                            )
                                        }
                                    )
                                },
                                onFailure = { e ->
                                    if (!isAdded)
                                    context?.let { ctx3 ->
                                        Toast.makeText(
                                            ctx3,
                                            "Error actualizando perfil: ${e.message}",
                                            Toast.LENGTH_LONG
                                        ).show()
                                    }
                                }
                            )
                        } else {
                            Log.w(TAG, "signInWithEmail:failure", task.exception)
                            if (!isAdded) return@addOnCompleteListener
                            val errorMessage = task.exception?.message ?: "Error al iniciar sesión."
                            context?.let { ctx ->
                                Toast.makeText(
                                    ctx,
                                    "Error: $errorMessage",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                    }
            }
        }

        binding.textGoRegister.setOnClickListener {
            if (isAdded) {
                findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
            }
        }

        binding.textGoChangePassword.setOnClickListener {
            if (isAdded) {
                findNavController().navigate(R.id.action_loginFragment_to_passwordResetFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
