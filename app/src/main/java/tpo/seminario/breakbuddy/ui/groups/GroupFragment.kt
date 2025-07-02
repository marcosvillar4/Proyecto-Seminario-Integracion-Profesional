package tpo.seminario.breakbuddy.ui.groups

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import tpo.seminario.breakbuddy.R

class GroupsFragment : Fragment() {

    private lateinit var adView: AdView
    private val retryDelayMs = 2000L

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_groups, container, false)

        //banner AdMob
        adView = view.findViewById(R.id.adViewGroups)
        adView.adListener = object : AdListener() {
            override fun onAdLoaded() {
                Log.d("AdMob", "Groups banner loaded")
            }
            override fun onAdFailedToLoad(error: LoadAdError) {
                Log.e("AdMob", "Groups banner failed: ${error.message}")
                Handler(Looper.getMainLooper()).postDelayed({
                    adView.loadAd(AdRequest.Builder().build())
                }, retryDelayMs)
            }
        }
        adView.loadAd(AdRequest.Builder().build())

        view.findViewById<Button>(R.id.btnCreateGroup).setOnClickListener {
            findNavController().navigate(R.id.action_navigation_groups_to_createGroupFragment)
        }
        view.findViewById<Button>(R.id.btnViewAllGroups).setOnClickListener {
            findNavController().navigate(R.id.action_groupsFragment_to_groupsListFragment)
        }
        view.findViewById<Button>(R.id.btnJoinGroup).setOnClickListener {
            findNavController().navigate(R.id.action_navigation_group_to_joinGroupFragment)
        }

        return view
    }

    override fun onDestroyView() {
        adView.destroy()
        super.onDestroyView()
    }
}
