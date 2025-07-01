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
    private val retryDelayMs = 2000L

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

        setupFaqAccordion(view)

        adView.loadAd(AdRequest.Builder().build())
    }

    private fun setupFaqAccordion(view: View) {
        val faqs = listOf(
            R.id.tvPregunta1 to R.id.tvRespuesta1,
            R.id.tvPregunta2 to R.id.tvRespuesta2,
            R.id.tvPregunta3 to R.id.tvRespuesta3,
            R.id.tvPregunta4 to R.id.tvRespuesta4,
            R.id.tvPregunta5 to R.id.tvRespuesta5,
            R.id.tvPregunta6 to R.id.tvRespuesta6,
            R.id.tvPregunta7 to R.id.tvRespuesta7
        )

        val respuestas = faqs.map { view.findViewById<TextView>(it.second) }

        faqs.forEach { (idPregunta, idRespuesta) ->
            val preguntaView = view.findViewById<TextView>(idPregunta)
            val respuestaView = view.findViewById<TextView>(idRespuesta)

            preguntaView.setOnClickListener {
                respuestas.forEach { it.visibility = View.GONE }
                respuestaView.visibility = View.VISIBLE
            }
        }
    }

    override fun onDestroyView() {
        adView.destroy()
        super.onDestroyView()
        _binding = null
    }
}