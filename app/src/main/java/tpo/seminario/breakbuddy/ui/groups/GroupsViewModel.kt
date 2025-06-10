package tpo.seminario.breakbuddy.ui.groups

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.persistence.GroupRepository
import tpo.seminario.breakbuddy.persistence.OrganizationRepository
import tpo.seminario.breakbuddy.util.Organization
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.GroupCreationState
import tpo.seminario.breakbuddy.util.groups.GroupsListState
import tpo.seminario.breakbuddy.util.groups.MembershipStatus

class GroupsViewModel : ViewModel() {
    private val firestore = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private val groupRepo = GroupRepository()
    private val orgRepo = OrganizationRepository()

    // Estado de la lista combinada
    private val _groupsUiState = MutableLiveData<GroupsListState>()
    val groupsUiState: LiveData<GroupsListState> = _groupsUiState

    // Estado de creación (grupo u organización)
    private val _uiState = MutableLiveData<GroupCreationState>()
    val uiState: LiveData<GroupCreationState> = _uiState

    // LiveData para errores/éxitos de agregar miembro en grupo (solo para grupos personales)
    private val _addMemberError = MutableLiveData<String?>()
    val addMemberError: LiveData<String?> = _addMemberError
    private val _addMemberSuccess = MutableLiveData<Boolean>()
    val addMemberSuccess: LiveData<Boolean> = _addMemberSuccess

    // LiveData para eliminar miembro / salir de grupo u organización
    private val _removeMemberSuccess = MutableLiveData<Boolean?>()
    val removeMemberSuccess: LiveData<Boolean?> = _removeMemberSuccess
    private val _removeMemberError = MutableLiveData<String?>()
    val removeMemberError: LiveData<String?> = _removeMemberError

    // LiveData para detalles de un solo “Group-like” (puede ser grupo o mapeo de organización)
    private val _singleGroup = MutableLiveData<Group?>()
    val singleGroup: LiveData<Group?> = _singleGroup

    init {
        // Estado inicial de creación
        _uiState.value = GroupCreationState(isLoading = false, isSuccess = false, errorMessage = null, createdGroupId = null, groupCode = null)
        _removeMemberError.value = null
        _removeMemberSuccess.value = false
    }

    /**
     * Convierte una Organization a un objeto Group para UI.
     * Usamos campos análogos: id, name, code, type="organization", organizationName=name, memberIds, etc.
     */
    private fun Organization.asGroupLike(): Group {
        return Group(
            id = this.id,
            name = this.name,
            code = this.code,
            type = "organization",
            hobby = null,
            derivado = false,
            organizationId = null,
            organizationName = this.name,
            memberIds = this.memberIds,
            emails = this.emails,
            memberCount = this.memberCount,
            ownerUid = this.ownerUid,
            createdAt = this.createdAt,
            updatedAt = this.updatedAt,
            isOwner = this.isOwner,
            membershipStatus = this.membershipStatus,
            memberHobbies = emptyMap()
        )
    }

    /** Limpia errores de agregar miembro */
    fun clearAddMemberError() {
        _addMemberError.value = null
    }
    /** Limpia éxito de agregar miembro */
    fun clearAddMemberSuccess() {
        _addMemberSuccess.value = false
    }
    /** Limpia estado de removeMember */
    fun clearRemoveMemberSuccess() {
        _removeMemberSuccess.value = null
    }
    fun clearRemoveMemberError() {
        _removeMemberError.value = null
    }
    /** Limpia errores generales */
    fun clearError() {
        _groupsUiState.value = _groupsUiState.value?.copy(errorMessage = null)
        _uiState.value = _uiState.value?.copy(errorMessage = null)
    }

