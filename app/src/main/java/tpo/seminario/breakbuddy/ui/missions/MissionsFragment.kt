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
import com.google.firebase.functions.FirebaseFunctions
import com.google.firebase.functions.FirebaseFunctionsException
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentMissionsBinding
import tpo.seminario.breakbuddy.util.missions.Mision
import tpo.seminario.breakbuddy.util.missions.TipoMision
class MissionsFragment : Fragment() {
    private var _binding: FragmentMissionsBinding? = null
    private val binding get() = _binding!!

    private var misionesHoy = listOf<Mision>()
    private var completedMap = mapOf<String, Boolean>()

    override fun onCreateView(inflater: LayoutInflater, c: ViewGroup?, s: Bundle?) =
        FragmentMissionsBinding.inflate(inflater, c, false).also { _binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchDailyMissions()
    }

    private fun fetchDailyMissions() {
        FirebaseFunctions
            .getInstance()
            .getHttpsCallable("generateDailyMissions")
            .call()
            .addOnSuccessListener { hr ->
                val data = hr.data as? Map<*, *>
                if (data == null) {
                    Toast.makeText(requireContext(), "Respuesta nula del servidor", Toast.LENGTH_LONG).show()
                    return@addOnSuccessListener
                }

                // 1) Misiones
                val rawMissions = data["missions"]
                if (rawMissions !is List<*>) {
                    Toast.makeText(requireContext(), "Formato inesperado en missions", Toast.LENGTH_LONG).show()
                    return@addOnSuccessListener
                }
                @Suppress("UNCHECKED_CAST")
                misionesHoy = rawMissions.mapNotNull { item ->
                    (item as? Map<String,Any>)?.let { m ->
                        Mision(
                            id              = m["id"] as? String ?: return@let null,
                            titulo          = m["titulo"] as? String ?: "",
                            descripcion     = m["descripcion"] as? String ?: "",
                            tipo            = TipoMision.valueOf(m["tipo"] as? String ?: "SIMPLE"),
                            duracionSegundos= (m["duracionSegundos"] as? Number)?.toInt() ?: 0,
                            pasosGuiados    = (m["pasosGuiados"] as? List<String>) ?: emptyList()
                        )
                    }
                }

                // 2) Completed
                val rawComp = data["completed"]
                completedMap = if (rawComp is Map<*,*>) {
                    rawComp.entries.filter {
                        it.key is String && it.value is Boolean
                    }.associate { it.key as String to it.value as Boolean }
                } else {
                    emptyMap()
                }

                mostrarMisiones()
            }
            .addOnFailureListener { e ->
                Toast.makeText(requireContext(), "Error: ${e.message}", Toast.LENGTH_LONG).show()
            }
    }

    private fun mostrarMisiones() {
        binding.layoutMisiones.removeAllViews()
        if (misionesHoy.isEmpty()) {
            Toast.makeText(requireContext(), "No hay micro‑misiones hoy", Toast.LENGTH_SHORT).show()
            return
        }

        misionesHoy.forEach { m ->
            val card = layoutInflater.inflate(R.layout.item_mision, binding.layoutMisiones, false)
            card.findViewById<TextView>(R.id.tvTitulo).text = m.titulo
            card.findViewById<TextView>(R.id.tvDescripcion).text = m.descripcion
            val btn = card.findViewById<Button>(R.id.btnCompletar)

            // Inhabilita si ya completada
            val done = completedMap[m.id] == true
            btn.isEnabled = !done

            btn.setOnClickListener {
                MissionDialogFragment(m) {
                    completeTodayMission(m.id)
                }.show(childFragmentManager, "MissionDialog")
            }

            binding.layoutMisiones.addView(card)
        }
    }

    private fun completeTodayMission(missionId: String) {
        FirebaseFunctions
            .getInstance()
            .getHttpsCallable("completeDailyMission")
            .call(mapOf("missionId" to missionId))
            .addOnSuccessListener {
                // Marcamos y refrescamos
                completedMap = completedMap.toMutableMap().also { it[missionId] = true }
                mostrarMisiones()
            }
            .addOnFailureListener { e ->
                val msg = (e as? FirebaseFunctionsException)?.details?.toString() ?: e.message
                Toast.makeText(requireContext(), "Error: $msg", Toast.LENGTH_LONG).show()
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
