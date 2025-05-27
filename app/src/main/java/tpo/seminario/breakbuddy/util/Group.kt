package tpo.seminario.breakbuddy.util

data class Group(
    val id: String = "",
    val name: String = "",
    val createdBy: String = "",
    val emails: List<String> = emptyList(),
    val hobby: String? = null,
    val code: String = ""
)