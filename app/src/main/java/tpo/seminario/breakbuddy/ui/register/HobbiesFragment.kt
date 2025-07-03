package tpo.seminario.breakbuddy.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.flexbox.FlexboxLayout
import com.google.android.material.chip.Chip
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.persistence.UserRepository
import tpo.seminario.breakbuddy.util.HobbiesList

class HobbiesFragment : Fragment() {
    private lateinit var hobbiesContainer: FlexboxLayout
    private lateinit var btnGuardar: Button

    private val userRepo = UserRepository()
    private val hobbiesList = HobbiesList.DEFAULT
    private val chipList = mutableListOf<Chip>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hobbies, container, false)
        hobbiesContainer = view.findViewById(R.id.hobbiesContainer)
        btnGuardar = view.findViewById(R.id.btnGuardarHobbies)

        agregarChips()

        btnGuardar.setOnClickListener {
            guardarHobbiesSeleccionados()
        }

        return view
    }

    private fun agregarChips() {
        for (hobby in hobbiesList) {
            val chip = Chip(requireContext()).apply {
                text = hobby
                isCheckable = true
                isClickable = true
                chipBackgroundColor = ContextCompat.getColorStateList(requireContext(), R.color.chip_selector)
                setTextColor(ContextCompat.getColorStateList(requireContext(), R.color.chip_text_selector))
                setPadding(32, 16, 32, 16)
                setOnCheckedChangeListener { _, _ ->
                    val seleccionados = chipList.count { it.isChecked }
                    if (seleccionados > 5) {
                        isChecked = false
                        Toast.makeText(context, "Máximo 5 hobbies", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            val layoutParams = ViewGroup.MarginLayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            layoutParams.setMargins(0, 0, 12, 0)
            chip.layoutParams = layoutParams

            hobbiesContainer.addView(chip)
            chipList.add(chip)
        }
    }


    private fun guardarHobbiesSeleccionados() {
        val seleccionados = chipList
            .filter { it.isChecked }
            .map { it.text.toString() }

        val uid = FirebaseAuth.getInstance().currentUser?.uid
        if (uid.isNullOrEmpty()) {
            Toast.makeText(requireContext(),
                "Error: no hay usuario autenticado",
                Toast.LENGTH_SHORT).show()
            return
        }

        userRepo.saveUserHobbiesProfile(
            uid = uid,
            newHobbies = seleccionados,
            onSuccess = {
                Toast.makeText(requireContext(),
                    "Hobbies guardados correctamente",
                    Toast.LENGTH_SHORT).show()
                findNavController().navigate(
                    R.id.action_hobbiesFragment_to_wheelFragment
                )
            },
            onFailure = { e ->
                Toast.makeText(requireContext(),
                    "Error guardando hobbies: ${e.message}",
                    Toast.LENGTH_LONG).show()
            }
        )
    }
}
