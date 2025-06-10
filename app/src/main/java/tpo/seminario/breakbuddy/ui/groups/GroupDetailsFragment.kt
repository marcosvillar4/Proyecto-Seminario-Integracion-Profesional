package tpo.seminario.breakbuddy.ui.groups

import android.app.AlertDialog
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import tpo.seminario.breakbuddy.databinding.FragmentGroupDetailsBinding
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.GroupMember
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.util.groups.MembershipStatus
import java.text.SimpleDateFormat
import java.util.Locale
class GroupDetailsFragment : Fragment() {

    private var _binding: FragmentGroupDetailsBinding? = null
    private val binding get() = _binding!!

    private val args: GroupDetailsFragmentArgs by navArgs()
    private val viewModel: GroupsViewModel by viewModels()
    private val auth = FirebaseAuth.getInstance()
    private lateinit var entityId: String
    private lateinit var entityType: String

    private lateinit var membersAdapter: GroupMembersAdapter
    private var currentGroup: Group? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGroupDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        entityId = args.entityId
        entityType = args.entityType
        if (entityId.isBlank() || entityType.isBlank()) {
            Toast.makeText(requireContext(), "ID de grupo inválido", Toast.LENGTH_SHORT).show()
            findNavController().popBackStack()
            return
        }

        setupStaticUI()
        observeGroupDetails()
        observeOperationResults()
        viewModel.loadEntityById(entityId, entityType)
    }

    private fun setupStaticUI() {
        membersAdapter = GroupMembersAdapter(
            currentUserUid = auth.currentUser?.uid ?: "",
            groupOwnerUid  = "",
            onRemoveClick  = { member ->
                AlertDialog.Builder(requireContext())
                    .setTitle("Eliminar miembro")
                    .setMessage("¿Deseas eliminar a ${member.email} del grupo?")
                    .setPositiveButton("Eliminar") { _, _ ->
                        viewModel.removeMemberFromEntity(
                            entityId            = entityId,
                            type                = entityType,
                            memberUidToRemove   = member.id,
                            memberEmailToRemove = member.email
                        )
                    }
                    .setNegativeButton("Cancelar", null)
                    .show()
            }
        )

        binding.recyclerViewMembers.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = membersAdapter
        }

        binding.buttonJoinGroup.setOnClickListener {
            currentGroup?.let { grp ->
                viewModel.joinByCode(grp.id)
                binding.buttonJoinGroup.isEnabled = false
            }
        }

        binding.buttonLeaveGroup.setOnClickListener {
            val currentUid   = auth.currentUser?.uid ?: return@setOnClickListener
            val currentEmail = auth.currentUser?.email ?: ""
            currentGroup?.let { grp ->
                viewModel.removeMemberFromEntity(
                    entityId            = grp.id,
                    type                = grp.type,
                    memberUidToRemove   = currentUid,
                    memberEmailToRemove = currentEmail
                )
                binding.buttonLeaveGroup.isEnabled = false
            }
        }

        binding.buttonAddMember.setOnClickListener {
            showAddMemberDialog()
        }

        binding.buttonCopyCode.setOnClickListener {
            currentGroup?.let { grp ->
                copyGroupCodeToClipboard(grp.code)
            }
        }
    }

    private fun observeGroupDetails() {
        viewModel.singleGroup.observe(viewLifecycleOwner) { group ->
            if (group == null) {
                Toast.makeText(requireContext(), "El grupo ya no existe.", Toast.LENGTH_LONG).show()
                findNavController().popBackStack()
            } else {
                // Si mi membershipStatus cambió a NOT_MEMBER → cierro
                if (group.membershipStatus == MembershipStatus.NOT_MEMBER) {
                    Toast.makeText(requireContext(), "Ya no eres parte de este grupo.", Toast.LENGTH_LONG).show()
                    findNavController().popBackStack()
                    return@observe
                }
                currentGroup = group
                populateGroupDetails(group)
            }
        }
    }

    private fun observeOperationResults() {
        viewModel.removeMemberError.observe(viewLifecycleOwner) { err ->
            err?.let {
                Toast.makeText(requireContext(), it, Toast.LENGTH_LONG).show()
                viewModel.clearRemoveMemberError()
            }
        }
        viewModel.removeMemberSuccess.observe(viewLifecycleOwner) { success ->
            if (success == true) {
                Toast.makeText(requireContext(), "Miembro eliminado", Toast.LENGTH_SHORT).show()
                viewModel.clearRemoveMemberSuccess()
                // Actualizo sólo este grupo
                viewModel.loadEntityById(entityId, entityType)
            }
        }

        viewModel.addMemberError.observe(viewLifecycleOwner) { err ->
            err?.let {
                Toast.makeText(requireContext(), it, Toast.LENGTH_LONG).show()
                viewModel.clearAddMemberError()
            }
        }
        viewModel.addMemberSuccess.observe(viewLifecycleOwner) { success ->
            if (success == true) {
                Toast.makeText(requireContext(), "Miembro agregado con éxito", Toast.LENGTH_SHORT).show()
                viewModel.clearAddMemberSuccess()
                viewModel.loadEntityById(entityId, entityType)
            }
        }
    }

    private fun populateGroupDetails(group: Group) {
        binding.apply {
            textGroupName.text   = group.name
            textGroupCode.text   = "Código: ${group.code}"
            textMemberCount.text = "${group.memberCount} miembros"

            if (!group.hobby.isNullOrBlank()) {
                textGroupHobby.text = group.hobby
                layoutHobby.visibility = View.VISIBLE
            } else {
                layoutHobby.visibility = View.GONE
            }

            textGroupType.text = when (group.type) {
                "personal"     -> "Grupo Personal"
                "organization" -> "Grupo de Organización"
                else           -> "Tipo desconocido"
            }

            if (group.type == "organization" && !group.organizationName.isNullOrBlank()) {
                textOrganizationName.text = group.organizationName
                layoutOrganization.visibility = View.VISIBLE
            } else {
                layoutOrganization.visibility = View.GONE
            }

            textCreatedAt.text = "Creado: ${formatDate(group.createdAt)}"

            updateMembershipButtons(group)

            membersAdapter.setCurrentUserUid(auth.currentUser?.uid ?: "")
            membersAdapter.setGroupOwnerUid(group.ownerUid)

            updateMembersList(group)

            val currentUid = auth.currentUser?.uid
            textOwnerBadge.visibility = if (group.ownerUid == currentUid) View.VISIBLE else View.GONE
            if (group.ownerUid == currentUid) {
                textOwnerBadge.text = "Eres el administrador"
            }
            buttonAddMember.visibility = if (group.ownerUid == currentUid) View.VISIBLE else View.GONE
        }
    }

    private fun updateMembershipButtons(group: Group) {
        val currentUid = auth.currentUser?.uid
        binding.apply {
            if (group.ownerUid == currentUid) {
                buttonJoinGroup.visibility = View.GONE
                buttonLeaveGroup.visibility = View.GONE
                textOwnerBadge.visibility = View.VISIBLE
                buttonAddMember.visibility = View.VISIBLE
            }
            else if (group.memberIds.contains(currentUid)) {
                buttonJoinGroup.visibility = View.GONE
                buttonLeaveGroup.visibility = View.VISIBLE
                textOwnerBadge.visibility = View.GONE
                buttonAddMember.visibility = View.GONE
            }
            else {
                buttonJoinGroup.visibility = View.VISIBLE
                buttonLeaveGroup.visibility = View.GONE
                textOwnerBadge.visibility = View.GONE
                buttonAddMember.visibility = View.GONE
            }
        }
    }

    private fun updateMembersList(group: Group) {
        val uids   = group.memberIds
        val emails = group.emails
        val list   = mutableListOf<GroupMember>()

        for (i in uids.indices) {
            val uid     = uids[i]
            val email   = if (i < emails.size) emails[i] else ""
            val isOwner = (uid == group.ownerUid)
            list.add(GroupMember(id = uid, name = "", email = email, isOwner = isOwner))
        }

        membersAdapter.submitList(list)
        binding.layoutMembers.visibility = View.VISIBLE
    }

    private fun showAddMemberDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Agregar nuevo miembro")
        val input = EditText(requireContext()).apply {
            hint = "Email del integrante"
            inputType = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                marginStart = 24
                marginEnd = 24
            }
        }
        builder.setView(input)
        builder.setPositiveButton("Agregar") { dialog, _ ->
            val email = input.text.toString().trim()
            if (email.isBlank()) {
                Toast.makeText(requireContext(), "Debes ingresar un email", Toast.LENGTH_SHORT).show()
            } else {
                viewModel.addMemberToEntity(entityId, entityType, email)
            }
            dialog.dismiss()
        }
        builder.setNegativeButton("Cancelar") { d, _ -> d.dismiss() }
        builder.show()
    }

    private fun copyGroupCodeToClipboard(code: String) {
        val clipboard = requireContext().getSystemService(Context.CLIPBOARD_SERVICE)
                as ClipboardManager
        val clip = ClipData.newPlainText("Código del grupo", code)
        clipboard.setPrimaryClip(clip)
        Toast.makeText(requireContext(), "Código copiado al portapapeles", Toast.LENGTH_SHORT).show()
    }

    private fun formatDate(ts: com.google.firebase.Timestamp?): String {
        if (ts == null) return ""
        val date = ts.toDate() // convierte a java.util.Date
        val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        return formatter.format(date)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
