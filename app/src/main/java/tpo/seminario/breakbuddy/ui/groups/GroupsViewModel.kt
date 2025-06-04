package tpo.seminario.breakbuddy.ui.groups

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import tpo.seminario.breakbuddy.util.groups.Group
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.persistence.GroupRepository
import tpo.seminario.breakbuddy.util.groups.GroupCreationState
import tpo.seminario.breakbuddy.util.groups.GroupsListState
import tpo.seminario.breakbuddy.util.groups.MembershipStatus

// AGREGAR ESTE DATA CLASS AL INICIO DEL ARCHIVO
class GroupsViewModel : ViewModel() {

    private val firestore = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private val repo = GroupRepository()


    private val _groupsUiState = MutableLiveData<GroupsListState>()
    val groupsUiState: LiveData<GroupsListState> = _groupsUiState

    private val _uiState = MutableLiveData<GroupCreationState>()
    val uiState: LiveData<GroupCreationState> = _uiState


    // --- LiveData para capturar errores al agregar miembro ---
    private val _addMemberError = MutableLiveData<String?>()
    val addMemberError: LiveData<String?> = _addMemberError

    // LiveData para indicar que se añadió correctamente (puede ser un booleano simple o String).
    private val _addMemberSuccess = MutableLiveData<Boolean>()
    val addMemberSuccess: LiveData<Boolean> = _addMemberSuccess

    // 1) LiveData para notificar “removeMember” OK / error
    private val _removeMemberSuccess = MutableLiveData<Boolean?>()
    val removeMemberSuccess: LiveData<Boolean?> = _removeMemberSuccess

    private val _removeMemberError = MutableLiveData<String?>()
    val removeMemberError: LiveData<String?> = _removeMemberError

    init {
        _removeMemberError.value = null
        _removeMemberSuccess.value = false
    }

    init {
        // Asignamos un estado inicial no nulo
        _uiState.value = GroupCreationState(
            isLoading = false,
            isSuccess = false,
            errorMessage = null,
            groupCode = null
        )
    }

    // 1) Nuevo LiveData para los detalles de UN solo grupo:
    private val _singleGroup = MutableLiveData<Group?>()
    val singleGroup: LiveData<Group?> = _singleGroup


    // Función existente para crear grupos...

    // REEMPLAZAR la función createGroup con esta versión mejorada:
    fun createGroup(
        name: String,
        emails: List<String>,
        hobby: String?,
        type: String,
        orgId: String?,
        orgName: String?
    ) {
        // Validar inputs (igual que antes)…

        // Mostrar loading…
        _uiState.value = _uiState.value?.copy(isLoading = true, errorMessage = null)
            ?: GroupCreationState(isLoading = true, isSuccess = false, errorMessage = null, groupCode = null)

        // Llamamos ahora a la firma nueva
        repo.createGroup(
            name             = name,
            emails           = emails,
            hobby            = hobby,
            type             = type,
            orgId            = orgId,
            organizationName = orgName,          // <-- dato extra
            onSuccess = { groupCode ->
                _uiState.value = GroupCreationState(
                    isLoading   = false,
                    isSuccess   = true,
                    errorMessage= null,
                    groupCode   = groupCode
                )
            },
            onFailure = { errorMsg ->
                _uiState.value = GroupCreationState(
                    isLoading   = false,
                    isSuccess   = false,
                    errorMessage= errorMsg,
                    groupCode   = null
                )
            }
        )
    }


    // AGREGAR esta nueva función de validación:
    private fun validateInputs(name: String, emails: List<String>): Boolean {
        when {
            name.isBlank() -> {
                _uiState.value = _uiState.value?.copy(
                    errorMessage = "El nombre del grupo es obligatorio"
                )
                return false
            }
            name.length < 3 -> {
                _uiState.value = _uiState.value?.copy(
                    errorMessage = "El nombre debe tener al menos 3 caracteres"
                )
                return false
            }
            name.length > 50 -> {
                _uiState.value = _uiState.value?.copy(
                    errorMessage = "El nombre no puede exceder 50 caracteres"
                )
                return false
            }
            emails.isEmpty() -> {
                _uiState.value = _uiState.value?.copy(
                    errorMessage = "Debe agregar al menos un email"
                )
                return false
            }
            emails.size > 20 -> {
                _uiState.value = _uiState.value?.copy(
                    errorMessage = "No se pueden agregar más de 20 miembros"
                )
                return false
            }
        }
        return true
    }

