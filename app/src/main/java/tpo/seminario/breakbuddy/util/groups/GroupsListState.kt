package tpo.seminario.breakbuddy.util.groups

data class GroupsListState(
    val groups: List<Group> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)