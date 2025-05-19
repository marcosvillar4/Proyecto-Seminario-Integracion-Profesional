package tpo.seminario.breakbuddy.ui.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.databinding.FragmentLoginBinding
import tpo.seminario.breakbuddy.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase



class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private lateinit var auth: FirebaseAuth // Declara una variable para mantener la instancia
    private val TAG = "LoginFragment" //REVISAR ESTO BIEN

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        auth = Firebase.auth // Inicializa la instancia de Auth

        binding.btnLogin.setOnClickListener {
            val email = binding.inputEmail.text.toString()
            val password = binding.inputPassword.text.toString()

            // Validación básica
            if (email.isBlank() || password.isBlank()) {
                Toast.makeText(requireContext(), "Completá todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                // Acá iría el intento de login real
                Toast.makeText(requireContext(), "Iniciando sesión...", Toast.LENGTH_SHORT).show()

                // Firebase

                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(requireActivity()) { task ->
                        if (task.isSuccessful) {
                            // Inicio de sesión exitoso!
                            Log.d(TAG, "signInWithEmail:success") // O define un TAG para logging
                            val user = auth.currentUser // Obtiene el usuario logueado

                            // Navega al siguiente Fragment (ej: dashboard)
                            findNavController().navigate(R.id.action_loginFragment_to_dashboardFragment)

                        } else {
                            // Si falla, muestra un mensaje al usuario
                            Log.w(TAG, "signInWithEmail:failure", task.exception)
                            val errorMessage = task.exception?.message ?: "Error al iniciar sesión."
                            Toast.makeText(requireContext(), "Error: $errorMessage", Toast.LENGTH_SHORT).show()
                        }
                    }
            }
        }

        binding.textGoRegister.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
