package tpo.seminario.breakbuddy.ui.logout

import android.os.Bundle
import tpo.seminario.breakbuddy.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
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

        binding.btnLogout.setOnClickListener {
            //Firebase

            findNavController().navigate(R.id.action_accountSettingsFragment_to_loginFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}