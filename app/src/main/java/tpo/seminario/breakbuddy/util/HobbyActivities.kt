package tpo.seminario.breakbuddy.util


data class ActivitySuggestion(
    val description: String,
    val minParticipants: Int,
    val maxParticipants: Int
)

object HobbyActivities {
    val map: Map<String, List<ActivitySuggestion>> = mapOf(
        // Ejemplo para algunos hobbies
        "Andar en bicicleta" to listOf(
            ActivitySuggestion("Paseo grupal en parque", 2, 10),
            ActivitySuggestion("Ruta de montaña", 1, 4)
        ),
        "Juegos de mesa" to listOf(
            ActivitySuggestion("Partida de Catan", 3, 4),
            ActivitySuggestion("Torneo de ajedrez rápido", 2, 16)
        ),
        "Cocinar" to listOf(
            ActivitySuggestion("Clase de cocina en pareja", 2, 2),
            ActivitySuggestion("Competencia de repostería", 2, 6)
        ),
        "Escuchar música" to listOf(
            ActivitySuggestion("Karaoke en casa", 1, 8),
            ActivitySuggestion("Jam session improvisada", 2, 5)
        ),
        "Ver películas" to listOf(
            ActivitySuggestion("Maratón de series", 1, 5),
            ActivitySuggestion("Noche de cine temático", 2, 10)
        ),
        // Agrega mapeos para el resto de hobbies
        // "Leer" to listOf(...),
        // "Pintar" to listOf(...),
        // etc.
    )
    fun getSuggestionsFor(hobby: String): List<ActivitySuggestion> =
        map[hobby] ?: emptyList()
}
