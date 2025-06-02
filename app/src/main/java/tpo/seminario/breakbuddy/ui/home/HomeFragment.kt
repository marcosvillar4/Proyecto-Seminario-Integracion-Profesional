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

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    // 1) Declara AdView
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

    // 2) Carga el banner en onViewCreated
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adView = view.findViewById(R.id.adViewBanner)

        // Listener con retry
        adView.adListener = object : AdListener() {
            override fun onAdLoaded() {
                // Banner cargó bien
                Log.d("AdMob", "Banner loaded")
            }

            override fun onAdFailedToLoad(error: LoadAdError) {
                Log.e("AdMob", "Failed to load banner: ${error.message}")
                // Reintentar tras delay
                Handler(Looper.getMainLooper()).postDelayed({
                    adView.loadAd(AdRequest.Builder().build())
                }, retryDelayMs)
            }
        }

        val btnTestMBI = view.findViewById<Button>(R.id.btnRealizarTestMBI)
        btnTestMBI.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_testMBIFragment)
        }

        // Primera carga
        adView.loadAd(AdRequest.Builder().build())
    }

    override fun onDestroyView() {
        adView.destroy()
        super.onDestroyView()
        _binding = null
    }
}