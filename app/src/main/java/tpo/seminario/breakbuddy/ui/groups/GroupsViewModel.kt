package tpo.seminario.breakbuddy.ui.groups

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tpo.seminario.breakbuddy.persistence.GroupRepository

// AGREGAR ESTE DATA CLASS AL INICIO DEL ARCHIVO
data class GroupCreationState(
    val isLoading: Boolean = false,
    val isSuccess: Boolean = false,
    val errorMessage: String? = null,
    val groupCode: String? = null
)

class GroupsViewModel : ViewModel() {
    private val repo = GroupRepository()

    // REEMPLAZAR la variable _creationSuccess con estas nuevas:
    private val _uiState = MutableLiveData(GroupCreationState())
    val uiState: LiveData<GroupCreationState> = _uiState

    // REEMPLAZAR la función createGroup con esta versión mejorada:
    fun createGroup(name: String, emails: List<String>, hobby: String?) {
        // Validar inputs antes de proceder
        if (!validateInputs(name, emails)) return
        _uiState.value = _uiState.value?.copy(isLoading = true, errorMessage = null)

        // Establecer estado de carga
        _uiState.value = _uiState.value?.copy(isLoading = true, errorMessage = null)

        repo.createGroup(
            name = name,
            emails = emails,
            hobby = hobby,
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

    // AGREGAR esta función para limpiar errores:
    fun clearError() {
        _uiState.value = _uiState.value?.copy(errorMessage = null)
    }
}