package tpo.seminario.breakbuddy.ui.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.databinding.FragmentWelcomeBinding
import tpo.seminario.breakbuddy.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null;
    private val binding get() = _binding!!

    // 1. Declara la variable auth
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        val welcomeViewModel =
            ViewModelProvider(this)[WelcomeViewModel::class.java]

        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        welcomeViewModel.text.observe(viewLifecycleOwner){
            binding.textWelcome.text = it
        }

        //Redireccion del boton iniciar sesion
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        //Redireccion del link registrarse
        binding.textRegister.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_registerFragment)
        }

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 2. Inicializa la instancia de Firebase Auth
        auth = Firebase.auth

        // 3. Verifica si hay un usuario logueado
        val currentUser = auth.currentUser

        if (currentUser != null) {
            // Si el usuario NO es nulo, significa que ya está logueado.
            // Navega directamente al dashboard.
            // ¡Necesitas definir la acción de navegación en tu nav_graph.xml!
            findNavController().navigate(R.id.action_welcomeFragment_to_navigation_dashboard)
        } else {
            // Si el usuario es nulo, significa que no hay nadie logueado.
            // Quédate en este fragmento (WelcomeFragment) y configura los listeners de los botones
            setupButtonClickListeners() // Creamos una función aparte para esto
        }
        // *** FIN DE LA LÓGICA DE VERIFICACIÓN ***

        // Si no hay usuario logueado, los listeners ya se configuran en setupButtonClickListeners()
        // Si sí hay usuario logueado, la navegación ocurrirá ANTES de llegar a este punto en una ejecución normal,
        // pero es más limpio separar la configuración de listeners.
    }

    // Creamos una función para configurar los listeners de los botones
    // Solo se llamará si no hay un usuario logueado
    private fun setupButtonClickListeners() {
        // Botón para ir a Login
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        // Botón para ir a Register
        binding.textRegister.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_registerFragment)
        }
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }
}