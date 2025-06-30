package tpo.seminario.breakbuddy.util.missions

import com.google.firebase.firestore.PropertyName

data class Mision(
    val id: String,
    val titulo: String,
    val descripcion: String,
    val tipo: TipoMision = TipoMision.TEMPORIZADOR,
    val duracionSegundos: Int = 10,
    val pasosGuiados: List<String>? = null,
    var completada: Boolean = false
) {
    // Este constructor vacío es el que Firestore usará para instanciar antes de poblar campos
    @Suppress("unused") // para silenciar warning de parámetro no usado
    constructor() : this(
        id             = "",
        titulo         = "",
        descripcion    = "",
        tipo           = TipoMision.SIMPLE,
        duracionSegundos = 0,
        pasosGuiados   = null,
        completada     = false
    )
}

enum class TipoMision {
    TEMPORIZADOR,
    GUIADA,
    SIMPLE
}
