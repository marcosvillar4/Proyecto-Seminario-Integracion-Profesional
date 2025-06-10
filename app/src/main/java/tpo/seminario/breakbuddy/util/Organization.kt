package tpo.seminario.breakbuddy.util

import com.google.firebase.Timestamp
import com.google.firebase.firestore.DocumentId
import tpo.seminario.breakbuddy.util.groups.MembershipStatus


/**
 * Representa una organización/empresa.
 * A partir de ella, se crearán grupos personales derivados según hobbies compartidos.
 */
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
    // Campos auxiliares (no almacenados o sí, según tu necesidad):
    val isOwner: Boolean = false,
    val membershipStatus: MembershipStatus = MembershipStatus.NOT_MEMBER,
    // Mantenimiento de lógica de hobbies dentro de la organización:
    // hobbiesUnicos: hobbies que actualmente aparecen en EXACTAMENTE un miembro de la org,
    // guardamos junto con el UID de ese miembro, para crear futuros grupos cuando alguien más comparta ese hobby.
    // Definimos una clase auxiliar UniqueHobbyEntry:
    val emails: List<String> = emptyList(),
    val hobbiesUnicos: List<UniqueHobbyEntry> = emptyList(),
    // gruposDerivados: lista de grupos personales ya creados a partir de la org, por hobby.
    // Definimos clase auxiliar DerivedGroupEntry:
    val gruposDerivados: List<DerivedGroupEntry> = emptyList()
)

/**
 * Representa un hobby que aparece en exactamente un miembro de la organización:
 * si luego otro miembro adquiere el mismo hobby, podemos detectar de 1→2 para crear grupo.
 */
data class UniqueHobbyEntry(
    val hobby: String = "",
    val userId: String = ""            // UID del único usuario que tiene este hobby actualmente en la organización
)

/**
 * Representa un grupo personal derivado de la organización, creado para un hobby compartido:
 * guardamos el hobby y el ID del grupo Firestore.
 */
data class DerivedGroupEntry(
    val hobby: String = "",
    val groupId: String = ""           // ID del documento en /groups (o en /personalGroups u otra colección)
)