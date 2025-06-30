package tpo.seminario.breakbuddy.ui.ranking

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FieldPath
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.R
class RankingDialogFragment : DialogFragment() {

    companion object {
        private const val ARG_GROUP_ID = "ARG_GROUP_ID"
        fun newInstance(groupId: String) = RankingDialogFragment().apply {
            arguments = bundleOf(ARG_GROUP_ID to groupId)
        }
    }

    private lateinit var groupId: String
    private val db = FirebaseFirestore.getInstance()
    private lateinit var adapter: RankingAdapter

    override fun onCreate(saved: Bundle?) {
        super.onCreate(saved)
        groupId = requireArguments().getString(ARG_GROUP_ID)!!
        setStyle(STYLE_NORMAL, R.style.Theme_BreakBuddy) //TODO, REVISAR ESTO
    }

    override fun onCreateDialog(saved: Bundle?): Dialog {
        val binding = LayoutInflater.from(context)
            .inflate(R.layout.dialog_ranking, null) as ViewGroup

        adapter = RankingAdapter()
        val rv = binding.findViewById<RecyclerView>(R.id.recyclerRanking).apply {
            layoutManager = LinearLayoutManager(context)
            adapter = this@RankingDialogFragment.adapter
        }

        // Cargar datos:
        loadRanking()

        return AlertDialog.Builder(requireContext())
            .setTitle("Ranking del grupo")
            .setView(binding)
            .setPositiveButton("Cerrar", null)
            .create()
    }

    private fun loadRanking() {
        // Leer miembros del grupo:
        db.collection("groups").document(groupId)
            .get().addOnSuccessListener { snap ->
                val memberIds = (snap.get("memberIds") as? List<*>)?.filterIsInstance<String>().orEmpty()
                if (memberIds.isEmpty()) return@addOnSuccessListener

                // Para cada uid, leer acumulado:
                db.collection("userProfiles")
                    .whereIn(FieldPath.documentId(), memberIds)
                    .get()
                    .addOnSuccessListener { usersSnap ->
                        val list = usersSnap.documents
                            .mapNotNull { doc ->
                                val uid = doc.id
                                val name = doc.getString("displayName") ?: doc.getString("email") ?: uid
                                val points = (doc.getLong("accumulatedPoints") ?: 0L).toInt()
                                RankingItem(name, points)
                            }
                            .sortedByDescending { it.points }
                            .mapIndexed { idx, item -> item.copy(rank = idx + 1) }

                        adapter.submitList(list)
                    }
            }
    }
}
