package tpo.seminario.breakbuddy.util

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctIndex: Int
)