    // ---------------------------------------------------
    // 1) Listar “mis grupos” + “mis organizaciones” juntos
    // ---------------------------------------------------
    fun loadUserGroupsAndOrgs() {
        val currentUserId = auth.currentUser?.uid ?: return
        // Indicar loading
        _groupsUiState.value = GroupsListState(isLoading = true)

        // 1) Obtener grupos personales
        firestore.collection("groups")
            .whereArrayContains("memberIds", currentUserId)
            .get()
            .addOnSuccessListener { groupDocs ->
                // Mapear documentos de grupos
                val groupsPersonal = groupDocs.documents.mapNotNull { doc ->
                    try {
                        val grp = doc.toObject(Group::class.java)
                        val memberIds = (doc.get("memberIds") as? List<String>) ?: emptyList()
                        if (grp != null) {
                            grp.copy(
                                id = doc.id,
                                isOwner = (doc.getString("ownerUid") == currentUserId),
                                membershipStatus = if (memberIds.contains(currentUserId)) MembershipStatus.MEMBER else MembershipStatus.NOT_MEMBER,
                                memberCount = memberIds.size
                            )
                        } else null
                    } catch (e: Exception) {
                        null
                    }
                }

                // 2) Obtener organizaciones
                orgRepo.getUserOrganizations(
                    onSuccess = { orgList ->
                        // Mapear cada Organization a Group-like
                        val groupsFromOrgs = orgList.map { it.asGroupLike() }
                        // 3) Combinar ambas listas
                        val combined = (groupsPersonal + groupsFromOrgs)
                            // Opcional: ordenar por createdAt descendente
                            .sortedByDescending { it.createdAt ?: com.google.firebase.Timestamp.now() }
                        // Emitir resultado
                        _groupsUiState.value = GroupsListState(
                            groups = combined,
                            isLoading = false
                        )
                    },
                    onFailure = { errMsg ->
                        // Aunque falle al obtener orgs, al menos mostramos los grupos personales
                        val combined = groupsPersonal
                        _groupsUiState.value = GroupsListState(
                            groups = combined,
                            isLoading = false,
                            errorMessage = "Error cargando organizaciones: $errMsg"
                        )
                    }
                )
            }
            .addOnFailureListener { e ->
                // Falla lectura de grupos personales: igual intentamos leer organizaciones?
                orgRepo.getUserOrganizations(
                    onSuccess = { orgList ->
                        val groupsFromOrgs = orgList.map { it.asGroupLike() }
                        _groupsUiState.value = GroupsListState(
                            groups = groupsFromOrgs,
                            isLoading = false,
                            errorMessage = "Error cargando grupos personales: ${e.message}"
                        )
                    },
                    onFailure = { errOrg ->
                        // Falla ambos
                        _groupsUiState.value = GroupsListState(
                            groups = emptyList(),
                            isLoading = false,
                            errorMessage = "Error cargando grupos: ${e.message}. Además error orgs: $errOrg"
                        )
                    }
                )
            }
    }

