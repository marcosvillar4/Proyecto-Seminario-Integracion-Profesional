package tpo.seminario.breakbuddy.util

object HobbyQuestionsProvider {
    val hobbyQuizzes: Map<String, List<QuizQuestion>> = mapOf(
        "Basket" to listOf(
            QuizQuestion(
                question = "¿Quién es el máximo anotador en la historia de la NBA?",
                options = listOf("Kareem Abdul-Jabbar", "LeBron James", "Michael Jordan", "Wilt Chamberlain"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántos anillos de campeonato ganó Michael Jordan?",
                options = listOf("5", "6", "7", "8"),
                correctIndex = 1
            )
        ),
        "Volley" to listOf(
            QuizQuestion(
                question = "¿Cuántos jugadores hay en cancha por equipo en voleibol?",
                options = listOf("5", "6", "7", "8"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama la acción de enviar la pelota al otro lado?",
                options = listOf("Bloqueo", "Recepción", "Saque", "Colocación"),
                correctIndex = 2
            )
        ),
        "Cocinar" to listOf(
            QuizQuestion(
                question = "¿A qué temperatura hierve el agua al nivel del mar?",
                options = listOf("90 °C", "95 °C", "100 °C", "105 °C"),
                correctIndex = 2
            )
        ),
        "Leer" to listOf(
            QuizQuestion(
                question = "¿Cuál es considerado el libro más leído del mundo?",
                options = listOf("Don Quijote", "La Biblia", "El Principito", "1984"),
                correctIndex = 1
            )
        )
        // ... más hobbies
    )
}
