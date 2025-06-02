package tpo.seminario.breakbuddy.ui.wheel

import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bluehomestudio.luckywheel.WheelItem
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentWheelBinding
import kotlin.random.Random

class WheelFragment : Fragment() {

    private var _binding: FragmentWheelBinding? = null
    private val binding get() = _binding!!

    private lateinit var wheelItems: MutableList<WheelItem>
    private var lastTargetIndex: Int = -1
    private var hasUsedRespin = false
    private var chosenText: String? = null

    private val emptyBitmap: Bitmap by lazy {
        Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWheelBinding.inflate(inflater, container, false)

        if (!binding.lwv.isInEditMode) {
            wheelItems = mutableListOf(
                WheelItem(resources.getColor(R.color.green_500, null), emptyBitmap, "Descanso 5’"),
                WheelItem(resources.getColor(R.color.blue_500, null), emptyBitmap, "Hidratarte"),
                WheelItem(resources.getColor(R.color.purple_500, null), emptyBitmap, "Estiramiento"),
                WheelItem(resources.getColor(R.color.orange_500, null), emptyBitmap, "Caminar"),
                WheelItem(resources.getColor(R.color.teal_200, null), emptyBitmap, "Meditación"),
                WheelItem(resources.getColor(R.color.red_500, null), emptyBitmap, "Respirar")
            )
            binding.lwv.addWheelItems(wheelItems)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSpin.setOnClickListener {
            binding.tvStatus.text = ""
            binding.btnAceptar.visibility = View.GONE
            binding.btnRespin.visibility = View.GONE
            binding.btnSpin.visibility = View.GONE
            lastTargetIndex = Random.nextInt(wheelItems.size)
            binding.lwv.rotateWheelTo(lastTargetIndex)
        }

        binding.lwv.setLuckyWheelReachTheTarget {
            if (lastTargetIndex in wheelItems.indices) {
                val n = wheelItems.size
                val actualIndex = (lastTargetIndex - 1 + n) % n
                chosenText = wheelItems[actualIndex].text

                binding.tvStatus.text = "¡Desafío: $chosenText!"

                // Mostrar botones después del giro
                binding.btnAceptar.visibility = View.VISIBLE
                if (!hasUsedRespin) {
                    binding.btnRespin.visibility = View.VISIBLE
                }
            }
        }

        binding.btnAceptar.setOnClickListener {
            val texto = chosenText ?: return@setOnClickListener

            val instrucciones = mapOf(
                "Descanso 5’" to "Poné el celular a un lado y relajate 5 minutos.",
                "Hidratarte" to "Andá a buscar agua y tomate un vaso.",
                "Estiramiento" to "Estirá cuello, espalda y piernas.",
                "Caminar" to "Caminá 2 minutos por tu espacio.",
                "Meditación" to "Respirá profundo durante 3 minutos.",
                "Respirar" to "Hacé 5 respiraciones profundas."
            )

            val detalle = instrucciones[texto] ?: "Realizá el desafío."
            val recompensa = if (hasUsedRespin) "+5 puntos" else "+10 puntos"

            val bundle = Bundle().apply {
                putString("nombre", texto)
                putString("instruccion", detalle)
                putString("recompensa", recompensa)
                putBoolean("respin", hasUsedRespin)
            }

            findNavController().navigate(R.id.challengeFragment, bundle)
        }

        binding.btnRespin.setOnClickListener {
            if (!hasUsedRespin) {
                hasUsedRespin = true
                binding.btnRespin.visibility = View.GONE
                binding.btnAceptar.visibility = View.GONE
                binding.tvStatus.text = "Re-intentando..."
                // Girar distinto
                var newIndex: Int
                do {
                    newIndex = Random.nextInt(wheelItems.size)
                } while (newIndex == lastTargetIndex)
                lastTargetIndex = newIndex
                binding.lwv.rotateWheelTo(newIndex)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