    // NUEVAS FUNCIONES PARA LISTAR GRUPOS:

    fun loadUserGroups() {
        val currentUserId = auth.currentUser?.uid ?: return

        _groupsUiState.value = _groupsUiState.value?.copy(isLoading = true)
            ?: GroupsListState(isLoading = true)

        firestore.collection("groups")
            .whereArrayContains("memberIds", currentUserId)
            .get()
            .addOnSuccessListener { documents ->
                val groups = documents.mapNotNull { doc ->
                    try {
                        val memberIds = doc.get("memberIds") as? List<String> ?: emptyList()
                        val group = doc.toObject(Group::class.java)?.copy(
                            id               = doc.id,
                            isOwner          = (doc.getString("ownerUid") == currentUserId),
                            membershipStatus = if (memberIds.contains(currentUserId))
                                MembershipStatus.MEMBER
                            else
                                MembershipStatus.NOT_MEMBER,
                            memberCount      = memberIds.size
                        )
                        if (group != null && group.type == "organization" && group.organizationId != null) {
                            loadGroupWithOrganization(group)
                        }
                        group
                    } catch (e: Exception) {
                        null
                    }
                }.sortedByDescending { it.createdAt }

                _groupsUiState.value = GroupsListState(
                    groups    = groups,
                    isLoading = false
                )
            }
            .addOnFailureListener { exception ->
                _groupsUiState.value = GroupsListState(
                    groups       = emptyList(),
                    isLoading    = false,
                    errorMessage = "Error al cargar grupos: ${exception.message}"
                )
            }
    }


    private fun loadGroupWithOrganization(group: Group) {
        firestore.collection("organizations")
            .document(group.organizationId!!)
            .get()
            .addOnSuccessListener { doc ->
                val orgName = doc.getString("name") ?: "Organización desconocida"
                val updatedGroup = group.copy(organizationName = orgName)

                // Actualizar la lista reemplazando este grupo
                val currentState = _groupsUiState.value ?: return@addOnSuccessListener
                val updatedGroups = currentState.groups.map { it: Group ->
                    if (it.id == group.id) updatedGroup else it
                }
                _groupsUiState.value = currentState.copy(groups = updatedGroups)
            }
    }

    fun joinGroup(groupId: String) {
        val currentUserId = auth.currentUser?.uid ?: return

        firestore.collection("groups")
            .document(groupId)
            .update("memberIds", FieldValue.arrayUnion(currentUserId))
            .addOnSuccessListener {
                // Recargar grupos para reflejar cambios
                loadUserGroups()

            }
            .addOnFailureListener { exception ->
                _groupsUiState.value = GroupsListState(
                    groups = emptyList(),
                    isLoading = false,
                    errorMessage = "Error al cargar grupos: ${exception.message}"
                )
            }
    }



    fun searchPublicGroups(query: String) {

        if (query.length < 3) return

        _groupsUiState.value = _groupsUiState.value?.copy(isLoading = true)
            ?: GroupsListState(isLoading = true)

        firestore.collection("groups")
            .orderBy("name")
            .startAt(query)
            .endAt(query + "\uf8ff")
            .limit(50)
            .get()
            .addOnSuccessListener { documents ->
                val currentUserId = auth.currentUser?.uid ?: ""

                val groups = documents.mapNotNull { doc ->
                    try {
                        val memberIds = doc.get("memberIds") as? List<String> ?: emptyList()
                        doc.toObject(Group::class.java).copy(
                            id = doc.id,
                            isOwner = doc.getString("ownerUid") == currentUserId,
                            membershipStatus = if (memberIds.contains(currentUserId))
                                MembershipStatus.MEMBER else MembershipStatus.NOT_MEMBER,
                            memberCount = memberIds.size
                        )
                    } catch (e: Exception) {
                        null
                    }
                }

                _groupsUiState.value = GroupsListState(
                    groups = groups,
                    isLoading = false
                )
            }
            .addOnFailureListener { exception ->
                _groupsUiState.value = GroupsListState(
                    groups = emptyList(),
                    isLoading = false,
                    errorMessage = "Error en la búsqueda: ${exception.message}"
                )
            }
    }


