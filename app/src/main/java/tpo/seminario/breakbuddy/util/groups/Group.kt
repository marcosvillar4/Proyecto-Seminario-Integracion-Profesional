package tpo.seminario.breakbuddy.util.groups

import com.google.firebase.firestore.FieldValue

data class Group(
    val id: String = "",
    val name: String = "",
    val code: String = "",
    val type: String = "", // "personal" o "organization"
    val hobby: String? = null,
    val organizationName: String? = null,
    val organizationId: String? = null,
    val memberIds: List<String> = emptyList(),
    val memberCount: Int = 0,
    val createdAt: com.google.firebase.Timestamp? = null,
    val updatedAt: com.google.firebase.Timestamp? = null,
    val isOwner: Boolean = false,
    val membershipStatus: MembershipStatus = MembershipStatus.NOT_MEMBER,
    val ownerUid: String = "",   // ÚNICO campo que indica el UID del dueño
    val emails: List<String> = emptyList(),
    val orgId: String? = null
)