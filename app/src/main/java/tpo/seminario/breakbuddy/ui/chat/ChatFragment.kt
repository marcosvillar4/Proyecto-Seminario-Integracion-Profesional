package tpo.seminario.breakbuddy.ui.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.*
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentChatBinding
import tpo.seminario.breakbuddy.util.groups.messages.ChatMessage

class ChatFragment : Fragment() {

    private var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!

    // Firestore & Auth
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private lateinit var groupId: String

    // RecyclerView y Adapter
    private lateinit var chatAdapter: ChatAdapter
    private var messagesListener: ListenerRegistration? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1) Recuperar groupId desde argumentos
        groupId = arguments?.getString("groupId") ?: ""
        if (groupId.isBlank()) {
            Toast.makeText(requireContext(), "Grupo inválido", Toast.LENGTH_SHORT).show()
            requireActivity().onBackPressed()
            return
        }



        // 2) Configurar RecyclerView
        chatAdapter = ChatAdapter(currentUserUid = auth.currentUser?.uid ?: "")
        binding.recyclerViewChat.apply {
            layoutManager = LinearLayoutManager(requireContext()).apply {
                stackFromEnd = true // para que se mantenga en los últimos mensajes
            }
            adapter = chatAdapter
        }

        // 4) Lógica del botón “Enviar”
        binding.buttonSend.setOnClickListener {
            sendMessage()
        }

        // 5) Habilitar/deshabilitar botón “Enviar” según el texto
        binding.editTextMessage.addTextChangedListener {
            binding.buttonSend.isEnabled = it.toString().trim().isNotEmpty()
        }

        // 3) Comenzar a escuchar nuevos mensajes
        attachMessagesListener()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // 4) Remover listener real-time al salir
        messagesListener?.remove()
        _binding = null
    }

    /**
     * Enviar un mensaje a Firestore: crea un ChatMessage en
     * /groups/{groupId}/messages con senderUid= currentUser, timestamp=now.
     */
    private fun sendMessage() {
        val text = binding.editTextMessage.text.toString().trim()
        if (text.isEmpty()) return

        val currentUser = auth.currentUser ?: return
        val newMsgRef = db.collection("groups")
            .document(groupId)
            .collection("messages")
            .document() // documento auto-id

        val message = ChatMessage(
            id                = newMsgRef.id,
            senderUid         = currentUser.uid,
            senderDisplayName = currentUser.displayName ?: currentUser.email.orEmpty(),
            text              = text,
            timestamp         = Timestamp.now(),
            isSystemMessage   = false
        )

        // Guardar en Firestore
        newMsgRef.set(message)
            .addOnSuccessListener {
                binding.editTextMessage.text?.clear()
                // Scroll al final
                binding.recyclerViewChat.scrollToPosition(chatAdapter.itemCount - 1)
            }
            .addOnFailureListener { e ->
                Toast.makeText(requireContext(), "Error enviando: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    /**
     * Adjunta un listener en tiempo real a /groups/{groupId}/messages,
     * ordenado por timestamp ascendente.
     */
    private fun attachMessagesListener() {
        val messagesQuery = db.collection("groups")
            .document(groupId)
            .collection("messages")
            .orderBy("timestamp", Query.Direction.ASCENDING)

        messagesListener = messagesQuery.addSnapshotListener { snapshots, error ->
            if (error != null) {
                Toast.makeText(requireContext(), "Error al leer mensajes: ${error.message}", Toast.LENGTH_SHORT).show()
                return@addSnapshotListener
            }
            if (snapshots != null) {
                val lista = mutableListOf<ChatMessage>()
                for (doc in snapshots.documents) {
                    // Convertir cada doc a ChatMessage
                    val msg = doc.toObject(ChatMessage::class.java)
                    if (msg != null) {
                        // Asegurar que tenga el ID correcto
                        lista.add(msg.copy(id = doc.id))
                    }
                }
                chatAdapter.submitList(lista)
                // Mantener scrolleado al final
                if (lista.isNotEmpty()) {
                    binding.recyclerViewChat.scrollToPosition(lista.size - 1)
                }
            }
        }
    }
}
