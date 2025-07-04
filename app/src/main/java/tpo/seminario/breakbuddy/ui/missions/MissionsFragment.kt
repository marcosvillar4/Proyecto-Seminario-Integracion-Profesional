package tpo.seminario.breakbuddy.ui.missions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.data.MisionProvider
import tpo.seminario.breakbuddy.databinding.FragmentMissionsBinding
import tpo.seminario.breakbuddy.util.missions.Mision
import tpo.seminario.breakbuddy.util.missions.TipoMision

class MissionsFragment : Fragment() {

    private var _binding: FragmentMissionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMissionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mostrarMisiones(MisionProvider.obtenerMisionesDelDia())
    }

    private fun mostrarMisiones(misiones: List<Mision>) {
        val layout = binding.layoutMisiones
        layout.removeAllViews()

        misiones.forEach { mision ->
            val card = layoutInflater.inflate(R.layout.item_mision, layout, false)
            card.findViewById<TextView>(R.id.tvTitulo).text = mision.titulo
            card.findViewById<TextView>(R.id.tvDescripcion).text = mision.descripcion

            card.findViewById<Button>(R.id.btnCompletar).setOnClickListener {
                val dialog = MissionDialogFragment(mision) {
                    layout.removeView(card)

                    if (layout.childCount == 0) {
                        val mensajeFinal = TextView(requireContext()).apply {
                            text = "¡Buen trabajo! Vuelve mañana"
                            textSize = 16f
                            setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                            setPadding(32, 32, 32, 32)
                        }
                        layout.addView(mensajeFinal)
                    }
                }
                dialog.show(childFragmentManager, "MissionDialog")
            }

            layout.addView(card)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
