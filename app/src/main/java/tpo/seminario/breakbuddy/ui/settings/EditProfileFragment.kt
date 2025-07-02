package tpo.seminario.breakbuddy.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import tpo.seminario.breakbuddy.databinding.FragmentEditProfileBinding
import tpo.seminario.breakbuddy.persistence.User
import tpo.seminario.breakbuddy.persistence.UserRepository

class EditProfileFragment : Fragment() {

    private var _binding: FragmentEditProfileBinding? = null
    private val binding get() = _binding!!


    //Instancia de FirebaseAuth para saber quién es el usuario actual
    private val auth = FirebaseAuth.getInstance()

    // Repositorio de usuario (lo creamos en el paso anterior)
    private val userRepo = UserRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEditProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val currentUser = auth.currentUser
        if (currentUser == null) {
            Toast.makeText(requireContext(), "Usuario no autenticado", Toast.LENGTH_SHORT).show()
            return
        }

        userRepo.getUser(
            currentUser.uid,
            onSuccess = { profile: User ->
                binding.editTextName.setText(profile.displayName)
                binding.editTextDescription.setText(profile.description ?: "")
            },
            onFailure = { e ->
                Toast.makeText(requireContext(), "Error cargando perfil: ${e.message}", Toast.LENGTH_LONG).show()
            }
        )

        // Botón Guardar
        binding.btnSaveProfile.setOnClickListener {
            val name = binding.editTextName.text.toString().trim()
            val description = binding.editTextDescription.text.toString().trim()

            if (name.isEmpty()) {
                Toast.makeText(requireContext(), "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(requireContext(), "Cambios guardados", Toast.LENGTH_SHORT).show()

            userRepo.updateUser(
                userId = currentUser.uid,
                newName = name,
                newDescription = description,
                onSuccess = {
                    val request = UserProfileChangeRequest.Builder()
                        .setDisplayName(name)
                        .build()
                    currentUser.updateProfile(request)
                        .addOnSuccessListener {
                        }
                        .addOnFailureListener { e ->
                        }

                    Toast.makeText(requireContext(), "Cambios guardados", Toast.LENGTH_SHORT).show()
                    findNavController().popBackStack()
                },
                onFailure = { exception ->
                    Toast.makeText(requireContext(), "Error guardando perfil: ${exception.message}", Toast.LENGTH_LONG).show()
                }
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
