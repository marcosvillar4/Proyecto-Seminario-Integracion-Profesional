package tpo.seminario.breakbuddy.ui.wheel

import android.R.attr.logo
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.caneryilmaz.apps.luckywheel.constant.TextOrientation
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
                icon = loadBitmapFromResource(R.drawable.weekend_24dp_),
                text = "Descanso 5’",
                textColor = intArrayOf(resources.getColor(R.color.white, null)),       // negro
                backgroundColor = intArrayOf(resources.getColor(R.color.green_200, null))
            ),
            WheelData(
                icon = loadBitmapFromResource(R.drawable.water_drop_24dp_),
                text = "Hidratarte",
                textColor = intArrayOf(resources.getColor(R.color.white, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.green_500, null))
            ),
            WheelData(
                icon = loadBitmapFromResource(R.drawable.physical_therapy_24dp_),
                text = "Estiramiento",
                textColor = intArrayOf(resources.getColor(R.color.white, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.green_200, null))
            ),
            WheelData(
                icon = loadBitmapFromResource(R.drawable.directions_walk_24dp_png),
                text = "Caminar",
                textColor = intArrayOf(resources.getColor(R.color.white, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.green_500, null))
            ),
            WheelData(
                icon = loadBitmapFromResource(R.drawable.self_improvement_24dp_),
                text = "Meditación",
                textColor = intArrayOf(resources.getColor(R.color.white, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.green_200, null))
            ),
            WheelData(
                icon = loadBitmapFromResource(R.drawable.pulmonology_24dp_),
                text = "Respirar",
                textColor = intArrayOf(resources.getColor(R.color.white, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.green_500, null))
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

        binding.lwv.apply {

            setWheelCenterImage(R.drawable.logo2)
            setWheelCenterImageSize(70.toFloat(), 70.toFloat())
            drawCenterPoint(true)
            setCenterPointColor(resources.getColor(R.color.white, null))
            setCenterPointRadius(120.toFloat())
            drawWheelStroke(true)
            var array = intArrayOf(resources.getColor(R.color.green_500, null))
            setWheelStrokeColor(array)
            setWheelStrokeThickness(15.toFloat())
            setTextFont(R.font.poppins_medium)
            setTextPadding(20.toFloat())
            setTextOrientation(TextOrientation.HORIZONTAL)
            setTextSize(0)
            setWheelTopArrowSize(55.toFloat(),55.toFloat())
            setWheelTopArrowColor(resources.getColor(R.color.acento, null))
            drawItemSeparator(true)
            var array2 = intArrayOf(resources.getColor(R.color.acento, null))
            setWheelItemSeparatorColor(array2)
            setItemSeparatorThickness(10.toFloat())
            setIconPosition(0.8f)
        }

        return binding.root
    }

    private fun drawableToBitmap(drawableId: Int, widthPx: Int? = null, heightPx: Int? = null): Bitmap? {
        val drawable = ContextCompat.getDrawable(requireContext(), drawableId) ?: return null
        // Determinar dimensiones
        val w = widthPx ?: drawable.intrinsicWidth.takeIf { it > 0 } ?: 24.dpToPx()
        val h = heightPx ?: drawable.intrinsicHeight.takeIf { it > 0 } ?: 24.dpToPx()
        // Crear bitmap y canvas
        val bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        drawable.setBounds(0, 0, w, h)
        drawable.draw(canvas)
        return bitmap
    }

    private fun loadBitmapFromResource(resId: Int): Bitmap? {
        return try {
            BitmapFactory.decodeResource(resources, resId)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    /** Extensión para convertir Int dp a px */
    private fun Int.dpToPx(): Int =
        (this * resources.displayMetrics.density).toInt()

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
