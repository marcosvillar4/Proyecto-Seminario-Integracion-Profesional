package tpo.seminario.breakbuddy.ui.ranking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FieldPath
import com.google.firebase.firestore.FirebaseFirestore
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.databinding.FragmentRankingBinding
import tpo.seminario.breakbuddy.util.groups.Group


class RankingFragment : Fragment() {

    private val args: RankingFragmentArgs by navArgs()

    private var _binding: FragmentRankingBinding? = null
    private val binding get() = _binding!!

    private val db = FirebaseFirestore.getInstance()
    private lateinit var adapter: RankingAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRankingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val groupId = args.groupId
        if (groupId.isBlank()) {
            requireActivity().onBackPressed()
            return
        }


        // Recycler + Adapter
        adapter = RankingAdapter()
        binding.recyclerRanking.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@RankingFragment.adapter
        }

        loadRanking(groupId)
    }

    private fun loadRanking(groupId: String) {
        // Paso 1: leer miembros del grupo
        db.collection("groups").document(groupId)
            .get()
            .addOnSuccessListener { snap ->
                val group = snap.toObject(Group::class.java)
                val memberIds = group?.memberIds ?: emptyList()
                if (memberIds.isEmpty()) {
                    showEmpty(true)
                    return@addOnSuccessListener
                }

                // Paso 2: leer perfiles para obtener puntos
                db.collection("userProfiles")
                    .whereIn(FieldPath.documentId(), memberIds)
                    .get()
                    .addOnSuccessListener { profSnap ->
                        val pointsMap = profSnap.documents.associate { doc ->
                            doc.id to ((doc.getLong("accumulatedPoints") ?: 0L).toInt())
                        }

                        // Paso 3: leer users para obtener email/displayName
                        db.collection("users")
                            .whereIn(FieldPath.documentId(), memberIds)
                            .get()
                            .addOnSuccessListener { userSnap ->
                                // Combina ambos mapas
                                val items = userSnap.documents.mapNotNull { doc ->
                                    val uid = doc.id
                                    val email = doc.getString("username")
                                        ?: doc.getString("displayName")
                                        ?: return@mapNotNull null
                                    val pts = pointsMap[uid] ?: 0
                                    RankingItem(email, pts)
                                }
                                if (items.isEmpty()) {
                                    showEmpty(true)
                                } else {
                                    showEmpty(false)
                                    val ranked = items
                                        .sortedByDescending { it.points }
                                        .mapIndexed { idx, item -> item.copy(rank = idx + 1) }
                                    adapter.submitList(ranked)
                                }
                            }
                            .addOnFailureListener { e ->
                                showError("Error cargando usuarios: ${e.message}")
                            }
                    }
                    .addOnFailureListener { e ->
                        showError("Error cargando perfiles: ${e.message}")
                    }
            }
            .addOnFailureListener { e ->
                showError("Error cargando grupo: ${e.message}")
            }
    }

    private fun showEmpty(empty: Boolean) {
        binding.tvEmpty.isVisible = empty
        binding.recyclerRanking.isVisible = !empty
    }

    private fun showError(msg: String) {
        Toast.makeText(requireContext(), msg, Toast.LENGTH_LONG).show()
        showEmpty(true)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
