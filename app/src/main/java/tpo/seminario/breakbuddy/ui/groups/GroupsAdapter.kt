package tpo.seminario.breakbuddy.ui.groups

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.ItemGroupBinding
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.GroupFilter
import tpo.seminario.breakbuddy.util.groups.MembershipStatus
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class GroupsAdapter(
    private val onGroupClick: (Group) -> Unit,
    private val onJoinClick: (Group) -> Unit,
    private val onLeaveClick: (Group) -> Unit
) : ListAdapter<Group, GroupsAdapter.GroupViewHolder>(GroupDiffCallback()) {

    private var allGroups: List<Group> = emptyList()
    private var filteredGroups: List<Group> = emptyList()
    private var currentFilter = GroupFilter.ALL
    private var searchQuery = ""

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
        val binding = ItemGroupBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return GroupViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    // Cambié el nombre del método para evitar conflicto con ListAdapter.submitList()
    fun updateGroups(groups: List<Group>) {
        allGroups = groups
        applyCurrentFilters()
    }

    fun applyFilter(filter: GroupFilter) {
        currentFilter = filter
        applyCurrentFilters()
    }

    fun filter(query: String) {
        searchQuery = query.lowercase()
        applyCurrentFilters()
    }

    private fun applyCurrentFilters() {
        var filtered = allGroups

        // Aplicar filtro por tipo
        filtered = when (currentFilter) {
            GroupFilter.ALL -> filtered
            GroupFilter.PERSONAL -> filtered.filter { it.type == "personal" }
            GroupFilter.ORGANIZATION -> filtered.filter { it.type == "organization" }
            GroupFilter.OWNED -> filtered.filter { it.isOwner }
        }

        // Aplicar filtro de búsqueda
        if (searchQuery.isNotEmpty()) {
            filtered = filtered.filter { group ->
                group.name.lowercase().contains(searchQuery) ||
                        group.hobby?.lowercase()?.contains(searchQuery) == true ||
                        group.organizationName?.lowercase()?.contains(searchQuery) == true
            }
        }

        filteredGroups = filtered
        // Usar el método heredado de ListAdapter
        submitList(filtered)
    }

    inner class GroupViewHolder(
        private val binding: ItemGroupBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(group: Group) {
            binding.apply {
                // Información básica
                textGroupName.text = group.name
                textMemberCount.text = "${group.memberCount} miembros"
                textGroupCode.text = "Código: ${group.code}"

                // Hobby (opcional)
                if (group.hobby != null) {
                    textHobby.text = group.hobby
                    textHobby.visibility = View.VISIBLE
                    iconHobby.visibility = View.VISIBLE
                } else {
                    textHobby.visibility = View.GONE
                    iconHobby.visibility = View.GONE
                }

                // Tipo de grupo
                chipGroupType.text = when (group.type) {
                    "personal" -> "Personal"
                    "organization" -> "Organización"
                    else -> "Desconocido"
                }

                // Color del chip según tipo
                chipGroupType.backgroundTintList = ColorStateList.valueOf(
                    ContextCompat.getColor(
                        root.context,
                        if (group.type == "personal") R.color.blue_500 else R.color.purple_500
                    )
                )

                // Mostrar organización si aplica
                if (group.organizationName != null) {
                    textOrganization.text = group.organizationName
                    textOrganization.visibility = View.VISIBLE
                    iconOrganization.visibility = View.VISIBLE
                } else {
                    textOrganization.visibility = View.GONE
                    iconOrganization.visibility = View.GONE
                }

                // Indicador de propietario
                if (group.isOwner) {
                    iconOwner.visibility = View.VISIBLE
                    textOwnerLabel.visibility = View.VISIBLE
                } else {
                    iconOwner.visibility = View.GONE
                    textOwnerLabel.visibility = View.GONE
                }

                // Estado del miembro
                when (group.membershipStatus) {
                    MembershipStatus.MEMBER -> {
                        btnJoin.visibility = View.GONE
                        btnLeave.visibility = View.VISIBLE
                        cardGroup.alpha = 1.0f
                        textPendingStatus.visibility = View.GONE
                    }
                    MembershipStatus.NOT_MEMBER -> {
                        btnJoin.visibility = View.VISIBLE
                        btnLeave.visibility = View.GONE
                        cardGroup.alpha = 0.7f
                        textPendingStatus.visibility = View.GONE
                    }
                    MembershipStatus.PENDING -> {
                        btnJoin.visibility = View.GONE
                        btnLeave.visibility = View.GONE
                        cardGroup.alpha = 0.5f
                        // Mostrar indicador de pendiente
                        textPendingStatus.visibility = View.VISIBLE
                        textPendingStatus.text = "Solicitud pendiente"
                    }
                }

                // Fecha de creación
                textCreatedDate.text = "Creado: ${formatDate(group.createdAt)}"

                // Listeners
                cardGroup.setOnClickListener {
                    onGroupClick(group)
                }

                btnJoin.setOnClickListener {
                    onJoinClick(group)
                }

                btnLeave.setOnClickListener {
                    onLeaveClick(group)
                }

                // Hacer el código copiable
                textGroupCode.setOnClickListener {
                    copyToClipboard(root.context, group.code, "Código de grupo copiado")
                }
            }
        }

        private fun formatDate(timestamp: Long): String {
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            return sdf.format(Date(timestamp))
        }

        private fun copyToClipboard(context: Context, text: String, message: String) {
            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText("Group Code", text)
            clipboard.setPrimaryClip(clip)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}

class GroupDiffCallback : DiffUtil.ItemCallback<Group>() {
    override fun areItemsTheSame(oldItem: Group, newItem: Group): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Group, newItem: Group): Boolean {
        return oldItem == newItem
    }
}