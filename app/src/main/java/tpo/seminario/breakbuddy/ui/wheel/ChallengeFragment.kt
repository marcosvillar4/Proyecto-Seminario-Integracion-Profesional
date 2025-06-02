package tpo.seminario.breakbuddy.ui.challenge

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.databinding.FragmentChallengeBinding

class ChallengeFragment : Fragment() {

    private var _binding: FragmentChallengeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChallengeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 🔸 Recibir datos desde el Bundle
        val nombre = arguments?.getString("nombre") ?: "Desafío"
        val instruccion = arguments?.getString("instruccion") ?: "Realizá la actividad"
        val recompensa = arguments?.getString("recompensa") ?: "+10 puntos"

        // 🔹 Mostrar en pantalla
        binding.tvTituloDesafio.text = "¡Desafío: $nombre!"
        binding.tvInstruccion.text = instruccion

        // 🔸 Al hacer clic en “¡Lo logré!”
        binding.btnCompletar.setOnClickListener {
            Toast.makeText(requireContext(), "¡Ganaste $recompensa!", Toast.LENGTH_LONG).show()

            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
