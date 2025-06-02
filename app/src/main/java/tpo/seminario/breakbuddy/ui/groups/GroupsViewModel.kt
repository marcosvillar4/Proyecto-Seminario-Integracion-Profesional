package tpo.seminario.breakbuddy.ui.groups

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

    private val _groupsUiState = MutableLiveData<GroupsListState>()
    val groupsUiState: LiveData<GroupsListState> = _groupsUiState

    private val _uiState = MutableLiveData<GroupCreationState>()
    val uiState: LiveData<GroupCreationState> = _uiState

    init {
        // Asignamos un estado inicial no nulo
        _uiState.value = GroupCreationState(
            isLoading = false,
            isSuccess = false,
            errorMessage = null,
            groupCode = null
        )
    }

    private val firestore = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private val repo = GroupRepository()

    // Función existente para crear grupos...

    // REEMPLAZAR la función createGroup con esta versión mejorada:
    fun createGroup(name: String, emails: List<String>, hobby: String?, type: String, orgId: String?) {
        // Validar inputs antes de proceder
        if (!validateInputs(name, emails)) return


        // Establecer estado de carga
        // Opción A: Forzar a partir del estado actual, pero si es null, creamos uno nuevo
        _uiState.value = _uiState.value?.copy(isLoading = true, errorMessage = null)
            ?: GroupCreationState(isLoading = true, isSuccess = false, errorMessage = null, groupCode = null)


        repo.createGroup(
            name = name,
            emails = emails,
            hobby = hobby,
            type = type,
            orgId = orgId,
            onSuccess = { groupCode ->
                _uiState.value = GroupCreationState(
                    isLoading = false,
                    isSuccess = true,
                    errorMessage = null,
                    groupCode = groupCode
                )
            },
            onFailure = { errorMessage ->
                _uiState.value = GroupCreationState(
                    isLoading = false,
                    isSuccess = false,
                    errorMessage = errorMessage,
                    groupCode = null
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

        // Cargar grupos donde el usuario es miembro
        firestore.collection("groups")
            .whereArrayContains("memberIds", currentUserId)
            .get()
            .addOnSuccessListener { documents ->
                val groups = documents.mapNotNull { doc ->
                    try {
                        val group = doc.toObject(Group::class.java)?.copy(
                            id = doc.id,
                            isOwner = doc.getString("ownerId") == currentUserId,
                            membershipStatus = MembershipStatus.MEMBER,
                            memberCount = (doc.get("memberIds") as? List<*>)?.size ?: 0
                        )

                        // Si es organización, cargar nombre de la organización (asíncrono)
                        if (group != null && group.type == "organization" && group.organizationId != null) {
                            loadGroupWithOrganization(group)
                        }

                        group // Retornar el grupo
                    } catch (e: Exception) {
                        null
                    }
                }.sortedByDescending { it.createdAt }

                _groupsUiState.value = GroupsListState(
                    groups = groups,
                    isLoading = false
                )
            }
            .addOnFailureListener { exception ->
                _groupsUiState.value = GroupsListState(
                    groups = emptyList(),
                    isLoading = false,
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

    fun leaveGroup(groupId: String) {
        val currentUserId = auth.currentUser?.uid ?: return

        firestore.collection("groups")
            .document(groupId)
            .update("memberIds", FieldValue.arrayRemove(currentUserId))
            .addOnSuccessListener {
                // Recargar grupos
                loadUserGroups()
            }
            .addOnFailureListener { exception ->
                _groupsUiState.value = _groupsUiState.value?.copy(
                    errorMessage = "Error al salir del grupo: ${exception.message}"
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
                            isOwner = doc.getString("ownerId") == currentUserId,
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

    fun clearError() {
        _groupsUiState.value = _groupsUiState.value?.copy(errorMessage = null)
        _uiState.value = _uiState.value?.copy(errorMessage = null)
    }
}