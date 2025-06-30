package tpo.seminario.breakbuddy.ui.checkin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.Timestamp
import tpo.seminario.breakbuddy.databinding.ItemCheckinBinding
import java.text.SimpleDateFormat
import java.util.*

data class CheckinHistoryItem(
    val timestamp: Timestamp?,
    val emoji: String
)

class CheckinHistoryAdapter :
    ListAdapter<CheckinHistoryItem, CheckinHistoryAdapter.VH>(DIFF) {

    companion object {
        private val DIFF = object : DiffUtil.ItemCallback<CheckinHistoryItem>() {
            override fun areItemsTheSame(a: CheckinHistoryItem, b: CheckinHistoryItem) =
                a.timestamp == b.timestamp
            override fun areContentsTheSame(a: CheckinHistoryItem, b: CheckinHistoryItem) =
                a == b
        }
    }

    inner class VH(private val vb: ItemCheckinBinding) :
        RecyclerView.ViewHolder(vb.root) {
        fun bind(item: CheckinHistoryItem) {
            val date = item.timestamp?.toDate()
            val fmt = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())
            vb.tvDate.text = fmt.format(date)
            vb.tvEmoji.text = item.emoji
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VH(ItemCheckinBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: VH, position: Int) =
        holder.bind(getItem(position))
}
