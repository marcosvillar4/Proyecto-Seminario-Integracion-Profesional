package tpo.seminario.breakbuddy.ui.wheel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.caneryilmaz.apps.luckywheel.data.WheelData
import com.caneryilmaz.apps.luckywheel.ui.LuckyWheelView
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentWheelBinding
import kotlin.random.Random

class WheelFragment : Fragment() {

    private var _binding: FragmentWheelBinding? = null
    private val binding get() = _binding!!

    private lateinit var wheelItems: ArrayList<WheelData>
    private var hasUsedRespin = false
    private var chosenText: String? = null
    private var lastTargetIndex: Int = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWheelBinding.inflate(inflater, container, false)

        // 1) Armo la lista de WheelData
        wheelItems = arrayListOf(
            WheelData(
                text = "Descanso 5’",
                textColor = intArrayOf(resources.getColor(R.color.black, null)),       // negro
                backgroundColor = intArrayOf(resources.getColor(R.color.green_500, null))
            ),
            WheelData(
                text = "Hidratarte",
                textColor = intArrayOf(resources.getColor(R.color.black, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.blue_500, null))
            ),
            WheelData(
                text = "Estiramiento",
                textColor = intArrayOf(resources.getColor(R.color.black, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.purple_500, null))
            ),
            WheelData(
                text = "Caminar",
                textColor = intArrayOf(resources.getColor(R.color.black, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.orange_500, null))
            ),
            WheelData(
                text = "Meditación",
                textColor = intArrayOf(resources.getColor(R.color.black, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.teal_200, null))
            ),
            WheelData(
                text = "Respirar",
                textColor = intArrayOf(resources.getColor(R.color.black, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.red_500, null))
            )
        )

        // 2) Cargo los datos en la ruleta
        binding.lwv.setWheelData(wheelItems)

        // 3) Personalizo tamaño y padding del texto
        //    getDimension returns px as float
        val textSizePx = resources.getDimension(R.dimen.luckywheel_text_size)
        (binding.lwv as LuckyWheelView).setTextSize(textSizePx.toInt())
        val paddingPx = resources.getDimension(R.dimen.luckywheel_padding)
        (binding.lwv as LuckyWheelView).setTextPadding(paddingPx)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Botón “Girar”
        binding.btnSpin.setOnClickListener {
            binding.tvStatus.text = ""
            binding.btnAceptar.visibility = View.GONE
            binding.btnRespin.visibility  = View.GONE

            val idx = Random.nextInt(wheelItems.size)
            lastTargetIndex = idx
            binding.lwv.setTarget(idx)
            binding.lwv.rotateWheel()
        }

        // Listener de fin de rotación
        binding.lwv.setRotationCompleteListener { data ->
            chosenText = data.text
            binding.tvStatus.text = "¡Desafío: ${data.text}!"
            binding.btnAceptar.visibility = View.VISIBLE
            if (!hasUsedRespin) binding.btnRespin.visibility = View.VISIBLE
        }

        // Botón “Aceptar”
        binding.btnAceptar.setOnClickListener {
            val texto = chosenText ?: return@setOnClickListener
            val instrucciones = mapOf(
                "Descanso 5’" to "Poné el celular a un lado y relajate 5 minutos.",
                "Hidratarte"  to "Andá a buscar agua y tomate un vaso.",
                "Estiramiento" to "Estirá cuello, espalda y piernas.",
                "Caminar"     to "Caminá 2 minutos por tu espacio.",
                "Meditación"  to "Respirá profundo durante 3 minutos.",
                "Respirar"    to "Hacé 5 respiraciones profundas."
            )
            val detalle = instrucciones[texto] ?: "Realizá el desafío."
            val recompensa = if (hasUsedRespin) "+5 puntos" else "+10 puntos"

            findNavController().navigate(
                R.id.challengeFragment,
                Bundle().apply {
                    putString("nombre", texto)
                    putString("instruccion", detalle)
                    putString("recompensa", recompensa)
                    putBoolean("respin", hasUsedRespin)
                }
            )
        }

        // Botón “Re-spin”
        binding.btnRespin.setOnClickListener {
            if (!hasUsedRespin) {
                hasUsedRespin = true
                binding.btnRespin.visibility  = View.GONE
                binding.btnAceptar.visibility = View.GONE
                binding.tvStatus.text = "Re-intentando…"

                var newIdx: Int
                do {
                    newIdx = Random.nextInt(wheelItems.size)
                } while (newIdx == lastTargetIndex)
                lastTargetIndex = newIdx
                binding.lwv.setTarget(newIdx)
                binding.lwv.rotateWheel()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
