package tpo.seminario.breakbuddy.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentRegisterBinding
import android.graphics.Paint
import android.text.TextWatcher
import android.text.Editable

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Mostrar requisitos solo cuando el campo de contrasenia tiene foco
        binding.inputPassword.setOnFocusChangeListener { _, hasFocus ->
            val visibility = if (hasFocus) View.VISIBLE else View.GONE
            binding.requirementLength.visibility = visibility
            binding.requirementUppercase.visibility = visibility
            binding.requirementDigit.visibility = visibility
        }

        //Escuchar cambios en el texto de la contrasenia
        binding.inputPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val password = s.toString()
                checkPasswordRequirements(password)
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        // Botón de registrarse
        binding.btnRegister.setOnClickListener {
            val name = binding.inputName.text.toString().trim()
            val email = binding.inputEmail.text.toString().trim()
            val password = binding.inputPassword.text.toString().trim()

            when {
                name.isEmpty() || email.isEmpty() || password.isEmpty() -> {
                    Toast.makeText(requireContext(), "Completá todos los campos", Toast.LENGTH_SHORT).show()
                }
                // Verificacion de requisitos de contrasenia
                password.length < 8 || !password.any { it.isUpperCase() } || !password.any { it.isDigit() } -> {
                    Toast.makeText(requireContext(), "La contraseña no cumple con los requisitos", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(requireContext(), "Creando cuenta...", Toast.LENGTH_SHORT).show()
                    // lógica real de Firebase
                    // findNavController().navigate(R.id.action_registerFragment_to_dashboardFragment)
                }
            }
        }

        // Link a iniciar sesión
        binding.textGoLogin.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }

    fun checkPasswordRequirements(password: String) {
        val colorOK = resources.getColor(android.R.color.holo_green_dark, null)
        val colorNO = resources.getColor(android.R.color.darker_gray, null)

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
