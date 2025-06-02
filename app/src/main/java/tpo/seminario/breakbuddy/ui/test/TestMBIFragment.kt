package tpo.seminario.breakbuddy.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import tpo.seminario.breakbuddy.R

class TestMBIFragment : Fragment() {

    private val preguntas = listOf(
        "Me siento emocionalmente agotado por mi trabajo.",
        "Siento que trato a algunos pacientes/clientes como si fueran objetos.",
        "Siento que trabajar todo el día con personas me cansa.",
        "Tengo la sensación de que afecta negativamente mi vida personal.",
        "Siento que he logrado muchas cosas valiosas en mi trabajo."
    )

    private var indiceActual = 0
    private val respuestas = mutableListOf<Int>()

    private lateinit var txtPregunta: TextView
    private lateinit var opciones: RadioGroup
    private lateinit var btnSiguiente: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test_mbi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        txtPregunta = view.findViewById(R.id.txtPregunta)
        opciones = view.findViewById(R.id.radioGroupOpciones)
        btnSiguiente = view.findViewById(R.id.btnSiguiente)

        mostrarPregunta()

        btnSiguiente.setOnClickListener {
            val seleccion = opciones.checkedRadioButtonId
            if (seleccion != -1) {
                val puntaje = opciones.indexOfChild(view.findViewById(seleccion))
                respuestas.add(puntaje)
                opciones.clearCheck()
                indiceActual++
                if (indiceActual < preguntas.size) {
                    mostrarPregunta()
                } else {
                    mostrarResultado()
                }
            }
        }
    }

    private fun mostrarPregunta() {
        txtPregunta.text = preguntas[indiceActual]
    }

    private fun mostrarResultado() {
        txtPregunta.text = "Test finalizado."
        opciones.visibility = View.GONE
        btnSiguiente.visibility = View.GONE
    }
}
