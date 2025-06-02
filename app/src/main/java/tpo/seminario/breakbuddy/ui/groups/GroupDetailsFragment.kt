package tpo.seminario.breakbuddy.ui.groups

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import tpo.seminario.breakbuddy.databinding.FragmentGroupDetailsBinding
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.GroupMember
import tpo.seminario.breakbuddy.util.groups.MembershipStatus

class GroupDetailsFragment : Fragment() {

    private var _binding: FragmentGroupDetailsBinding? = null
    private val binding get() = _binding!!

    private val args: GroupDetailsFragmentArgs by navArgs()
    private val viewModel: GroupsViewModel by viewModels()

    private lateinit var membersAdapter: GroupMembersAdapter
    private var currentGroup: Group? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGroupDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
        setupObservers()
        loadGroupDetails()
    }

    private fun setupUI() {
        // Configurar RecyclerView para miembros
        membersAdapter = GroupMembersAdapter()
        binding.recyclerViewMembers.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = membersAdapter
        }

        // Configurar botones
        binding.buttonJoinGroup.setOnClickListener {
            currentGroup?.let { group ->
                viewModel.joinGroup(group.id)
                binding.buttonJoinGroup.isEnabled = false
            }
        }

        binding.buttonLeaveGroup.setOnClickListener {
            currentGroup?.let { group ->
                viewModel.leaveGroup(group.id)
                binding.buttonLeaveGroup.isEnabled = false
            }
        }

        // Botón de navegación hacia atrás
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        // Botón para copiar código
        binding.buttonCopyCode.setOnClickListener {
            currentGroup?.let { group ->
                copyGroupCodeToClipboard(group.code)
            }
        }
    }

    private fun setupObservers() {
        viewModel.groupsUiState.observe(viewLifecycleOwner) { state ->
            binding.progressBar.visibility = if (state.isLoading) View.VISIBLE else View.GONE

            state.errorMessage?.let { error ->
                Toast.makeText(requireContext(), error, Toast.LENGTH_LONG).show()
                viewModel.clearError()
            }
        }
    }

    private fun loadGroupDetails() {
        // Por ahora simulamos la carga del grupo individual
        // En una implementación real, necesitarías una función en el ViewModel
        // para cargar un grupo específico por ID
        viewModel.loadUserGroups()

        // Observar cambios en los grupos para encontrar el actual
        viewModel.groupsUiState.observe(viewLifecycleOwner) { state ->
            val group = state.groups.find { it.id == args.groupId }
            group?.let {
                currentGroup = it
                updateUI(it)
            }
        }
    }

    private fun updateUI(group: Group) {
        binding.apply {
            // Información básica del grupo
            textGroupName.text = group.name
            textGroupCode.text = "Código: ${group.code}"
            textMemberCount.text = "${group.memberCount} miembros"

            // Hobby (si existe)
            if (group.hobby != null) {
                textGroupHobby.text = group.hobby
                layoutHobby.visibility = View.VISIBLE
            } else {
                layoutHobby.visibility = View.GONE
            }

            // Tipo de grupo
            textGroupType.text = when (group.type) {
                "personal" -> "Grupo Personal"
                "organization" -> "Grupo de Organización"
                else -> "Tipo desconocido"
            }

            // Organización (si es grupo de organización)
            if (group.type == "organization" && group.organizationName != null) {
                textOrganizationName.text = group.organizationName
                layoutOrganization.visibility = View.VISIBLE
            } else {
                layoutOrganization.visibility = View.GONE
            }

            // Información de creación
            textCreatedAt.text = "Creado: ${formatDate(group.createdAt)}"

            // Configurar botones según el estado de membresía
            updateMembershipButtons(group)

            // Cargar lista de miembros (simulada por ahora)
            loadGroupMembers(group)
        }
    }

    private fun updateMembershipButtons(group: Group) {
        binding.apply {
            when {
                group.isOwner -> {
                    // Es el dueño del grupo
                    buttonJoinGroup.visibility = View.GONE
                    buttonLeaveGroup.visibility = View.GONE
                    textOwnerBadge.visibility = View.VISIBLE
                    textOwnerBadge.text = "Eres el administrador"
                }
                group.membershipStatus == MembershipStatus.MEMBER -> {
                    // Es miembro del grupo
                    buttonJoinGroup.visibility = View.GONE
                    buttonLeaveGroup.visibility = View.VISIBLE
                    buttonLeaveGroup.isEnabled = true
                    textOwnerBadge.visibility = View.GONE
                }
                else -> {
                    // No es miembro
                    buttonJoinGroup.visibility = View.VISIBLE
                    buttonLeaveGroup.visibility = View.GONE
                    buttonJoinGroup.isEnabled = true
                    textOwnerBadge.visibility = View.GONE
                }
            }
        }
    }

    private fun loadGroupMembers(group: Group) {
        // Por ahora mostramos una lista simulada
        // En una implementación real, cargarías los detalles de los miembros desde Firestore
        val mockMembers = group.memberIds.mapIndexed { index, memberId ->
            GroupMember(
                id = memberId,
                name = "Miembro ${index + 1}",
                email = if (index < group.emails.size) group.emails[index] else "email@example.com",
                isOwner = memberId == group.ownerId
            )
        }

        membersAdapter.submitList(mockMembers)

        // Mostrar sección de miembros
        binding.layoutMembers.visibility = View.VISIBLE
    }

    private fun copyGroupCodeToClipboard(code: String) {
        val clipboard = requireContext().getSystemService(android.content.Context.CLIPBOARD_SERVICE)
                as android.content.ClipboardManager
        val clip = android.content.ClipData.newPlainText("Código del grupo", code)
        clipboard.setPrimaryClip(clip)

        Toast.makeText(requireContext(), "Código copiado al portapapeles", Toast.LENGTH_SHORT).show()
    }

    private fun formatDate(timestamp: Long): String {
        val date = java.util.Date(timestamp)
        val formatter = java.text.SimpleDateFormat("dd/MM/yyyy", java.util.Locale.getDefault())
        return formatter.format(date)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}