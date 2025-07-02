package tpo.seminario.breakbuddy.util

import tpo.seminario.breakbuddy.R

object PhysicalChallengesProvider {
    // Lista de DesafioGamificado para desafíos físicos genéricos
    val physicalChallenges: List<DesafioGamificado> = listOf(
        DesafioGamificado(
            nombre = "Descanso 5'",
            instruccion = "Poné el celular a un lado y relajate 5 minutos.",
            recompensa = 10,
            iconoResId = R.drawable.weekend_24dp_,
            requiereTemporizador = true,
            duracionSegundos = 300
        ),
        DesafioGamificado(
            nombre = "Caminar",
            instruccion = "Caminá al menos 2 minutos por tu espacio.",
            recompensa = 15,
            iconoResId = R.drawable.directions_walk_24dp_png,
            requiereTemporizador = true,
            duracionSegundos = 120
        ),
        DesafioGamificado(
            nombre = "Estiramiento",
            instruccion = "Estirá cuello, espalda y piernas por 1 minuto.",
            recompensa = 12,
            iconoResId = R.drawable.physical_therapy_24dp_
        ),
        DesafioGamificado(
            nombre = "Hidratarte",
            instruccion = "Tomate un vaso de agua y recargá energías.",
            recompensa = 8,
            iconoResId = R.drawable.water_drop_24dp_
        ),
        DesafioGamificado(
            nombre = "Meditación",
            instruccion = "Respirá profundo durante 3 minutos.",
            recompensa = 20,
            iconoResId = R.drawable.self_improvement_24dp_,
            requiereTemporizador = true,
            duracionSegundos = 180
        ),
        DesafioGamificado(
            nombre = "Respirar",
            instruccion = "Hacé 5 respiraciones profundas y conscientes.",
            recompensa = 8,
            iconoResId = R.drawable.pulmonology_24dp_
        )
    )
}
