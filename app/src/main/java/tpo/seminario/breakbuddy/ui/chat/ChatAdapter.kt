package tpo.seminario.breakbuddy.ui.chat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.util.groups.messages.ChatMessage

import java.text.SimpleDateFormat
import java.util.*

class ChatAdapter(
    private val currentUserUid: String
) : ListAdapter<ChatMessage, ChatAdapter.MessageViewHolder>(MessageDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_chat_message, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = getItem(position)
        holder.bind(message, currentUserUid)
    }

    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val container: LinearLayout = itemView.findViewById(R.id.containerMessage)
        private val textSender: TextView    = itemView.findViewById(R.id.textSenderName)
        private val textBody: TextView      = itemView.findViewById(R.id.textMessage)
        private val textTime: TextView      = itemView.findViewById(R.id.textTimestamp)

        fun bind(message: ChatMessage, currentUserUid: String) {
            //fondo y alineación
            val params = container.layoutParams as ConstraintLayout.LayoutParams

            if (message.isSystemMessage) {
                // Fondo gris y centrado
                container.setBackgroundResource(R.drawable.bg_message_system)
                val params = container.layoutParams as ConstraintLayout.LayoutParams
                params.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
                params.endToEnd   = ConstraintLayout.LayoutParams.PARENT_ID
                container.layoutParams = params
                textSender.visibility = View.GONE

                textBody.text = message.text
                textTime.text = SimpleDateFormat("HH:mm", Locale.getDefault())
                    .format(message.timestamp?.toDate() ?: Date())
                return
            } else if (message.senderUid == currentUserUid) {
                // Mensaje propio → alinear a la derecha y fondo verde
                container.setBackgroundResource(R.drawable.bg_message_user)
                params.startToStart = ConstraintLayout.LayoutParams.UNSET
                params.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
                textSender.visibility = View.GONE
            } else {
                // Mensaje de otro usuario → alinear a la izquierda y fondo blanco
                container.setBackgroundResource(R.drawable.bg_message_other)
                params.startToStart = ConstraintLayout.LayoutParams.PARENT_ID
                params.endToEnd = ConstraintLayout.LayoutParams.UNSET
                // Mostrar nombre del remitente
                textSender.visibility = View.VISIBLE
                textSender.text = message.senderDisplayName
            }
            container.layoutParams = params

            // 2) Texto del mensaje
            textBody.text = message.text

            // 3) Formatear y mostrar timestamp (hora: minutos)
            val ts = message.timestamp
            if (ts != null) {
                val date = ts.toDate()
                val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
                textTime.text = sdf.format(date)
            } else {
                textTime.text = ""
            }
        }
    }
}

class MessageDiffCallback : DiffUtil.ItemCallback<ChatMessage>() {
    override fun areItemsTheSame(oldItem: ChatMessage, newItem: ChatMessage): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ChatMessage, newItem: ChatMessage): Boolean {
        return oldItem == newItem
    }
}
