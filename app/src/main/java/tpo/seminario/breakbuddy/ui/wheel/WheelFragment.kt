package tpo.seminario.breakbuddy.ui.wheel

import android.R.attr.logo
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.caneryilmaz.apps.luckywheel.constant.TextOrientation
import com.caneryilmaz.apps.luckywheel.data.WheelData
import com.caneryilmaz.apps.luckywheel.ui.LuckyWheelView
import com.google.android.gms.ads.AdView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.functions.FirebaseFunctions
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentWheelBinding
import tpo.seminario.breakbuddy.persistence.UserProfile
import tpo.seminario.breakbuddy.util.DesafioGamificado
import tpo.seminario.breakbuddy.util.HobbyQuestionsProvider
import tpo.seminario.breakbuddy.util.PhysicalChallengesProvider
import kotlin.random.Random


import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.LoadAdError
import android.os.Handler
import android.os.Looper


class WheelFragment : Fragment() {

    private var _binding: FragmentWheelBinding? = null
    private val binding get() = _binding!!



    // 1) AdMob banner
    private lateinit var adView: AdView
    private val retryDelayMs = 2000L



    private var currentChallengesList: List<DesafioGamificado> = emptyList()
    // Al inicio de la clase:
    private val challengeViewModel: ChallengeViewModel by activityViewModels()

    private lateinit var wheelItems: ArrayList<WheelData>
    private var hasUsedRespin = false
    private var chosenText: String? = null
    private var lastTargetIndex: Int = -1
    private var firestoreListener: ListenerRegistration? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWheelBinding.inflate(inflater, container, false)

