package tpo.seminario.breakbuddy.ui.challenge

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
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

        // Selecciona flujo según tipo
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
                val feedback = if (idx == quiz.correctIndex) {
                    "¡Correcto! +$earnedLocal pts"
                } else {
                    val correcta = quiz.options[quiz.correctIndex]
                    "Incorrecto. La respuesta correcta era: $correcta. +0 pts"
                }

                // Si no hay puntos ganados, mostrar feedback y regresar sin llamar backend
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

        // Temporizador
        if (desafio.requiereTemporizador) {
            binding.tvTemporizador.visibility = View.VISIBLE
            binding.progressBar.visibility = View.VISIBLE
            binding.progressBar.max = desafio.duracionSegundos
            binding.progressBar.progress = 0

            temporizador?.cancel()
            temporizador = object : CountDownTimer(desafio.duracionSegundos * 1000L, 1000L) {
                override fun onTick(ms: Long) {
                    val secLeft = (ms / 1000).toInt()
                    val passed = desafio.duracionSegundos - secLeft
                    binding.progressBar.progress = passed
                    val min = secLeft / 60
                    val sec = secLeft % 60
                    binding.tvTemporizador.text = String.format("Tiempo restante: %02d:%02d", min, sec)
                }
                override fun onFinish() {
                    binding.tvTemporizador.text = "¡Tiempo cumplido!"
                    binding.btnCompletar.isEnabled = true
                }
            }.also { timer ->
                binding.btnCompletar.isEnabled = false
                timer.start()
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

    private fun completeChallenge(
        respin: Boolean,
        name: String,
        earned: Int,
        feedback: String
    ) {
        binding.btnCompletar.isEnabled = false
        FirebaseFunctions.getInstance()
            .getHttpsCallable("completeChallenge")
            .call(mapOf(
                "isRespin" to respin,
                "challengeName" to name,
                "earnedPoints" to earned
            ))
            .addOnSuccessListener { result ->
                val data = result.data as? Map<*, *> ?: emptyMap<Any,Any>()
                val total = (data["totalPoints"] as? Number)?.toInt() ?: -1
                Toast.makeText(
                    requireContext(),
                    "$feedback. Total: $total pts",
                    Toast.LENGTH_LONG
                ).show()
                findNavController().navigateUp()
            }
            .addOnFailureListener { e ->
                binding.btnCompletar.isEnabled = true
                Toast.makeText(requireContext(), e.message ?: "Error", Toast.LENGTH_LONG).show()
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        temporizador?.cancel()
        _binding = null
    }
}
