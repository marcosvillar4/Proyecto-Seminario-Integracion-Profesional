package tpo.seminario.breakbuddy.ui.dashboard

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
import tpo.seminario.breakbuddy.databinding.FragmentDashboardBinding
import tpo.seminario.breakbuddy.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError


class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var adView: AdView
    private val retryDelayMs = 2000L  // 2 segundos

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

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

        // Primera carga
        adView.loadAd(AdRequest.Builder().build())
    }

    override fun onDestroyView() {
        adView.destroy()
        super.onDestroyView()
        _binding = null
    }
}