        // 1) Armo la lista de WheelData
        wheelItems = arrayListOf(
            WheelData(
                icon = loadBitmapFromResource(R.drawable.weekend_24dp_),
                text = "Descanso 5'",
                textColor = intArrayOf(resources.getColor(R.color.white, null)),
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
        val w = widthPx ?: drawable.intrinsicWidth.takeIf { it > 0 } ?: 24.dpToPx()
        val h = heightPx ?: drawable.intrinsicHeight.takeIf { it > 0 } ?: 24.dpToPx()
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

    private fun Int.dpToPx(): Int =
        (this * resources.displayMetrics.density).toInt()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // === Banner AdMob ===
        adView = view.findViewById(R.id.adViewWheel)
        adView.adListener = object : AdListener() {
            override fun onAdLoaded() {
                Log.d("AdMob", "Wheel banner loaded")
            }
            override fun onAdFailedToLoad(error: LoadAdError) {
                Log.e("AdMob", "Wheel banner failed: ${error.message}")
                Handler(Looper.getMainLooper()).postDelayed({
                    adView.loadAd(AdRequest.Builder().build())
                }, retryDelayMs)
            }
        }
        adView.loadAd(AdRequest.Builder().build())



        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return

        firestoreListener = FirebaseFirestore.getInstance()
            .collection("userProfiles").document(uid)
            .addSnapshotListener { snap, e ->
                if (e != null) {
                    Log.e("WheelFragment","Error leyendo perfil: ${e.message}")
                    return@addSnapshotListener
                }
                if (snap != null && snap.exists()) {
                    val profile = snap.toObject(UserProfile::class.java)!!
                    actualizarEstadoSpin(profile)
                    generateWheelChallenges(profile.hobbies)

                }
            }

        // Botón "Girar"
        binding.btnSpin.setOnClickListener {
            binding.btnSpin.isEnabled = false
            hasUsedRespin = false
            chosenText = null
            binding.tvStatus.text = "Girando..."
            binding.btnAceptar.visibility = View.GONE
            binding.btnRespin.visibility = View.GONE

            // Primero validar el spin diario
            FirebaseFunctions.getInstance()
                .getHttpsCallable("spinDaily")
                .call(emptyMap<String, Any>())
                .addOnSuccessListener {
                    // Si la validación es exitosa, girar la ruleta
                    val idx = Random.nextInt(wheelItems.size)
                    lastTargetIndex = idx
                    binding.lwv.setTarget(idx)
                    binding.lwv.rotateWheel()
                }
                .addOnFailureListener { e ->
                    Log.e("WheelFragment","Error validando spin: ${e.message}")
                    Toast.makeText(requireContext(), e.message ?: "Error al validar spin", Toast.LENGTH_LONG).show()
                    binding.btnSpin.isEnabled = true
                    binding.tvStatus.text = ""
                }
        }

        // Listener de fin de rotación
        binding.lwv.setRotationCompleteListener { data ->
            val b = _binding ?: return@setRotationCompleteListener
            chosenText = data.text
            b.tvStatus.text = "¡Desafío: ${data.text}!"
            b.btnAceptar.visibility = View.VISIBLE
            if (!hasUsedRespin) b.btnRespin.visibility = View.VISIBLE
        }

        // Botón "Aceptar" - Solo navega al desafío, NO otorga puntos
        binding.btnAceptar.setOnClickListener {
            val texto = chosenText ?: return@setOnClickListener
            val instrucciones = mapOf(
                "Descanso 5'" to "Poné el celular a un lado y relajate 5 minutos.",
                "Hidratarte"  to "Andá a buscar agua y tomate un vaso.",
                "Estiramiento" to "Estirá cuello, espalda y piernas.",
                "Caminar"     to "Caminá 2 minutos por tu espacio.",
                "Meditación"  to "Respirá profundo durante 3 minutos.",
                "Respirar"    to "Hacé 5 respiraciones profundas."
            )
            val detalle = instrucciones[texto] ?: "Realizá el desafío."

            // Solo navegar al desafío
            if (_binding != null) {
                findNavController().navigate(
                    R.id.challengeFragment,
                    Bundle().apply {
                        putString("nombre", texto)
                        putString("instruccion", detalle)
                        putInt("recompensa", if (hasUsedRespin) 5 else 10)
                        putBoolean("respin", hasUsedRespin)
                    }
                )
            }
        }

        // Botón "Re-spin"
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

    private fun actualizarEstadoSpin(profile: UserProfile) {
        val currentBinding = _binding ?: return

        val now = System.currentTimeMillis()
        val last = profile.lastSpinAt ?: 0L
        val dayMillis = 60000 // 24 horas //USAR ESTO PARA CAMBIAR EL TIEMPO ENTRE SPINS

        if (now - last >= dayMillis) {
            currentBinding.btnSpin.isEnabled = true
            currentBinding.tvStatus.text = "¡Gira la ruleta para obtener un desafío!"
            hasUsedRespin = false
        } else {
            currentBinding.btnSpin.isEnabled = false
            val millisLeft = dayMillis - (now - last)
            val hours = millisLeft / (1000 * 60 * 60)
            val minutes = (millisLeft % (1000 * 60 * 60)) / (1000 * 60)
            val seconds = (millisLeft % (1000 * 60)) / 1000
            currentBinding.tvStatus.text = "Próximo spin disponible en ${hours}h ${minutes}m ${seconds}s"
        }
    }
    private fun generateWheelChallenges(hobbies: List<String>) {
        // 1) Físicos
        val phys = PhysicalChallengesProvider.physicalChallenges.shuffled().take(3)

        // 2) Quizzes de hobby
        val hobbyMap = HobbyQuestionsProvider.hobbyQuizzes
        val quizzes = hobbies
            .filter { hobbyMap.containsKey(it) }
            .flatMap { hobbyMap[it]!! }
            .shuffled()
            .take(3)
            .map { qq ->
                DesafioGamificado(
                    nombre = qq.question,
                    instruccion = qq.question,
                    recompensa = 10,
                    iconoResId = getIconForHobbyQuiz(),
                    quiz = qq
                )
            }

        // 3) Extra físicos si faltan
        val faltan = 6 - (phys.size + quizzes.size)
        val extra = if (faltan > 0) PhysicalChallengesProvider.physicalChallenges.shuffled().drop(3).take(faltan) else emptyList()

        // 4) Mezclar y guardar
        val all = (phys + quizzes + extra).shuffled()
        challengeViewModel.setCurrentChallenges(all.associateBy { it.nombre })

        // 5) WheelData
        wheelItems = ArrayList(all.map { d ->
            val bmp = loadBitmapFromResource(d.iconoResId) ?: createPlaceholderBitmap()
            WheelData(
                icon = bmp,
                text = d.nombre,
                textColor = intArrayOf(resources.getColor(R.color.white, null)),
                backgroundColor = intArrayOf(resources.getColor(R.color.green_500, null))
            )
        })
        binding.lwv.setWheelData(wheelItems)
    }

    private fun getIconForHobbyQuiz(): Int = R.drawable.question_mark_24dp_


    private fun getIconForHobby(hobby: String): Int {
        return when(hobby) {
            "Volley" -> R.drawable.sports_volleyball_24dp_
            "Cocinar" -> R.drawable.chef_hat_24dp_
            "Leer"    -> R.drawable.menu_book_24dp_
            // ...
            else -> R.drawable.question_mark_24dp_
        }
    }
    private fun createPlaceholderBitmap(): Bitmap {
        // Un cuadrado sencillo
        val size = 48.dpToPx()
        val bmp = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bmp)
        canvas.drawColor(ContextCompat.getColor(requireContext(), R.color.gray_300))
        val paint = Paint()
        return bmp
    }

    override fun onDestroyView() {
        super.onDestroyView()
        firestoreListener?.remove()
        firestoreListener = null
        _binding = null
    }
}