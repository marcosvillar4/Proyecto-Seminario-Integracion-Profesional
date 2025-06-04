package tpo.seminario.breakbuddy.ui.test

data class TestResult(
    val id: String = "",

    val timestamp: Long = 0L,
    val agotamiento: Int = 0,
    val despersonalizacion: Int = 0,
    val realizacion: Int = 0,
    val impacto: Int = 0,

    // Campos opcionales para guardar directamente las etiquetas:
    val nivelAgotamiento: String? = null,
    val nivelDespersonalizacion: String? = null,
    val nivelRealizacion: String? = null,
    val nivelImpacto: String? = null
)