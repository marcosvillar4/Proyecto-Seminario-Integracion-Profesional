package tpo.seminario.breakbuddy.ui.settings

import android.os.Bundle
import tpo.seminario.breakbuddy.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.databinding.FragmentAccountSettingsBinding
import tpo.seminario.breakbuddy.persistence.User
import tpo.seminario.breakbuddy.persistence.UserRepository

class AccountSettingsFragment : Fragment(){
    private var _binding: FragmentAccountSettingsBinding? = null;
    private val binding get() = _binding!!

    // 1) Instancia de FirebaseAuth
    private val auth = FirebaseAuth.getInstance()

    // 2) Instancia del repositorio de usuarios
    private val userRepo = UserRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentAccountSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)



        Glide.with(this)
            .load(R.drawable.ic_default_avatar) // Imagen por defecto
            .into(binding.profileImageView)

        //Editar perfil
        binding.cardEditProfile.setOnClickListener {
            findNavController().navigate(R.id.action_accountSettingsFragment_to_editProfileFragment)
        }

        // Cambiar hobbies
        binding.cardEditHobbies.setOnClickListener {
            findNavController().navigate(R.id.action_accountSettingsFragment_to_editHobbiesFragment)
        }

        //Cambiar contraseña
        binding.cardChangePassword.setOnClickListener {
            findNavController().navigate(R.id.action_accountSettingsFragment_to_changePasswordFragment)
        }

        //Cerrar sesión
        binding.btnLogout.setOnClickListener {
            // 1) Desloguear
            FirebaseAuth.getInstance().signOut()

            // 2) Navegar al login limpiando la pila
            val options = NavOptions.Builder()
                // Se usa el id del nav graph root para vaciar todo
                .setPopUpTo(R.id.mobile_navigation, true)
                .build()

            findNavController().navigate(
                R.id.action_accountSettingsFragment_to_loginFragment,
                null,
                options
            )

    }
        fetchAndShowUserName()
    }


    override fun onResume() {
        super.onResume()
        // Cada vez que el fragmento vuelve a aparecer (por ejemplo tras EditProfile), recargamos el nombre
        fetchAndShowUserName()
    }

    private fun fetchAndShowUserName() {
        val currentUser = auth.currentUser
        if (currentUser == null) {
            binding.textGreeting.text = "¡Hola, usuario!"
            return
        }

        // Leer del documento Firestore → users/{userId}
        userRepo.getUser(
            currentUser.uid,
            onSuccess = { profile: User ->
                // Cuando tengamos el profile, mostramos el displayName
                val nombre = if (profile.displayName.isNotBlank()) {
                    profile.displayName
                } else {
                    "usuario"
                }
                binding.textGreeting.text = "¡Hola, $nombre!"
            },
            onFailure = { exception ->
                // Si falla, igual mostramos algo
                binding.textGreeting.text = "¡Hola, usuario!"
                Toast.makeText(
                    requireContext(),
                    "Error cargando nombre: ${exception.message}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        )
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}