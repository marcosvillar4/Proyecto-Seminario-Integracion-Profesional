package tpo.seminario.breakbuddy.ui.groups

import android.app.AlertDialog
import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentGroupsListBinding
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.GroupFilter
import tpo.seminario.breakbuddy.util.groups.GroupsListState

class GroupsListFragment : Fragment() {

    private var _binding: FragmentGroupsListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: GroupsViewModel by viewModels()

    private lateinit var groupsAdapter: GroupsAdapter
    private var currentFilter = GroupFilter.ALL

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGroupsListBinding.inflate(inflater, container, false)
        setupViews()
        setupRecyclerView()
        observeViewModel()
        loadGroups()

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        // Solo recarga de Firestore, no toca filtros ni lista vacía:
        viewModel.loadUserGroupsAndOrgs()
    }

    private fun setupViews() {
        // Botón para crear nuevo grupo
        binding.fabCreateGroup.setOnClickListener {
            findNavController().navigate(R.id.action_groupsList_to_createGroup)
        }

        // Configurar filtros
        binding.chipAll.setOnClickListener { applyFilter(GroupFilter.ALL) }
        binding.chipPersonal.setOnClickListener { applyFilter(GroupFilter.PERSONAL) }
        binding.chipOrganization.setOnClickListener { applyFilter(GroupFilter.ORGANIZATION) }
        binding.chipOwned.setOnClickListener { applyFilter(GroupFilter.OWNED) }

        // Pull to refresh
        binding.swipeRefreshLayout.setOnRefreshListener {
            viewModel.loadUserGroupsAndOrgs()
        }

        // Configurar búsqueda
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                groupsAdapter.filter(newText ?: "")
                return true
            }
        })
    }

    private fun setupRecyclerView() {
        groupsAdapter = GroupsAdapter(
            onGroupClick = { group ->
                val action = GroupsListFragmentDirections
                    .actionGroupsListToGroupDetails(entityId = group.id, entityType = group.type)
                findNavController().navigate(action)
            },
            onJoinClick = { group ->
                // Confirmación
                AlertDialog.Builder(requireContext())
                    .setTitle("Unirse")
                    .setMessage("¿Deseas unirte a '${group.name}'?")
                    .setPositiveButton("Unirse") { _,_ ->
                        viewModel.joinByCode(group.code)
                    }
                    .setNegativeButton("Cancelar", null)
                    .show()
            },
            onLeaveClick = { group ->
                AlertDialog.Builder(requireContext())
                    .setTitle("Salir")
                    .setMessage("¿Deseas salir de '${group.name}'?")
                    .setPositiveButton("Salir") { _,_ ->
                        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return@setPositiveButton
                        val email = FirebaseAuth.getInstance().currentUser?.email ?: ""
                        viewModel.removeMemberFromEntity(group.id, group.type, uid, email)
                    }
                    .setNegativeButton("Cancelar", null)
                    .show()
            },
            onChatClick = { group ->
                // Navegar al ChatFragment, pasando group.id
                val action = GroupsListFragmentDirections
                    .actionGroupsListToChatFragment(group.id) // si quieres pasar nombre
                findNavController().navigate(action)
            }

        )

        binding.recyclerViewGroups.apply {
            adapter = groupsAdapter
            layoutManager = LinearLayoutManager(requireContext())

            // Agregar decoración para separar items
            addItemDecoration(
                DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
            )
        }
    }

    private fun observeViewModel() {
        viewModel.groupsUiState.observe(viewLifecycleOwner) { state ->
            updateUI(state)
        }
    }

    private fun loadGroups() {
        viewModel.loadUserGroupsAndOrgs()
    }

    private fun applyFilter(filter: GroupFilter) {
        currentFilter = filter
        updateFilterChips()
        groupsAdapter.applyFilter(filter)
    }

    private fun updateFilterChips() {
        // Resetear todos los chips
        binding.chipAll.isChecked = false
        binding.chipPersonal.isChecked = false
        binding.chipOrganization.isChecked = false
        binding.chipOwned.isChecked = false

        // Marcar el chip activo
        when (currentFilter) {
            GroupFilter.ALL -> binding.chipAll.isChecked = true
            GroupFilter.PERSONAL -> binding.chipPersonal.isChecked = true
            GroupFilter.ORGANIZATION -> binding.chipOrganization.isChecked = true
            GroupFilter.OWNED -> binding.chipOwned.isChecked = true
        }
    }

    private fun updateUI(state: GroupsListState) {
        // Controlar loading
        binding.swipeRefreshLayout.isRefreshing = state.isLoading
        binding.progressBar.visibility = if (state.isLoading && state.groups.isEmpty())
            View.VISIBLE else View.GONE

        // Mostrar/ocultar vista vacía
        if (state.groups.isEmpty() && !state.isLoading) {
            binding.layoutEmpty.visibility = View.VISIBLE
            binding.recyclerViewGroups.visibility = View.GONE
        } else {
            binding.layoutEmpty.visibility = View.GONE
            binding.recyclerViewGroups.visibility = View.VISIBLE
        }

        // Actualizar lista
        groupsAdapter.updateGroups(state.groups)

        // Manejar errores
        state.errorMessage?.let { error ->
            showErrorToast(error)
            viewModel.clearError()
        }
    }

    private fun showJoinGroupDialog(group: Group) {
        AlertDialog.Builder(requireContext())
            .setTitle(if (group.type=="organization") "Unirse a la organización" else "Unirse al grupo")
            .setMessage("¿Deseas unirte a '${group.name}'?")
            .setPositiveButton("Unirse") { _, _ ->
                // Usualmente joinByCode usa el código
                viewModel.joinByCode(group.code)
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }

    private fun showLeaveGroupDialog(group: Group) {
        AlertDialog.Builder(requireContext())
            .setTitle(if (group.type == "organization") "Salir de la organización" else "Salir del grupo")
            .setMessage("¿Estás seguro de que deseas " +
                    if (group.type == "organization") "salir de '${group.name}'?"
                    else "salir del grupo '${group.name}'?")
            .setPositiveButton("Salir") { _, _ ->
                val currentUser = FirebaseAuth.getInstance().currentUser
                if (currentUser == null) {
                    Toast.makeText(requireContext(), "Usuario no autenticado", Toast.LENGTH_SHORT).show()
                    return@setPositiveButton
                }
                val uid = currentUser.uid
                val email = currentUser.email ?: ""
                viewModel.removeMemberFromEntity(
                    entityId = group.id,
                    type = group.type,
                    memberUidToRemove = uid,
                    memberEmailToRemove = email
                )
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }

    private fun showErrorToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).apply {
            view?.backgroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), R.color.error)
            )
        }.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}