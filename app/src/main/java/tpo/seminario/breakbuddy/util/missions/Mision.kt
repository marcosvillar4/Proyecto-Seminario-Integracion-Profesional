package tpo.seminario.breakbuddy.util.missions

data class Mision(
    val id: String,
    val titulo: String,
    val descripcion: String,
    val tipo: TipoMision = TipoMision.TEMPORIZADOR, // o ANIMADA, GUIADA, SIMPLE
    val duracionSegundos: Int = 10,
    val pasosGuiados: List<String>? = null, // para cosas como "Inhala / Exhala"
    var completada: Boolean = false
)

enum class TipoMision {
    TEMPORIZADOR,
    GUIADA,
    SIMPLE
}
