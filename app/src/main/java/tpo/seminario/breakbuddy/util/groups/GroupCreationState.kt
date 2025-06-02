package tpo.seminario.breakbuddy.util.groups

data class GroupCreationState(
    val isLoading: Boolean = false,
    val isSuccess: Boolean = false,
    val errorMessage: String? = null,
    val createdGroupId: String? = null,
    val groupCode: String?
) {
}
