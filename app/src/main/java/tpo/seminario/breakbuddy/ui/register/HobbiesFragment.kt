package tpo.seminario.breakbuddy.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import tpo.seminario.breakbuddy.R

class HobbiesFragment : Fragment() {
    private lateinit var hobbiesContainer: LinearLayout
    private lateinit var btnGuardar: Button

    //Lista de hobbies (MODIFICABLE)
    private val hobbiesList = listOf(
        "Leer", "Hacer ejercicio", "Cocinar", "Escuchar música",
        "Pintar", "Pintar", "Jardinería", "Videojuegos", "Meditar", "Bailar", "Ver películas"
    )

    private val checkBoxes = mutableListOf<CheckBox>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        val view = inflater.inflate(R.layout.fragment_hobbies, container, false)
        hobbiesContainer = view.findViewById(R.id.hobbiesContainer)
        btnGuardar = view.findViewById(R.id.btnGuardarHobbies)

        agegarCheckBoxes()

        btnGuardar.setOnClickListener {
            guardarHobbiesSeleccionados()
        }

        return view
    }

    private fun agegarCheckBoxes(){
        for(hobby in hobbiesList){
            val checkBox = CheckBox(requireContext())
            checkBox.text = hobby
            hobbiesContainer.addView(checkBox)
            checkBoxes.add(checkBox)
        }
    }

    private fun guardarHobbiesSeleccionados(){
        val seleccionados = checkBoxes.filter { it.isChecked }.map {it.text.toString()}

        //Firebase
    }
 }