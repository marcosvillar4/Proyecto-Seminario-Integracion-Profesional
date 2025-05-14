package tpo.seminario.breakbuddy.ui.welcome

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.databinding.FragmentWelcomeBinding
import tpo.seminario.breakbuddy.R

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null;
    private val binding get() = _binding!!

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

        //Redireccion del boton comenzar a otra pagina
        binding.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_navigation_home)
        }

        return root
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }
}