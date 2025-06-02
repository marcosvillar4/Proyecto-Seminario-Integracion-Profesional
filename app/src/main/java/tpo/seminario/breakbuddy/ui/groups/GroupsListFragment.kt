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
            loadGroups()
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
                // Navegar a detalles del grupo
                val action = GroupsListFragmentDirections
                    .actionGroupsListToGroupDetails(group.id)
                findNavController().navigate(action)
            },
            onJoinClick = { group ->
                // Mostrar diálogo para unirse al grupo
                showJoinGroupDialog(group)
            },
            onLeaveClick = { group ->
                // Mostrar confirmación para salir del grupo
                showLeaveGroupDialog(group)
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
        viewModel.loadUserGroups()
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
        groupsAdapter.submitList(state.groups)

        // Manejar errores
        state.errorMessage?.let { error ->
            showErrorToast(error)
            viewModel.clearError()
        }
    }

    private fun showJoinGroupDialog(group: Group) {
        AlertDialog.Builder(requireContext())
            .setTitle("Unirse al grupo")
            .setMessage("¿Deseas unirte al grupo '${group.name}'?")
            .setPositiveButton("Unirse") { _, _ ->
                viewModel.joinGroup(group.id)
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }

    private fun showLeaveGroupDialog(group: Group) {
        AlertDialog.Builder(requireContext())
            .setTitle("Salir del grupo")
            .setMessage("¿Estás seguro de que deseas salir del grupo '${group.name}'?")
            .setPositiveButton("Salir") { _, _ ->
                viewModel.leaveGroup(group.id)
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