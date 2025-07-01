package tpo.seminario.breakbuddy.ui.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.*
import com.google.firebase.functions.FirebaseFunctions                                  // ← CAMBIO
import com.google.firebase.functions.FirebaseFunctionsException                         // ← CAMBIO
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentChatBinding
import tpo.seminario.breakbuddy.util.HobbyActivities
import tpo.seminario.breakbuddy.util.groups.Group
import tpo.seminario.breakbuddy.util.groups.messages.ChatMessage

class ChatFragment : Fragment() {

    private var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!

    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private val functions = FirebaseFunctions.getInstance()                              // ← CAMBIO

    private lateinit var groupId: String
    private var groupHobby: String? = null
    private var groupSize: Int = 0

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

        // Recuperar ID del grupo
        groupId = arguments?.getString("groupId").orEmpty()
        if (groupId.isBlank()) {
            Toast.makeText(requireContext(), "Grupo inválido", Toast.LENGTH_SHORT).show()
            requireActivity().onBackPressed()
            return
        }

        setupToolbar()
        setupRecyclerView()
        setupInput()

        // Cargar hobby y tamaño del grupo
        db.collection("groups").document(groupId)
            .get()
            .addOnSuccessListener { snap ->
                if (snap.exists()) {
                    val grp = snap.toObject(Group::class.java)!!
                    groupHobby = grp.hobby
                    groupSize = grp.memberCount
                }
            }

        attachMessagesListener()
    }

    private fun setupToolbar() {
        binding.toolbarChat.menu.clear()
        binding.toolbarChat.inflateMenu(R.menu.chat_toolbar_menu)
        binding.toolbarChat.setOnMenuItemClickListener { item ->
            if (item.itemId == R.id.action_suggest) {
                suggestActivity()
                true
            } else false
        }
    }

    private fun setupRecyclerView() {
        chatAdapter = ChatAdapter(currentUserUid = auth.currentUser?.uid.orEmpty())
        binding.recyclerViewChat.apply {
            layoutManager = LinearLayoutManager(requireContext()).apply { stackFromEnd = true }
            adapter = chatAdapter
        }
    }

    private fun setupInput() {
        binding.buttonSend.setOnClickListener { attemptSendMessage() }                     // ← CAMBIO
        binding.editTextMessage.addTextChangedListener {
            binding.buttonSend.isEnabled = it.toString().trim().isNotEmpty()
        }
    }

    private fun suggestActivity() {
        val hobby = groupHobby
        if (hobby.isNullOrEmpty()) {
            Toast.makeText(requireContext(),
                "Este grupo no tiene hobby asignado",
                Toast.LENGTH_SHORT).show()
            return
        }
        val candidates = HobbyActivities.getSuggestionsFor(hobby)
            .filter { groupSize in it.minParticipants..it.maxParticipants }

        if (candidates.isEmpty()) {
            Toast.makeText(requireContext(),
                "No hay sugerencias para $groupSize personas",
                Toast.LENGTH_SHORT).show()
            return
        }
        val choice = candidates.random().description
        postSystemMessage("¡Actividad sugerida para el grupo: $choice!")
    }

    private fun postSystemMessage(text: String) {
        val msgRef = db.collection("groups")
            .document(groupId)
            .collection("messages")
            .document()
        val msg = ChatMessage(
            id                = msgRef.id,
            senderUid         = "SYSTEM",
            senderDisplayName = "BreakBuddy",
            text              = text,
            timestamp         = Timestamp.now(),
            isSystemMessage   = true
        )
        msgRef.set(msg)
    }

    /**
     * 1) Primero validamos el contenido vía Cloud Function `moderateMessage`.
     * 2) Si está OK lo enviamos, si no mostramos el error al usuario.
     */
    private fun attemptSendMessage() {
        val text = binding.editTextMessage.text.toString().trim()
        if (text.isEmpty()) return
        val currentUser = auth.currentUser ?: return

        binding.buttonSend.isEnabled = false
        functions
            .getHttpsCallable("moderateMessage")                                        // ← CAMBIO
            .call(mapOf("text" to text))
            .addOnSuccessListener {
                // Allowed → publicamos en Firestore
                performSend(text, currentUser.uid, currentUser.displayName ?: currentUser.email.orEmpty())
            }
            .addOnFailureListener { e ->
                binding.buttonSend.isEnabled = true
                val msg = if (e is FirebaseFunctionsException && e.code == FirebaseFunctionsException.Code.PERMISSION_DENIED) {
                    // Nuestra función lanza permission-denied si hay toxicidad
                    e.message ?: "Contenido no permitido"
                } else {
                    "Error de moderación: ${e.message}"
                }
                Toast.makeText(requireContext(), msg, Toast.LENGTH_LONG).show()
            }
    }

    /**
     * Envía realmente el mensaje ya validado.
     */
    private fun performSend(text: String, uid: String, displayName: String) {
        val newRef = db.collection("groups")
            .document(groupId)
            .collection("messages")
            .document()
        val message = ChatMessage(
            id                = newRef.id,
            senderUid         = uid,
            senderDisplayName = displayName,
            text              = text,
            timestamp         = Timestamp.now(),
            isSystemMessage   = false
        )
        newRef.set(message)
            .addOnSuccessListener {
                binding.editTextMessage.text?.clear()
                binding.recyclerViewChat.scrollToPosition(chatAdapter.itemCount - 1)
            }
            .addOnFailureListener { e ->
                Toast.makeText(requireContext(),
                    "Error enviando: ${e.message}",
                    Toast.LENGTH_SHORT).show()
            }
            .addOnCompleteListener {
                binding.buttonSend.isEnabled = true
            }
    }

    private fun attachMessagesListener() {
        val q = db.collection("groups")
            .document(groupId)
            .collection("messages")
            .orderBy("timestamp", Query.Direction.ASCENDING)
        messagesListener = q.addSnapshotListener { snaps, err ->
            if (err != null) {
                Toast.makeText(requireContext(),
                    "Error al leer mensajes: ${err.message}",
                    Toast.LENGTH_SHORT).show()
                return@addSnapshotListener
            }
            val list = snaps?.documents
                ?.mapNotNull { it.toObject(ChatMessage::class.java)?.copy(id = it.id) }
                .orEmpty()
            chatAdapter.submitList(list)
            if (list.isNotEmpty())
                binding.recyclerViewChat.scrollToPosition(list.size - 1)
        }
    }

    override fun onDestroyView() {
        messagesListener?.remove()
        super.onDestroyView()
        _binding = null
    }
}
