package tpo.seminario.breakbuddy.ui.settings

import android.os.Bundle
import tpo.seminario.breakbuddy.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.databinding.FragmentAccountSettingsBinding

class AccountSettingsFragment : Fragment(){
    private var _binding: FragmentAccountSettingsBinding? = null;
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        _binding = FragmentAccountSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)

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
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}