package tpo.seminario.breakbuddy.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import tpo.seminario.breakbuddy.databinding.FragmentTestHistoryBinding
import tpo.seminario.breakbuddy.databinding.ItemTestHistoryBinding
import java.text.SimpleDateFormat
import java.util.*

class TestHistoryFragment : Fragment() {

    private var _binding: FragmentTestHistoryBinding? = null
    private val binding get() = _binding!!
    private val db = FirebaseFirestore.getInstance()
    private val auth = FirebaseAuth.getInstance()
    private lateinit var adapter: TestHistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTestHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TestHistoryAdapter()
        binding.recyclerTests.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@TestHistoryFragment.adapter
        }
        loadTestHistory()
    }

    private fun loadTestHistory() {
        val uid = auth.currentUser?.uid
        if (uid.isNullOrEmpty()) {
            Toast.makeText(requireContext(), "Usuario no autenticado", Toast.LENGTH_SHORT).show()
            return
        }
        db.collection("users")
            .document(uid)
            .collection("tests")
            .orderBy("timestamp", Query.Direction.DESCENDING)
            .get()
            .addOnSuccessListener { snaps ->
                val list = snaps.documents.mapNotNull { doc ->
                    doc.toObject(TestResult::class.java)
                }
                if (list.isEmpty()) {
                    binding.tvEmptyTests.visibility = View.VISIBLE
                } else {
                    binding.tvEmptyTests.visibility = View.GONE
                }
                adapter.submitList(list)
            }
            .addOnFailureListener {
                Toast.makeText(requireContext(),
                    "Error cargando historial: ${it.message}",
                    Toast.LENGTH_SHORT).show()
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // ----- Adapter interno -----
    private class TestHistoryAdapter :
        ListAdapter<TestResult, TestHistoryAdapter.VH>(DIFF) {

        companion object {
            private val DIFF = object : DiffUtil.ItemCallback<TestResult>() {
                override fun areItemsTheSame(a: TestResult, b: TestResult) = a.id == b.id
                override fun areContentsTheSame(a: TestResult, b: TestResult) = a == b
            }
        }

        inner class VH(val vb: ItemTestHistoryBinding) :
            RecyclerView.ViewHolder(vb.root) {
            fun bind(item: TestResult) {
                val date = Date(item.timestamp)
                val fmt = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())
                vb.tvTestDate.text = fmt.format(date)
                vb.tvTestScore.text = """
                  Agotamiento: ${item.agotamiento}
                  Despersonalización: ${item.despersonalizacion}
                  Realización: ${item.realizacion}
                  Impacto: ${item.impacto}
                """.trimIndent()
                }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            VH(ItemTestHistoryBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))

        override fun onBindViewHolder(holder: VH, position: Int) =
            holder.bind(getItem(position))
    }
}
