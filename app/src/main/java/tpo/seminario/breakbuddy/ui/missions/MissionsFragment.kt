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
    private var weeklyRecords = listOf<Map<String, Any>>()  // raw semanal
    private val db = FirebaseFirestore.getInstance()
    private val functions = FirebaseFunctions.getInstance()
    private val uid get() = FirebaseAuth.getInstance().currentUser?.uid.orEmpty()

    override fun onCreateView(inflater: LayoutInflater, c: ViewGroup?, s: Bundle?) =
        FragmentMissionsBinding.inflate(inflater, c, false).also { _binding = it }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fetchDailyMissions()
    }

    private fun fetchDailyMissions() {
        functions.getHttpsCallable("generateDailyMissions")
            .call()
            .addOnSuccessListener { hr ->
                val data = hr.data as? Map<*,*> ?: return@addOnSuccessListener

                // 1) extraer misiones
                @Suppress("UNCHECKED_CAST")
                misionesHoy = (data["missions"] as? List<Map<String,Any>>)
                    ?.map { m ->
                        Mision(
                            id = m["id"] as String,
                            titulo = m["titulo"] as String,
                            descripcion = m["descripcion"] as String,
                            tipo = TipoMision.valueOf(m["tipo"] as String),
                            duracionSegundos = (m["duracionSegundos"] as Number).toInt(),
                            pasosGuiados = m["pasosGuiados"] as? List<String>
                        )
                    }.orEmpty()

                // 2) extraer completadas de hoy
                @Suppress("UNCHECKED_CAST")
                completedMap = (data["completed"] as? Map<String,Boolean>) ?: emptyMap()

                // 3) leer historial semanal para barra semanal
                db.collection("userProfiles").document(uid)
                    .get()
                    .addOnSuccessListener { snap ->
                        @Suppress("UNCHECKED_CAST")
                        weeklyRecords = (snap.get("weeklyMissions") as? List<Map<String,Any>>)
                            ?: emptyList()
                        // una vez tenemos todo, mostramos
                        mostrarMisiones()
                    }
            }
            .addOnFailureListener { e ->
                Toast.makeText(requireContext(), "Error: ${e.message}", Toast.LENGTH_LONG).show()
            }
    }

    private fun mostrarMisiones() {
        binding.layoutMisiones.removeAllViews()

        // 4) calcular progreso diario
        val doneToday = misionesHoy.count { completedMap[it.id] == true }
        val totalToday = misionesHoy.size
        binding.tvDailyProgress.text = "Progreso diario: $doneToday/$totalToday"
        binding.progressDaily.apply {
            max = totalToday.takeIf { it>0 } ?: 1
            progress = doneToday
        }

        // 5) calcular progreso semanal
        var totalWeek = 0
        var doneWeek = 0
        for (rec in weeklyRecords) {
            val ids = rec["missionIds"] as? List<String> ?: continue
            val comp = rec["completedToday"] as? Map<String,Boolean> ?: continue
            totalWeek += ids.size
            doneWeek += ids.count { comp[it] == true }
        }
        binding.tvWeeklyProgress.text = "Progreso semanal: $doneWeek/$totalWeek"
        binding.progressWeekly.apply {
            max = totalWeek.takeIf { it>0 } ?: 1
            progress = doneWeek


            actualizarBarrasProgreso()
        }

        // 6) mostrar cada misión
        misionesHoy.forEach { m ->
            val card = layoutInflater.inflate(R.layout.item_mision, binding.layoutMisiones, false)
            card.findViewById<TextView>(R.id.tvTitulo).text = m.titulo
            card.findViewById<TextView>(R.id.tvDescripcion).text = m.descripcion
            val btn = card.findViewById<Button>(R.id.btnCompletar)



            val done = completedMap[m.id] == true
            val titulo = card.findViewById<TextView>(R.id.tvTitulo)
            val descripcion = card.findViewById<TextView>(R.id.tvDescripcion)
            if (done) {
                btn.text = "Completada"
                btn.isEnabled = false
                titulo.setTextColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                descripcion.setTextColor(ContextCompat.getColor(requireContext(), android.R.color.white))
                card.setBackgroundResource(R.drawable.bg_card_completada)
                card.animate().alpha(1f).scaleX(1.02f).scaleY(1.03f).setDuration(300).withEndAction {
                    card.animate().scaleX(1f).scaleY(1f).setDuration(100).start()
                }.start()
                btn.setBackgroundTintList(ContextCompat.getColorStateList(requireContext(), R.color.green_200))
            } else {
                btn.text = "Completar"
                titulo.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                descripcion.setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                btn.isEnabled = true
                btn.setBackgroundTintList(ContextCompat.getColorStateList(requireContext(), R.color.green_500))
                btn.setOnClickListener {
                    MissionDialogFragment(m) {
                        completeTodayMission(m.id)
                    }.show(childFragmentManager, "MissionDialog")
                }
                card.setBackgroundResource(R.drawable.bg_mision_card)
            }

            binding.layoutMisiones.addView(card)
        }
    }


    private fun actualizarBarrasProgreso() {
        // Diario
        val dailyTotal = misionesHoy.size
        val dailyDone  = completedMap.count { it.value }
        binding.progressDaily.max      = dailyTotal
        binding.progressDaily.progress = dailyDone
        binding.tvDailyProgress.text   = "Progreso diario: $dailyDone/$dailyTotal"

        // Semanal
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return
        FirebaseFirestore.getInstance()
            .collection("userProfiles")
            .document(uid)
            .get()
            .addOnSuccessListener { snap ->
                @Suppress("UNCHECKED_CAST")
                val weekly = snap.get("weeklyMissions") as? List<Map<String,Any>> ?: emptyList()
                val weeklyTotal = weekly.sumOf { (it["missionIds"] as? List<*>)?.size ?: 0 }
                val weeklyDone  = weekly.sumOf {
                    val comp = it["completedToday"] as? Map<String,Boolean> ?: emptyMap()
                    comp.count { entry -> entry.value }
                }
                binding.progressWeekly.max      = weeklyTotal
                binding.progressWeekly.progress = weeklyDone
                binding.tvWeeklyProgress.text   = "Progreso semanal: $weeklyDone/$weeklyTotal"
            }
    }


    private fun completeTodayMission(missionId: String) {
        functions.getHttpsCallable("completeDailyMission")
            .call(mapOf("missionId" to missionId))
            .addOnSuccessListener {
                // actualizar local y redibujar
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
