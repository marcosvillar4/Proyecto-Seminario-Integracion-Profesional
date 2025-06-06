package tpo.seminario.breakbuddy.data

import tpo.seminario.breakbuddy.util.missions.Mision
import tpo.seminario.breakbuddy.util.missions.TipoMision

object MisionProvider {

    fun obtenerMisionesDelDia(): List<Mision> {
        return listOf(
            Mision(
                id = "1",
                titulo = "Respirá profundo",
                descripcion = "Instrucciones guiadas para respirar.",
                tipo = TipoMision.GUIADA,
                pasosGuiados = listOf("Inhalá", "Exhalá", "Inhalá", "Exhalá", "Listo"),
                duracionSegundos = 10
            ),
            Mision(
                id = "2",
                titulo = "Desconectate",
                descripcion = "Alejate del celular durante 2 minutos.",
                tipo = TipoMision.TEMPORIZADOR,
                duracionSegundos = 120
            ),
            Mision(
                id = "3",
                titulo = "Estirate",
                descripcion = "Estirá brazos, cuello y piernas durante 30 segundos.",
                tipo = TipoMision.TEMPORIZADOR,
                duracionSegundos = 30
            ),
            Mision(
                id = "4",
                titulo = "Tomá agua",
                descripcion = "Tomate un vaso de agua.",
                tipo = TipoMision.SIMPLE
            ),
            Mision(
                id = "5",
                titulo = "Camina un poco",
                descripcion = "Caminá por tu casa u oficina 1 minuto.",
                tipo = TipoMision.TEMPORIZADOR,
                duracionSegundos = 60
            ),
            Mision(
                id = "6",
                titulo = "Mirada al horizonte",
                descripcion = "Mirá algo lejano por 20 segundos para descansar la vista.",
                tipo = TipoMision.TEMPORIZADOR,
                duracionSegundos = 20
            ),
            Mision(
                id = "7",
                titulo = "Postura consciente",
                descripcion = "Corregí tu postura y estirá la espalda.",
                tipo = TipoMision.SIMPLE
            )
        ).shuffled().take(3) // Retorna 3 aleatorias
    }
}