    /**
     * Llamar cuando el usuario intente agregar al grupo `groupId` un miembro con `email`.
     */
    fun addMemberToGroup(groupId: String, email: String) {
        // Reiniciamos valores previos
        _addMemberError.value = null
        _addMemberSuccess.value = false

        // Validar formato básico de email antes de llamar a repo
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            _addMemberError.value = "Email inválido: \"$email\""
            return
        }

        repo.addMemberByEmail(
            groupId = groupId,
            email = email.trim().lowercase(),
            onSuccess = {
                _addMemberSuccess.postValue(true)  // marca éxito
            },
            onFailure = { errorMsg ->
                _addMemberError.postValue(errorMsg)
            }
        )
    }

    /** Limpia el flag de error de agregar miembro */
    fun clearAddMemberError() {
        _addMemberError.value = null
    }

    /** Limpia el flag de éxito de agregar miembro */
    fun clearAddMemberSuccess() {
        _addMemberSuccess.value = false
    }

    /**
     * Método único para eliminar a cualquier miembro, o para que un usuario salga de su propio grupo.
     */
    fun removeMemberFromGroup(
        groupId: String,
        memberUidToRemove: String,
        memberEmailToRemove: String
    ) {
        repo.removeMemberFromGroup(
            groupId               = groupId,
            memberUidToRemove     = memberUidToRemove,
            memberEmailToRemove   = memberEmailToRemove,
            onSuccess             = {
                _removeMemberSuccess.value = true
            },
            onFailure             = { errorMsg ->
                _removeMemberError.value = errorMsg
            }
        )
    }
    /** Para que la UI pueda reiniciar el estado después de mostrar un Toast */
    fun clearRemoveMemberSuccess() {
        _removeMemberSuccess.value = null
    }
    fun clearRemoveMemberError() {
        _removeMemberError.value = null
    }

    /** Si prefieres un método explícito “leaveGroup” para que el miembro salga a sí mismo */
    fun leaveGroup(groupId: String) {
        val currentUid = auth.currentUser?.uid ?: return
        val currentEmail = auth.currentUser?.email ?: return
        removeMemberFromGroup(groupId, currentUid, currentEmail)
    }

    fun clearError() {
        _groupsUiState.value = _groupsUiState.value?.copy(errorMessage = null)
        _uiState.value = _uiState.value?.copy(errorMessage = null)
    }
    /**
     * Carga un documento de /groups/{groupId} sin filtrar por membership.
     */
    fun loadGroupById(groupId: String) {
        firestore.collection("groups")
            .document(groupId)
            .get()
            .addOnSuccessListener { doc ->
                if (doc.exists()) {
                    val g = doc.toObject(Group::class.java)
                    if (g != null) {
                        // Reconstruir metadatos:
                        val memberIds = (doc.get("memberIds") as? List<String>) ?: emptyList()
                        val isOwner = (doc.getString("ownerUid") == auth.currentUser?.uid)
                        val membership = if (memberIds.contains(auth.currentUser?.uid)) {
                            MembershipStatus.MEMBER
                        } else {
                            MembershipStatus.NOT_MEMBER
                        }
                        val count = memberIds.size

                        _singleGroup.value = g.copy(
                            id               = doc.id,
                            memberCount      = count,
                            isOwner          = isOwner,
                            membershipStatus = membership
                        )
                    } else {
                        _singleGroup.value = null
                    }
                } else {
                    _singleGroup.value = null
                }
            }
            .addOnFailureListener {
                _singleGroup.value = null
            }
    }
}
