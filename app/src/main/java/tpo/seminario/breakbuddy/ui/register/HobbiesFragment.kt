package tpo.seminario.breakbuddy.ui.register

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
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.persistence.UserRepository

class HobbiesFragment : Fragment() {
    private lateinit var hobbiesContainer: LinearLayout
    private lateinit var btnGuardar: Button

    private val userRepo = UserRepository()

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
            val checkBox = CheckBox(requireContext()).apply{
                text = hobby
                //Tamaño fuente
                textSize = 16f
                setTextColor(ContextCompat.getColor(requireContext(), R.color.black))
                buttonTintList = ContextCompat.getColorStateList(requireContext(), R.color.green_500)

                setOnCheckedChangeListener { buttonView, isChecked ->
                    val seleccionados = checkBoxes.count { it.isChecked }
                    if(isChecked && seleccionados > 6)
                        buttonView.isChecked = false
                }
            }
            hobbiesContainer.addView(checkBox)
            checkBoxes.add(checkBox)
        }
    }

    private fun guardarHobbiesSeleccionados() {
        // 1) Filtra los seleccionados
        val seleccionados = checkBoxes
            .filter { it.isChecked }
            .map { it.text.toString() }

        // 2) Obtiene el UID del usuario actual
        val uid = FirebaseAuth.getInstance().currentUser?.uid
        if (uid.isNullOrEmpty()) {
            Toast.makeText(requireContext(),
                "Error: no hay usuario autenticado",
                Toast.LENGTH_SHORT).show()
            return
        }

        // 3) Llama al repositorio para guardar
        userRepo.saveHobbies(
            userId = uid,
            hobbies = seleccionados,
            onSuccess = {
                Toast.makeText(requireContext(),
                    "Hobbies guardados correctamente",
                    Toast.LENGTH_SHORT).show()
                // 4) Navega al Dashboard
                findNavController().navigate(
                    R.id.action_hobbiesFragment_to_dashboardFragment
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