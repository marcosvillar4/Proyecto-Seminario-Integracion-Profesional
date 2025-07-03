// tpo/seminario/breakbuddy/ui/ranking/RankingFragment.kt

package tpo.seminario.breakbuddy.ui.ranking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import tpo.seminario.breakbuddy.databinding.FragmentRankingBinding

class RankingFragment : Fragment() {

    private val args: RankingFragmentArgs by navArgs()
    private var _binding: FragmentRankingBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: RankingAdapter
    private val repo = RankingRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRankingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val groupId = args.groupId
        if (groupId.isBlank()) {
            requireActivity().onBackPressed()
            return
        }

        adapter = RankingAdapter()
        binding.recyclerRanking.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@RankingFragment.adapter
        }

        loadRanking(groupId)
    }

    private fun loadRanking(groupId: String) {
        showEmpty(true)
        repo.getGroupRanking(groupId,
            onSuccess = { list ->
                if (list.isEmpty()) {
                    showEmpty(true)
                } else {
                    showEmpty(false)
                    adapter.submitList(list)
                }
            },
            onFailure = { err ->
                Toast.makeText(requireContext(), "Error: $err", Toast.LENGTH_LONG).show()
                showEmpty(true)
            }
        )
    }

    private fun showEmpty(empty: Boolean) {
        binding.tvEmpty.isVisible = empty
        binding.recyclerRanking.isVisible = !empty
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
