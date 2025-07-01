package tpo.seminario.breakbuddy.util.questions

import tpo.seminario.breakbuddy.util.QuizQuestion

object DamasQuestions {
    val questions = listOf(
        QuizQuestion(
            question = "¿Cuántas piezas tiene cada jugador al comenzar una partida de damas?",
            options = listOf("12", "16", "10", "8"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué color comienza primero en una partida tradicional de damas?",
            options = listOf("Negro", "Rojo", "Blanco", "El que elija el árbitro"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué movimiento básico puede hacer una pieza en damas?",
            options = listOf("Vertical y horizontal", "En L como el caballo", "Diagonal hacia adelante", "Salto largo en línea recta"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Cómo se captura una pieza en damas?",
            options = listOf("Saltando sobre ella en diagonal", "Empujándola fuera del tablero", "Colocándola encima", "Tocándola con otra pieza"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué ocurre cuando una pieza llega a la última fila del tablero del oponente?",
            options = listOf("Se retira del juego", "Se convierte en reina o dama", "Pierde un turno", "Puede retroceder automáticamente"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuántas casillas tiene un tablero de damas?",
            options = listOf("64", "100", "49", "81"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué casillas se utilizan en el juego de damas?",
            options = listOf("Solo las blancas", "Solo las negras", "Ambas", "Depende del jugador"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuál es el tamaño típico de un tablero de damas estándar?",
            options = listOf("8x8", "10x10", "6x6", "12x12"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué puede hacer una dama (pieza coronada) que una pieza normal no puede?",
            options = listOf("Moverse en línea recta", "Saltar dos piezas a la vez", "Moverse en diagonal hacia atrás también", "Moverse como una torre"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Es obligatorio capturar una pieza si se presenta la oportunidad?",
            options = listOf("Sí", "No", "Solo si se está ganando", "Depende del reglamento local"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Se puede capturar varias piezas en una sola jugada?",
            options = listOf("No", "Sí, en cadena de saltos", "Solo si son piezas normales", "Solo si son damas"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué sucede si un jugador omite una captura obligatoria?",
            options = listOf("No pasa nada", "Pierde la partida", "Se le retira la pieza que debía capturar", "Gana el turno siguiente"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Cómo termina una partida de damas?",
            options = listOf("Cuando se corona una dama", "Cuando un jugador no tiene piezas o movimientos", "Al capturar 5 piezas", "Después de 20 movimientos"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué estrategia básica se recomienda en damas?",
            options = listOf("Aislar piezas", "Proteger el centro y formar cadenas", "No mover ninguna pieza", "Avanzar todas a la vez"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué significa 'formar una cadena' en damas?",
            options = listOf("Hacer varias damas seguidas", "Colocar piezas en diagonal unidas entre sí", "Alinear piezas en una fila recta", "Mover varias piezas al mismo tiempo"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuál es la función de las piezas 'damas' coronadas en defensa?",
            options = listOf("Nada", "Permitir retroceder y cubrir más espacio", "Se convierten en peones", "Sirven para eliminar piezas aliadas"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué ventaja tiene dejar piezas en la fila de atrás?",
            options = listOf("Evitar coronaciones del rival", "Facilitar movimientos", "No sirve para nada", "Confundir al oponente"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué se recomienda al inicio del juego?",
            options = listOf("Jugar sin pensar", "Avanzar piezas centrales y mantener la defensa", "Matar sin estrategia", "No mover las piezas"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué pasa si ambas jugadoras solo tienen damas y no logran avanzar?",
            options = listOf("Se continúa eternamente", "Se declara empate", "Gana quien tenga más piezas", "Se lanza una moneda"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuándo se considera una partida de damas tablas o empate?",
            options = listOf("Cuando se mueven todas las piezas", "Cuando ninguna pieza ha sido coronada", "Cuando no hay progresos posibles por muchos turnos", "Cuando el tablero queda vacío"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué debe hacer un jugador antes de mover una pieza?",
            options = listOf("Preguntar al rival", "Pensar la jugada y verificar posibles capturas", "Lanzar un dado", "Mover al azar"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué pieza tiene más movilidad en el tablero?",
            options = listOf("Pieza normal", "Dama", "Pieza bloqueada", "La primera que se mueve"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cómo se puede evitar que el rival corone una dama?",
            options = listOf("Avanzando las piezas rápidamente", "Abandonando la partida", "Manteniendo piezas en la última fila", "Sacando las piezas del tablero"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Cuál es una desventaja de mover siempre las mismas piezas?",
            options = listOf("Ninguna", "Se desgastan", "Se dejan espacios desprotegidos", "Se gana automáticamente"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué acción puede llevar a una desventaja táctica?",
            options = listOf("Proteger piezas", "Formar cadenas", "Abandonar el centro", "Coronar damas"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué ventaja tiene controlar el centro del tablero?",
            options = listOf("Ninguna", "Mayor movilidad y control de juego", "Bloquear al oponente", "Ganar más piezas"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué permite una captura en cadena?",
            options = listOf("Avanzar más piezas", "Capturar varias piezas en un turno", "Mover a cualquier lado", "Reiniciar la partida"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuándo se puede mover una dama recién coronada?",
            options = listOf("En el mismo turno si aún no se movió", "Nunca", "Al siguiente turno", "Cuando el árbitro lo indique"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué sucede si un jugador no puede moverse?",
            options = listOf("Pasa su turno", "Pierde la partida", "Gana automáticamente", "Se le da una jugada extra"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuál es la mejor forma de aprender damas?",
            options = listOf("Memorizar todas las jugadas", "Jugar, practicar y analizar partidas", "Mirar solamente", "Leer sin practicar"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cómo se le llama a una partida en la que nadie gana?",
            options = listOf("Reinicio", "Tablas o empate", "Coronación", "Abandono"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué acción NO está permitida en damas?",
            options = listOf("Mover en diagonal", "Capturar al oponente", "Mover hacia atrás con piezas normales", "Formar cadenas"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué se debe observar al planear un salto?",
            options = listOf("Color de la pieza", "Casillas vacías y posibilidades de cadena", "Altura del tablero", "Color del oponente"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué es una doble captura?",
            options = listOf("Cuando se pierde una pieza", "Cuando se mueven dos damas", "Cuando se capturan dos piezas en un mismo turno", "Cuando el rival no juega"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Por qué es importante anticipar los movimientos del rival?",
            options = listOf("Para confundirlo", "Para hacer trampa", "Para evitar perder piezas o quedar en desventaja", "Para ganar más turnos"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué pieza debe protegerse más al final del juego?",
            options = listOf("Cualquiera", "La primera que se mueve", "La dama", "Las que están atrás"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué puede provocar una mala distribución de piezas?",
            options = listOf("Mayor defensa", "Desorganización y vulnerabilidad", "Más coronaciones", "Ganancias inmediatas"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué actitud favorece el progreso en damas?",
            options = listOf("Impulsividad", "Practicar, pensar y ser paciente", "Mover sin pensar", "Evitar estudiar partidas"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué tipo de jugadas son más efectivas?",
            options = listOf("Las predecibles", "Las que siguen un patrón defensivo sin pensar", "Las planificadas estratégicamente", "Las que se repiten siempre"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué aporta el estudio de partidas anteriores?",
            options = listOf("Nada", "Ayuda a mejorar la estrategia y aprender errores", "Solo sirve para los expertos", "Hace el juego aburrido"),
            correctIndex = 1
        )
    )
}