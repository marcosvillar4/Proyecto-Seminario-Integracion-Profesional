package tpo.seminario.breakbuddy.ui.groups

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tpo.seminario.breakbuddy.databinding.ItemGroupMemberBinding
import tpo.seminario.breakbuddy.util.groups.GroupMember

class GroupMembersAdapter(
    private var currentUserUid: String,
    private var groupOwnerUid: String,
    private val onRemoveClick: (GroupMember) -> Unit
) : ListAdapter<GroupMember, GroupMembersAdapter.MemberViewHolder>(MemberDiffCallback()) {

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
                // Nombre y email
                textMemberName.text = member.name.ifBlank { member.email } // si no hay nombre, mostramos email
                textMemberEmail.text = member.email

                // Chip “Admin” visible solo si isOwner == true
                chipOwner.visibility = if (member.isOwner) View.VISIBLE else View.GONE

                // Botón eliminar (btnRemove) visible solo si quien ve (currentUserUid) es el dueño
                // y no se está mostrando a sí mismo:
                if (currentUserUid == groupOwnerUid && member.id != currentUserUid) {
                    btnRemove.visibility = View.VISIBLE
                } else {
                    btnRemove.visibility = View.GONE
                }

                // Listener para “eliminar”
                btnRemove.setOnClickListener {
                    onRemoveClick(member)
                }
            }
        }
    }

    /** Permite actualizar dinámicamente quién es el viewer (para ocultar su propio botón) */
    fun setCurrentUserUid(uid: String) {
        this.currentUserUid = uid
    }

    /** Permite actualizar dinámicamente quién es el owner del grupo */
    fun setGroupOwnerUid(uid: String) {
        this.groupOwnerUid = uid
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