    // ---------------------------------------------------
    // 2) Crear grupo u organización
    // ---------------------------------------------------
    fun createEntity(
        name: String,
        emails: List<String>,
        hobby: String?,
        type: String,   // "personal" o "organization"
        orgId: String? = null,    // solo si es derivado de org; para creación manual de org, null
        orgName: String? = null   // no usado aquí
    ) {
        // Validar inputs según tipo
        // Por ejemplo:
        if (name.isBlank()) {
            _uiState.value = _uiState.value?.copy(errorMessage = "El nombre es obligatorio")
            return
        }
        if (type == "personal" && emails.isEmpty()) {
            _uiState.value = _uiState.value?.copy(errorMessage = "Debe agregar al menos un email para el grupo personal")
            return
        }
        // Mostrar loading
        _uiState.value = _uiState.value?.copy(isLoading = true, errorMessage = null)
            ?: GroupCreationState(isLoading = true, isSuccess = false, errorMessage = null, createdGroupId = null, groupCode = null)

        if (type == "organization") {
            // Crear organización
            orgRepo.createOrganization(
                name = name,
                emails = emails,
                onSuccess = { code ->
                    _uiState.value = GroupCreationState(
                        isLoading = false,
                        isSuccess = true,
                        errorMessage = null,
                        createdGroupId = null,
                        groupCode = code
                    )
                },
                onFailure = { errMsg ->
                    _uiState.value = GroupCreationState(
                        isLoading = false,
                        isSuccess = false,
                        errorMessage = errMsg,
                        createdGroupId = null,
                        groupCode = null
                    )
                }
            )
        } else {
            // Crear grupo personal
            groupRepo.createGroup(
                name = name,
                emails = emails,
                hobby = hobby,
                type = "personal",
                orgId = null,
                organizationName = null,
                onSuccess = { code ->
                    _uiState.value = GroupCreationState(
                        isLoading = false,
                        isSuccess = true,
                        errorMessage = null,
                        createdGroupId = null,
                        groupCode = code
                    )
                },
                onFailure = { errMsg ->
                    _uiState.value = GroupCreationState(
                        isLoading = false,
                        isSuccess = false,
                        errorMessage = errMsg,
                        createdGroupId = null,
                        groupCode = null
                    )
                }
            )
        }
    }

    // ---------------------------------------------------
    // 3) Unirse por código (grupo personal u organización)
    // ---------------------------------------------------
    fun joinByCode(code: String) {
        if (code.isBlank()) {
            _groupsUiState.value = _groupsUiState.value?.copy(errorMessage = "El código no puede estar vacío")
            return
        }
        // Llamar método unificado
        groupRepo.joinGroupByCode(
            code = code.trim().uppercase(),
            onSuccess = {
                // Al unirse, recargar lista
                loadUserGroupsAndOrgs()
            },
            onFailure = { errMsg ->
                _groupsUiState.value = _groupsUiState.value?.copy(errorMessage = errMsg)
            }
        )
    }

    // ---------------------------------------------------
    // 4) Añadir miembro a grupo personal (solo si type=="personal")
    // ---------------------------------------------------
    fun addMemberToEntity(entityId: String, type: String, email: String) {
        _addMemberError.value = null
        _addMemberSuccess.value = false

        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _addMemberError.value = "Email inválido: \"$email\""
            return
        }

