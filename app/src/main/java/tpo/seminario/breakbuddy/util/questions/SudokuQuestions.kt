package tpo.seminario.breakbuddy.util.questions

import tpo.seminario.breakbuddy.util.QuizQuestion

object SudokuQuestions {
    val questions = listOf(
        QuizQuestion(
            question = "¿Qué es un Sudoku?",
            options = listOf("Un tipo de rompecabezas numérico", "Un juego de cartas", "Un videojuego japonés", "Un tablero de ajedrez"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Cuál es el objetivo principal del Sudoku?",
            options = listOf("Colocar colores distintos", "Ordenar los números en orden ascendente", "Llenar la cuadrícula sin repetir números en filas, columnas y regiones", "Formar palabras ocultas"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿De cuántas casillas consta un Sudoku clásico?",
            options = listOf("36", "81", "64", "100"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué tamaño tiene normalmente un Sudoku estándar?",
            options = listOf("8x8", "9x9", "10x10", "6x6"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuántos números hay que colocar en cada fila de un Sudoku 9x9?",
            options = listOf("8", "10", "9", "6"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Cómo se llaman los bloques más pequeños dentro del Sudoku?",
            options = listOf("Subtableros", "Mini-cuadrículas", "Regiones o subcuadrantes", "Núcleos"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué número no puede faltar en una cuadrícula de Sudoku?",
            options = listOf("El 0", "El 1", "El 5", "Todos del 1 al 9 deben estar presentes"),
            correctIndex = 3
        ),
        QuizQuestion(
            question = "¿Está permitido repetir números en la misma región?",
            options = listOf("Sí", "No", "Solo los pares", "Depende del nivel"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuál de estos es un buen consejo al comenzar un Sudoku?",
            options = listOf("Llenar números al azar", "Rellenar solo los bordes", "Comenzar con las filas o columnas que tienen más números", "Empezar por las esquinas"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué es una 'casilla dada' en Sudoku?",
            options = listOf("Una casilla ya completada en el tablero inicial", "Una casilla decorativa", "Una pista opcional", "Una casilla sin uso"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Se puede resolver un Sudoku sin adivinar?",
            options = listOf("No, siempre hay que adivinar", "Sí, usando lógica", "Solo si es fácil", "Depende del software"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué habilidad desarrolla el Sudoku?",
            options = listOf("Velocidad motora", "Memoria a corto plazo", "Razonamiento lógico y concentración", "Conocimiento histórico"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Cuál es un error común al resolver un Sudoku?",
            options = listOf("Tomarse su tiempo", "Empezar por lo fácil", "Colocar un número sin verificar filas, columnas y región", "Verificar cada movimiento"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué significa que un Sudoku tenga 'una única solución'?",
            options = listOf("Que sólo hay una casilla correcta", "Que no se puede resolver", "Que sólo existe una forma válida de completarlo", "Que se puede jugar una vez"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué número va al centro de una cuadrícula 9x9?",
            options = listOf("No hay un número fijo", "Siempre es 5", "Depende del diseñador", "Debe ser par"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué pasa si se repite un número en una fila?",
            options = listOf("Se rompe la regla y la solución es inválida", "No importa", "Se suma como penalidad", "Es parte del juego"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué técnica básica se usa para eliminar posibilidades en una celda?",
            options = listOf("Regla de tres", "Análisis de exclusión", "Adivinación", "Coloración"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué caracteriza un Sudoku 'difícil'?",
            options = listOf("Tiene más números dados", "Tiene menos pistas y requiere técnicas avanzadas", "Tiene colores", "Es en 3D"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué debe hacerse si te atascás en un Sudoku?",
            options = listOf("Borrar todo", "Adivinar al azar", "Volver atrás y revisar jugadas anteriores", "Dejarlo sin terminar"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Cuál es una variante del Sudoku tradicional?",
            options = listOf("Sudoku diagonal", "Sudoku rápido", "Sudoku parlante", "Sudoku oculto"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué herramienta mental es clave para resolver Sudoku?",
            options = listOf("Memoria a largo plazo", "Velocidad de cálculo", "Pensamiento lógico", "Imaginación creativa"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué técnica implica buscar números posibles por eliminación?",
            options = listOf("Descarte", "Adivinación", "Sudokus cruzados", "Agrupamiento aleatorio"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué es una 'celda solitaria'?",
            options = listOf("Una celda que contiene un único número posible", "Una casilla vacía", "Una celda decorativa", "Una casilla con número tachado"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué indica que un Sudoku fue mal resuelto?",
            options = listOf("Tiene todas las casillas llenas", "Tiene números repetidos en una fila o columna", "Tiene más de una solución", "Termina en menos de 5 minutos"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué técnica avanzada busca pares ocultos o triples?",
            options = listOf("Técnica XY-Wing", "Sudoku inverso", "Reducción lógica simple", "Búsqueda de estructuras diagonales"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué pasa si colocás un número incorrecto?",
            options = listOf("Nada", "Puede afectar la solución total del Sudoku", "Es irrelevante", "El juego se reinicia"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuál es una señal de que estás progresando bien en un Sudoku?",
            options = listOf("Completás varias casillas seguidas correctamente", "Te atascás en todas las filas", "Adivinás y acertás", "El tablero queda vacío"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué estilo de Sudoku incluye reglas diagonales adicionales?",
            options = listOf("Sudoku Samurai", "Sudoku con letras", "Sudoku diagonal", "Sudoku extremo"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué pasa si dos celdas en una misma región tienen el mismo número?",
            options = listOf("Es un error que invalida el Sudoku", "Se suman", "Se ignoran", "Se colorean de azul"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué aplicación puede ayudarte a practicar Sudoku?",
            options = listOf("Microsoft Paint", "Excel", "Sudoku.com", "Spotify"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué estrategia ayuda cuando no hay celdas obvias?",
            options = listOf("Tomar un descanso y volver más tarde", "Borrar todo y comenzar de nuevo", "Adivinar cada número", "Pedirle a alguien más que lo resuelva"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué se puede usar para llevar registro de posibles números?",
            options = listOf("Notas o lápiz", "Marcadores de texto", "Colores de fondo", "Cinta adhesiva"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué significa que una celda tenga 'una sola opción posible'?",
            options = listOf("Debe dejarse vacía", "Se puede colocar ese número con certeza", "Es una pista falsa", "Debe eliminarse"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿En qué país se popularizó el Sudoku moderno?",
            options = listOf("Estados Unidos", "Japón", "China", "Alemania"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué significa 'nivel experto' en Sudoku?",
            options = listOf("Tiene muchos números dados", "Solo usa números impares", "Requiere técnicas complejas y lógica avanzada", "Se resuelve en 2 minutos"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué pasa si duplicás un número en una columna?",
            options = listOf("No afecta nada", "Invalida toda la solución", "Se marca en rojo", "Es parte del reto"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué se logra al practicar Sudoku con frecuencia?",
            options = listOf("Mejorar la rapidez y precisión lógica", "Memorizar los números", "Ganar premios", "Dominar el álgebra"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Cuál es una variante de Sudoku que usa letras en lugar de números?",
            options = listOf("Wordoku", "Letrodoku", "Alfadoku", "Lexidoku"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué representa una cuadrícula vacía al comenzar un Sudoku?",
            options = listOf("Un error", "El desafío puro sin pistas", "Un modo fácil", "Una versión para niños"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué característica tiene un Sudoku 'imposible'?",
            options = listOf("Tiene errores o múltiples soluciones", "Tiene colores", "Es solo para expertos", "Se juega al revés"),
            correctIndex = 0
        )
    )
}