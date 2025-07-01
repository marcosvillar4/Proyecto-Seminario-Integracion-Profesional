package tpo.seminario.breakbuddy.ui.checkin

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.databinding.FragmentCheckinHistoryBinding
import tpo.seminario.breakbuddy.R

class CheckinHistoryFragment : Fragment() {

    private var _binding: FragmentCheckinHistoryBinding? = null
    private val binding get() = _binding!!

    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private lateinit var adapter: CheckinHistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCheckinHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = CheckinHistoryAdapter()
        binding.recyclerHistory.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@CheckinHistoryFragment.adapter

            val divider = DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
            ContextCompat.getDrawable(requireContext(), R.drawable.divider_horizontal)
                ?.let { divider.setDrawable(it) }
            addItemDecoration(divider)
        }

        loadHistory()
    }

    private fun loadHistory() {
        val uid = auth.currentUser?.uid
        if (uid == null) {
            Toast.makeText(requireContext(), "No autenticado", Toast.LENGTH_SHORT).show()
            return
        }

        db.collection("userProfiles").document(uid)
            .collection("checkins")
            .orderBy("fechaRegistro", com.google.firebase.firestore.Query.Direction.DESCENDING)
            .get()
            .addOnSuccessListener { snaps ->
                val items = snaps.documents.mapNotNull { doc ->
                    val ts: Timestamp? = doc.getTimestamp("fechaRegistro")
                    val emoji = doc.getString("estadoEmocional") ?: return@mapNotNull null
                    CheckinHistoryItem(ts, emoji)
                }
                if (items.isEmpty()) {
                    binding.tvEmptyHistory.visibility = View.VISIBLE
                } else {
                    binding.tvEmptyHistory.visibility = View.GONE
                }
                adapter.submitList(items)
            }
            .addOnFailureListener {
                Toast.makeText(requireContext(),
                    "Error cargando historial: ${it.message}", Toast.LENGTH_SHORT).show()
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
