package tpo.seminario.breakbuddy.ui.changePassword;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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
            val email = binding.inputEmail.text.toString()

            if (email.isBlank()) {
                Toast.makeText(requireContext(), "Ingresá tu email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Correo de recuperación enviado (simulado)", Toast.LENGTH_LONG).show()

                // FireBase

                findNavController().popBackStack()
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
