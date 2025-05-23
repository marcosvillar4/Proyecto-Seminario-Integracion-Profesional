package tpo.seminario.breakbuddy.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.util.HobbiesList
import androidx.navigation.fragment.findNavController

class EditHobbiesFragment : Fragment() {
    private lateinit var hobbiesContainer: LinearLayout
    private lateinit var btnGuardar: Button

    private val hobbiesList = HobbiesList.DEFAULT
    private val checkBoxes = mutableListOf<CheckBox>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_hobbies, container, false)
        hobbiesContainer = view.findViewById(R.id.hobbiesContainer)
        btnGuardar = view.findViewById(R.id.btnGuardarHobbies)

        agregarCheckBoxes()
        cargarHobbiesGuardados() // marcarlos si ya los tenía

        btnGuardar.setOnClickListener {
            guardarHobbiesSeleccionados()
        }

        return view
    }

    private fun agregarCheckBoxes() {
        for (hobby in hobbiesList) {
            val checkBox = CheckBox(requireContext()).apply {
                text = hobby
                textSize = 16f
                setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                buttonTintList = ContextCompat.getColorStateList(requireContext(), R.color.green_500)

                setOnCheckedChangeListener { buttonView, isChecked ->
                    val seleccionados = checkBoxes.count { it.isChecked }
                    if (isChecked && seleccionados > 5)
                        buttonView.isChecked = false
                }
            }
            hobbiesContainer.addView(checkBox)
            checkBoxes.add(checkBox)
        }
    }

    private fun cargarHobbiesGuardados() {
        // FireBase
    }

    private fun guardarHobbiesSeleccionados() {
        val seleccionados = checkBoxes
            .filter { it.isChecked }
            .map { it.text.toString() }

        //FireBase

        Toast.makeText(requireContext(), "Hobbies actualizados", Toast.LENGTH_SHORT).show()


        findNavController().navigate(R.id.action_editHobbiesFragment_to_accountSettingsFragment)
    }
}
