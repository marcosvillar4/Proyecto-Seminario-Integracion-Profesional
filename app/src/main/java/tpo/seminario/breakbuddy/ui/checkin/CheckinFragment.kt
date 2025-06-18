package tpo.seminario.breakbuddy.ui.checkin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.Timestamp
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentCheckinBinding
import java.text.SimpleDateFormat
import java.util.*

class CheckinFragment : Fragment() {

    private lateinit var binding: FragmentCheckinBinding
    private var selectedEmoji: String? = null

    private val emojiViews by lazy {
        listOf(
            binding.emoji1,
            binding.emoji2,
            binding.emoji3,
            binding.emoji4,
            binding.emoji5
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCheckinBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        emojiViews.forEach { emoji ->
            emoji.setOnClickListener {
                selectedEmoji = emoji.text.toString()
                resetEmojiStyles()
                emoji.setBackgroundResource(R.drawable.bg_selected)
            }
        }

        binding.btnEnviar.setOnClickListener {
            selectedEmoji?.let {
                guardarCheckin(it)
            } ?: Toast.makeText(requireContext(), "Seleccioná un emoji", Toast.LENGTH_SHORT).show()
        }
    }

    private fun resetEmojiStyles() {
        emojiViews.forEach {
            it.setBackgroundResource(0)
        }
    }

    private fun guardarCheckin(emoji: String) {
        val db = FirebaseFirestore.getInstance()
        val user = FirebaseAuth.getInstance().currentUser

        if (user == null) {
            Log.e("CheckinDebug", "⛔ Usuario no logueado")
            return
        }

        val userId = user.uid
        val checkin = hashMapOf(
            "estadoEmocional" to emoji,
            "fechaRegistro" to Timestamp.now()
        )

        val today = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            .format(Date())

        Log.d("CheckinDebug", "👤 UID: $userId")
        Log.d("CheckinDebug", "📅 Hoy: $today")

        db.collection("userProfiles").document(userId)
            .collection("checkins")
            .document(today)
            .set(checkin)
            .addOnSuccessListener {
                Log.d("CheckinDebug", "✅ Check-in guardado")
                Toast.makeText(context, "Gracias por compartir ❤️", Toast.LENGTH_SHORT).show()
                requireActivity().finish()
            }
            .addOnFailureListener { e ->
                Log.e("CheckinDebug", "❌ Error guardando check-in", e)
                Toast.makeText(context, "Error al guardar: ${e.message}", Toast.LENGTH_LONG).show()
            }
    }

}
