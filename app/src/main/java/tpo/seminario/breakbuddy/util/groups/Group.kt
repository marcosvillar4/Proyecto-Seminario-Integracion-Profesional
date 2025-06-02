package tpo.seminario.breakbuddy.util.groups

data class Group(
    val id: String = "",
    val name: String = "",
    val code: String = "",
    val type: String = "", // "personal" o "organization"
    val hobby: String? = null,
    val organizationName: String? = null,
    val organizationId: String? = null,
    val ownerId: String = "",
    val memberIds: List<String> = emptyList(),
    val memberCount: Int = 0,
    val createdAt: Long = 0,
    val updatedAt: Long = 0,
    val isOwner: Boolean = false,
    val membershipStatus: MembershipStatus = MembershipStatus.NOT_MEMBER,
    val createdBy: String,
    val emails: List<String>,
    val orgId: String?
)