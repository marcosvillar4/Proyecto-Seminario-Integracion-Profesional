package tpo.seminario.breakbuddy.util

import com.google.firebase.Timestamp
import com.google.firebase.firestore.DocumentId
import tpo.seminario.breakbuddy.util.groups.MembershipStatus


data class Organization(
    @DocumentId
    val id: String = "",               // ID del documento en Firestore
    val name: String = "",             // Nombre de la organización
    val code: String = "",             // Código de invitación o similar
    val type: String = "", // "personal" o "organization"
    val ownerUid: String = "",         // UID del creador/administrador de la organización
    val memberIds: List<String> = emptyList(),
    val memberCount: Int = 0,
    val createdAt: Timestamp? = null,
    val updatedAt: Timestamp? = null,
    val isOwner: Boolean = false,
    val membershipStatus: MembershipStatus = MembershipStatus.NOT_MEMBER,

    val emails: List<String> = emptyList(),
    val hobbiesUnicos: List<UniqueHobbyEntry> = emptyList(),

    val gruposDerivados: List<DerivedGroupEntry> = emptyList()
)

data class UniqueHobbyEntry(
    val hobby: String = "",
    val userId: String = ""
)

data class DerivedGroupEntry(
    val hobby: String = "",
    val groupId: String = ""
)