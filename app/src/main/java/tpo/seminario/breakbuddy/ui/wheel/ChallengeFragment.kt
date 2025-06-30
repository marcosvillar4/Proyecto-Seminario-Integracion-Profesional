package tpo.seminario.breakbuddy.ui.challenge

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldPath
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.functions.FirebaseFunctions
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentChallengeBinding
import tpo.seminario.breakbuddy.ui.wheel.ChallengeViewModel
import tpo.seminario.breakbuddy.util.DesafioGamificado
import tpo.seminario.breakbuddy.util.QuizQuestion

class ChallengeFragment : Fragment(R.layout.fragment_challenge) {

    private var _binding: FragmentChallengeBinding? = null
    private val binding get() = _binding!!
    private var temporizador: CountDownTimer? = null
    private val challengeViewModel: ChallengeViewModel by activityViewModels()

    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private val functions = FirebaseFunctions.getInstance()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentChallengeBinding.bind(view)

        val respin = arguments?.getBoolean("respin") ?: false
        val nombre = arguments?.getString("nombre") ?: return
        val desafio = challengeViewModel.currentChallenges.value?.get(nombre) ?: run {
            findNavController().navigateUp()
            return
        }

        binding.tvTituloDesafio.text = "¡${desafio.nombre}!"
        binding.imgDesafio.setImageResource(desafio.iconoResId)
        desafio.quiz?.let { quiz ->
            setupQuiz(quiz, desafio.recompensa, respin)
        } ?: setupPhysical(desafio, respin)
    }

    private fun setupQuiz(quiz: QuizQuestion, recompensa: Int, respin: Boolean) {
        val puntos = if (respin) recompensa / 2 else recompensa
        binding.tvInstruccion.text = quiz.question
        binding.rgOpciones.visibility = View.VISIBLE

        val opciones = listOf(
            binding.rbOpcion1, binding.rbOpcion2,
            binding.rbOpcion3, binding.rbOpcion4
        )
        quiz.options.forEachIndexed { i, texto ->
            opciones[i].apply {
                text = texto
                visibility = View.VISIBLE
            }
        }

        binding.btnCompletar.apply {
            text = if (respin) "Responder (Re-spin) - $puntos pts" else "Responder - $puntos pts"
            isEnabled = true
            setOnClickListener {
                val selId = binding.rgOpciones.checkedRadioButtonId
                if (selId == -1) return@setOnClickListener
                val idx = opciones.indexOfFirst { it.id == selId }
                val earnedLocal = if (idx == quiz.correctIndex) puntos else 0
                val feedback = if (earnedLocal > 0) {
                    "¡Correcto! +$earnedLocal pts"
                } else {
                    val correcta = quiz.options[quiz.correctIndex]
                    "Incorrecto. La respuesta correcta era: $correcta. +0 pts"
                }

                if (earnedLocal == 0) {
                    Toast.makeText(requireContext(), feedback, Toast.LENGTH_LONG).show()
                    findNavController().navigateUp()
                } else {
                    completeChallenge(respin, quiz.question, earnedLocal, feedback)
                }
            }
        }
    }

    private fun setupPhysical(desafio: DesafioGamificado, respin: Boolean) {
        val puntos = if (respin) desafio.recompensa / 2 else desafio.recompensa
        binding.tvInstruccion.text = desafio.instruccion

        if (desafio.requiereTemporizador) {
            binding.tvTemporizador.visibility = View.VISIBLE
            binding.progressBar.visibility = View.VISIBLE
            binding.progressBar.max = desafio.duracionSegundos
            binding.progressBar.progress = 0
            temporizador?.cancel()
            temporizador = object : CountDownTimer(desafio.duracionSegundos * 1000L, 1000L) {
                override fun onTick(ms: Long) {
                    val secLeft = (ms / 1000).toInt()
                    binding.progressBar.progress = desafio.duracionSegundos - secLeft
                    binding.tvTemporizador.text = String.format(
                        "Tiempo restante: %02d:%02d",
                        secLeft / 60, secLeft % 60
                    )
                }
                override fun onFinish() {
                    binding.tvTemporizador.text = "¡Tiempo cumplido!"
                    binding.btnCompletar.isEnabled = true
                }
            }.also {
                binding.btnCompletar.isEnabled = false
                it.start()
            }
        } else {
            binding.tvTemporizador.visibility = View.GONE
            binding.progressBar.visibility = View.GONE
            binding.btnCompletar.isEnabled = true
        }

        binding.btnCompletar.apply {
            text = if (respin) "Completar (Re-spin) - $puntos pts" else "Completar - $puntos pts"
            setOnClickListener {
                val feedback = "¡Ganaste $puntos pts!"
                completeChallenge(respin, desafio.nombre, puntos, feedback)
            }
        }
    }

    /**
     * Llama al backend, actualiza puntos y luego disemina el logro
     */
    private fun completeChallenge(
        respin: Boolean,
        name: String,
        earnedLocal: Int,
        feedback: String
    ) {
        val user = auth.currentUser
        if (user == null) {
            Toast.makeText(requireContext(), "Debes iniciar sesión", Toast.LENGTH_LONG).show()
            return
        }
        binding.btnCompletar.isEnabled = false

        functions
            .getHttpsCallable("completeChallenge")
            .call(mapOf("isRespin" to respin, "challengeName" to name))
            .addOnSuccessListener { snap ->
                val data = snap.data as Map<*, *>
                val earned = (data["earnedPoints"] as Number).toInt()
                val total  = (data["totalPoints"] as Number).toInt()
                Toast.makeText(
                    requireContext(),
                    "$feedback\n+${earned} pts\nTotal: $total",
                    Toast.LENGTH_LONG
                ).show()

                //  ───────────────  NUEVA LÓGICA  ───────────────
                diseminarLogroEnGrupos(user.uid, earned, name)

                findNavController().navigateUp()
            }
            .addOnFailureListener { e ->
                binding.btnCompletar.isEnabled = true
                Toast.makeText(
                    requireContext(),
                    (e as? Exception)?.message ?: "Error",
                    Toast.LENGTH_LONG
                ).show()
            }
    }

    /**
     * Para cada grupo personal del usuario, publica un mensaje de sistema
     * incluyendo quién lo completó (email o displayName).
     */
    private fun diseminarLogroEnGrupos(uid: String, pts: Int, name: String) {
        val currentUser = auth.currentUser
        // Aquí sacamos el identificador legible: preferimos displayName, si no email
        val who = currentUser?.displayName
            ?: currentUser?.email
            ?: "Alguien"

        // 1) Leer userProfile.groupIds
        db.collection("userProfiles").document(uid)
            .get()
            .addOnSuccessListener { profSnap ->
                val groupIds = (profSnap.get("groupIds") as? List<*>)?.filterIsInstance<String>()
                    .orEmpty()
                if (groupIds.isEmpty()) return@addOnSuccessListener

                // 2) Filtrar solo los grupos personales
                db.collection("groups")
                    .whereIn(FieldPath.documentId(), groupIds)
                    .whereEqualTo("type", "personal")
                    .get()
                    .addOnSuccessListener { groupsSnap ->
                        groupsSnap.documents.forEach { gdoc ->
                            val gid = gdoc.id
                            val msgRef = db.collection("groups")
                                .document(gid)
                                .collection("messages")
                                .document()

                            // Incluir “who” en el texto
                            val text = "¡$who completó “$name”! +$pts pts"

                            val msg = mapOf(
                                "id" to msgRef.id,
                                "senderUid" to "SYSTEM",
                                "senderDisplayName" to "BreakBuddy",
                                "text" to text,
                                "timestamp" to Timestamp.now(),
                                "isSystemMessage" to true
                            )
                            msgRef.set(msg)
                        }
                    }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        temporizador?.cancel()
        _binding = null
    }
}
