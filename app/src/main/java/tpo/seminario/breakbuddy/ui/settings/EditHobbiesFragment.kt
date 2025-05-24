package tpo.seminario.breakbuddy.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import tpo.seminario.breakbuddy.R
import tpo.seminario.breakbuddy.util.HobbiesList
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import tpo.seminario.breakbuddy.persistence.UserRepository

class EditHobbiesFragment : Fragment() {

    private lateinit var scrollView: ScrollView

    private lateinit var hobbiesContainer: LinearLayout
    private lateinit var btnGuardar: Button


    private val hobbiesList = HobbiesList.DEFAULT
    private val checkBoxes = mutableListOf<CheckBox>()

    private val userRepo = UserRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_hobbies, container, false)

        scrollView = view.findViewById(R.id.scrollViewHobbies)

        hobbiesContainer = view.findViewById(R.id.hobbiesContainer)
        btnGuardar = view.findViewById(R.id.btnGuardarHobbies)


        //INTENTO DE AJUSTE DINÁMICO, PERO NO PARECE FUNCIONAR
        // Ajuste dinámico de paddingBottom según la barra de navegación
        ViewCompat.setOnApplyWindowInsetsListener(scrollView) { v, insets ->
            val navBarHeight = insets.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom
            v.updatePadding(bottom = navBarHeight + (40 * resources.displayMetrics.density).toInt())
            insets
        }

        agregarCheckBoxes()

        // 1) Carga los hobbies guardados de Firestore
        val uid = FirebaseAuth.getInstance().currentUser?.uid ?: return view
        userRepo.getUserHobbies(uid,
            onSuccess = { savedList ->
                // Marca cada checkbox cuyo texto esté en savedList
                checkBoxes.forEach { cb ->
                    cb.isChecked = savedList.contains(cb.text.toString())
                }
            },
            onFailure = { e ->
                Toast.makeText(requireContext(),
                    "Error cargando hobbies: ${e.message}", Toast.LENGTH_LONG).show()
            }
        )

        // Botón Guardar → actualiza en Firestore
        btnGuardar.setOnClickListener {
            if (uid == null) {
                Toast.makeText(requireContext(),
                    "Error: usuario no autenticado", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val seleccionados = checkBoxes
                .filter { it.isChecked }
                .map { it.text.toString() }
            userRepo.saveHobbies(
                userId = uid,
                hobbies = seleccionados,
                onSuccess = {
                    Toast.makeText(requireContext(),
                        "Hobbies actualizados", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(
                        R.id.action_editHobbiesFragment_to_accountSettingsFragment
                    )
                },
                onFailure = { e ->
                    Toast.makeText(requireContext(),
                        "Error guardando hobbies: ${e.message}", Toast.LENGTH_LONG).show()
                }
            )
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
}
