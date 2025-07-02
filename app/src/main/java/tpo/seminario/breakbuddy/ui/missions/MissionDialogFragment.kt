package tpo.seminario.breakbuddy.ui.missions

import android.app.Dialog
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.DialogMissionBinding
import tpo.seminario.breakbuddy.util.missions.Mision
import tpo.seminario.breakbuddy.util.missions.TipoMision

class MissionDialogFragment(
    private val mision: Mision,
    private val onCompletada: () -> Unit
) : DialogFragment() {

    private var _binding: DialogMissionBinding? = null
    private val binding get() = _binding!!
    private var temporizador: CountDownTimer? = null
    private var pasoIndex = 0

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.window?.requestFeature(Window.FEATURE_NO_TITLE)
        return dialog
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DialogMissionBinding.inflate(inflater, container, false)
        dialog?.setCanceledOnTouchOutside(false) //bloquea toque afuera
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvTitulo.text = mision.titulo
        binding.tvDescripcion.text = mision.descripcion
        binding.btnListo.isEnabled = false

        when (mision.tipo) {
            TipoMision.TEMPORIZADOR -> iniciarTemporizador()
            TipoMision.GUIADA -> iniciarGuiaPasos()
            TipoMision.SIMPLE -> {
                binding.tvTemporizador.text = "Toca para continuar"
                binding.btnListo.isEnabled = true
            }
        }

        binding.btnListo.setOnClickListener {
            Toast.makeText(requireContext(), "¡Misión completada!", Toast.LENGTH_SHORT).show()
            mision.completada = true
            onCompletada()
            dismiss()
        }
    }

    private fun iniciarTemporizador() {
        // Aseguramos que duracionSegundos > 0
        val duracionMs = (mision.duracionSegundos * 1000L).coerceAtLeast(0L)
        temporizador?.cancel()
        temporizador = object : CountDownTimer(duracionMs, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                val b = _binding ?: run {
                    cancel()
                    return
                }
                val segundos = millisUntilFinished / 1000
                b.tvTemporizador.text = "Completando... ${segundos}s"
                b.tvTemporizador.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100).withEndAction {
                    val b2 = _binding ?: return@withEndAction
                    b2.tvTemporizador.animate().scaleX(1f).scaleY(1f).setDuration(100).start()
                }.start()
            }

            override fun onFinish() {
                val b = _binding ?: return
                b.tvTemporizador.text = "¡Listo!"
                b.btnListo.isEnabled = true
            }
        }.also { it.start() }
    }

    private fun iniciarGuiaPasos() {
        val pasos = mision.pasosGuiados
        if (pasos.isNullOrEmpty()) {
            val b0 = _binding ?: return
            b0.tvTemporizador.text = "¡Bien hecho!"
            b0.btnListo.isEnabled = true
            return
        }
        pasoIndex = 0
        val duracionTotal = pasos.size * 2000L
        temporizador?.cancel()
        temporizador = object : CountDownTimer(duracionTotal, 2000L) {
            override fun onTick(millisUntilFinished: Long) {
                val b = _binding ?: run {
                    cancel()
                    return
                }
                if (pasoIndex < pasos.size) {
                    b.tvTemporizador.text = pasos[pasoIndex]
                    pasoIndex++
                }
            }

            override fun onFinish() {
                val b = _binding ?: return
                b.tvTemporizador.text = "¡Bien hecho!"
                b.btnListo.isEnabled = true
            }
        }.also { it.start() }
    }

    override fun getTheme(): Int {
        return R.style.MissionDialogTheme
    }

    override fun onDestroyView() {
        temporizador?.cancel()
        temporizador = null
        _binding = null
        super.onDestroyView()
    }
}
