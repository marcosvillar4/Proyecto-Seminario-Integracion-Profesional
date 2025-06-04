package tpo.seminario.breakbuddy.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.card.MaterialCardView
import tpo.seminario.breakbuddy.R

class TestMBIFragment : Fragment() {

    private val preguntas = listOf(
        // Agotamiento emocional (2)
        "Me siento emocionalmente agotado por mi trabajo.",
        "Siento que estoy al límite de lo que puedo dar emocionalmente.",

        // Despersonalización (2)
        "Siento que trato a algunas personas como si fueran objetos.",
        "Me preocupa que este trabajo me esté volviendo menos empático/a.",

        // Realización personal (2)
        "Tengo la sensación de que soy una persona eficaz en mi puesto.",
        "Creo que influyo positivamente en la vida de otras personas con mi trabajo.",

        // Impacto en vida personal (1)
        "Tengo la sensación de que mi trabajo interfiere con mi vida personal."
    )

    private var indiceActual = 0
    private val respuestas = mutableListOf<Int>()

    private lateinit var txtPregunta: TextView
    private lateinit var opciones: RadioGroup
    private lateinit var btnSiguiente: Button
    private lateinit var txtAgotamiento: TextView
    private lateinit var txtDespersonalizacion: TextView
    private lateinit var txtRealizacion: TextView
    private lateinit var txtImpacto: TextView
    private lateinit var cardResultado: MaterialCardView

    private val viewModel: TestMBIViewModel by viewModels()  // ← Nuevo ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test_mbi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Vincular vistas
        txtPregunta = view.findViewById(R.id.txtPregunta)
        opciones = view.findViewById(R.id.radioGroupOpciones)
        btnSiguiente = view.findViewById(R.id.btnSiguiente)
        txtAgotamiento = view.findViewById(R.id.txtAgotamiento)
        txtDespersonalizacion = view.findViewById(R.id.txtDespersonalizacion)
        txtRealizacion = view.findViewById(R.id.txtRealizacion)
        txtImpacto = view.findViewById(R.id.txtImpacto)
        cardResultado = view.findViewById(R.id.cardResultado)

        // Mostrar la primera pregunta
        mostrarPregunta()

        // Observamos LiveData de guardado
        observeSaveState()

        // Evento botón Siguiente
        btnSiguiente.setOnClickListener {
            val seleccion = opciones.checkedRadioButtonId
            if (seleccion != -1) {
                // Calculamos índice del RadioButton seleccionado
                val indexSeleccion = opciones.indexOfChild(view.findViewById(seleccion))
                respuestas.add(indexSeleccion)
                opciones.clearCheck()
                indiceActual++
                if (indiceActual < preguntas.size) {
                    mostrarPregunta()
                } else {
                    mostrarResultado()  // Cuando terminan todas las preguntas
                }
            } else {
                Toast.makeText(requireContext(), "Selecciona una opción antes de continuar", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun mostrarPregunta() {
        txtPregunta.text = preguntas[indiceActual]
    }

    /**
     * Se llama cuando ya se contestaron todas las preguntas.
     * Calcula puntajes, muestra en pantalla y luego guarda en Firestore.
     */
    private fun mostrarResultado() {
        // Ocultamos preguntas / opciones / botón
        txtPregunta.visibility = View.GONE
        opciones.visibility = View.GONE
        btnSiguiente.visibility = View.GONE

        // Calcular puntajes
        val agotamiento       = respuestas.slice(0..1).sum()
        val despersonalizacion= respuestas.slice(2..3).sum()
        val realizacion       = respuestas.slice(4..5).sum()
        val impacto           = respuestas[6]

        // Calcular niveles (etiquetas)
        val nivelAgotamiento       = categorizar(agotamiento, listOf(4, 8))
        val nivelDespersonalizacion= categorizar(despersonalizacion, listOf(3, 6))
        val nivelRealizacion       = categorizarInvertido(realizacion, listOf(3, 6))
        val nivelImpacto           = "$impacto/6"  // puedes adaptar si necesitas otra forma

        // Mostrar en los TextView del layout
        txtAgotamiento.text        = "Agotamiento emocional: $nivelAgotamiento"
        txtDespersonalizacion.text = "Despersonalización: $nivelDespersonalizacion"
        txtRealizacion.text        = "Realización personal: $nivelRealizacion"
        txtImpacto.text            = "Impacto en vida personal: $nivelImpacto"

        cardResultado.visibility = View.VISIBLE

        // 1) Crear un objeto TestResult
        val resultadoAGuardar = TestResult(
            // id se genera en el repositorio
            timestamp = System.currentTimeMillis(),
            agotamiento = agotamiento,
            despersonalizacion = despersonalizacion,
            realizacion = realizacion,
            impacto = impacto,
            nivelAgotamiento = nivelAgotamiento,
            nivelDespersonalizacion = nivelDespersonalizacion,
            nivelRealizacion = nivelRealizacion,
            nivelImpacto = nivelImpacto
        )

        // 2) Llamar al ViewModel para guardarlo en Firestore
        viewModel.saveResult(resultadoAGuardar)
    }

    /**
     * Observa los LiveData saveSuccess / saveError del ViewModel.
     * Muestra Toasts según corresponda.
     */
    private fun observeSaveState() {
        viewModel.saveSuccess.observe(viewLifecycleOwner) { testId ->
            testId?.let {
                Toast.makeText(requireContext(), "Resultado guardado (ID: $it)", Toast.LENGTH_LONG).show()
                // Opcional: aquí podrías navegar a otra pantalla o dejar todo inactivo
                viewModel.clearSaveStates()
            }
        }
        viewModel.saveError.observe(viewLifecycleOwner) { errorMsg ->
            errorMsg?.let {
                Toast.makeText(requireContext(), "Error guardando resultado: $it", Toast.LENGTH_LONG).show()
                viewModel.clearSaveStates()
            }
        }
    }

    private fun categorizar(valor: Int, cortes: List<Int>): String {
        return when {
            valor <= cortes[0] -> "Bajo"
            valor <= cortes[1] -> "Moderado"
            else -> "Alto"
        }
    }

    private fun categorizarInvertido(valor: Int, cortes: List<Int>): String {
        return when {
            valor <= cortes[0] -> "Alto (riesgo)"
            valor <= cortes[1] -> "Moderado"
            else -> "Bajo (saludable)"
        }
    }
}
