package tpo.seminario.breakbuddy.ui.home

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import tpo.seminario.breakbuddy.databinding.FragmentHomeBinding
import tpo.seminario.breakbuddy.R
import com.google.android.gms.ads.AdRequest
import android.widget.Button
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    private lateinit var adView: AdView
    private val retryDelayMs = 2000L  // 2 segundos

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adView = view.findViewById(R.id.adViewBanner)

        adView.adListener = object : AdListener() {
            override fun onAdLoaded() {
                Log.d("AdMob", "Banner loaded")
            }

            override fun onAdFailedToLoad(error: LoadAdError) {
                Log.e("AdMob", "Failed to load banner: ${error.message}")
                Handler(Looper.getMainLooper()).postDelayed({
                    adView.loadAd(AdRequest.Builder().build())
                }, retryDelayMs)
            }
        }

        val btnTestMBI = view.findViewById<Button>(R.id.btnRealizarTestMBI)
        btnTestMBI.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_testMBIFragment)
        }
        binding.btnIrAMisiones.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_missionsFragment)
        }

        binding.fabHistory.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_checkinHistory)
        }

        binding.fabHistoryTests.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_testHistory)
        }


        setupFaqAccordion(view)

        adView.loadAd(AdRequest.Builder().build())
    }


    private fun setupFaqAccordion(view: View) {
        val faqs = listOf(
            Triple(R.id.tvPregunta1, R.id.tvRespuesta1, R.id.ivArrow1),
            Triple(R.id.tvPregunta2, R.id.tvRespuesta2, R.id.ivArrow2),
            Triple(R.id.tvPregunta3, R.id.tvRespuesta3, R.id.ivArrow3),
            Triple(R.id.tvPregunta4, R.id.tvRespuesta4, R.id.ivArrow4),
            Triple(R.id.tvPregunta5, R.id.tvRespuesta5, R.id.ivArrow5),
            Triple(R.id.tvPregunta6, R.id.tvRespuesta6, R.id.ivArrow6),
            Triple(R.id.tvPregunta7, R.id.tvRespuesta7, R.id.ivArrow7),
        )

        val respuestas = faqs.map { view.findViewById<TextView>(it.second) }

        faqs.forEach { (idPregunta, idRespuesta, idFlecha) ->
            val preguntaView = view.findViewById<TextView>(idPregunta)
            val respuestaView = view.findViewById<TextView>(idRespuesta)
            val flechaView = view.findViewById<View>(idFlecha)

            preguntaView.setOnClickListener {
                val visible = respuestaView.visibility == View.VISIBLE

                // Cierra todos
                respuestas.forEach { it.visibility = View.GONE }
                faqs.forEach { (_, _, arrowId) ->
                    val arrow = view.findViewById<View>(arrowId)
                    arrow.animate().rotation(0f).setDuration(200).start()
                }

                if (!visible) {
                    respuestaView.visibility = View.VISIBLE
                    flechaView.animate().rotation(180f).setDuration(200).start()
                }
            }
        }
    }



    override fun onDestroyView() {
        adView.destroy()
        super.onDestroyView()
        _binding = null
    }
}