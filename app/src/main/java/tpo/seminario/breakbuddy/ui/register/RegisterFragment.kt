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
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import android.util.Log
import com.google.firebase.auth.UserProfileChangeRequest
import tpo.seminario.breakbuddy.persistence.*

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    private lateinit var auth: FirebaseAuth
    private val TAG = "RegisterFragment"

    private val userRepo = UserRepository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        auth = Firebase.auth
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

        binding.inputPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val password = s.toString()
                checkPasswordRequirements(password)
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        binding.inputRepeatPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val password = binding.inputPassword.text.toString()
                val repeat = s.toString()
                if (repeat == password) {
                    binding.repeatPasswordLayout.error = null
                }
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        // Botón de registrarse
        binding.btnRegister.setOnClickListener {
            val name = binding.inputName.text.toString().trim()
            val email = binding.inputEmail.text.toString().trim()
            val password = binding.inputPassword.text.toString().trim()
            val repeatPassword = binding.inputRepeatPassword.text.toString().trim()

            when {
                name.isEmpty() || email.isEmpty() || password.isEmpty() -> {
                    context?.let { ctx ->
                        Toast.makeText(ctx, "Completá todos los campos", Toast.LENGTH_SHORT).show()
                    }
                }
                // Verificacion de requisitos de contrasenia
                password.length < 8 || !password.any { it.isUpperCase() } || !password.any { it.isDigit() } -> {
                    context?.let { ctx ->
                        Toast.makeText(ctx, "La contraseña no cumple con los requisitos", Toast.LENGTH_SHORT).show()
                    }
                }
                password != repeatPassword -> {
                    binding.repeatPasswordLayout.error = "Las contraseñas no coinciden"
                }
                else -> {
                    binding.repeatPasswordLayout.error = null
                    context?.let { ctx ->
                        Toast.makeText(ctx, "Creando cuenta...", Toast.LENGTH_SHORT).show()
                    }

                    //create user
                    auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (!isAdded) return@addOnCompleteListener
                            if (task.isSuccessful) {
                                val user = auth.currentUser!!
                                val profileUpdates = UserProfileChangeRequest.Builder()
                                    .setDisplayName(name)
                                    .build()
                                user.updateProfile(profileUpdates)
                                    .addOnCompleteListener { updateTask ->
                                        if (!isAdded) return@addOnCompleteListener
                                        // Continuar aunque falle el displayName
                                        userRepo.createUserDocument(
                                            user,
                                            onSuccess = {
                                                if (!isAdded) return@createUserDocument
                                                userRepo.createUserProfile(
                                                    user.uid,
                                                    onSuccess = {
                                                        if (!isAdded) return@createUserProfile
                                                        user.sendEmailVerification()
                                                            .addOnSuccessListener {
                                                                if (!isAdded) return@addOnSuccessListener
                                                                context?.let { ctx2 ->
                                                                    Toast.makeText(
                                                                        ctx2,
                                                                        "Se envió un email de verificación a ${user.email}. Revisá tu bandeja de entrada.",
                                                                        Toast.LENGTH_LONG
                                                                    ).show()
                                                                }
                                                                Firebase.auth.signOut()
                                                                if (isAdded) {
                                                                    findNavController().navigate(R.id.action_registerFragment_to_welcomeFragment)
                                                                }
                                                            }
                                                            .addOnFailureListener { e ->
                                                                if (!isAdded) return@addOnFailureListener
                                                                context?.let { ctx3 ->
                                                                    Toast.makeText(
                                                                        ctx3,
                                                                        "Error enviando verificación: ${e.message}",
                                                                        Toast.LENGTH_LONG
                                                                    ).show()
                                                                }
                                                                Firebase.auth.signOut()
                                                                if (isAdded) {
                                                                    findNavController().navigate(R.id.action_registerFragment_to_welcomeFragment)
                                                                }
                                                            }
                                                    },
                                                    onFailure = { eProfile ->
                                                        if (!isAdded) return@createUserProfile
                                                        Log.w(TAG, "Error creando perfil ligero: ${eProfile.message}")
                                                        context?.let { ctx4 ->
                                                            Toast.makeText(
                                                                ctx4,
                                                                "Cuenta creada pero error interno al inicializar perfil. Intentá reiniciar la app.",
                                                                Toast.LENGTH_LONG
                                                            ).show()
                                                        }
                                                        // Aún así enviamos verificación y cerramos sesión
                                                        user.sendEmailVerification()
                                                            .addOnSuccessListener {
                                                                if (!isAdded) return@addOnSuccessListener
                                                                Firebase.auth.signOut()
                                                                if (isAdded) {
                                                                    findNavController().navigate(R.id.action_registerFragment_to_welcomeFragment)
                                                                }
                                                            }
                                                            .addOnFailureListener {
                                                                if (!isAdded) return@addOnFailureListener
                                                                Firebase.auth.signOut()
                                                                if (isAdded) {
                                                                    findNavController().navigate(R.id.action_registerFragment_to_welcomeFragment)
                                                                }
                                                            }
                                                    }
                                                )
                                            },
                                            onFailure = { e ->
                                                if (!isAdded) return@createUserDocument
                                                Log.w(TAG, "Error creando documento /users: ${e.message}")
                                                context?.let { ctx5 ->
                                                    Toast.makeText(
                                                        ctx5,
                                                        "Error interno al crear perfil. Intentá nuevamente.",
                                                        Toast.LENGTH_LONG
                                                    ).show()
                                                }
                                            }
                                        )
                                    }
                            } else {
                                if (!isAdded) return@addOnCompleteListener
                                Log.w(TAG, "createUserWithEmail:failure", task.exception)
                                val errorMessage = task.exception?.message ?: "Error al crear la cuenta."
                                context?.let { ctx ->
                                    Toast.makeText(ctx, "Error: $errorMessage", Toast.LENGTH_SHORT).show()
                                }
                            }
                        }
                }
            }
        }

        // Link a iniciar sesión
        binding.textGoLogin.setOnClickListener {
            if (isAdded) {
                findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
            }
        }
    }

    fun checkPasswordRequirements(password: String) {
        val colorOK = resources.getColor(android.R.color.holo_green_dark, null)
        val colorNO = resources.getColor(android.R.color.darker_gray, null)

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
