package tpo.seminario.breakbuddy.util.questions

import tpo.seminario.breakbuddy.util.QuizQuestion

object CrucigramaQuestions {
    val questions = listOf(
        QuizQuestion(
            question = "¿Qué es un crucigrama?",
            options = listOf("Un rompecabezas numérico", "Un juego de adivinanzas visuales", "Un pasatiempo en el que se completan palabras en una cuadrícula", "Un tipo de sudoku con letras"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué indica una casilla negra en un crucigrama?",
            options = listOf("Una letra incorrecta", "Una pista especial", "Separación entre palabras", "Fin del juego"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué se debe hacer si dos palabras se cruzan?",
            options = listOf("Ignorar una de las dos", "Ambas deben tener la misma letra en la casilla compartida", "Eliminar una palabra", "Usar una letra comodín"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cómo suelen estar organizadas las pistas en un crucigrama?",
            options = listOf("Al azar", "Por tema", "En secciones numéricas aleatorias", "Divididas en horizontal y vertical"),
            correctIndex = 3
        ),
        QuizQuestion(
            question = "¿Qué habilidad se fortalece al resolver crucigramas?",
            options = listOf("Equilibrio", "Ortografía y vocabulario", "Velocidad de lectura", "Memoria visual"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué significa una pista con signo de interrogación al final?",
            options = listOf("Pista capciosa o con juego de palabras", "Pista en otro idioma", "Palabra invertida", "Trampa del creador"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué instrumento se usa comúnmente para completar un crucigrama en papel?",
            options = listOf("Computadora", "Lápiz o bolígrafo", "Cinta adhesiva", "Tijeras"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué debe coincidir entre una pista y su solución?",
            options = listOf("Longitud de la palabra", "Color de la casilla", "Hora de publicación", "Idioma original"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué es un anagrama, a veces usado en crucigramas?",
            options = listOf("Una palabra con acento", "Una palabra escondida en otra", "Una palabra formada reordenando letras", "Un sinónimo difícil"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué es un crucigrama temático?",
            options = listOf("Con palabras en varios idiomas", "Con pistas escritas por famosos", "Con todas las respuestas relacionadas a un mismo tema", "Con pistas que riman"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué tipo de crucigrama no tiene casillas negras prediseñadas?",
            options = listOf("Crucigrama libre", "Crucigrama americano", "Crucigrama de lógica", "Crucigrama diagramless"),
            correctIndex = 3
        ),
        QuizQuestion(
            question = "¿Qué puede hacer más difícil un crucigrama?",
            options = listOf("Usar solo sustantivos comunes", "Incluir siglas, nombres propios o palabras técnicas", "Tener menos pistas", "Usar colores llamativos"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué hace un 'crucigramista' profesional?",
            options = listOf("Resuelve crucigramas mundialmente", "Crea y edita crucigramas", "Organiza torneos de palabras", "Dirige diccionarios en línea"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué indica una pista entre comillas?",
            options = listOf("Una cita famosa", "Una frase literal", "Una palabra mal escrita", "Una expresión común que debe interpretarse tal cual"),
            correctIndex = 3
        ),
        QuizQuestion(
            question = "¿Qué significa que una palabra es 'en plural' en una pista?",
            options = listOf("Debe escribirse dos veces", "Tiene que ir en inglés", "Termina en 's' u otra forma plural", "Se escribe en mayúscula"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Cuál es una estrategia útil para resolver crucigramas difíciles?",
            options = listOf("Empezar por las pistas más largas", "Borrar todas las palabras", "Escribir sin mirar", "Empezar por las últimas pistas"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué puede indicar una pista con abreviación?",
            options = listOf("Que la solución también es una abreviación", "Que debe escribirse en otro idioma", "Que hay un error", "Que es una palabra técnica"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué se busca evitar en los crucigramas bien diseñados?",
            options = listOf("Palabras comunes", "Letras compartidas", "Palabras demasiado oscuras o arbitrarias", "Temas generales"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué característica es típica de los crucigramas americanos?",
            options = listOf("Muchas casillas negras", "Simetría rotacional", "Líneas curvas", "Incluir dibujos"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué hace que un crucigrama sea un 'pasatiempo educativo'?",
            options = listOf("Es solo para adultos", "Mejora el vocabulario, agilidad mental y memoria", "Se puede imprimir gratis", "Viene con respuestas"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué suele indicar una pista con la palabra 'arcaico' o 'antiguo'?",
            options = listOf("Una palabra común", "Una palabra que debe escribirse en otro idioma", "Una palabra en desuso o poco frecuente", "Un error en la pista"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué se debe hacer si una pista incluye una sigla como 'EE.UU.'?",
            options = listOf("Ignorarla", "Buscar una sigla como respuesta", "Buscar un país en otro idioma", "Buscar una ciudad cercana"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué elemento visual ayuda a saber cuántas letras tiene una respuesta?",
            options = listOf("El número de la pista", "Las casillas en blanco disponibles", "El color del fondo", "El tipo de letra"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué tipo de palabra es más común en crucigramas?",
            options = listOf("Sustantivos y verbos", "Adverbios exclusivamente", "Palabras con muchas letras", "Palabras compuestas únicamente"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué se logra al resolver un crucigrama sin errores?",
            options = listOf("Puntos adicionales", "Un patrón estético completo", "El desbloqueo de un nivel", "Recompensas en línea"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué tipo de pistas suelen tener más dificultad?",
            options = listOf("Pistas literales", "Pistas con juego de palabras o dobles sentidos", "Pistas muy cortas", "Pistas en negrita"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué puede hacer un diccionario de sinónimos mientras resolvés un crucigrama?",
            options = listOf("Confundirte", "Ayudarte a ampliar vocabulario y encontrar respuestas", "Eliminar opciones", "Mostrar palabras aleatorias"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué herramienta moderna ha cambiado la forma de resolver crucigramas?",
            options = listOf("La tiza", "Las aplicaciones móviles de crucigramas", "La televisión", "El bolígrafo fluorescente"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué suele pasar cuando resolvés una palabra correctamente?",
            options = listOf("Se borra automáticamente", "Ayuda a resolver las que se cruzan", "Desactiva la casilla", "Muestra una imagen"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué pasa si una letra de una palabra cruzada está incorrecta?",
            options = listOf("Todo el crucigrama se invalida", "Esa casilla afecta ambas respuestas", "No afecta el resultado final", "Se salta automáticamente"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué es una pista críptica?",
            options = listOf("Una pista que contiene un acertijo o doble sentido", "Una pista escrita en clave Morse", "Una pista oculta en la imagen", "Una pista con números romanos"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué significa 'pista cruzada'?",
            options = listOf("Una pista muy difícil", "Una pista relacionada con otra palabra en la cuadrícula", "Una pista duplicada", "Una pista que viene de otro crucigrama"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Cuál de estos elementos es importante para crear crucigramas?",
            options = listOf("Simetría y distribución de letras", "Colores llamativos", "Fotografías decorativas", "Ilustraciones en las pistas"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué estrategia puede ayudar si no sabés una respuesta?",
            options = listOf("Revisar las palabras que se cruzan", "Borrar todo", "Escribir cualquier cosa", "Cambiar de pasatiempo"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué función tienen los números en una cuadrícula de crucigrama?",
            options = listOf("Indicar el orden en que debe resolverse", "Indicar la letra correcta", "Relacionar pistas con las casillas donde empieza cada palabra", "Dividir el crucigrama en secciones"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué pista podría indicar una palabra en otro idioma?",
            options = listOf("Una palabra entre paréntesis", "Una indicación como '(fr.)' o '(lat.)'", "Una letra resaltada", "Una palabra en mayúscula"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué significa una pista que dice 'familia de árboles'?",
            options = listOf("Busca un tipo de árbol específico", "Busca un color", "Busca una profesión", "Busca un animal"),
            correctIndex = 0
        ),
        QuizQuestion(
            question = "¿Qué ocurre si se usa tinta en lugar de lápiz para resolver un crucigrama?",
            options = listOf("Se mejora la legibilidad", "Se dificulta corregir errores", "Se gana más rápido", "Se activa un modo difícil"),
            correctIndex = 1
        ),
        QuizQuestion(
            question = "¿Qué suele buscar un amante de crucigramas en el diario?",
            options = listOf("La sección de espectáculos", "El horóscopo", "La página de pasatiempos", "Las ofertas laborales"),
            correctIndex = 2
        ),
        QuizQuestion(
            question = "¿Qué es un crucigrama inverso?",
            options = listOf("Uno donde se dan las respuestas y hay que adivinar las pistas", "Uno con letras ya colocadas", "Uno que se resuelve de abajo hacia arriba", "Uno que incluye números"),
            correctIndex = 0
        )
    )
}