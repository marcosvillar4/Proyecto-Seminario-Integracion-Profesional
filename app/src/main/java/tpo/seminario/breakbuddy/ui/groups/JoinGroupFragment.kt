package tpo.seminario.breakbuddy.ui.groups

import android.content.res.ColorStateList
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentCreateGroupBinding
import tpo.seminario.breakbuddy.databinding.FragmentJoinGroupBinding
import tpo.seminario.breakbuddy.persistence.UserRepository

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private val userRepo = UserRepository()

private val auth = FirebaseAuth.getInstance()

class JoinGroupFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentJoinGroupBinding? = null
    private val binding get() = _binding!!
    private val viewModel: GroupsViewModel by viewModels()

    private lateinit var idTextBox: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentJoinGroupBinding.inflate(inflater, container, false)

        setupViews()
        observeViewModel()

        return binding.root
    }

    private fun setupViews() {

        binding.btnUnirse.setOnClickListener {
            joinGroup()
        }
    }

    private fun observeViewModel() {
        viewModel.uiState.observe(viewLifecycleOwner) { state ->
            if (state == null) return@observe
        }
    }

    private fun joinGroup() {
        val id = binding.inputID.text.toString().trim()

        if (id.isBlank()) {
            showErrorToast("ID esta vacio")
        } else {
            val currentUser = auth.currentUser
            if (currentUser != null) {
                viewModel.joinByCode(id)
                Toast.makeText(context, "Unido al grupo con exito", Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun showErrorToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).apply {
            view?.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.error)
            )
        }.show()
    }

    private fun showSuccessToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).apply {
            view?.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.exito)
            )
        }.show()
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            JoinGroupFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}