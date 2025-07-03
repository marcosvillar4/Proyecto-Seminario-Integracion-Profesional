// tpo/seminario/breakbuddy/ui/ranking/RankingAdapter.kt
package tpo.seminario.breakbuddy.ui.ranking

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.ItemRankingBinding

class RankingAdapter : ListAdapter<RankingItem, RankingAdapter.VH>(DIFF) {
    companion object {
        private val DIFF = object : DiffUtil.ItemCallback<RankingItem>() {
            override fun areItemsTheSame(a: RankingItem, b: RankingItem) = a.name == b.name
            override fun areContentsTheSame(a: RankingItem, b: RankingItem) = a == b
        }
    }

    inner class VH(private val vb: ItemRankingBinding)
        : RecyclerView.ViewHolder(vb.root) {

        fun bind(item: RankingItem) {
            // Resalta al primero
            if (item.rank == 1) {
                vb.root.setCardBackgroundColor(
                    ContextCompat.getColor(vb.root.context, R.color.gold2)
                )
                vb.tvRank.setTextColor(
                    ContextCompat.getColor(vb.root.context, R.color.white)
                )
                vb.tvName.setTextColor(
                    ContextCompat.getColor(vb.root.context, R.color.white)
                )
                vb.tvPoints.setTextColor(
                    ContextCompat.getColor(vb.root.context, R.color.white)
                )
                vb.tvMotivation.apply {
                    text = "¡Felicidades ${item.name}! Como primer puesto, te mereces una invitación por parte de tus colegas para la próxima actividad grupal 🎉"
                    visibility = View.VISIBLE
                }
            } else {
                vb.root.setCardBackgroundColor(
                    ContextCompat.getColor(vb.root.context, android.R.color.white)
                )
                vb.tvMotivation.visibility = View.GONE
            }

            vb.tvRank.text   = "${item.rank}."
            vb.tvName.text   = item.name
            vb.tvPoints.text = "${item.points} pts"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        ItemRankingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )
    override fun onBindViewHolder(holder: VH, position: Int) =
        holder.bind(getItem(position))
}
