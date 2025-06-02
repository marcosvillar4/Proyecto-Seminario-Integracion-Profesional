package tpo.seminario.breakbuddy.ui.groups

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tpo.seminario.breakbuddy.databinding.ItemGroupMemberBinding
import tpo.seminario.breakbuddy.util.groups.GroupMember

class GroupMembersAdapter : ListAdapter<GroupMember, GroupMembersAdapter.MemberViewHolder>(MemberDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val binding = ItemGroupMemberBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return MemberViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class MemberViewHolder(
        private val binding: ItemGroupMemberBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(member: GroupMember) {
            binding.apply {
                textMemberName.text = member.name
                textMemberEmail.text = member.email

                // Mostrar badge de administrador si es el owner
                if (member.isOwner) {
                    chipOwner.visibility = android.view.View.VISIBLE
                } else {
                    chipOwner.visibility = android.view.View.GONE
                }
            }
        }
    }
}

class MemberDiffCallback : DiffUtil.ItemCallback<GroupMember>() {
    override fun areItemsTheSame(oldItem: GroupMember, newItem: GroupMember): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: GroupMember, newItem: GroupMember): Boolean {
        return oldItem == newItem
    }
}