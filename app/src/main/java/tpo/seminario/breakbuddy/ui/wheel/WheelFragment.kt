package tpo.seminario.breakbuddy.ui.wheel

import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentWheelBinding
import com.bluehomestudio.luckywheel.WheelItem
import kotlin.random.Random

class WheelFragment : Fragment() {

    // 1) View binding
    private var _binding: FragmentWheelBinding? = null
    private val binding get() = _binding!!

    // 2) Lista de secciones (items) de la ruleta
    private lateinit var wheelItems: MutableList<WheelItem>

    // 3) Guardamos aquí el índice que elegimos girar (tal cual se lo pasamos a rotateWheelTo)
    private var lastTargetIndex: Int = -1

    // Bitmap transparente (placeholder) de 1×1 px (para no enviar null al WheelItem)
    private val emptyBitmap: Bitmap by lazy {
        Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // 4) Inflar el XML mediante view binding
        _binding = FragmentWheelBinding.inflate(inflater, container, false)

        // 5) Solo agregamos items SI NO estamos en Edit Mode (Preview)
        if (!binding.lwv.isInEditMode) {
            wheelItems = mutableListOf(
                WheelItem(
                    resources.getColor(R.color.green_500, null),
                    emptyBitmap,
                    "Descanso 5’"
                ),
                WheelItem(
                    resources.getColor(R.color.blue_500, null),
                    emptyBitmap,
                    "Hidratarte"
                ),
                WheelItem(
                    resources.getColor(R.color.purple_500, null),
                    emptyBitmap,
                    "Estiramiento"
                ),
                WheelItem(
                    resources.getColor(R.color.orange_500, null),
                    emptyBitmap,
                    "Caminar"
                ),
                WheelItem(
                    resources.getColor(R.color.teal_200, null),
                    emptyBitmap,
                    "Meditación"
                ),
                WheelItem(
                    resources.getColor(R.color.red_500, null),
                    emptyBitmap,
                    "Respirar"
                )
            )

            // 6) Le pasamos la lista de segmentos AL LUCKYWHEEL antes de devolver la vista
            binding.lwv.addWheelItems(wheelItems)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 7) Callback: cuando la rueda termina de girar, se invoca esta lambda sin argumentos.
        //    El índice que realmente queda bajo la flecha es (lastTargetIndex - 1 + n) % n,
        //    porque rotateWheelTo(k) provoca que la flecha acabe en k-1 (módulo n).
        binding.lwv.setLuckyWheelReachTheTarget {
            if (lastTargetIndex in wheelItems.indices) {
                val n = wheelItems.size
                // Calculamos el índice real bajo la flecha:
                val actualIndex = (lastTargetIndex - 1 + n) % n
                val chosenText = wheelItems[actualIndex].text
                binding.tvStatus.text = "¡Desafío: $chosenText!"
            }
        }

        // 8) Botón “Girar”
        binding.btnSpin.setOnClickListener {
            // Limpiamos texto previo
            binding.tvStatus.text = ""

            // Elegimos un índice aleatorio (entre 0 y n-1)
            lastTargetIndex = Random.nextInt(wheelItems.size)

            // ────────────────────────────────
            //   Importante: solo llamamos a rotateWheelTo. No usar setTarget().
            binding.lwv.rotateWheelTo(lastTargetIndex)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
