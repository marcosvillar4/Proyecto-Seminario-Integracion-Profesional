package tpo.seminario.breakbuddy.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import tpo.seminario.breakbuddy.databinding.FragmentChangePasswordBinding
import android.graphics.Paint
import android.text.Editable
import android.text.TextWatcher
import androidx.core.content.ContextCompat

class ChangePasswordFragment : Fragment() {

    private var _binding: FragmentChangePasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChangePasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Mostrar requisitos solo cuando el campo tiene foco
        binding.inputNewPassword.setOnFocusChangeListener { _, hasFocus ->
            val visibility = if (hasFocus) View.VISIBLE else View.GONE
            binding.requirementLength.visibility = visibility
            binding.requirementUppercase.visibility = visibility
            binding.requirementDigit.visibility = visibility
        }

        // Escuchar cambios en el texto de la contraseña nueva
            binding.inputNewPassword.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    checkPasswordRequirements(s.toString())
                }
                override fun afterTextChanged(s: Editable?) {}
            })

        binding.btnConfirmPasswordChange.setOnClickListener {
            val currentPassword = binding.inputCurrentPassword.text.toString().trim()
            val newPassword = binding.inputNewPassword.text.toString().trim()
            val repeatPassword = binding.inputRepeatPassword.text.toString().trim()

            if (currentPassword.isEmpty() || newPassword.isEmpty() || repeatPassword.isEmpty()) {
                Toast.makeText(requireContext(), "Completá todos los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val meetsRequirements = newPassword.length >= 8 &&
                    newPassword.any { it.isUpperCase() } &&
                    newPassword.any { it.isDigit() }

            if (!meetsRequirements) {
                binding.newPasswordLayout.error = "Debe tener al menos 8 caracteres, 1 mayúscula y 1 número"
                return@setOnClickListener
            } else {
                binding.newPasswordLayout.error = null
            }

            if (newPassword != repeatPassword) {
                binding.repeatPasswordLayout.error = "Las contraseñas no coinciden"
                return@setOnClickListener
            } else {
                binding.repeatPasswordLayout.error = null
            }

            if (currentPassword == newPassword) {
                Toast.makeText(requireContext(), "La nueva contraseña debe ser diferente a la actual", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(requireContext(), "Cambiando contraseña...", Toast.LENGTH_SHORT).show()


            // Firebase para cambiar contraseña
        }
    }

    //VISUAL >> Animacion requerimientos
    private fun checkPasswordRequirements(password: String) {
        val colorOK = ContextCompat.getColor(requireContext(), android.R.color.holo_green_dark)
        val colorNO = ContextCompat.getColor(requireContext(), android.R.color.darker_gray)

        // Longitud mínima
        if (password.length >= 8) {
            binding.requirementLength.apply {
                text = "✓ Al menos 8 caracteres"
                setTextColor(colorOK)
                paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            }
        } else {
            binding.requirementLength.apply {
                text = "• Al menos 8 caracteres"
                setTextColor(colorNO)
                paintFlags = paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }

        // Al menos una mayúscula
        if (password.any { it.isUpperCase() }) {
            binding.requirementUppercase.apply {
                text = "✓ Al menos 1 letra mayúscula"
                setTextColor(colorOK)
                paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            }
        } else {
            binding.requirementUppercase.apply {
                text = "• Al menos 1 letra mayúscula"
                setTextColor(colorNO)
                paintFlags = paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }

        // Al menos un número
        if (password.any { it.isDigit() }) {
            binding.requirementDigit.apply {
                text = "✓ Al menos 1 número"
                setTextColor(colorOK)
                paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            }
        } else {
            binding.requirementDigit.apply {
                text = "• Al menos 1 número"
                setTextColor(colorNO)
                paintFlags = paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
