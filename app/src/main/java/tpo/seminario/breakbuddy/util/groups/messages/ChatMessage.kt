package tpo.seminario.breakbuddy.util.groups.messages

import com.google.firebase.Timestamp

data class ChatMessage(
    val id: String = "",
    val senderUid: String = "",
    val senderDisplayName: String = "",
    val text: String = "",
    val timestamp: Timestamp? = null,
    val isSystemMessage: Boolean = false
)