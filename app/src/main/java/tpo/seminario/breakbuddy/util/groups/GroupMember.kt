package tpo.seminario.breakbuddy.util.groups

data class GroupMember(
    val id: String,
    val name: String,
    val email: String,
    val isOwner: Boolean = false
)