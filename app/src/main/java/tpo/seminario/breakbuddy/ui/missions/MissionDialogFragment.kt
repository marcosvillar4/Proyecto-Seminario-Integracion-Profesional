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
        dialog?.setCanceledOnTouchOutside(false) // ← bloquea el toque afuera
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
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
        temporizador = object : CountDownTimer(mision.duracionSegundos * 1000L, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                val segundos = millisUntilFinished / 1000
                binding.tvTemporizador.text = "Completando... ${segundos}s"
                binding.tvTemporizador.animate().scaleX(1.1f).scaleY(1.1f).setDuration(100).withEndAction {
                    binding.tvTemporizador.animate().scaleX(1f).scaleY(1f).setDuration(100).start()
                }.start()
            }

            override fun onFinish() {
                binding.tvTemporizador.text = "¡Listo!"
                binding.btnListo.isEnabled = true
            }
        }.start()
    }

    private fun iniciarGuiaPasos() {
        val pasos = mision.pasosGuiados ?: return
        val duracionTotal = pasos.size * 2000L

        temporizador = object : CountDownTimer(duracionTotal, 2000L) {
            override fun onTick(millisUntilFinished: Long) {
                if (pasoIndex < pasos.size) {
                    binding.tvTemporizador.text = pasos[pasoIndex]
                    pasoIndex++
                }
            }

            override fun onFinish() {
                binding.tvTemporizador.text = "¡Bien hecho!"
                binding.btnListo.isEnabled = true
            }
        }.start()
    }

    override fun getTheme(): Int {
        return R.style.MissionDialogTheme
    }

    override fun onDestroyView() {
        super.onDestroyView()
        temporizador?.cancel()
        _binding = null
    }
}
