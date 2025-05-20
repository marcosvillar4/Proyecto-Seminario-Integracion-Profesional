package tpo.seminario.breakbuddy.ui.changePassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.databinding.FragmentPasswordResetBinding

class PasswordResetFragment : Fragment() {

    private var _binding: FragmentPasswordResetBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPasswordResetBinding.inflate(inflater, container, false)

        binding.btnSend.setOnClickListener {
            val email = binding.inputEmail.text.toString().trim()

            if (email.isBlank()) {
                Toast.makeText(requireContext(), "Ingresá tu email", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 1) Llamada a Firebase para enviar el email de recuperación
            FirebaseAuth.getInstance()
                .sendPasswordResetEmail(email)
                .addOnSuccessListener {
                    Toast.makeText(requireContext(),
                        "Se ha enviado un correo de recuperación a $email",
                        Toast.LENGTH_LONG).show()
                    findNavController().popBackStack()
                }
                .addOnFailureListener { e ->
                    // Por ejemplo: user-not-found
                    Toast.makeText(requireContext(),
                        "Error enviando correo: ${e.message}",
                        Toast.LENGTH_LONG).show()
                }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
