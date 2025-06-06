package tpo.seminario.breakbuddy.ui.challenge

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentChallengeBinding
import tpo.seminario.breakbuddy.util.DesafioGamificado

class ChallengeFragment : Fragment() {

    private var _binding: FragmentChallengeBinding? = null
    private val binding get() = _binding!!
    private var temporizador: CountDownTimer? = null

    private val desafios = mapOf(
        "Descanso 5’" to DesafioGamificado(
            nombre = "Descanso 5’",
            instruccion = "Poné el celular a un lado y relajate 5 minutos.",
            recompensa = 10,
            iconoResId = R.drawable.ic_timer,
            requiereTemporizador = true,
            duracionSegundos = 300
        ),
        "Hidratarte" to DesafioGamificado(
            nombre = "Hidratarte",
            instruccion = "Tomate un vaso de agua y recargá energías.",
            recompensa = 10,
            iconoResId = R.drawable.ic_water
        ),
        "Estiramiento" to DesafioGamificado(
            nombre = "Estiramiento",
            instruccion = "Estirá cuello, espalda y piernas por 1 minuto.",
            recompensa = 10,
            iconoResId = R.drawable.ic_stretch
        ),
        "Caminar" to DesafioGamificado(
            nombre = "Caminar",
            instruccion = "Caminá al menos 2 minutos por tu espacio.",
            recompensa = 10,
            iconoResId = R.drawable.ic_walk,
            requiereTemporizador = true,
            duracionSegundos = 120
        ),
        "Meditación" to DesafioGamificado(
            nombre = "Meditación",
            instruccion = "Respirá profundo durante 3 minutos.",
            recompensa = 10,
            iconoResId = R.drawable.ic_meditate,
            requiereTemporizador = true,
            duracionSegundos = 180
        ),
        "Respirar" to DesafioGamificado(
            nombre = "Respirar",
            instruccion = "Hacé 5 respiraciones profundas y conscientes.",
            recompensa = 10,
            iconoResId = R.drawable.ic_breath
        )
    )

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

        val respin = arguments?.getBoolean("respin", false) ?: false
        val nombre = arguments?.getString("nombre") ?: return
        val desafio = desafios[nombre] ?: return

        binding.tvTituloDesafio.text = "¡Desafío: ${desafio.nombre}!"
        binding.tvInstruccion.text = desafio.instruccion
        binding.imgDesafio.setImageResource(desafio.iconoResId)

        if (respin) {
            binding.tvInstruccion.text = "${desafio.instruccion}\n\n⚠️ Este desafío fue obtenido con Re-spin y otorga la mitad de puntos."
            binding.btnCompletar.setBackgroundTintList(
                resources.getColorStateList(R.color.alerta, null)
            )
            binding.btnCompletar.text = "Aceptar (Re-spin)"
        }

        if (desafio.requiereTemporizador) {
            binding.tvTemporizador.visibility = View.VISIBLE
            binding.progressBar.visibility = View.VISIBLE
            binding.progressBar.max = desafio.duracionSegundos
            binding.progressBar.progress = 0

            temporizador?.cancel() // cancelación previa
            temporizador = object : CountDownTimer(desafio.duracionSegundos * 1000L, 1000L) {
                override fun onTick(millisUntilFinished: Long) {
                    val segundosRestantes = (millisUntilFinished / 1000).toInt()
                    val segundosPasados = desafio.duracionSegundos - segundosRestantes
                    binding.progressBar.progress = segundosPasados

                    val minutos = segundosRestantes / 60
                    val segundos = segundosRestantes % 60
                    val tiempoRestante = String.format("%02d:%02d", minutos, segundos)

                    binding.tvTemporizador.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100).withEndAction {
                        binding.tvTemporizador.animate().scaleX(1f).scaleY(1f).setDuration(100).start()
                    }.start()

                    binding.tvTemporizador.text = "Tiempo restante: $tiempoRestante"
                }

                override fun onFinish() {
                    binding.tvTemporizador.text = "¡Tiempo cumplido!"
                    binding.btnCompletar.isEnabled = true
                    binding.progressBar.progress = binding.progressBar.max
                }
            }.also { it.start() }

            binding.btnCompletar.isEnabled = false
        } else {
            binding.tvTemporizador.visibility = View.GONE
            binding.progressBar.visibility = View.GONE
            binding.btnCompletar.isEnabled = true
        }

        binding.btnCompletar.setOnClickListener {
            val puntos = if (respin) desafio.recompensa / 2 else desafio.recompensa
            Toast.makeText(requireContext(), "¡Ganaste $puntos puntos!", Toast.LENGTH_LONG).show()
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        temporizador?.cancel()
        _binding = null
    }
}