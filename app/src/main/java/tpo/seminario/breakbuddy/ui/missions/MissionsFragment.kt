package tpo.seminario.breakbuddy.ui.missions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.functions.FirebaseFunctions
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentMissionsBinding
import tpo.seminario.breakbuddy.util.missions.Mision
import tpo.seminario.breakbuddy.util.missions.TipoMision

class MissionsFragment : Fragment() {

    private var _binding: FragmentMissionsBinding? = null
    private val binding get() = _binding!!

    private lateinit var misionesHoy: MutableList<Mision>

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
        fetchDailyMissions()
    }

    private fun fetchDailyMissions() {
        FirebaseFunctions.getInstance()
            .getHttpsCallable("generateDailyMissions")
            .call()
            .addOnSuccessListener { hr ->
                @Suppress("UNCHECKED_CAST")
                val data = hr.data as Map<String,Any>
                val list = (data["missions"] as List<Map<String,Any>>).map { m ->
                    Mision(
                        id             = m["id"] as String,
                        titulo         = m["titulo"] as String,
                        descripcion    = m["descripcion"] as String,
                        tipo           = TipoMision.valueOf(m["tipo"] as String),
                        duracionSegundos = (m["duracionSegundos"] as Number).toInt(),
                        pasosGuiados   = (m["pasosGuiados"] as? List<String>),
                        completada     = m["completada"] as Boolean
                    )
                }
                misionesHoy = list.toMutableList()
                mostrarMisiones(misionesHoy)
            }
            .addOnFailureListener { e -> /* … */ }
    }
    private fun mostrarMisiones(misiones: List<Mision>) {
        binding.layoutMisiones.removeAllViews()
        misiones.forEachIndexed { idx, m ->
            val card = layoutInflater.inflate(R.layout.item_mision, binding.layoutMisiones, false)
            card.findViewById<TextView>(R.id.tvTitulo).text = m.titulo
            card.findViewById<TextView>(R.id.tvDescripcion).text = m.descripcion
            val btn = card.findViewById<Button>(R.id.btnCompletar)
            btn.isEnabled = !m.completada

            // <-- Aquí abrimos el diálogo:
            btn.setOnClickListener {
                MissionDialogFragment(m) {
                    // callback: sólo se ejecuta cuando el user pulsa “Listo” en el diálogo
                    markMissionCompleted(idx)
                }.show(childFragmentManager, "MissionDialog")
            }

            binding.layoutMisiones.addView(card)
        }
    }

    private fun markMissionCompleted(index: Int) {
        misionesHoy[index].completada = true
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return

        FirebaseFirestore.getInstance()
            .collection("userProfiles").document(uid)
            .update("dailyMissions", misionesHoy)
            .addOnSuccessListener {
                // refresca la UI
                mostrarMisiones(misionesHoy)
            }
            .addOnFailureListener {
                Toast.makeText(requireContext(), "Error guardando misión", Toast.LENGTH_SHORT).show()
            }
    }

    private fun completeMission(index: Int, currentList: MutableList<Mision>) {
        currentList[index].completada = true
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return
        // Protegemos el binding antes de actualizar la UI tras guardar
        FirebaseFirestore.getInstance()
            .collection("userProfiles").document(uid)
            .update("dailyMissions", currentList)
            .addOnSuccessListener {
                _binding?.let {
                    mostrarMisiones(currentList)
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
