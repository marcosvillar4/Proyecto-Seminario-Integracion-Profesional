package tpo.seminario.breakbuddy.util.groups

import com.google.firebase.Timestamp
import com.google.firebase.firestore.DocumentId


/**
 * Representa un grupo (puede ser creado manualmente o derivado de una organización).
 */

data class Group(
    @DocumentId
    val id: String = "",               // ID del doc en Firestore
    val name: String = "",             // Nombre del grupo
    val code: String = "",             // Código de invitación
    val type: String = "",             // "personal" o "organization"
    val hobby: String? = null,// Hobby principal si es grupo derivado; null si no aplica
    val derivado: Boolean = false,     // true si fue generado automáticamente desde una organización
    val organizationId: String? = null,// ID de la organización de la que deriva (si derivado=true)
    val organizationName: String? = null,// Nombre de la organización (para mostrar); se llena en UI al cargar
    val memberIds: List<String> = emptyList(),
    val memberCount: Int = 0,
    val createdAt: Timestamp? = null,
    val updatedAt: Timestamp? = null,
    val ownerUid: String = "",
    // Campos auxiliares en UI (no se guardan directamente en Firestore):
    val isOwner: Boolean = false,
    val membershipStatus: MembershipStatus = MembershipStatus.NOT_MEMBER,
    val emails: List<String> = emptyList(),
    // Mapa denormalizado: UID -> lista de hobbies del usuario en este grupo (para sugerencias futuras).
    // Si no usas aún sugerencias dentro de grupo, puede inicializarse vacío. Se mantendrá vía triggers.
    val memberHobbies: Map<String, List<String>> = emptyMap()
)