        val emailLower = email.trim().lowercase()
        if (type == "organization") {
            // Llamar OrganizationRepository.addMemberByEmail
            orgRepo.addMemberByEmail(
                orgId = entityId,
                email = emailLower,
                onSuccess = {
                    _addMemberSuccess.postValue(true)
                    // Recarga combinada de lista
                    loadUserGroupsAndOrgs()
                },
                onFailure = { errMsg ->
                    _addMemberError.postValue(errMsg)
                }
            )
        } else {
            // Grupo personal
            groupRepo.addMemberByEmail(
                groupId = entityId,
                email = emailLower,
                onSuccess = {
                    _addMemberSuccess.postValue(true)
                    loadUserGroupsAndOrgs()
                },
                onFailure = { errMsg ->
                    _addMemberError.postValue(errMsg)
                }
            )
        }
    }

    // ---------------------------------------------------
    // 5) Eliminar miembro o salir de grupo u organización
    // ---------------------------------------------------
    fun removeMemberFromEntity(entityId: String, type: String, memberUidToRemove: String, memberEmailToRemove: String) {
        _removeMemberError.value = null
        _removeMemberSuccess.value = false
        val currentUid = auth.currentUser?.uid ?: return
        if (type == "organization") {
            if (memberUidToRemove == currentUid) {
                // Me estoy saliendo a mí mismo
                orgRepo.leaveOrganization(
                    orgId = entityId,
                    onSuccess = {
                        _removeMemberSuccess.value = true
                        loadUserGroupsAndOrgs()
                    },
                    onFailure = { errMsg ->
                        _removeMemberError.value = errMsg
                    }
                )
            } else {
                // Owner removiendo a otro miembro
                orgRepo.removeMemberFromOrganization(
                    orgId = entityId,
                    memberUidToRemove = memberUidToRemove,
                    memberEmailToRemove = memberEmailToRemove,
                    onSuccess = {
                        _removeMemberSuccess.value = true
                        loadUserGroupsAndOrgs()
                    },
                    onFailure = { errMsg ->
                        _removeMemberError.value = errMsg
                    }
                )
            }
        } else {
            // Grupo personal como antes
            if (memberUidToRemove == currentUid) {
                // me salgo del grupo
                groupRepo.removeMemberFromGroup(
                    groupId = entityId,
                    memberUidToRemove = memberUidToRemove,
                    memberEmailToRemove = memberEmailToRemove,
                    onSuccess = {
                        _removeMemberSuccess.value = true
                        loadUserGroupsAndOrgs()
                    },
                    onFailure = { errMsg ->
                        _removeMemberError.value = errMsg
                    }
                )
            } else {
                // owner removiendo a otro en grupo personal
                groupRepo.removeMemberFromGroup(
                    groupId = entityId,
                    memberUidToRemove = memberUidToRemove,
                    memberEmailToRemove = memberEmailToRemove,
                    onSuccess = {
                        _removeMemberSuccess.value = true
                        loadUserGroupsAndOrgs()
                    },
                    onFailure = { errMsg ->
                        _removeMemberError.value = errMsg
                    }
                )
            }
        }
    }


    fun createOrganization(name: String, emails: List<String>, hobby: String?) {
        _uiState.value = GroupCreationState(isLoading = true, isSuccess = false, errorMessage = null, createdGroupId = null, groupCode = null)
        orgRepo.createOrganization(
            name = name,
            emails = emails,
            onSuccess = { code ->
                _uiState.value = GroupCreationState(isLoading = false, isSuccess = true, errorMessage = null, createdGroupId = null, groupCode = code)
            },
            onFailure = { err ->
                _uiState.value = GroupCreationState(isLoading = false, isSuccess = false, errorMessage = err, createdGroupId = null, groupCode = null)
            }
        )
    }

    // ---------------------------------------------------
    // 6) Detalles de un “Group-like”: puede ser grupo o organización
    // ---------------------------------------------------
    fun loadEntityById(entityId: String, type: String) {
        val currentUserId = auth.currentUser?.uid ?: return
        if (type == "organization") {
            // Cargar organización y mapear a Group-like
            orgRepo.getOrganizationById(
                orgId = entityId,
                onSuccess = { org ->
                    _singleGroup.value = org.asGroupLike()
                },
                onFailure = { errMsg ->
                    // Puede emitir null si no existe o no es miembro
                    _singleGroup.value = null
                    _groupsUiState.value = _groupsUiState.value?.copy(errorMessage = errMsg)
                }
            )
        } else {
            // Cargar grupo personal
            firestore.collection("groups")
                .document(entityId)
                .get()
                .addOnSuccessListener { doc ->
                    if (doc.exists()) {
                        val grp = doc.toObject(Group::class.java)
                        val memberIds = (doc.get("memberIds") as? List<String>) ?: emptyList()
                        if (grp != null) {
                            val isOwner = (doc.getString("ownerUid") == currentUserId)
                            val membership = if (memberIds.contains(currentUserId)) MembershipStatus.MEMBER else MembershipStatus.NOT_MEMBER
                            _singleGroup.value = grp.copy(
                                id = doc.id,
                                isOwner = isOwner,
                                membershipStatus = membership,
                                memberCount = memberIds.size
                            )
                        } else {
                            _singleGroup.value = null
                        }
                    } else {
                        _singleGroup.value = null
                    }
                }
                .addOnFailureListener { e ->
                    _singleGroup.value = null
                    _groupsUiState.value = _groupsUiState.value?.copy(errorMessage = "Error cargando grupo: ${e.message}")
                }
        }
    }
}
