// tpo/seminario/breakbuddy/ui/ranking/RankingDialogFragment.kt

package tpo.seminario.breakbuddy.ui.ranking

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.DialogRankingBinding

class RankingDialogFragment : DialogFragment() {

    companion object {
        private const val ARG_GROUP_ID = "ARG_GROUP_ID"
        fun newInstance(groupId: String) = RankingDialogFragment().apply {
            arguments = bundleOf(ARG_GROUP_ID to groupId)
        }
    }

    private lateinit var groupId: String
    private var _binding: DialogRankingBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: RankingAdapter
    private val repo = RankingRepository()

    override fun onCreate(saved: Bundle?) {
        super.onCreate(saved)
        groupId = requireArguments().getString(ARG_GROUP_ID)!!
        setStyle(STYLE_NORMAL, R.style.Theme_BreakBuddy)
    }

    override fun onCreateDialog(saved: Bundle?): Dialog {
        _binding = DialogRankingBinding.inflate(LayoutInflater.from(context))
        adapter = RankingAdapter()
        binding.recyclerRanking.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = this@RankingDialogFragment.adapter
        }

        repo.getGroupRanking(groupId,
            onSuccess = { list ->
                adapter.submitList(list)
            },
            onFailure = {
                // Silencioso
            }
        )

        return AlertDialog.Builder(requireContext())
            .setTitle("Ranking del grupo")
            .setView(binding.root)
            .setPositiveButton("Cerrar", null)
            .create()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
