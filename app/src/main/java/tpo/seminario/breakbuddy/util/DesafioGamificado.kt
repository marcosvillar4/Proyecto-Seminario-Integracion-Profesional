package tpo.seminario.breakbuddy.util

data class DesafioGamificado(
    val nombre: String,
    val instruccion: String,
    val recompensa: Int,
    val iconoResId: Int,
    val requiereTemporizador: Boolean = false,
    val duracionSegundos: Int = 0,
    val quiz: QuizQuestion? = null
)
