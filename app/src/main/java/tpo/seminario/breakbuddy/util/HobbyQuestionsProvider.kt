package tpo.seminario.breakbuddy.util


/*Hasta ahora esta (mas o menos): ESTAN PUESTAS EN ESTE ORDEN ESPECIFICO
Basket / Volley / Natación / Cocinar / Repostería / Leer / Fotografía / Pescar / Jardineria / Escuchar música / Canto / Tocar un instrumento musical / Bailar /
Ver películas / Actuar / Aprender idiomas / Carpinteria / Pintar / Cerámica / Corte y confección / Tejer / Marroquineria / Escultura / Bisutería /
Maquillaje profesional / Programar / Videojuegos / Juegos de mesa / Ajedrez / Modelismo / Hacer ejercicio / Trekking / Skate / Escalada / Viajar / Camping /
Meditar / Astronomía / Avistamiento de aves / Adiestramiento de animales / Manicura / Diseño floral / Lepidopterologia / Escribir / Dibujo / Crochet /
Dardos / Manualidades / Creación de contenido / Andar en bicicleta / Armar rompecabezas / Bloggear / Diseño gráfico / Correr / Voluntariado /
Restaurar muebles / Golf / Bordado / Crucigramas / Origami / Poesía / Caligrafia / Vidrieria artistica / Coleccionismo / Ilusionismo / Pilates / Tarot /
Hacer velas / Peluqueria / Decoracion de interiores / Damas / Bonsai / Sudoku / Sopa de letras / Bingo

TERMINADO.
*/

object HobbyQuestionsProvider{
    val hobbyQuizzes: Map<String, List<QuizQuestion>> = mapOf(
        "Basket" to listOf(
            QuizQuestion(
                question = "¿Cuántos jugadores por equipo están en cancha al mismo tiempo en un partido de básquet profesional?",
                options = listOf("5", "6", "7", "4"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo principal en el básquet?",
                options = listOf("Evitar que el otro equipo anote", "Hacer más triples que el rival", "Encestar el balón en el aro más veces que el rival", "Correr más rápido que el otro equipo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuántos puntos vale una canasta desde dentro de la línea de triple?",
                options = listOf("3", "2", "1", "4"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'doble-drible' en básquet?",
                options = listOf("Una jugada ofensiva", "Cuando un jugador dribla, se detiene y vuelve a driblar", "Un tipo de defensa", "Un pase entre dos jugadores"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué jugador es conocido por sus volcadas espectaculares y jugó en los Chicago Bulls?",
                options = listOf("LeBron James", "Michael Jordan", "Stephen Curry", "Shaquille O'Neal"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una asistencia en básquet?",
                options = listOf("Un pase que lleva directamente a una anotación", "Una ayuda defensiva", "Un rebote ofensivo", "Una sustitución de jugador"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuántos segundos tiene un equipo para intentar lanzar al aro una vez que tiene la posesión en FIBA?",
                options = listOf("30 segundos", "24 segundos", "10 segundos", "15 segundos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa hacer una 'falta técnica'?",
                options = listOf("Empujar a un rival", "Cometer una infracción leve durante el juego", "Faltar el respeto al árbitro o conducta antideportiva", "Sacar la pelota del campo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se considera un triple?",
                options = listOf("Una canasta desde la línea de tiro libre", "Una canasta desde fuera de la línea de 3 puntos", "Un tiro fallado", "Un pase cruzado largo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función principal tiene el 'pivot' en el equipo?",
                options = listOf("Defender el perímetro", "Encestar desde fuera", "Jugar cerca del aro, rebotear y anotar", "Organizar el juego desde atrás"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pasa si un jugador comete 5 faltas personales en FIBA?",
                options = listOf("Se le da una advertencia", "Es expulsado del partido", "Se reanudan los tiros libres", "Se detiene el partido para revisión"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre de la liga profesional más reconocida del mundo?",
                options = listOf("NFL", "MLS", "NBA", "ATP"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo no se puede usar para tocar el balón en básquet?",
                options = listOf("La cabeza", "El pie o la pierna intencionalmente", "Los codos", "La cadera"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una 'zona' en defensa?",
                options = listOf("Una táctica ofensiva", "Una defensa donde los jugadores cubren áreas del campo, no marcas individuales", "Un sistema para pasar el balón", "Una forma de sacar lateral"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántos cuartos tiene un partido oficial de básquet?",
                options = listOf("2", "4", "3", "5"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un rebote ofensivo?",
                options = listOf("Recuperar el balón tras un tiro fallado del equipo contrario", "Capturar el balón tras un tiro fallado de tu propio equipo", "Un pase hacia atrás", "Una forma de infracción"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué característica se valora en un base armador?",
                options = listOf("Altura y fuerza", "Velocidad y buena lectura del juego", "Capacidad para bloquear", "Resistencia al salto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué equipo ganó más títulos de NBA históricamente (hasta 2023)?",
                options = listOf("Chicago Bulls", "Golden State Warriors", "Los Angeles Lakers", "Boston Celtics"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué acción representa una falta intencional?",
                options = listOf("Empujar para cortar el ataque", "Driblar demasiado", "Pasar en zona", "Correr sin mirar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué medida tiene una cancha de básquet oficial FIBA?",
                options = listOf("20x10 metros", "30x15 metros", "28x15 metros", "25x12 metros"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una bandeja en básquet?",
                options = listOf("Un tipo de pase largo", "Un tiro en salto con una mano cerca del aro", "Un rebote defensivo", "Una jugada de distracción"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se considera una violación de pasos?",
                options = listOf("Correr con la pelota sin picarla", "Driblar con ambas manos", "Pasar sin mirar", "Rotar mal al defender"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué jugador tiene más títulos de NBA como jugador (hasta 2023)?",
                options = listOf("LeBron James", "Michael Jordan", "Bill Russell", "Kobe Bryant"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué acción se premia con tiros libres?",
                options = listOf("Una buena jugada", "Una falta en el acto de tiro", "Un triple exitoso", "Un pase largo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una pantalla en básquet?",
                options = listOf("Una jugada para cortar el drible", "Un bloqueo legal para liberar a un compañero", "Una falta ofensiva", "Un pase aéreo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa la línea de 3 puntos?",
                options = listOf("Un límite de faltas", "La línea de tiro libre", "Distancia desde la cual un enceste vale 3 puntos", "Límite de cancha"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una jugada de pick and roll?",
                options = listOf("Un tipo de defensa en zona", "Un pase sin mirar", "Una jugada donde un jugador bloquea y luego corta al aro", "Un rebote defensivo mal tomado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe hacer un equipo después de recibir un punto?",
                options = listOf("Llamar tiempo muerto", "Pasar la pelota desde el fondo en 5 segundos", "Sacar desde la mitad de cancha", "Anotar inmediatamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se entiende por triple doble?",
                options = listOf("Tres jugadores anotan diez puntos", "Un jugador logra al menos 10 en tres estadísticas (puntos, rebotes, asistencias, etc.)", "Un jugador hace tres tiros libres consecutivos", "Un pase que vale tres puntos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una finta?",
                options = listOf("Un tipo de pase", "Un amague para desorientar al rival", "Una infracción", "Un triple sin mirar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué rol cumple el alero en la cancha?",
                options = listOf("Organiza el juego", "Rebotea y anota desde media distancia", "Defiende al base", "Realiza los saques laterales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántos árbitros suelen dirigir un partido profesional de básquet?",
                options = listOf("2", "3", "4", "1"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una falta antideportiva?",
                options = listOf("Una infracción accidental", "Una jugada con contacto excesivo y sin intención de jugar el balón", "Un cambio mal hecho", "Un saque mal ejecutado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué equipo ganó los Juegos Olímpicos de básquet masculino en Tokio 2021?",
                options = listOf("Francia", "España", "Estados Unidos", "Argentina"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué sucede si un partido termina empatado en tiempo reglamentario?",
                options = listOf("Se lanza una moneda", "Se juega tiempo extra", "Gana el visitante", "El partido se suspende"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un alley-oop?",
                options = listOf("Un pase largo desde el fondo", "Una jugada donde un jugador lanza y otro encesta en el aire", "Un rebote defensivo rápido", "Una defensa hombre a hombre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué posición suele tener el número 1 en el dorsal en muchos equipos?",
                options = listOf("Pivot", "Alero", "Base armador", "Escolta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué regla limita el tiempo que un jugador puede estar en la llave?",
                options = listOf("Regla de 5 segundos", "Regla de 3 segundos", "Regla del saque rápido", "Regla del paso inicial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una falta ofensiva?",
                options = listOf("Una falta cometida por el defensor", "Una infracción por contacto del jugador que ataca", "Una demora en el pase", "Un grito al árbitro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué país es considerado una potencia histórica en básquet junto con EE.UU.?",
                options = listOf("Brasil", "Francia", "Lituania", "España"),
                correctIndex = 3
            )
        ),


        //********************************************************************************************************************************

        "Volley" to listOf(
            QuizQuestion(
                question = "¿Cuántos jugadores hay en cancha por equipo en un partido de vóley?",
                options = listOf("4", "6", "5", "7"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el jugador especializado en defensa que usa una camiseta diferente?",
                options = listOf("Capitán", "Central", "Libero", "Colocador"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuántos toques puede dar un equipo antes de pasar la pelota al otro lado?",
                options = listOf("2", "3", "4", "5"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué sucede si un jugador toca la red durante una jugada?",
                options = listOf("Nada", "Se cobra punto para el rival", "Se repite el punto", "Se da una advertencia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa un 'bloqueo' en vóley?",
                options = listOf("Un tipo de saque", "Un salto para evitar que el balón pase al campo propio", "Un pase defensivo", "Una pausa entre jugadas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo principal del juego en vóley?",
                options = listOf("Hacer más saques", "Tener mayor posesión", "Hacer que el balón toque el suelo en el campo rival", "Evitar faltas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de saque es el más habitual en vóley profesional?",
                options = listOf("Saque por abajo", "Saque flotado", "Saque con efecto lateral", "Saque en salto"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuándo un equipo gana un set?",
                options = listOf("Al llegar a 15 puntos", "Al llegar a 21 puntos", "Al llegar a 25 puntos con al menos 2 de diferencia", "Cuando el rival se lesiona"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una rotación en vóley?",
                options = listOf("Un pase especial", "Un tipo de defensa", "El cambio de posiciones en sentido horario cuando se recupera el saque", "Una técnica de saque"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué posición se encuentra en la parte frontal y central de la red?",
                options = listOf("Punta", "Central", "Libero", "Armador"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué pasa si un equipo hace 4 toques antes de pasar la pelota?",
                options = listOf("Se permite si hay un bloqueo", "Es falta y punto para el rival", "Se repite el punto", "Solo se cobra si fue intencional"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas acciones NO está permitida en vóley?",
                options = listOf("Pisar la línea al sacar", "Golpear el balón con el pie", "Bloquear un saque", "Pasar el balón con un golpe de antebrazo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo se llama el pase realizado con las yemas de los dedos por encima de la cabeza?",
                options = listOf("Saque", "Recepción", "Toque de dedos", "Remate"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple el colocador o armador?",
                options = listOf("Sacar siempre", "Organizar el ataque del equipo", "Defender en zona", "Liderar el equipo en faltas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántos sets gana un equipo para ganar un partido de vóley?",
                options = listOf("2", "3", "4", "5"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la medida estándar de altura de la red en vóley masculino?",
                options = listOf("2.24 metros", "2.43 metros", "2.50 metros", "2.10 metros"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se considera una falta de rotación?",
                options = listOf("Sacar mal", "Tener un jugador en posición equivocada al momento del saque", "Tocar el balón con el pie", "Fallar un remate"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué equipo masculino ganó la medalla de oro en Tokio 2021 en vóley?",
                options = listOf("Brasil", "Francia", "Italia", "Rusia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué acción se realiza para evitar que el balón toque el suelo tras un remate del rival?",
                options = listOf("Remate", "Toque de dedos", "Recepción o defensa", "Rotación"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se usa comúnmente para hacer una recepción?",
                options = listOf("Rodillas", "Cabeza", "Antebrazos", "Hombros"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué sucede si el balón toca la línea del campo?",
                options = listOf("Se considera fuera", "Se repite el punto", "Se considera dentro", "El árbitro decide"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el rol del jugador punta o atacante externo?",
                options = listOf("Recibir saques y rematar desde la banda", "Solo realizar saques", "Actuar como líbero", "Dirigir al equipo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'ace' en vóley?",
                options = listOf("Un bloqueo efectivo", "Un saque que termina en punto directo", "Una jugada con tres toques", "Un pase alto cruzado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de balón se usa en vóley profesional?",
                options = listOf("Cuero liso sin costuras", "Pelota pesada sin cámara", "Balón liviano con superficie texturizada", "Balón de caucho"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuántos cambios por set puede hacer un equipo en vóley FIVB?",
                options = listOf("6", "12", "8", "10"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué jugador inicia el juego con el saque?",
                options = listOf("El que esté en la posición 1", "El líbero", "El armador", "El central"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pasa si un jugador bloquea y toca el balón pero su equipo luego da 3 toques más?",
                options = listOf("Es falta", "Se permite porque el bloqueo no cuenta como uno de los tres toques", "Es punto para el rival", "Se repite el punto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué país es una potencia histórica en vóley masculino y femenino?",
                options = listOf("Argentina", "Italia", "Brasil", "Canadá"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una infracción común en el toque de dedos?",
                options = listOf("Hacerlo con los pies", "Realizar un pase corto", "Dobles o retención del balón", "Usar solo una mano"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa una jugada de 'pelota libre'?",
                options = listOf("Un pase intencional sin remate", "Una pelota que puede ser rematada sin bloqueo", "Una pelota enviada al otro campo sin fuerza", "Un balón que rebota fuera de la cancha"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo puede usarse legalmente para jugar en vóley?",
                options = listOf("Solo brazos", "Solo manos", "Cualquier parte del cuerpo", "Solo torso y brazos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe hacer un equipo si pierde el punto cuando tenía el saque?",
                options = listOf("Pedir tiempo muerto", "Rotar", "Cambiar de libero", "Nada, sigue igual"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de defensa se utiliza cuando el rival tiene un buen rematador?",
                options = listOf("Defensa por zonas", "Defensa de línea", "Defensa flotada", "Defensa alta"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una jugada típica luego de una buena recepción?",
                options = listOf("Remate", "Toque con la cabeza", "Tiempo muerto", "Cambio de líbero"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué señal realiza el árbitro principal cuando hay un punto?",
                options = listOf("Levanta el puño", "Muestra la palma abierta hacia arriba", "Levanta el brazo extendido del lado del equipo que ganó", "Cruza los brazos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de comunicación es importante entre jugadores?",
                options = listOf("Visual y escrita", "Gritos descoordinados", "Verbal y gestual para coordinar jugadas", "Solo por señas del entrenador"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple el juez de línea?",
                options = listOf("Determina si el balón tocó línea o salió", "Cuenta los puntos", "Lleva estadísticas", "Indica los cambios"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué puede hacer el líbero durante el juego?",
                options = listOf("Sacar y rematar", "Recibir saques y hacer defensa", "Bloquear en la red", "Rotar hacia la zona de ataque"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué pasa si el balón toca el techo?",
                options = listOf("Se repite la jugada", "Punto para el rival", "Solo es válido si cae en campo propio", "Sigue en juego sin interrupción"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la duración de un set en caso de quinto set (tie-break)?",
                options = listOf("25 puntos", "15 puntos con diferencia de 2", "10 puntos fijos", "Hasta que uno saque ventaja de 3"),
                correctIndex = 1
            )
        ),

        //********************************************************************************************************************************

        "Natación" to listOf(
            QuizQuestion(
                question = "¿Cuál es el estilo de natación más rápido en competencias?",
                options = listOf("Pecho", "Mariposa", "Espalda", "Crol"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuántos estilos oficiales hay en la natación competitiva?",
                options = listOf("3", "4", "5", "2"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué nadador ha ganado más medallas olímpicas?",
                options = listOf("Ian Thorpe", "Caeleb Dressel", "Michael Phelps", "Ryan Lochte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la distancia olímpica más corta en natación?",
                options = listOf("50 metros", "100 metros", "25 metros", "200 metros"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué estilo de natación se nada con ambos brazos moviéndose simultáneamente hacia adelante?",
                options = listOf("Crol", "Pecho", "Espalda", "Mariposa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿En qué estilo se nada boca arriba?",
                options = listOf("Pecho", "Espalda", "Crol", "Mariposa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo entra primero en una salida de clavado bien ejecutada?",
                options = listOf("Piernas", "Cabeza", "Brazos", "Hombros"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja de nadar regularmente?",
                options = listOf("Disminuye la flexibilidad", "Aumenta el estrés", "Mejora la salud cardiovascular", "Reduce la capacidad pulmonar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el viraje en natación?",
                options = listOf("Un estilo de nado", "Una forma de respirar", "Una técnica para girar en la pared", "Un tipo de flotación"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'nadador máster'?",
                options = listOf("Nadador profesional", "Entrenador certificado", "Adulto que practica natación", "Nadador olímpico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué músculo principal trabaja la patada de crol?",
                options = listOf("Tríceps", "Abdominales", "Cuádriceps", "Bíceps"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una buena práctica para evitar calambres al nadar?",
                options = listOf("Nadar con ropa ajustada", "Beber agua y estirar", "Evitar respirar", "Nadar en ayunas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la temperatura recomendada para una piscina recreativa?",
                options = listOf("15°C", "21°C", "27°C", "35°C"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un pull buoy?",
                options = listOf("Un tipo de aleta", "Un flotador entre las piernas", "Una tabla de natación", "Un gorro de silicona"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo ayuda a la flotación natural?",
                options = listOf("Pulmones", "Manos", "Pies", "Hombros"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué elemento es obligatorio en piscinas olímpicas?",
                options = listOf("Calefacción", "Luces LED", "Ocho carriles", "Piso móvil"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuántos metros mide una piscina olímpica?",
                options = listOf("25", "100", "50", "33"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿En qué estilo de natación se realiza la brazada más circular?",
                options = listOf("Espalda", "Pecho", "Crol", "Mariposa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué accesorio se usa para entrenar la respiración unilateral?",
                options = listOf("Snorkel", "Gorro", "Paletas", "Aletas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer antes de entrar a nadar?",
                options = listOf("Comer en exceso", "Usar ropa pesada", "Dormir", "Ducharse"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de natación mejora la coordinación y fuerza muscular más intensamente?",
                options = listOf("Pecho", "Espalda", "Crol", "Mariposa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es una señal de fatiga en el agua?",
                options = listOf("Buena técnica", "Respiración calmada", "Movimientos descoordinados", "Mayor velocidad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué nadador argentino ganó medalla de oro olímpica en 1948?",
                options = listOf("Alberto Zorrilla","José Meolans", "Delfina Pignatiello",  "Luis Nicolao"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué estilo de natación es ideal para principiantes?",
                options = listOf("Crol", "Espalda", "Mariposa", "Pecho"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué hacen las aletas en un entrenamiento de natación?",
                options = listOf("Disminuyen la resistencia", "Aumentan la velocidad y fortalecen piernas", "Impiden flotar", "Ayudan a respirar mejor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa nadar 'en negativo' en una competencia?",
                options = listOf("Ir más lento al final", "Cambiar de estilo", "Terminar más rápido que al inicio", "Ganar con penalización"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo requiere una patada de delfín?",
                options = listOf("Crol", "Espalda", "Mariposa", "Pecho"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué accesorio se usa para fortalecer los brazos en natación?",
                options = listOf("Snorkel", "Pull buoy", "Aletas", "Paletas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuántos estilos diferentes se nadan en una prueba de 400 metros combinado individual?",
                options = listOf("3", "5", "4", "2"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué nadador se destacó en aguas abiertas para Argentina?",
                options = listOf("José Meolans", "Cecilia Biagioli", "Delfina Pignatiello", "Federico Grabich"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué músculo se trabaja especialmente en el estilo mariposa?",
                options = listOf("Glúteos", "Dorsales", "Bíceps femorales", "Tríceps"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple la tabla en natación?",
                options = listOf("Flotar la cabeza", "Medir la velocidad", "Ayudar a trabajar piernas", "Reducir el oxígeno"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de natación se practica en el mar o ríos?",
                options = listOf("Aguas abiertas", "Waterpolo", "Sincronizada", "Crol libre"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es lo primero que se debe aprender al nadar?",
                options = listOf("Técnica de mariposa", "Virajes", "Flotación y respiración", "Salidas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una señal de buena técnica en crol?",
                options = listOf("Cabeza fuera del agua todo el tiempo", "Brazada larga y eficiente", "Patada muy amplia", "Respiración cada dos brazadas siempre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos estilos NO se utiliza en la competencia oficial de estilos combinados?",
                options = listOf("Crol", "Espalda", "Pecho", "Sidestroke"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué ayuda a reducir la resistencia al nadar?",
                options = listOf("Movimiento descoordinado", "Postura hidrodinámica", "Respiración forzada", "Nadar con los puños cerrados"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el beneficio principal del snorkel frontal en natación?",
                options = listOf("Mayor velocidad", "Menor trabajo de piernas", "Mejora de la alineación corporal", "Flotar más"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo principal del nado continuo en entrenamiento?",
                options = listOf("Trabajar la fuerza", "Mejorar resistencia aeróbica", "Practicar salidas", "Reducir el tiempo de descanso"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Cocinar" to listOf(
            QuizQuestion(
                question = "¿A qué temperatura hierve el agua al nivel del mar?",
                options = listOf("90 °C", "95 °C", "100 °C", "105 °C"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿De dónde es originario el rissotto?",
                options = listOf("España","Grecia", "Italia", "Francia"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el tzatiki?",
                options = listOf("Una sopa rusa","Una ensalada griega", "Una crema bulgara", "Una salsa húngara"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el ingrediente principal de la sopa borscht?",
                options = listOf("Calabacín","Berenjena", "Cebolla", "Remolacha"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Dónde se origina el kebab?",
                options = listOf("Occidente","Medio Oriente", "Sudamerica", "África"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué condimento es rojo?",
                options = listOf("Paprika","Curry", "Tomillo", "Canela"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes cortes NO es de vaca?",
                options = listOf("Churrasco","Short rib", "Cochinita pibil", "Tomakawk"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes opciones es una verdura?",
                options = listOf("Calabaza","Nabo", "Cilantro", "Choclo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "Es el alimento base de las culturas orientales",
                options = listOf("Arroz","Trigo", "Cereales varios", "Centeno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "El Asado es un método de cocción...",
                options = listOf("Compuesto","En seco", "A las brasas", "Mixto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "Consiste en sumergir los alimentos en materia grasa caliente",
                options = listOf("Sofreír","Saltear", "Bridar", "Freír"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "Se elabora principalmente a partir de huesos de ave",
                options = listOf("Fondo Blanco","Fasolada", "Consomé", "Caldo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes métodos de conserva consiste en sumergir un alimento en sal?",
                options = listOf("Salmuera","Encurtir", "Macerar", "Curar"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "Al cocinar huevos escalfados ¿Qué se le hecha generalmente al agua para facilitar el proceso?",
                options = listOf("Sal","Aceite", "Vinagre", "Pimienta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la actividad acuosa?",
                options = listOf("Es la cantidad de lípidos que se encuentran en un alimento",
                    "Es un alimento con altos contenidos de microorganismos y gérmenes",
                    "Es la cantidad de agua disponible en un alimento", "Es una modificación en el alimento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "De que esta compuesto, clásicamente, el Strogonoff?",
                options = listOf("Carne, setas, papas fritas, crema agria",
                    "Pollo, limon, zanahoria, tomate", "Cerdo, manzanas, crema agridulce", "Pollo, setas, papas españolas"),
                correctIndex = 0
            )
        ),

        //********************************************************************************************************************************


        "Repostería" to listOf(
            QuizQuestion(
                question = "¿Qué ingrediente hace que la masa leve en un bizcocho?",
                options = listOf("Azúcar", "Polvo de hornear", "Sal", "Miel"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué harina se utiliza para hacer pan y masas con mayor gluten?",
                options = listOf("Harina integral", "Harina de repostería", "Harina de fuerza", "Harina de avena"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento se utiliza para medir temperatura en repostería?",
                options = listOf("Cronómetro", "Termómetro de cocina", "Báscula", "Rallador"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de azúcar se usa para glaseados brillantes?",
                options = listOf("Azúcar moreno", "Azúcar glass", "Azúcar granulada", "Panela"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función tiene la mantequilla en una masa quebrada?",
                options = listOf("Endulzar", "Aportar color", "Dar textura hojaldrada", "Fermentar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el punto ideal del merengue?",
                options = listOf("Blanda", "Pico suave", "Pico firme", "Grumosa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para incorporar aire a la masa de bizcocho?",
                options = listOf("Batido", "Reposo", "Cernido", "Horneado"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ingrediente aporta humedad y elasticidad a la masa?",
                options = listOf("Huevos", "Leche", "Aceite", "Todos los anteriores"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para engrasar moldes sin que se pegue?",
                options = listOf("Aceite o mantequilla y harina", "Agua", "Leche", "Azúcar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué temperatura es ideal para calentar el horno al comienzo?",
                options = listOf("120 °C", "180 °C", "230 °C", "300 °C"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se logra al cremar mantequilla y azúcar juntos?",
                options = listOf("Masa seca", "Textura aireada", "Sabor amargo", "Color oscuro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de horno es mejor para hornear pan?",
                options = listOf("Horno de convección", "Microondas", "Horno sin ventilador", "Tostadora"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Para qué sirve cernir la harina?",
                options = listOf("Eliminar humedad", "Apreciar aroma", "Evitar grumos", "Endulzar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ingrediente aporta acidez y puede activar el polvo de hornear?",
                options = listOf("Sal", "Vinagre o limón", "Harina", "Aceite"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué masa se utiliza para hacer croissants?",
                options = listOf("Masa quebrada", "Masa madre", "Masa laminada", "Masa choux"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el punto de bola en caramelo?",
                options = listOf("110 °C", "120 °C", "130 °C", "140 °C"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para evitar que suavicen las galletas en envase cerrado?",
                options = listOf("Agua", "Azúcar", "Sal", "Papel absorbente"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para darle brillo a las tartas?",
                options = listOf("Pintura", "Glaseado con jarabe", "Horneado extra", "Azucarado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué huevo se utiliza para dorar masas?",
                options = listOf("Blanco sin batir", "Clara batida", "Yema con un poco de agua o leche", "Entero sin batir"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el prefermento en panadería?",
                options = listOf("Harina sin uso", "Azúcar añadida", "Aceite aromático", "Masa madre elaborada previamente"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué ingrediente da elasticidad al gluten?",
                options = listOf("Azúcar", "Sal", "Harina integral", "Levadura"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica se utiliza para enfriar rápidamente postres?",
                options = listOf("Horneado prolongado", "Baño maría en hielo", "Refrigeración a temperatura ambiente", "Congelación directa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se usa para decorar con precisión cremas y glaseados?",
                options = listOf("Espátula", "Cuchara grande", "Manga pastelera", "Brocha"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la masa choux?",
                options = listOf("Base para pizzas", "Masa ligera para profiteroles y eclairs", "Masa de pan normal", "Masa de hojaldre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función del baño María en repostería?",
                options = listOf("Agregar sabor", "Hidratar masa", "Cocción suave y uniforme", "Dorar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se puede usar para aromatizar bizcochos?",
                options = listOf("Canela, vainilla o ralladura de cítricos", "Sal marina", "Aceite de oliva", "Café negro"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el glaseado real?",
                options = listOf("Chocolate derretido", "Azúcar glas con clara de huevo", "Mantequilla con azúcar", "Crema de leche"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el pan dulce navideño italiano?",
                options = listOf("Panettone", "Stollen", "Brioche", "Rugelach"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ingrediente se puede sustituir por huevo en recetas veganas?",
                options = listOf("Miel", "Plátano o puré de manzana", "Yogur", "Queso crema"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué harina no contiene gluten?",
                options = listOf("Trigo integral", "Almendras", "Harina leudante", "Centeno"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para mantener una tarta uniforme al cortar capas?",
                options = listOf("Cortar con cuchillo serrado", "Congelar ligeramente y cortar con hilo", "Usar manos", "Hornear más"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué decoración es tradicional en cupcakes?",
                options = listOf("Chocolate líquido", "Buttercream con manga pastelera", "Azúcar glass espolvoreada", "Gelatina"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el punto de bola dura en caramelo?",
                options = listOf("116 °C", "121 °C", "132 °C", "149 °C"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se añade a la levadura para activarla?",
                options = listOf("Agua tibia y azúcar", "Aceite y sal", "Mantequilla derretida", "Huevo batido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué receta utiliza harina, agua y sal, y se deja fermentar?",
                options = listOf("Masa quebrada", "Masa choux", "Masa de galletas", "Masa madre para pan"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué producto se logra al fermentar leche y azúcar en horno suave?",
                options = listOf("Bizcocho", "Yogur casero", "Mermelada", "Pan dulce"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se logra una corteza crujiente en panes?",
                options = listOf("Poner mantequilla encima", "Hornear sin calor", "Añadir azúcar", "Hornear con vapor"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué receta clásica francesa lleva mantequilla y almendras caramelizadas?",
                options = listOf("Éclair", "Tarta Tatin", "Croissant", "Quiche"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento es importante para medir peso en repostería?",
                options = listOf("Tazas y cucharas", "Cronómetro", "Termómetro", "Báscula digital"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué sabor aporta la frescura a una tarta de limón?",
                options = listOf("Chocolate", "Canela", "Café", "Merengue y ralladura de limón"),
                correctIndex = 3
            )
        ),


        //********************************************************************************************************************************

        "Leer" to listOf(
            QuizQuestion(
                question = "¿Cuál es considerado el libro más leído del mundo?",
                options = listOf("Don Quijote", "La Biblia", "El Principito", "1984"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Quien es el creador del Realismo Mágico?",
                options = listOf("Vicente García-Huidobro", "Nicanor Parra", "Ernesto Sábato", "Gabriel García Márquez"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos escritores latinoamericanos NO ganó el Nobel?",
                options = listOf("Jorge Luis Borges", "Mario Vargas Llosa", "Octavio Paz", "Miguel Ángel Asturias"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Quién es el autor de El Quijote de la Mancha?",
                options = listOf("Patrick Süskind", "Miguel de Cervantes", "Marcela Paz", "Antonio Machado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "La Divina comedia fue escrita a finales de...",
                options = listOf("Renacimiento", "Barroco","La Edad Media", "Neoclásico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿A que época pertenece William Shakespeare?",
                options = listOf("Contemporánea", "Edad Media","Antigua", "Renacimiento"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "Es considerado uno de los padres de la Ciencia Ficción",
                options = listOf("Isaac Asimov", "Ray Bradbury","Aldous Huxley", "Julio Verne"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "Autor de Frankenstein",
                options = listOf("Jane Austen", "Mary Shelley","Charles Dickens", "Edgar Allan Poe"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de obra es 'El extranjero'?",
                options = listOf("Vanguardista", "Existencialista","Ciencia Ficción", "Psicológica"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántas reglas o mandamientos crearon los cerdos en la novela 'Rebelión en la granja'?",
                options = listOf("5", "6","7", "9"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes novelas es psicológica?",
                options = listOf("Un Mundo Feliz", "Rebelión en la Granja","Crimen y Castigo", "Todas las anteriores"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Como se llama el personaje principar de 'Metamorfosis'?",
                options = listOf("Gregorio Samsa", "Gretha Samsa","Ana", "Rodrigo Somsa"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes obras NO fue escrita por Ray Bradbury?",
                options = listOf("Un Marciano Entre Nosotros", "Fahrenheit 451","Crónicas Marcianas", "El Extranjero"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Como se llama el antagonista principal de 'El Resplandor'?",
                options = listOf("Johnny Carson", "Jack Torrance","Dick Hallorann", "Delbert Grady"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Quien es el culpable del asesinato de las dos mujeres en 'Los Asesinatos de la Calle Morgue'?",
                options = listOf("Un marinero", "Un carnicero","Un orangután de Borneo", "El vecino de ambas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿A qué se dedican los bomberos en la novela 'Fahrenheit 451'?",
                options = listOf("Hacer casas", "Quemar aparatos electrónicos","Quemar libros", "Apagar incendios"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "Escribió la Odisea y la Ilíada",
                options = listOf("Homero","Eurípides", "Virgilio", "Esopo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "Famosa novela de Alejandro Dumas",
                options = listOf("El Fantasma de la Ópera","Ana Karenina", "El Conde de Montecristo", "Rayuela"),
                correctIndex = 2
            )
        ),

        //********************************************************************************************************************************

        "Fotografía" to listOf(
            QuizQuestion(
                question = "¿Qué significa la sigla ISO en fotografía?",
                options = listOf("International Shutter Organization", "Image Stabilization Output", "International Organization for Standardization", "Internal Sensor Operation"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué controla el diafragma en una cámara?",
                options = listOf("La velocidad de obturación", "La sensibilidad ISO", "La profundidad de campo", "El enfoque automático"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del inventor del daguerrotipo?",
                options = listOf("Louis Daguerre", "George Eastman", "Ansel Adams", "Henri Cartier-Bresson"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué hace una velocidad de obturación lenta?",
                options = listOf("Congela el movimiento", "Oscurece la imagen", "Captura más luz y puede causar desenfoque por movimiento", "Aumenta el ISO automáticamente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué representa el valor f/ en un objetivo?",
                options = listOf("La longitud del sensor", "El tamaño de la apertura", "El número de píxeles", "La velocidad de enfoque"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos NO es un formato de archivo fotográfico?",
                options = listOf("RAW", "JPEG", "PNG", "MP3"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de lente es ideal para retratos?",
                options = listOf("Gran angular", "Teleobjetivo largo", "50mm o similar", "Ojo de pez"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa la 'regla de los tercios'?",
                options = listOf("Dividir la imagen en tres colores", "Usar un trípode cada tres tomas", "Dividir la imagen en una cuadrícula 3x3 para componer mejor", "Tomar tres fotos por cada escena"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el balance de blancos?",
                options = listOf("Una herramienta para estabilizar la cámara", "Un ajuste para corregir el color según la luz", "El control de contraste de una foto", "Una función del modo blanco y negro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué fotógrafo es famoso por sus paisajes en blanco y negro del Parque Yosemite?",
                options = listOf("Ansel Adams", "Steve McCurry", "Sebastião Salgado", "Diane Arbus"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué cámara utiliza película de formato medio?",
                options = listOf("Canon Rebel T7", "Fujifilm GFX 100", "Nikon D3500", "Sony Alpha A7 III"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa bokeh?",
                options = listOf("Un tipo de filtro", "Desenfoque artístico del fondo", "Estabilizador de imagen", "Modo de disparo nocturno"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué lente es mejor para fotografía de arquitectura?",
                options = listOf("Teleobjetivo", "Gran angular", "50mm", "Lente macro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál fue la primera cámara digital comercial?",
                options = listOf("Canon EOS 5D", "Nikon F3", "Kodak DCS 100", "Sony Alpha 100"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa DSLR?",
                options = listOf("Digital Single Lens Reflex", "Dual Sensor Lens Recording", "Digital Standard Lens Ratio", "Direct Scene Light Reflection"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de fotografía se centra en productos para publicidad?",
                options = listOf("Documental", "De retrato", "De arquitectura", "Fotografía comercial"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué parámetro afecta directamente el 'ruido digital' en una foto?",
                options = listOf("Velocidad de obturación", "Longitud focal", "ISO", "Tamaño del sensor"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué fotógrafo es célebre por su trabajo en National Geographic con retratos como la 'niña afgana'?",
                options = listOf("Annie Leibovitz", "Steve McCurry", "Robert Capa", "Helmut Newton"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué cámara es conocida por usar carretes tipo Polaroid instantáneo?",
                options = listOf("Canon EOS R", "Sony A7R", "Instax Mini", "Fujifilm X100V"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento NO forma parte del triángulo de exposición?",
                options = listOf("ISO", "Diafragma", "Velocidad de obturación", "Zoom"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué hace una lente macro?",
                options = listOf("Amplía el ángulo de visión", "Permite enfocar objetos muy pequeños de cerca", "Desenfoca todo menos el fondo", "Corrige colores automáticamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'chimping' en fotografía?",
                options = listOf("Usar filtros vintage", "Revisar constantemente las fotos en la pantalla", "Disparar en ráfaga", "Enfocar manualmente sin mirar el visor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de sensor es más común en cámaras profesionales?",
                options = listOf("APS-C", "Micro Cuatro Tercios", "Full Frame", "Compacto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué fotógrafo fue pionero del surrealismo en fotografía?",
                options = listOf("Man Ray", "Walker Evans", "Garry Winogrand", "Richard Avedon"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué función ayuda a estabilizar la imagen al disparar sin trípode?",
                options = listOf("Balance de blancos", "Autoenfoque", "Estabilización de imagen", "Temporizador"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un histograma en fotografía digital?",
                options = listOf("Un gráfico de colores vivos", "Una tabla de exposición correcta",
                    "Una representación gráfica de la distribución de luz en la imagen", "Un modo de enfoque automático"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué formato guarda más información en una imagen digital?",
                options = listOf("JPEG", "RAW", "PNG", "GIF"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la distancia focal de una lente?",
                options = listOf("La distancia entre la lente y el sujeto", "La distancia desde la lente al sensor cuando está enfocado",
                    "La longitud del lente físicamente", "La velocidad de enfoque automático"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué cámara popularizó el uso del carrete de 35 mm?",
                options = listOf("Canon AE-1", "Nikon F2", "Leica I", "Olympus OM-1"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué programa es más utilizado para edición profesional de fotos?",
                options = listOf("Illustrator", "Premiere Pro", "Excel", "Photoshop"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué lente tiene un ángulo de visión muy estrecho?",
                options = listOf("Gran angular", "Teleobjetivo", "Fisheye", "24mm"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la principal ventaja de disparar en modo manual?",
                options = listOf("Mejor calidad del color", "Control total sobre la exposición", "Disparo más rápido", "Mejor enfoque automático"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una cámara mirrorless?",
                options = listOf("Una cámara sin pantalla", "Una cámara compacta sin batería", "Una cámara solo para video", "Una cámara sin espejo interno"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito del filtro polarizador?",
                options = listOf("Incrementar el brillo", "Corregir enfoque", "Reducir reflejos y saturar colores", "Evitar desenfoque de movimiento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas marcas es conocida por cámaras instantáneas?",
                options = listOf("Sony", "Panasonic", "Pentax", "Polaroid"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de fotografía se centra en contar una historia real?",
                options = listOf("Moda", "Publicitaria", "Documental", "Conceptual"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué fotógrafo es considerado uno de los fundadores del fotoperiodismo moderno?",
                options = listOf("Henri Cartier-Bresson", "Dorothea Lange", "Robert Frank", "James Nachtwey"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta permite corregir líneas convergentes en arquitectura?",
                options = listOf("Curva de tonos", "Corrección de lente", "Perspectiva vertical", "Filtro degradado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una toma en 'larga exposición'?",
                options = listOf("Una foto con el obturador abierto durante más tiempo","Una foto sin luz artificial", "Una foto que usa ISO bajo",  "Una foto con zoom automático"),
                correctIndex = 0
            )
        ),


        //********************************************************************************************************************************


        "Pescar" to listOf(
            QuizQuestion(
                question = "¿Cuál es el mejor momento del día para pescar?",
                options = listOf("Mediodía", "Noche cerrada", "Amanecer o atardecer", "Medio de la tarde"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de anzuelo se usa comúnmente para captura y liberación?",
                options = listOf("Anzuelo triple", "Anzuelo de púas", "Anzuelo circular", "Anzuelo de cebo vivo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de pesca se realiza sin caña, usando solo línea, anzuelo y cebo?",
                options = listOf("Pesca con mosca", "Pesca de red", "Pesca a mano", "Pesca de línea de mano"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es una de las especies más buscadas en pesca deportiva en agua salada?",
                options = listOf("Trucha", "Dorado", "Salmón", "Atún"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué equipo se usa para lanzar el anzuelo al agua?",
                options = listOf("Red", "Carrete", "Señuelo", "Plomada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica el término 'catch and release'?",
                options = listOf("Pescar solo con carnada viva", "Capturar y conservar el pez", "Capturar y liberar el pez", "Pescar con red sin caña"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes peces se encuentra comúnmente en ríos de agua dulce?",
                options = listOf("Tiburón", "Dorado", "Trucha arcoíris", "Mero"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un señuelo artificial?",
                options = listOf("Un tipo de cebo natural", "Una red decorada", "Un objeto diseñado para imitar presas", "Un hilo de pescar reforzado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de la caña ayuda a mantener el hilo tenso?",
                options = listOf("Puntera", "Empuñadura", "Portacarrete", "Guías"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para medir la talla de un pez?",
                options = listOf("Balanza", "Cinta métrica", "Termómetro", "Brújula"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de pesca utiliza insectos artificiales flotantes?",
                options = listOf("Pesca de fondo", "Pesca con red", "Pesca con mosca", "Pesca a curricán"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de la caña sostiene el carrete?",
                options = listOf("Anillas", "Pomo", "Portacarrete", "Mango"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué especie se encuentra típicamente en agua salada?",
                options = listOf("Carpa", "Trucha", "Lubina", "Atún"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe el peso que se coloca en la línea para hundir el cebo?",
                options = listOf("Boya", "Plomada", "Cucharilla", "Anzuelo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función de una boya o flotador?",
                options = listOf("Aumentar la tensión de la línea", "Hundir el cebo", "Indicar una mordida", "Medir profundidad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe hacerse antes de comenzar a pescar en un área nueva?",
                options = listOf("Hablar con otros pescadores", "Conseguir una licencia si es necesario", "Ir directamente al agua", "Usar red sin caña"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas opciones es un pez de agua dulce?",
                options = listOf("Salmón", "Marlín", "Tiburón", "Mero"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe la pesca desde una embarcación en movimiento?",
                options = listOf("Pesca con mosca", "Pesca en orilla", "Pesca de fondo", "Pesca a curricán"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué parte del equipo se desgasta más rápidamente al pescar peces grandes?",
                options = listOf("Anzuelo", "Carrete", "Línea", "Caña"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una señal clara de que un pez ha mordido el anzuelo?",
                options = listOf("Movimiento de la boya", "Disminución del viento", "Olor a cebo", "Color del agua"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una caña telescópica?",
                options = listOf("Una caña con visor", "Una caña para fotografía submarina", "Una caña que se pliega o retrae para facilitar el transporte", "Una caña con imán para atrapar peces metálicos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué carnada natural se usa comúnmente para peces carnívoros?",
                options = listOf("Pan", "Lombrices", "Maíz", "Arroz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de línea es más resistente para pesca en el mar?",
                options = listOf("Monofilamento", "Fluorocarbono", "Seda", "Trenzada"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué condición climática puede hacer que los peces estén menos activos?",
                options = listOf("Lluvia ligera", "Día nublado", "Presión barométrica alta", "Amanecer"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pez es famoso por su fuerza durante la pesca deportiva?",
                options = listOf("Tiburón", "Marlín azul", "Mojarra", "Trucha"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el leader en pesca?",
                options = listOf("Un tipo de anzuelo", "Un accesorio para la caña", "Un tramo reforzado de línea que va antes del anzuelo", "Un tipo de carnada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para sacar el anzuelo de la boca del pez?",
                options = listOf("Tijeras", "Pinzas", "Gancho", "Aguja"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de un aparejo (rig)?",
                options = listOf("Medir peces", "Organizar herramientas", "Conjunto de elementos que se atan al final de la línea", "Sujetar la caña al suelo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pez se encuentra típicamente en lagos?",
                options = listOf("Dorado", "Róbalo", "Salmón del Atlántico", "Carpa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es la pesca de fondo?",
                options = listOf("Pescar con red desde el fondo del bote", "Usar cebos flotantes", "Colocar el cebo cerca del lecho del agua", "Pescar en la orilla"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de señuelo imita a un pez herido?",
                options = listOf("Cucharilla giratoria", "Mosca seca", "Pez de goma vibrador", "Popper"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué factor es más importante al elegir el grosor de la línea?",
                options = listOf("Color del agua", "Tamaño del carrete", , "Hora del día","Tamaño del pez objetivo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica para lanzar más lejos con caña y carrete?",
                options = listOf("Usar una caña más corta", "No usar plomada", "Usar fuerza sin técnica", "Dominar el movimiento del brazo y el momento del lanzamiento"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el 'spinning' en pesca?",
                options = listOf("Una forma de preparar el pescado", "Un tipo de anzuelo", "Una técnica con carrete giratorio", "Una red giratoria"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una marea baja?",
                options = listOf("Cuando el agua se encuentra en su punto más bajo", "Cuando hay mucha corriente", "Cuando llueve", "Cuando el pez no pica"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pez tiene espinas venenosas y habita en agua salada?",
                options = listOf("Raya", "Pez león", "Bacalao", "Salmón rosado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta portátil ayuda a ubicar peces bajo el agua?",
                options = listOf("GPS", "Termómetro digital", "Sonar o ecosonda", "Linterna LED"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa que una especie esté vedada?",
                options = listOf("Que su captura está prohibida temporalmente","Que es peligrosa", "Que solo se puede pescar de noche", "Que se encuentra en alta mar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué cebo se usa comúnmente para peces carnívoros en agua salada?",
                options = listOf("Sardinas", "Lombrices de tierra", "Pan", "Semillas"),
                correctIndex = 0
            )
        ),

        //********************************************************************************************************************************


        "Jardinería" to listOf(
            QuizQuestion(
                question = "¿En que época del año es ideal comenzar con las tareas de suelo y huerta?",
                options = listOf("Otoño", "Primavera", "Verano", "Invierno"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "Una forma de identificar la necesidad de la planta es mediante:",
                options = listOf("Color de la tierra", "Olor de las hojas", "Color de las hojas", "Temperatura de la planta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿De que depende cuanto y cuando regar?",
                options = listOf("Las dimensiones de mi huerta y cantidad de plantas", "El clima y la tierra", "La tierra y la cantidad de plantas", "El color de las plantas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es sembrar?",
                options = listOf("Sacar los vegetales de la tierra", "Marcar el contorno de los canteros", "Poner las semillas en la tierra para que germinen","Regar la tierra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "Las plantas, vegetales y frutos necesitan:",
                options = listOf("Oxígeno", "Nutrientes", "Sol","Todas las anteriores"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Que es el humus?",
                options = listOf("Tierra negra comprada", "Compost maduro producido por lombrices", "Material  inerte","Restos vegetales de la cocina"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuando florece el jacaranda?",
                options = listOf("Invierno-primavera", "Primavera-verano", "Otoño-invierno","primavera-otoño"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes opciones corresponde a el nombre científico de la flor más conocida como ´Nomeolvides´?",
                options = listOf("Oxalis", "Myosotis", "Lavandula angustifolia","Bellis perennis"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes trepadoras tiene espinas?",
                options = listOf("Jazmin", "Bignonia", "Buganvilla","Parra virgen"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "La lagunaria patersonii: ",
                options = listOf("Es caduca", "Tiene floración distinta según especie", "Tiene semillas que pican","No aguanta el viento salino"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es aromática? ",
                options = listOf("Nerium oleander", "Strelitzia reginae", "Viola tricolor","Salvia rosmarinus"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "Herramienta que sirve para agujerear una manguera para despues colocar un gotero: ",
                options = listOf("Sacabocados", "Metebocados", "Sacamordiscos","Azada"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "El pasto es una... ",
                options = listOf("Planta arbustiba", "Planta anual", "Graminea","Planta caducifolia"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "Una planta que se reproduce por tallo subterraneo, se reproduce por...",
                options = listOf("Semilla", "Estaquilla", "Rizoma","Estolón"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes opciones aporta aireación al sustrato?",
                options = listOf("Perlita", "Turba rubia", "Humus","Turba negra"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Donde se genera el polen?",
                options = listOf("En el caliz", "En las anteras", "En la flor","En el estigma"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "Esta planta repele a los mosquitos:",
                options = listOf("Cactus", "Mosquitera", "Planta carnivora","Citronela"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "Respecto a la siembra en bandeja de semillero ¿Cuál seria el orden correcto de pasos?",
                options = listOf("Preparar el terreno - Sembrar - Cubrir", "Preparar el terreno - Sembrar - Regar - Cubrir", "Preparar el terreno - Sembrar - Cubrir - Regar","Preparar el terreno - Regar - Sembrar - Cubrir"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "Técnica por la que se protege el suelo del jardin de la perdida de humedad y aparición de malas hierbas: ",
                options = listOf("Alcorques", "Mulching", "Plantas tapizantes","Herbicida"),
                correctIndex = 1
            )
        ),

        //********************************************************************************************************************************

        "Escuchar música" to listOf(
            QuizQuestion(
                question = "¿Cuál de las siguientes bandas NO es argentina?",
                options = listOf("Catupecu Machu", "Los Piojos", "No Te Va Gustar", "Divididos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo se llama el guitarrista principal de 'Queen'?",
                options = listOf("Freddie Mercury", "John Deacon", "Roger Taylor", "Brian May"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "La zamba, la chacarera, el chamamé son parte de la...",
                options = listOf("Música clásica", "Música folclórica", "Música abstracta", "Música espiritual"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿De dónde son 'Little Mix'?",
                options = listOf("Francia", "Estados Unidos", "Inglaterra", "Alemania"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿De qué género musical eran los beatles?",
                options = listOf("Pop", "Clásico", "Balada", "Cumbia"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas canciones es de 'Metallica'?",
                options = listOf("Fear The Voices", "Conquer Or Die", "The Call Of Ktulu", "Electric Funeral"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "'Shake the Disease' es una canción de la banda:",
                options = listOf("Pink Floyd", "The Smiths", "Led Zeppelin", "Depeche Mode"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿En que año se formaron los 'Red Hot Chili Peppers'?",
                options = listOf("1990", "1983", "1987", "1986"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "Considerada la 'Reina del Pop':",
                options = listOf("Britney Spears", "Madonna", "Lady Gaga", "Taylor Swift"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Quién es el vocalista de Guns N' Roses?",
                options = listOf("Brian Johnson", "Slash", "Axl Rose", "Steven Adler"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "Felipe Barrozo fue guitarrista en:",
                options = listOf("Intoxicados", "Los Fabulosos Cadillacs", "La Renga", "Los Auténticos Decadentes"),
                correctIndex =0
            ),
            QuizQuestion(
                question = "¿Cuál fue la primera canción de Britney Spears?",
                options = listOf("Toxic", "...Baby One More Time", "Oops!...I Did It Again", "Outrageous"),
                correctIndex =1
            ),
            QuizQuestion(
                question = "¿Cuál de estos géneros musicales se originó en Jamaica?",
                options = listOf("Reggaetón", "Jazz", "Rock", "Reggae"),
                correctIndex =3
            ),
            QuizQuestion(
                question = "¿Qué banda británica lanzó el álbum 'The Masterplan' en 1998?",
                options = listOf("The Cure", "Oasis", "The Police", "Radiohead"),
                correctIndex =1
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre real de la cantante conocida como Lady Gaga?",
                options = listOf("Katy Hudson", "Robyn Fenty", "Stefani Germanotta", "Alecia Moore"),
                correctIndex =2
            ),
            QuizQuestion(
                question = "¿Quién canta la canción 'Shape of You'?",
                options = listOf("Sam Smith", " Shawn Mendes", "Harry Styles", "Ed Sheeran"),
                correctIndex =3
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes no es un género musical?",
                options = listOf("House", "Trap", "Grunge", "Torta"),
                correctIndex =3
            ),
            QuizQuestion(
                question = "¿Qué cantante lanzó el álbum '25' en 2015?",
                options = listOf("Beyoncé", "Adele ","Rihanna", "Taylor Swift"),
                correctIndex =1
            ),
            QuizQuestion(
                question = "¿Cuál de estos artistas NO es parte del género reguetón?",
                options = listOf("Bad Bunny", "J Balvin","Daddy Yankee", "Ed Sheeran"),
                correctIndex =3
            ),
            QuizQuestion(
                question = "¿Qué banda es conocida por la canción 'Bohemian Rhapsody'?",
                options = listOf("Queen", "Nirvana","Coldplay", "Metallica"),
                correctIndex =0
            ),
            QuizQuestion(
                question = "¿Qué cantante se hizo famoso con el éxito 'Blinding Lights'?",
                options = listOf("Post Malone", "The Weeknd","Drake", "Justin Bieber"),
                correctIndex =1
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del festival de música más grande de Estados Unidos?",
                options = listOf("Tomorrowland", "Lollapalooza","Coachella", "Glastonbury"),
                correctIndex =2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes músicos no forma parte del 'Club de los 27'?",
                options = listOf("Taylor Hawkins","Brian Jones", "Janis Joplin","Jim Morrison"),
                correctIndex =0
            ),
            QuizQuestion(
                question = "¿Qué banda fue liderada por Kurt Cobain?",
                options = listOf("Pearl Jam","Nirvana", "Foo Fighters","Green Day"),
                correctIndex =1
            ),
            QuizQuestion(
                question = "¿Qué cantante latina es conocida por el éxito 'Hips Don’t Lie'?",
                options = listOf("Thalía","Rosalía", "Shakira","Paulina Rubio"),
                correctIndex =2
            ),
            QuizQuestion(
                question = "¿Cuál de estos géneros musicales suele caracterizarse por improvisación instrumental?",
                options = listOf("Jazz","Pop", "Reguetón","Country"),
                correctIndex =0
            ),
            QuizQuestion(
                question = "¿Cuál fue el primer videoclip transmitido por MTV en 1981?",
                options = listOf("Thriller – Michael Jackson","Like a Virgin – Madonna",
                    "Billie Jean – Michael Jackson","Video Killed the Radio Star – The Buggles"),
                correctIndex =3
            ),
            QuizQuestion(
                question = "¿Qué grupo tiene una canción llamada “Yellow”?",
                options = listOf("Imagine Dragons","Coldplay", "Maroon 5","U2"),
                correctIndex =1
            ),
            QuizQuestion(
                question = "¿Quién es el autor de la canción “Imagine”?",
                options = listOf("Elton John","Freddie Mercury", "John Lennon","Bob Dylan"),
                correctIndex =2
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del álbum debut de Billie Eilish?",
                options = listOf("Happier Than Ever","When We All Fall Asleep, Where Do We Go?", "Don’t Smile at Me","Ocean Eyes"),
                correctIndex =1
            ),
            QuizQuestion(
                question = "¿Qué país es el origen del grupo ABBA?",
                options = listOf("Alemania","Noruega", "Dinamarca","Suecia"),
                correctIndex =3
            ),
            QuizQuestion(
                question = "¿Qué artista popularizó el baile del 'moonwalk'?",
                options = listOf("Michael Jackson","Chris Brown", "Prince","Usher"),
                correctIndex =0
            ),
            QuizQuestion(
                question = "¿Qué cantante es conocido por su alter ego “Slim Shady”?",
                options = listOf("Machine Gun Kelly","Eminem", "Post Malone","Lil Wayne"),
                correctIndex =1
            ),
            QuizQuestion(
                question = "¿Quién canta la canción 'As It Was' (2022)?",
                options = listOf("Shawn Mendes","Charlie Puth", "Harry Styles","Troye Sivan"),
                correctIndex =2
            ),
            QuizQuestion(
                question = "¿Cuál de estos géneros se caracteriza por bases electrónicas y letras repetitivas?",
                options = listOf("House","Rock", "Soul","Blues"),
                correctIndex =0
            ),
            QuizQuestion(
                question = "¿Qué cantante fue integrante de Destiny’s Child antes de su carrera en solitario?",
                options = listOf("Alicia Keys","Beyoncé", "Nicki Minaj","Ciara"),
                correctIndex =1
            )
        ),


        //********************************************************************************************************************************


        "Canto" to listOf(
            QuizQuestion(
                question = "¿Qué es el diafragma en el canto?",
                options = listOf("Un músculo para respirar profundamente", "Una parte del oído", "Un tipo de voz", "Un instrumento musical"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es la función principal del calentamiento vocal?",
                options = listOf("Hidratar la garganta", "Preparar la voz para evitar lesiones", "Mejorar la afinación automáticamente", "Aumentar el volumen"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué término describe la altura de un sonido?",
                options = listOf("Timbre", "Volumen", "Tono o pitch", "Duración"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la resonancia en el canto?",
                options = listOf("La eco en un cuarto vacío", "El reforzamiento del sonido mediante cavidades del cuerpo", "Un tipo de vibrato", "Una nota muy alta"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica para mejorar la proyección de la voz?",
                options = listOf("Cantar susurrando", "Hablar en voz baja", "Usar la respiración diafragmática", "Evitar abrir la boca"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el vibrato?",
                options = listOf("Un tipo de falsete", "Una oscilación natural y controlada del tono al cantar", "Un error común", "Una canción tradicional"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos NO es un tipo de voz clásica?",
                options = listOf("Soprano", "Tenor", "Barítono", "Contrabajo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'falsete' en canto?",
                options = listOf("Una técnica de respiración", "Voz muy grave", "Una voz más aguda y ligera que la voz natural masculina", "Una nota muy larga"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ayuda a mantener la voz sana para cantar?",
                options = listOf("Gritar frecuentemente", "Hidratarse y evitar forzar la voz", "Fumar para calentar la garganta", "Cantar sin calentar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el rango vocal?",
                options = listOf("El número de canciones que sabes", "El conjunto de notas que puedes cantar cómodamente", "La duración de una canción", "La velocidad al cantar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué instrumento se usa comúnmente para afinar la voz?",
                options = listOf("Piano", "Timbal", "Guitarra eléctrica", "Batería"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'solfeo'?",
                options = listOf("Una técnica de respiración", "La práctica de leer y cantar notas musicales", "Un género musical", "Un tipo de micrófono"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'timbre' de la voz?",
                options = listOf("El volumen", "La duración de la nota", "La velocidad del canto", "El color o calidad del sonido vocal"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es un ejercicio común para mejorar la dicción al cantar?",
                options = listOf("Cantar con la boca cerrada", "Susurrar canciones", "Leer trabalenguas en voz alta", "Evitar hablar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la 'respiración diafragmática'?",
                options = listOf("Respirar sólo con el pecho", "Respirar usando el diafragma para mayor control y apoyo vocal", "No respirar mientras cantas", "Respirar rápido y superficialmente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué género musical se caracteriza por improvisación vocal sobre una base musical?",
                options = listOf("Pop", "Rock", "Country", "Jazz"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué cantante es famoso por su técnica de falsete?",
                options = listOf("Freddie Mercury", "Adele", "Elvis Presley", "Michael Jackson"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'entonar' en canto?",
                options = listOf("Cantar con ritmo acelerado", "Cantar con la nota correcta", "Hablar en voz alta", "Cantar en grupo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una causa común de fatiga vocal en cantantes?",
                options = listOf("Beber agua frecuentemente", "Cantar sin calentar ni descansar la voz", "Dormir bien", "Calentar antes de cantar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'melisma'?",
                options = listOf("Cantar una sola nota", "Un tipo de respiración", "Cantar varias notas sobre una sola sílaba", "Un estilo de baile"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un micrófono dinámico?",
                options = listOf("Un micrófono robusto ideal para escenarios","Un micrófono sensible para estudios",  "Un instrumento musical", "Una técnica vocal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'afinar' la voz?",
                options = listOf("Aumentar el volumen", "Cantar más rápido", "Cambiar de género musical", "Cantar en la altura correcta de la nota"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es la 'nota fundamental' en música?",
                options = listOf("La nota más baja de una canción", "La nota más alta posible", "Una nota inventada", "La nota base sobre la que se construye una melodía"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es un beneficio de cantar en grupo (coros)?",
                options = listOf("No se necesita afinar", "No se usa respiración", "Mejorar la coordinación y afinación grupal", "Se canta en silencio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una escala musical?",
                options = listOf("Un conjunto ordenado de notas musicales", "Una canción popular", "Un tipo de micrófono", "Un ejercicio de respiración"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un género musical que requiere mucha potencia vocal?",
                options = listOf("Opera", "Folk", "Balada", "Pop suave"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se usa para amplificar la voz naturalmente?",
                options = listOf("Pulmones", "Cavidades de resonancia (boca, nariz, pecho)", "Manos", "Piernas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'afinación relativa'?",
                options = listOf("Ajustar notas con referencia a otra nota", "Cantar en voz baja", "No usar micrófono", "Cantar con vibrato"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ejercicio ayuda a mejorar la respiración para cantar?",
                options = listOf("Correr rápido", "Sostener la respiración", "Respiración profunda con conteo lento", "Cantar sin respirar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué cantante es conocido por su gran rango vocal?",
                options = listOf("Whitney Houston", "Bob Dylan", "Frank Sinatra", "Ed Sheeran"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la técnica de 'belting' en canto?",
                options = listOf("Cantar susurrando", "Cantar notas altas con potencia y voz de pecho", "Un tipo de respiración", "Una técnica de relajación"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un solista?",
                options = listOf("Un cantante que canta en grupo", "Un cantante que interpreta solo una canción", "Un cantante que interpreta una parte vocal principal", "Un bailarín"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la importancia del 'tempo' en el canto?",
                options = listOf("Determina el ritmo y velocidad de la canción", "Solo afecta la letra", "No es importante", "Solo es para bailarines"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la foniatría?",
                options = listOf("El estudio de la voz y su salud", "Un tipo de música", "Un instrumento de viento", "Una técnica de respiración"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una canción a capela?",
                options = listOf("Cantar con instrumentos de fondo", "Cantar sin acompañamiento musical", "Un tipo de danza", "Una canción rápida"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es un problema común en cantantes principiantes?",
                options = listOf("Saber leer música", "Forzar la voz y fatiga vocal", "Cantar demasiado suave", "Hablar en voz alta"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer tras una sesión intensa de canto?",
                options = listOf("Beber alcohol", "Hidratarse y descansar la voz", "Gritar para liberar tensión", "No hablar nunca"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Tocar un instrumento musical" to listOf(
            QuizQuestion(
                question = "¿Qué es la digitación en la música?",
                options = listOf("El ritmo de la canción", "La posición y movimiento de los dedos para tocar un instrumento", "La afinación de las notas", "El tipo de instrumento"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función del metrónomo?",
                options = listOf("Medir la duración de una nota","Afinar el instrumento", "Marcar un tempo constante para practicar", "Cambiar el volumen"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa tocar una nota 'pianissimo' (pp)?",
                options = listOf("Tocar muy fuerte", "Tocar rápido", "Tocar lentamente","Tocar muy suave"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica común para afinar una guitarra?",
                options = listOf("Golpear las cuerdas", "Comparar notas con un afinador electrónico", "Doblar las cuerdas", "Usar solo el oído sin referencia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte de un instrumento de cuerda vibra para producir sonido?",
                options = listOf("El cuerpo", "Las cuerdas", "El mástil", "La clavija"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un acorde?",
                options = listOf("Una nota larga", "Una melodía rápida", "Un grupo de tres o más notas tocadas simultáneamente","Un silencio prolongado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una escala musical?",
                options = listOf("Un conjunto ordenado de notas musicales", "Una canción popular", "Un tipo de instrumento", "Una técnica para respirar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué instrumento pertenece a la familia de viento madera?",
                options = listOf("Trompeta", "Trombón", "Batería", "Flauta"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la función de un atril en la interpretación musical?",
                options = listOf("Apoyar el instrumento", "Amplificar el sonido", "Afinar el instrumento", "Sostener la partitura para leer mientras se toca"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para tocar el violín con el arco?",
                options = listOf("Pizzicato", "Glissando", "Arco", "Vibrato"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué instrumento musical se toca principalmente con teclas?",
                options = listOf( "Piano","Trombón", "Guitarra", "Bajo eléctrico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un compás en música?",
                options = listOf("La duración de una nota", "El nombre de una canción", "Una escala musical", "Una división del tiempo en grupos de pulsos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'legato' en música?",
                options = listOf("Tocar notas suavemente y conectadas","Tocar notas separadas y cortadas","Tocar muy rápido", "Tocar con mucho volumen"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué instrumento se considera de percusión?",
                options = listOf("Clarinete", "Violín", "Batería", "Saxofón"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del piano se presiona para producir sonido?",
                options = listOf("Cuerdas", "Cuerdas y teclas", "Teclas", "Pedales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'afinación'?",
                options = listOf("La velocidad de una pieza", "El ajuste de las notas para que suenen correctamente", "La duración de la música", "La técnica para respirar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué instrumento usa un arco para tocar las cuerdas?",
                options = listOf("Guitarra eléctrica", "Violín", "Piano", "Saxofón"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'pizzicato' en los instrumentos de cuerda?",
                options = listOf("Tocar las cuerdas con los dedos","Tocar con arco",  "Usar un pedal", "Una técnica de respiración"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué familia instrumental incluye el trombón y la trompeta?",
                options = listOf("Viento madera", "Percusión", "Viento metal", "Cuerda frotada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe el espacio donde se colocan las partituras?",
                options = listOf("Atril", "Podio", "Pupitre", "Caja de resonancia"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa tocar 'staccato'?",
                options = listOf("Notas largas y sostenidas", "Tocar sin parar", "Tocar muy suave", "Notas cortas y separadas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué instrumento de cuerda tiene cuatro cuerdas y se toca con arco?",
                options = listOf("Guitarra", "Arpa", "Violín", "Piano"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de la guitarra se utiliza para cambiar la altura de las notas?",
                options = listOf("Cuerdas", "Trastes", "Cuerpo", "Puente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función de los pedales en un piano?",
                options = listOf("Cambiar la afinación", "Cambiar el volumen", "Modificar la duración o resonancia del sonido", "Afinar las cuerdas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'arpegio'?",
                options = listOf("Tocar las notas de un acorde una tras otra", "Un tipo de ritmo", "Una técnica de respiración", "Un instrumento musical"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del instrumento que tiene teclas y cuerdas percutidas?",
                options = listOf("Violín", "Piano", "Guitarra", "Flauta"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'tempo' en música?",
                options = listOf("El volumen de la música", "El número de instrumentos","La velocidad de una pieza musical", "El tono de la voz"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una 'octava'?",
                options = listOf("El intervalo entre una nota y otra con el doble o la mitad de frecuencia", "Una nota grave", "Una nota aguda", "Un tipo de instrumento"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué instrumento se toca soplando aire y presionando teclas o válvulas?",
                options = listOf("Violín", "Saxofón", "Guitarra", "Piano"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica una 'pausa' en una partitura?",
                options = listOf("Cantar más fuerte", "Cambiar de tono", "Cambiar de instrumento", "Un silencio o interrupción en la música"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del músculo fundamental para controlar la respiración al tocar un instrumento?",
                options = listOf("Diafragma", "Bíceps", "Cuádriceps", "Trapecio"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué instrumento se toca principalmente con las manos, golpeando superficies?",
                options = listOf("Batería", "Guitarra", "Flauta", "Piano"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la 'notación musical'?",
                options = listOf("El nombre de un instrumento", "Un tipo de canción", "La representación gráfica de sonidos y ritmos", "Un género musical"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué instrumento musical tiene teclas blancas y negras?",
                options = listOf("Saxofón", "Piano", "Batería", "Violín"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la 'armonía' en música?",
                options = listOf("La melodía principal", "El ritmo de una canción", "La combinación simultánea de notas para crear acordes", "La letra de una canción"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué instrumento musical tiene un mástil y trastes?",
                options = listOf("Violín", "Piano", "Trompeta", "Guitarra"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa tocar 'forte' (f)?",
                options = listOf("Tocar suavemente", "Tocar lento", "Tocar rápido", "Tocar con fuerza o volumen alto"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué parte del instrumento produce el sonido?",
                options = listOf("La caja de resonancia", "El estuche", "El soporte", "El atril"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué instrumento de viento metal tiene pistones o válvulas?",
                options = listOf("Flauta", "Trompeta", "Saxofón", "Clarinete"),
                correctIndex = 1
            )
        ),

        //********************************************************************************************************************************

        "Bailar" to listOf(
            QuizQuestion(
                question = "¿Cuál es el estilo de baile que se originó en Argentina?",
                options = listOf("Salsa", "Tango", "Hip hop", "Flamenco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué instrumento marca el compás principal en el flamenco?",
                options = listOf("Guitarra", "Violín", "Piano", "Didgeridoo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué estilo de baile suele incluir 'breakdance' y 'popping'?",
                options = listOf("Ballet", "Samba", "Jazz", "Street/Hip hop"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿En qué país se originó la danza del ballet clásico?",
                options = listOf("Brasil", "Rusia/Francia", "Japón", "Estados Unidos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué baile popular se asocia con Cuba?",
                options = listOf("Merengue", "Tango", "Flamenco", "Salsa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es un paso fundamental del ballet?",
                options = listOf("Moonwalk",  "Shimmy","Plié", "Turfing"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de calzado usan los bailarines de ballet para puntas?",
                options = listOf("Zapatillas planas", "Puntas", "Botas de cuero", "Sandalias"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué baile combina zapateo y humillación?",
                options = listOf("Tap", "Breakdance", "Jazz", "Samba"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué baile tradicional se practica en Brasil durante el Carnaval?",
                options = listOf("Tango", "Samba", "Flamenco", "Merengue"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento es importante para el núcleo en la danza contemporánea?",
                options = listOf("Música rápida", "Control del core", "Vestuario brillante", "Coreografía fija"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo de baile es originario de Nueva Orleans en EE.UU.?",
                options = listOf("Tap dance", "Flamenco", "Bolero", "Polka"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué baile español utiliza castañuelas?",
                options = listOf("Salsa", "Flamenco", "Tango", "Merengue"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué coreografía popular fue reinventada por Michael Jackson?",
                options = listOf("Charleston", "Salsa paso doble", "Ballet clásico", "Moonwalk"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es un estilo de pareja de baile de salón?",
                options = listOf("Breakdance", "Swing", "Krumping", "Capoeira"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica es fundamental en el ballet para mantener equilibrio?",
                options = listOf("Glissade", "Twerking", "Pointe", "Shuffle"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿En qué país se originó el baile 'capeo'?",
                options = listOf("Cuba", "Brasil", "Argentina", "España"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué estilo combina jazz, funk y hip hop relajado?",
                options = listOf("Ballet", "Tap","Urban jazz", "Contemporary"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué baile latino se caracteriza por movimientos rápidos de cadera?",
                options = listOf("Merengue", "Salsa", "Tango", "Twerk"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una forma de danza tradicional de origen exótico de Medio Oriente?",
                options = listOf("Ballet", "Belly dance", "Salsa", "Flamenco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo de danza enfatiza la improvisación y la conexión emocional?",
                options = listOf("Ballet clásico", "Step", "Polka", "Contemporary"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué baile folklórico mexicano implica un 'twirl' con falda amplia?",
                options = listOf("Jarabe tapatío", "Zapateado", "Mariachi", "Cumbia"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de swing nace en Los Ángeles y París en los años 80?",
                options = listOf("Balboa", "Lindy Hop", "West Coast Swing", "East Coast Swing"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo de baile se presenta en la ópera y eventos formales?",
                options = listOf("Tap dance", "Waltz", "Hip‑hop", "Tango argentino"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué baile se considera bailado 'a contratiempo' y se originó en Jamaica?",
                options = listOf("Breakdance", "Salsa", "Reggae/dancehall", "Flamenco"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo combina danza clásica y moderna con música variada?",
                options = listOf("Contemporary jazz", "Tap", "Krumping", "Polka"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué género se asocia con Broadway y musicales?",
                options = listOf("Samba", "Jazz musical", "Merengue", "Bollywood"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué baile utiliza movimientos percusivos con los pies?",
                options = listOf("Tap", "Tango", "Salsa", "Breakdance"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué estilo puso en escena la 'donna' de Chicago y Nueva York?",
                options = listOf("Disco", "Tap", "Ballet", "Hip‑hop"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué estilo sudamericano busca la improvisación en pareja y nace en Buenos Aires?",
                options = listOf("Cumbia", "Tango argentino", "Samba", "Capoeira"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo de danza tiene movimientos de 'isolations' y líneas angulares?",
                options = listOf("Jazz funk", "Ballet", "Salsa", "Waltz"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué danza folklórica argentina se baila con boleadoras?",
                options = listOf("Chacarera", "Malambo", "Zamba", "Cueca"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo de baile exige 'flexibilidad y extensión' y surgió en el siglo XX?",
                options = listOf("Breakdance", "Tap", "Contemporary ballet", "Merengue"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de baile se basa en el contacto corporal improvisado en pareja?",
                options = listOf("Tango salón", "Viennese Waltz", "Salsa", "Step"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué elemento es esencial en el jazz musical teatral?",
                options = listOf("Zapatillas planas", "Puntas", "Botas altas", "Tacones"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué estilo de baile boliviano se caracteriza por faldas amplias y sombrero?",
                options = listOf("Tango", "Carnavalito", "Cholitas dance", "Bachata"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué baile tradicional irlandés se destaca por patadas rápidas y postura rígida?",
                options = listOf("Polka", "Riverdance/Irish dance", "Flamenco", "Jazz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo de baile urbano se originó en el Bronx en los 70?",
                options = listOf("Ballet", "Tango", "Waltz", "Hip‑hop"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué baile latino se originó en República Dominicana?",
                options = listOf("Cumbia", "Merengue", "Samba", "Tango"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué estilo se centra la danza clásica con influencia moderna?",
                options = listOf("Ballet clásico", "Contemporary ballet", "Tap", "Hip‑hop"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de baile social se practica en salones con música rápida y movimientos de calle?",
                options = listOf("Bachata", "Salsa", "Swing", "Flamenco"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué baile de película famosa tiene escena de 'silla' entre Patrick Swayze y Jennifer Grey?",
                options = listOf("Dirty Dancing", "Footloose", "Grease", "Saturday Night Fever"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué baile bollywoodense es típico en cine de la India?",
                options = listOf("Bhangra", "Kathak", "Bollywood dance", "Merengue"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo de danza prohibido en competiciones, pero usado en música urbana y cultura de club?",
                options = listOf("Tango", "Twerking", "Waltz", "Merengue"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo de baile incorpora movimientos rápidos de cabeza y brazos en frontal?",
                options = listOf("Popping", "Ballet", "Tap", "Waltz"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué técnica de jazz se conoce por 'isolations' y líneas fuertes?",
                options = listOf("Tap", "Jazz funk", "Ballet", "Salsa"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Ver películas" to listOf(
            QuizQuestion(
                question = "¿Qué película ganó el Oscar a Mejor Película en 1994?",
                options = listOf("Pulp Fiction", "El Rey León", "Cadena Perpetua", "Forrest Gump"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Quién dirigió la trilogía de 'El Señor de los Anillos'?",
                options = listOf("Steven Spielberg", "Peter Jackson", "Christopher Nolan", "James Cameron"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué película aparece el personaje Darth Vader?",
                options = listOf("Matrix", "Blade Runner", "Alien", "Star Wars"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué actor interpretó al Joker en 'The Dark Knight' (2008)?",
                options = listOf("Joaquin Phoenix", "Jack Nicholson", "Jared Leto", "Heath Ledger"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la película más taquillera de la historia (sin ajustar por inflación)?",
                options = listOf("Titanic", "Avengers: Endgame", "Avatar", "Jurassic World"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué película animada fue la primera en ser nominada al Oscar a Mejor Película?",
                options = listOf("Toy Story", "Shrek", "La Bella y la Bestia", "Up"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Quién protagonizó la película 'Misión: Imposible'?",
                options = listOf("Matt Damon", "Tom Cruise", "Brad Pitt", "Keanu Reeves"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas películas fue dirigida por Quentin Tarantino?",
                options = listOf("Inception", "Pulp Fiction", "El Club de la Pelea", "Gladiador"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué género se asocia comúnmente con películas como 'El Conjuro' o 'It'?",
                options = listOf("Comedia", "Suspenso", "Drama", "Horror"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿En qué década se estrenó la primera película sonora?",
                options = listOf("1930s", "1920s", "1910s", "1940s"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película está ambientada en Pandora, un planeta alienígena?",
                options = listOf("Avatar","Guardians of the Galaxy", "Dune", "Star Wars: Rogue One"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Quién ganó el Oscar a Mejor Actriz por 'La La Land'?",
                options = listOf("Emma Stone", "Natalie Portman", "Jennifer Lawrence", "Scarlett Johansson"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué película incluye la famosa frase: 'I'm gonna make him an offer he can't refuse'?",
                options = listOf("Goodfellas", "Scarface", "The Godfather", "The Irishman"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué director es conocido por películas como 'Inception' y 'Interstellar'?",
                options = listOf("Christopher Nolan", "James Cameron", "Ridley Scott", "Denis Villeneuve"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué actor protagonizó la saga de 'John Wick'?",
                options = listOf("Liam Neeson", "Keanu Reeves", "Tom Hardy", "Hugh Jackman"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película animada es sobre un chef que es una rata?",
                options = listOf("Zootopia", "Ratatouille", "Sing", "Bolt"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película ganó el Oscar a Mejor Película en 2020?",
                options = listOf("Joker", "1917", "Ford v Ferrari", "Parasite"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Quién interpretó a Iron Man en el Universo Cinematográfico de Marvel?",
                options = listOf("Chris Evans", "Robert Downey Jr.", "Mark Ruffalo", "Chris Hemsworth"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película cuenta la historia de un náufrago y una pelota llamada Wilson?",
                options = listOf("The Martian", "Life of Pi", "Náufrago", "Into the Wild"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Quién dirigió 'Titanic' y 'Avatar'?",
                options = listOf("James Cameron", "Steven Spielberg", "Ron Howard", "Peter Jackson"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del personaje principal en 'Matrix'?",
                options = listOf("Neo", "Morpheus", "Trinity", "Smith"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué película es famosa por la frase 'Here's Johnny'?",
                options = listOf("The Shining", "Psycho", "Misery", "It"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué película de Pixar trata sobre emociones en la mente de una niña?",
                options = listOf("Coco", "Up", "Inside Out", "Soul"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas películas fue dirigida por Guillermo del Toro?",
                options = listOf("El Laberinto del Fauno", "Roma", "Birdman", "Amores Perros"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Quién interpreta a Jack en 'Titanic'?",
                options = listOf("Matt Damon", "Leonardo DiCaprio", "Ben Affleck", "Johnny Depp"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué actor interpreta a Deadpool?",
                options = listOf("Chris Pratt", "Ryan Gosling", "Ryan Reynolds", "Tom Hiddleston"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué saga cinematográfica incluye casas como Gryffindor y Slytherin?",
                options = listOf("Game of Thrones", "Harry Potter", "Narnia", "Percy Jackson"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del payaso en la película 'It'?",
                options = listOf("Bozo", "Pennywise", "Joker", "Twisty"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película está basada en la vida de Freddie Mercury?",
                options = listOf("Rocketman", "Elvis", "The Doors", "Bohemian Rhapsody"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué película se desarrolla casi totalmente en una sala de jurado?",
                options = listOf("Doce Hombres en Pugna", "El Padrino", "El Secreto de Sus Ojos", "La Lista de Schindler"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos personajes es parte del universo de Studio Ghibli?",
                options = listOf("Sonic", "Totoro", "Elsa", "Po"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película argentina ganó el Oscar a Mejor Película Extranjera en 1985?",
                options = listOf("Relatos Salvajes", "El Secreto de Sus Ojos", "La Historia Oficial", "Nueve Reinas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué director es conocido por películas con giros inesperados como 'Sexto Sentido'?",
                options = listOf("David Fincher", "M. Night Shyamalan", "Jordan Peele", "Martin Scorsese"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película es una sátira sobre la Segunda Guerra Mundial con un niño y Hitler imaginario?",
                options = listOf("La Vida es Bella", "The Pianist", "El Niño con el Pijama de Rayas", "Jojo Rabbit"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué película musical cuenta con la canción 'This Is Me'?",
                options = listOf("Frozen", "The Greatest Showman", "La La Land", "Mamma Mia!"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película está basada en la novela de Stephen King sobre una prisión?",
                options = listOf("Carrie", "Misery", "Cadena Perpetua", "Doctor Sleep"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos personajes no es parte del universo Marvel?",
                options = listOf("Black Panther", "Wonder Woman", "Doctor Strange", "Thor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué película de Christopher Nolan trata sobre sueños dentro de sueños?",
                options = listOf("Tenet", "Dunkerque", "El Origen", "Memento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué película presenta a un robot llamado WALL·E?",
                options = listOf("Big Hero 6", "Robots", "Astro Boy", "WALL·E"),
                correctIndex = 3
            )
        ),


        //********************************************************************************************************************************


        "Actuar" to listOf(
            QuizQuestion(
                question = "¿Cuál es la técnica de actuación desarrollada por Konstantín Stanislavski?",
                options = listOf("Método Meisner", "Actuación representacional", "Sistema Stanislavski", "Improvisación teatral"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'análisis de texto' en actuación?",
                options = listOf("Leer el guion rápidamente", "Estudiar el guion para comprender el personaje y contexto", "Inventar líneas nuevas", "Ignorar el texto y solo actuar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa hacer 'improvisación' en teatro?",
                options = listOf("Seguir estrictamente el guion", "Actuar sin guion ni preparación previa", "Solo repetir líneas de otros", "Ensayar durante semanas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'monólogo'?",
                options = listOf("Una escena con muchos personajes", "Un diálogo entre dos actores", "Un tipo de vestuario", "Un discurso largo de un solo personaje"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo es fundamental para la proyección vocal?",
                options = listOf("Rodillas", "Manos", "Ojos", "Diafragma"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es la 'memoria afectiva' en actuación?",
                options = listOf("Recordar hechos históricos", "Evocar emociones personales para interpretar un personaje", "Recordar líneas de memoria", "Aprender movimientos de baile"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Quién es considerado el padre del teatro moderno?",
                options = listOf("William Shakespeare", "Anton Chéjov", "Bertolt Brecht", "Konstantín Stanislavski"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'romper la cuarta pared' en teatro?",
                options = listOf("Usar máscaras", "Dirigirse directamente al público", "Salir del escenario", "Hablar en voz baja"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo principal del actor durante una escena?",
                options = listOf("Ganar premios", "Transmitir la verdad del personaje al público", "Improvisar constantemente", "Leer el guion en voz alta"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'ensayo general'?",
                options = listOf("Primer ensayo sin vestuario", "Un descanso entre escenas", "Un ensayo para principiantes", "Ensayo final con vestuario y técnica completa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es la 'expresión corporal' en actuación?",
                options = listOf("Solo movimientos de manos", "Uso del cuerpo para comunicar emociones y mensajes", "Solo expresiones faciales", "Uso de vestuario"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'casting'?",
                options = listOf("Una prueba para seleccionar actores para un papel", "Una función de teatro", "Un tipo de actuación", "Una técnica vocal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para controlar los nervios antes de actuar?",
                options = listOf("Ignorarlos", "Respiración profunda y ejercicios de relajación", "Beber mucho café", "Hablar rápido"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la 'motivación del personaje'?",
                options = listOf("El motivo por el que el actor eligió el papel", "Un movimiento de baile", "Razón interna que impulsa las acciones del personaje", "Una técnica vocal"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'subtexto' en una actuación?",
                options = listOf("Lo que dice literalmente el personaje", "El significado o intención detrás de las palabras", "Un texto secundario", "Un error en el guion"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la 'puesta en escena'?",
                options = listOf("Solo el vestuario", "La lista de actores", "El guion final", "La organización y dirección visual de una obra teatral"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es la 'distribución de tiempo' en una actuación?",
                options = listOf("Cuando termina la obra", "La cadencia y ritmo con que el actor entrega sus líneas", "Una pausa para el público", "Un tipo de ensayos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué instrumento es fundamental para el calentamiento vocal?",
                options = listOf("Micrófono", "Guitarra","Ejercicios de respiración y vocalización", "Altavoz"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función de un director teatral?",
                options = listOf("Escribir el guion", "Coordinar y guiar a actores y técnicos para la puesta en escena", "Diseñar vestuario", "Organizar las entradas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'soliloquio'?",
                options = listOf("Un diálogo entre dos personajes", "Un discurso en voz alta de un personaje solo en escena", "Una escena de lucha", "Un monólogo cómico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'presencia escénica'?",
                options = listOf("Tamaño del escenario", "Número de líneas", "Cantidad de vestuario", "Capacidad de un actor para atraer y mantener la atención del público"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el 'tempo' en la actuación?",
                options = listOf("Velocidad y ritmo del diálogo y movimiento", "El vestuario del personaje", "Un tipo de guion", "Un movimiento de cámara"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'callback' en casting?",
                options = listOf("Una segunda ronda de audiciones para elegir actores finales", "Un error durante la audición", "Una parte del guion", "Un saludo del director"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una 'tabla de ensayos'?",
                options = listOf("Una herramienta para organizar fechas y escenas de ensayo", "Una mesa para pintar", "Un tipo de vestuario", "Un guion impreso"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'acto' en teatro?",
                options = listOf("Una escena", "Una división principal dentro de una obra teatral", "Una pausa", "Un tipo de personaje"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'guion técnico'?",
                options = listOf("Guion con instrucciones para luces, sonido y escena", "Guion original de la obra", "Una novela", "Un tipo de papel especial"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la 'mímica' en actuación?",
                options = listOf("Actuar solo con gestos y sin palabras", "Un género musical", "Un tipo de danza", "El uso de voz alta"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'quitarse el personaje' al finalizar la actuación?",
                options = listOf("Olvidar las líneas", "Dejar atrás las emociones y actitud del personaje para regresar a la propia identidad", "Salir del escenario", "Improvisar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la 'intonación' en la actuación?",
                options = listOf("La velocidad del diálogo", "La variación de tono y expresión en la voz", "El tipo de vestuario", "El escenario"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'dramaturgo'?",
                options = listOf("El director de escena", "El actor principal", "El escritor del guion teatral", "El productor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'blocking' o marcación en teatro?",
                options = listOf("Diseño del vestuario", "La decoración del escenario", "La iluminación", "Planificación y movimiento de los actores en escena"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'tener química' entre actores?",
                options = listOf("Que tengan el mismo vestuario", "Buena conexión y naturalidad en sus interacciones", "Que canten juntos", "Que compartan texto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'repertorio' para un actor?",
                options = listOf("Conjunto de obras o personajes que puede interpretar", "Un tipo de vestuario", "Una técnica de voz", "Un ensayo rápido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'plantón' en teatro?",
                options = listOf("Una falla técnica", "Cuando un actor no se presenta a la función o ensayo", "Un tipo de movimiento", "Un accesorio"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la 'puesta en voz'?",
                options = listOf("El maquillaje para la voz", "El vestuario vocal", "El entrenamiento para hablar claro y con buena proyección", "El guion hablado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la 'empatía' en actuación?",
                options = listOf("Sentir y comprender las emociones del personaje", "Actuar rápido", "Leer el guion sin emoción", "Improvisar diálogos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la 'doble función' en teatro?",
                options = listOf("Actuar y dirigir al mismo tiempo", "Un actor interpreta más de un papel en la misma obra", "Improvisar dos escenas", "Cambiar el guion"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la 'catarsis' en el teatro?",
                options = listOf("La emoción purificadora que experimenta el público", "Un tipo de vestuario", "Un ensayo", "Un error en escena"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'subtexto' en un diálogo?",
                options = listOf("Lo que está escrito literalmente", "El significado oculto o intención detrás de las palabras", "Un tipo de guion", "Una escena cómica"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la 'improvisación guiada'?",
                options = listOf("Actuar sin reglas ni objetivos", "Improvisar con ciertas pautas o límites", "Leer el guion sin cambios", "Una técnica de baile"),
                correctIndex = 1
            )
        ),



        //********************************************************************************************************************************


        "Aprender idiomas" to listOf(
            QuizQuestion(
                question = "¿Cuál de los siguientes métodos implica aprender un idioma a través de la inmersión total?",
                options = listOf("Traducción literal", "Memorización de listas", "Método natural", "Gramática tradicional"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'falso amigo' en el aprendizaje de idiomas?",
                options = listOf("Una palabra que suena igual en otro idioma pero tiene distinto significado", "Una palabra mal escrita", "Un sinónimo exacto", "Una palabra que no existe"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica efectiva para memorizar vocabulario?",
                options = listOf("Leer sin repetir", "Estudiar una vez por semana", "Usar tarjetas tipo flashcards", "Evitar repasar palabras conocidas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué aplicación es popular para aprender idiomas con ejercicios gamificados?",
                options = listOf("Notion", "Duolingo", "Grammarly", "Slack"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'intercambio de idiomas'?",
                options = listOf("Una aplicación de traducción", "Un curso intensivo", "Una conversación entre personas que enseñan mutuamente sus idiomas", "Un diccionario especializado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la ventaja de ver series en el idioma que estás aprendiendo?",
                options = listOf("Ayuda a conocer actores", "Mejora la pronunciación y comprensión auditiva", "Aumenta la velocidad de lectura", "Es más fácil que estudiar gramática"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del lenguaje se enfoca en la estructura de las oraciones?",
                options = listOf("Fonética", "Morfología", "Semántica", "Sintaxis"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué idioma tiene más hablantes nativos en el mundo?",
                options = listOf("Español", "Inglés", "Árabe", "Chino mandarín"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el 'input comprensible'?",
                options = listOf("Información solo en tu idioma nativo", "Contenido apenas más difícil que tu nivel actual", "Traducciones literales", "Hablar sin escuchar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una habilidad pasiva al aprender idiomas?",
                options = listOf("Escuchar","Hablar", "Escribir", "Repetir frases"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una lengua romance?",
                options = listOf("Idioma hablado en novelas románticas", "Idioma derivado del latín", "Idioma exclusivo de Europa", "Idioma con reglas simples"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es un alfabeto diferente al latino?",
                options = listOf("Francés", "Alemán", "Portugués", "Cirílico"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué idioma se escribe de derecha a izquierda?",
                options = listOf("Italiano", "Ruso", "Árabe", "Español"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'fluidez' en un idioma?",
                options = listOf("No cometer errores gramaticales", "Hablar como un nativo", "Poder comunicarte con facilidad sin muchas pausas", "Tener acento perfecto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un cognado verdadero?",
                options = listOf("Hospital - Hospital","Library - Librería", "Actual - Actual",  "Embarrassed - Embarazada"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer al cometer errores en otro idioma?",
                options = listOf("Evitar hablar", "Estudiar menos", "Memorizar frases completas", "Verlos como parte del aprendizaje"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el 'shadowing'?",
                options = listOf("Leer en voz baja", "Imitar en voz alta a un hablante nativo mientras lo escuchas", "Subrayar textos", "Traducir en silencio"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta es útil para mejorar la pronunciación?",
                options = listOf("Grammarly", "Google Sheets", "Forvo", "Wikipedia"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la mejor manera de adquirir un acento nativo?",
                options = listOf("Leer libros técnicos", "Memorizar listas", "Evitar ver televisión", "Escuchar e imitar hablantes nativos constantemente"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué idioma es considerado aislado, sin relación clara con otros?",
                options = listOf("Japonés", "Euskera (vasco)", "Finés", "Turco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'bilingüe'?",
                options = listOf("Saber decir frases básicas", "Entender canciones en otro idioma", "Hablar con fluidez dos idiomas", "Haber viajado a dos países"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del idioma estudia el significado de las palabras?",
                options = listOf("Semántica", "Fonética", "Ortografía", "Sintaxis"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es un ejemplo de interlengua?",
                options = listOf("El idioma esperanto", "Un error común al mezclar estructuras de dos idiomas", "Lenguaje formal", "Un dialecto de Francia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una razón común para aprender idiomas?",
                options = listOf("Evitar estudiar", "Ver series con subtítulos", "Viajar y conectar con otras culturas", "Cambiar de nombre"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una desventaja del uso excesivo de traducción literal?",
                options = listOf("Aumenta vocabulario", "Mejora la ortografía", "Facilita la pronunciación", "Puede generar errores de significado"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué aplicación permite hablar con nativos en otros idiomas?",
                options = listOf("Excel", "Tandem", "Photoshop", "Notion"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una forma activa de practicar un idioma?",
                options = listOf("Escuchar música", "Ver películas con subtítulos", "Hablar o escribir", "Leer sin diccionario"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una lengua tonal?",
                options = listOf("Usa tonos musicales para comunicar diferentes significados", "Tiene acento neutro", "Carece de vocales", "Solo se usa en canciones"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué idioma es oficial en más de 50 países?",
                options = listOf("Chino", "Francés", "Inglés", "Alemán"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué habilidad mejora con la lectura en otro idioma?",
                options = listOf("Pronunciación solamente", "Gramática, vocabulario y comprensión", "Solo escritura", "Memoria a corto plazo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué idioma usa caracteres kanji?",
                options = listOf("Coreano", "Hindi", "Japonés", "Tailandés"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el CEFR?",
                options = listOf("Un marco europeo para niveles de idioma","Un examen de inglés", "Una clasificación de idiomas muertos",  "Un diccionario bilingüe"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el nivel más alto según el CEFR?",
                options = listOf("A1", "B2", "C1", "C2"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué idioma es conocido por tener declinaciones complejas?",
                options = listOf("Español", "Inglés", "Ruso", "Italiano"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes no es un idioma germánico?",
                options = listOf("Inglés", "Alemán", "Sueco", "Griego"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué idioma se habla en Brasil?",
                options = listOf("Español", "Portugués", "Francés", "Inglés"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para mantener un idioma aprendido?",
                options = listOf("Evitar usarlo hasta olvidarlo", "Practicarlo regularmente", "Estudiarlo solo una vez al mes", "Solo leerlo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un dialecto?",
                options = listOf("Un idioma inventado", "Una versión regional de un idioma", "Un lenguaje de signos", "Una jerga juvenil"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué idioma tiene más palabras en su vocabulario según muchos diccionarios?",
                options = listOf("Chino", "Alemán", "Inglés", "Ruso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué idioma se considera aglutinante (forma palabras uniendo muchas partes)?",
                options = listOf("Inglés", "Turco", "Francés", "Italiano"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Carpintería" to listOf(
            QuizQuestion(
                question = "¿Qué herramienta se usa comúnmente para medir ángulos en carpintería?",
                options = listOf("Taladro", "Formón", "Escuadra", "Serrucho"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el tipo de madera más blanda?",
                options = listOf("Roble", "Pino", "Nogal", "Caoba"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para alisar superficies de madera?",
                options = listOf("Serrucho", "Lima", "Gubia", "Cepillo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estas herramientas es eléctrica?",
                options = listOf("Formón", "Garlopa", "Lijadora", "Serrucho japonés"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una espiga en carpintería?",
                options = listOf("Tipo de barniz", "Parte de una sierra", "Uniones macho-hembra", "Madera tratada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de unión es más resistente?",
                options = listOf("Clavada", "Pegada", "Ensambles de cola de milano", "Atornillada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para proteger la madera de la humedad?",
                options = listOf("Lija", "Cera", "Barniz", "Laca"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función principal del formón?",
                options = listOf("Lijar madera", "Medir ángulos", "Cortar clavos", "Cortar y tallar madera"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de madera es mejor para exteriores?",
                options = listOf("MDF", "Pino", "Cedro", "Contrachapado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de pintar una pieza de madera?",
                options = listOf("Lijar la superficie", "Mojarla", "Barnizarla", "Clavarla"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una ingletadora?",
                options = listOf("Lijadora eléctrica", "Sierra para cortes angulados", "Tipo de clavo", "Adhesivo de madera"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento no es un tipo de lija?",
                options = listOf("Grano 80", "Grano 220", "Grano 600", "Grano 5"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa MDF?",
                options = listOf("Madera de Frondosas", "Material Duro de Fábrica", "Medium Density Fiberboard", "Madera Deformada y Frágil"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas maderas es dura?",
                options = listOf("Pino", "Roble", "Abeto", "Álamo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para hacer agujeros?",
                options = listOf("Sargento", "Taladro", "Garlopa", "Cepillo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué adhesivo es más fuerte para unir madera?",
                options = listOf("Silicona", "Cola blanca", "Cinta adhesiva", "Pegamento epóxico"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta permite sujetar piezas de madera mientras se trabaja?",
                options = listOf("Cepillo", "Taladro", "Sargento", "Escuadra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se consigue al biselar una tabla?",
                options = listOf("Reducir su grosor", "Cortar un borde en ángulo", "Hacerla más ancha", "Redondear su superficie"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta es adecuada para cortar curvas en madera?",
                options = listOf("Sierra de cinta", "Cepillo", "Formón", "Sargento"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué hace una gubia?",
                options = listOf("Lijar madera", "Perforar", "Tallado en relieve", "Cepillar superficies"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de unión se forma encajando dos piezas en un ángulo de 90°?",
                options = listOf("Media madera", "Cola de milano", "Cola recta", "Inglete"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito del sellador de madera?",
                options = listOf("Pegar piezas", "Tapar poros", "Pintar", "Eliminar barniz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa contrachapado?",
                options = listOf("Madera de baja calidad", "Madera compuesta por capas", "Madera con pegamento", "Madera para interiores"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para trazar líneas rectas sobre madera?",
                options = listOf("Sargento", "Formón", "Regla o escuadra", "Taladro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se logra con el barniz?",
                options = listOf("Unión de piezas", "Protección y brillo", "Cambio de color", "Alisado profundo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un tipo de sierra?",
                options = listOf("Lima", "Escoplo", "Gubia", "Sierra japonesa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta sirve para hacer cortes rectos largos?",
                options = listOf("Sierra de mano", "Cepillo", "Sierra circular", "Formón"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función de la garlopa?",
                options = listOf("Lijar superficies", "Medir ángulos", "Perforar madera", "Cepillar madera"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se necesita para fijar tornillos?",
                options = listOf("Llave inglesa", "Destornillador", "Martillo", "Cepillo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de madera es mejor para muebles finos?",
                options = listOf("Pino", "Roble", "MDF", "Contrachapado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un tipo de cepillo de carpintero?",
                options = listOf("Cepillo de banco", "Cepillo de bloque", "Cepillo orbital", "Cepillo de ajuste"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una espiga redonda?",
                options = listOf("Tipo de madera", "Clavo grueso", "Elemento de unión cilíndrico", "Tornillo con cabeza redonda"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta corta en ángulos precisos?",
                options = listOf("Ingletadora", "Sargento", "Garlopa", "Cepillo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa desbastar?",
                options = listOf("Quitar pintura", "Cortar madera en exceso", "Pintar con rodillo", "Humedecer madera"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la principal característica del nogal?",
                options = listOf("Muy ligero", "Color claro", "Color oscuro y resistencia", "Poco duradero"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de un tornillo es la cabeza?",
                options = listOf("La parte roscada", "La parte afilada", "La tuerca", "La parte superior que se atornilla"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se logra con una fresadora?",
                options = listOf("Clavar madera", "Hacer ranuras y molduras", "Medir ángulos", "Lijar esquinas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función de un calibrador o pie de rey?",
                options = listOf("Cortar madera", "Cepillar cantos", "Medir con precisión", "Encolar uniones"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el mejor método para ocultar tornillos en un mueble?",
                options = listOf("Pintarlos", "Taparlos con masilla", "Dejarlos visibles", "Lijarlos"),
                correctIndex = 1
            )
        ),



        //********************************************************************************************************************************



        "Pintar" to listOf(
            QuizQuestion(
                question = "¿Quién pinto la Gioconda?",
                options = listOf("Pablo Picasso", "Salvador Dali", "Leonardo Da Vinci", "Rafael Sanzio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "Famosa pintura de Gustav Klimt: ",
                options = listOf("El beso", "Guernica", "Las meninas", "La joven de la perla"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué técnica de pintura se usó para pintar la boveda de la Capilla Sixtina?",
                options = listOf("Pintura al Óleo", "Gouache", "Fresco", "Aerografía"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes colores NO es primario?",
                options = listOf("Amarillo", "Rojo", "Azul", "Verde"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes elementos de pintura tiene el menor tiempo de secado?",
                options = listOf("Pintura al Óleo", "Pintura acrílica", "Gouache", "Acuarelas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué componente de la pintura actúa como el 'vehículo' que ayuda a la aplicación?",
                options = listOf("Pigmento", "Resina", "Solvente", "Aditivo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes es un pigmento blanco utilizado comúnmente en pinturas?",
                options = listOf("Óxido de hierro", "Dióxido de titanio", "Sulfato de bario", "Talco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿El 'Tono de viridiano' es un tono de qué color?",
                options = listOf("Rojo", "Violeta", "Marrón", "Verde"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de aditivo se utiliza para mejorar la resistencia al agua de la pintura?",
                options = listOf("Aditivo biocida", "Aditivo hidrofugante", "Aditivo nivelador", "Aditivo antiespumante"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del famoso cuadro de Salvador Dalí que retrata un paisaje con relojes derretidos?",
                options = listOf("El tiempo ahumando una pintura", "El sueño", "La persistencia de la memoria", "La continuidad del tiempo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes pintores NO es impresionista?",
                options = listOf("Claude Monet", "Edgar Degas", "Paul Cézanne", "Sandro Botticelli"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿En qué lugar se inspiró Monet para elaborar una serie de pinturas conocidas como 'Los nenúfares'?",
                options = listOf("En los lagos de Italia", "En los estanques del río Magdalena", "En los estanques de su propia casa", "En los estanques de los paisajes estadounidenses"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el tema principal que interesa a los pintores impresionistas?",
                options = listOf("El paisaje","La naturaleza muerta o bodegones", "El retrato", "El tema histórico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una pintura?",
                options = listOf("Una mezcla homogénea de pigmentos y solventes",
                    "Una mezcla homogénea de uno o más pigmentos dispersos en un aglutinante",
                    "Una combinación de resuinas y aditivos dispersos en solventes",
                    "Un producto utilizado para la protección y decoreción de superficies"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función principal de los pigmentos en una pintura?",
                options = listOf("Proveer color y opacidad","Actuar como aglutinante", "Mejorar la adhesión a la superficie",
                    "Proporcionar dirabilidad a la película de pintura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿En qué tarea el aglutinante no realiza ningún aporte?",
                options = listOf("Fijar el color en la superficie","Facilitar la aplicación de la pintura al reducir su viscosidad",
                    "Mejorar la adherencia de la pintura a la superficie",
                    "Proporcionar durabilidad a la película de pintura"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "La temática de la pintura renacentista se centra en...",
                options = listOf("Naturaleza muerta","Paisajes", "Temática antropológica y religiosa", "Temática religiosa, mitología y retratos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "Considerado co-fundador del cubismo junto con Pablo Picasso: ",
                options = listOf("Joaquín Sorolla","Paul Cézanne", "Georges Braque", "Joan Miró"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes características es típica de la pintura metafísica?",
                options = listOf("Uso de colores brillantes y vibrantes","Representación realista de la naturaleza",
                    "Escenas oníricas con objetos cotidianos en contextos inusuales", "Abstracción"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************

        "Cerámica" to listOf(
            QuizQuestion(
                question = "¿Cuál es el material básico principal para hacer cerámica?",
                options = listOf("Vidrio", "Arcilla", "Madera", "Metal"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'torno' en cerámica?",
                options = listOf("Una herramienta para moldear arcilla giratoria", "Un tipo de esmalte", "Un horno especial", "Un pincel para decorar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué proceso consiste en calentar la cerámica para endurecerla?",
                options = listOf("Secado", "Horneado o cocción", "Pulido", "Molienda"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama la arcilla cuando ya ha sido cocida una vez y se puede esmaltar?",
                options = listOf("Barro", "Bizcocho", "Terracota", "Porcelana"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de arcilla es conocida por su alta plasticidad y finura?",
                options = listOf("Gres", "Porcelana", "Terracota", "Caolín"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el 'esmaltado' en cerámica?",
                options = listOf("Una técnica de pulido", "Aplicar una capa vidriada para decoración y protección", "Un tipo de arcilla", "Un proceso de secado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe la técnica de cerámica que utiliza moldes para formar piezas?",
                options = listOf("Torno", "Modelado", "Moldeo", "Esmaltado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función principal del horno en cerámica?",
                options = listOf("Secar la arcilla", "Cocer la pieza para endurecerla", "Mezclar la arcilla", "Pulir la superficie"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'engobe' en cerámica?",
                options = listOf("Una capa de barro líquido para decorar o proteger", "Un tipo de esmalte", "Una herramienta para modelar", "Un tipo de horno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué técnica de cerámica implica construir piezas uniendo rollos de arcilla?",
                options = listOf("Torno", "Modelado por rollos o 'coil'", "Moldeo por presión", "Esmaltado por spray"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la temperatura aproximada para cocer porcelana en un horno cerámico?",
                options = listOf("500°C", "1000°C", "1300°C", "700°C"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la 'terracota'?",
                options = listOf("Un tipo de esmalte", "Una arcilla cocida sin esmaltar, de color rojizo", "Un horno pequeño", "Una herramienta para esculpir"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'piezas vidriadas' en cerámica?",
                options = listOf("Piezas sin cocer", "Piezas hechas solo de vidrio", "Piezas sin decoración", "Piezas cubiertas con esmalte brillante"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el principal componente del esmalte cerámico?",
                options = listOf("Arcilla", "Vidrio fundido", "Metal", "Pintura acrílica"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa comúnmente para alisar y dar forma a la arcilla en mano?",
                options = listOf("Torno", "Cepillo", "Paleta de modelado", "Martillo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'puntillado' en cerámica?",
                options = listOf("Una técnica para dar textura con pequeños puntos", "Un tipo de esmalte", "Un horno pequeño", "Un tipo de arcilla"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'secado lento' en cerámica?",
                options = listOf("Dejar que la arcilla seque lentamente para evitar grietas", "Cocer rápido en el horno", "Usar aire caliente", "Sumergir en agua"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'engobado'?",
                options = listOf( "Pulir la pieza", "Moldear con el torno", "Secar la pieza al sol","Aplicar una capa de barro líquido para decoración"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe la técnica de decoración con esmaltes de colores que se superponen?",
                options = listOf("Grisalla", "Esmaltado superpuesto", "Esgrafiado", "Barbotina"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'esgrafiado' en cerámica?",
                options = listOf("Raspar la capa superior para revelar otra capa de diferente color", "Aplicar esmalte transparente", "Moldear la arcilla", "Hornear a baja temperatura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para recortar y dar forma precisa a piezas de arcilla?",
                options = listOf("Cuchillo o esteca", "Martillo", "Pincel", "Torno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'bizcochado' en cerámica?",
                options = listOf("El primer horneado para endurecer la arcilla sin esmaltar", "El segundo horneado después del esmalte", "La decoración con pintura", "El moldeado de piezas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es la diferencia entre 'arcilla' y 'barro'?",
                options = listOf("No hay diferencia", "El barro es arcilla con más agua y materiales", "La arcilla tiene más agua", "El barro es un tipo de esmalte"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de arcilla se utiliza principalmente para hacer vajilla fina y porcelana?",
                options = listOf("Terracota", "Caolín", "Gres", "Barro común"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'plastilina cerámica'?",
                options = listOf("Arcilla lista para moldear y no secarse rápido", "Un tipo de esmalte", "Una herramienta para alisar", "El horno para cocer"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la 'barbotina' en cerámica?",
                options = listOf("Una mezcla líquida de arcilla y agua para pegar piezas", "Una herramienta para esculpir", "Un tipo de esmalte", "Un horno especial"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la técnica de 'mosaico' en cerámica?",
                options = listOf("Un tipo de horneado", "Crear imágenes con pequeñas piezas de cerámica unidas", "Usar esmaltes de colores brillantes", "Moldear figuras con barro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'engobe' coloreado?",
                options = listOf("Un esmalte transparente", "Una herramienta para alisar", "Un barro líquido con pigmentos para decorar", "Un horno pequeño"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la 'piedra pómez' en cerámica?",
                options = listOf("Una herramienta abrasiva para pulir piezas", "Un tipo de arcilla", "Un esmalte especial", "Un tipo de horno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'craquelado' en cerámica?",
                options = listOf("Un tipo de color", "Grietas decorativas en el esmalte", "Un tipo de horno", "Un error en la arcilla"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de usar un 'alambre cortador' en cerámica?",
                options = listOf("Cortar piezas de arcilla con precisión", "Decorar la pieza", "Hornear más rápido", "Medir la temperatura del horno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la 'temperatura de cocción' en cerámica?",
                options = listOf("La temperatura a la que se seca la arcilla", "La temperatura a la que se cuece la pieza para endurecerla", "La temperatura ambiente del taller", "La temperatura del agua para moldear"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'pulido' en cerámica?",
                options = listOf("Aplicar esmalte", "Moldear piezas", "Secar la arcilla","Lijar o alisar la superficie para dar brillo o textura"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es la 'gresa' o 'gres' en cerámica?",
                options = listOf("Un tipo de arcilla dura y resistente usada para vajilla", "Un esmalte especial", "Un horno pequeño", "Una herramienta para moldear"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la técnica de 'modelado a mano alzada'?",
                options = listOf("Moldear la arcilla sin usar herramientas ni moldes", "Usar solo el torno", "Decorar con pinceles", "Hornear sin esmaltar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'engobe' transparente?",
                options = listOf("Un esmalte opaco", "Un tipo de horno","Un esmalte claro que permite ver la arcilla debajo", "Un tipo de arcilla"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la 'cerámica raku'?",
                options = listOf("Una técnica japonesa de cocción rápida y enfriamiento en frío", "Un tipo de arcilla", "Un esmalte específico", "Un horno tradicional"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el principal riesgo si la cerámica no se seca bien antes de cocerla?",
                options = listOf("Se vuelve más brillante", "Puede explotar o romperse en el horno", "Se vuelve más suave", "Se hace impermeable"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Corte y confección" to listOf(
            QuizQuestion(
                question = "¿Cómo se llama la técnica para unir piezas de tela con hilos y puntadas?",
                options = listOf("Tejer", "Bordar", "Coser", "Tricotear"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para cortar tela con precisión?",
                options = listOf("Tijeras de papel", "Cúter común", "Tijeras de tela", "Sierra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un maniquí en confección?",
                options = listOf("Máquina de coser", "Figura de cuerpo para ajustar prendas", "Plancha profesional", "Rodillo de estiraje"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué sirve para marcar patrones sobre la tela?",
                options= listOf("Tiza o marcador de tela", "Lápiz de mina", "Marcador permanente", "Rotulador de tinta"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de puntada se usa para rematar costuras?",
                options = listOf("Puntada recta", "Puntada en zigzag", "Puntada francesa", "Puntada de ojal"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Para qué sirve una máquina overlock?",
                options = listOf("Planchar costuras", "Sobrehilar y rematar bordes", "Coser botones", "Cortar patrones"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el derecho de la tela?",
                options = listOf("Cara que se cose primero", "Cara inferior de la tela", "Cara exterior que se debe ver", "Lado opuesto al revés"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de tela es el denim?",
                options = listOf("Seda", "Lana", "Algodón grueso", "Malla sintética"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué medidas lleva una regla curva francesa?",
                options = listOf("Curvas de cadera y sisas", "Largo de manga", "Medida de cintura", "Medida de tela en línea recta"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué sirve para hacer ojales automáticamente?",
                options = listOf("Pie de costura", "Aguja doble", "Tijera de ojal", "Pie para ojal"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se obtiene al confeccionar un forro en una prenda?",
                options = listOf("Mayor rigidez", "Mayor opacidad y acabado interior limpio", "Menor durabilidad", "Menor calor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para recortar esquinas y rebajar costuras?",
                options = listOf("Descosedor", "Hilo cortador", "Tijeras dentadas", "Cutter rotativo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de costura se usa para unir dos piezas sin borde visible?",
                options = listOf("Costura francesa", "Puntada festón", "Puntada invisible", "Zigzag"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué aguja se usa para tejidos elásticos?",
                options = listOf("Aguja universal", "Aguja ballpoint", "Aguja para denim", "Aguja twin"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Para qué sirve un dedal?",
                options = listOf("Marcar tela", "Presionar la tela al coser a mano", "Limpiar la aguja", "Afilar tijeras"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta ayuda a mantener la tela estirada mientras se plancha?",
                options = listOf("Tabla de planchar", "Rodillo de quita pelusas", "Prensatelas", "Alfiler térmico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué técnica se utiliza para ajustar una prenda al cuerpo?",
                options = listOf("Pes puntada recta", "Tomar pinzas", "Realizar un bajo", "Hilvanar bordes"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa hilvanar?",
                options = listOf("Coser permanentemente", "Cortar tela", "Coser con puntadas grandes provisionales", "Planchar costuras"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué prensatelas se usa para coser cremalleras?",
                options = listOf("Prensatelas normal", "Prensatelas bordador", "Prensatelas zigzag", "Prensatelas para cremalleras"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de la entretela?",
                options = listOf("Decorar prenda", "Dar soporte y estructura", "Agregar color", "Reducir elasticidad"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de costura deja el borde de la tela doblado y oculto?",
                options = listOf("Costura francesa", "Pespunte", "Costura de sobrehilado", "Costura de ojal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para pelusas en tela?",
                options = listOf("Rodillo despeluchador", "Plancha de vapor", "Aguja especial", "Regla metálica"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué accesorio sirve para sujetar varias capas de tela sin agujeros?",
                options = listOf("Alfiler", "Tiza", "Dedal", "Clip de costura"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de tela es el popelín?",
                options = listOf("Mezcla de seda", "Algodón fino y suave", "Lana gruesa", "Denim sintético"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué sirve para trazar líneas curvas en los patrones?",
                options = listOf("Regla recta", "Cúter rotativo", "Regla de curvas", "Hilo doble"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la costura de refuerzo en ropa deportiva?",
                options = listOf("Puntada francesa", "Pespunte doble o triple", "Hilván largo", "Puntada recta normal"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué método se usa para prolongar la vida útil de una máquina de coser?",
                options = listOf("Usar hilo grueso siempre", "Utilizar plancha encima", "Dejarla al sol", "Lubricarla y limpiar la bobina"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un alfiletero?",
                options = listOf("Caja para botones", "Almohadilla para guardar alfileres", "Regla pequeña", "Dedal grande"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué prensatelas se usa para puntadas en zigzag?",
                options = listOf("Prensatelas recto", "Prensatelas dobladillo", "Prensatelas zigzag", "Prensatelas invisible"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función del cortahilos?",
                options = listOf("Doblar tela", "Cortar hilo sobrante", "Marcar patrones", "Planchar puntadas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Para qué se usa un descosedor?",
                options = listOf("Fijar botones", "Marcar tela", "Planchar costuras", "Quitar costuras"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de puntada se usa en costuras visibles para reforzar?",
                options = listOf("Puntada recta normal", "Puntada festón", "Pespunte", "Puntada invisible"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tela suele usarse para prendas que necesitan estirarse?",
                options = listOf("Popelín", "Lycra o elastano", "Tela vaquera rígida", "Encaje"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de cortar la tela lavada?",
                options = listOf("Plancharla mojada", "Estirarla mucho", "Prelavarla y plancharla", "Doblarla sin planchar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué costura se hace en mano para botones y ojales?",
                options = listOf("Puntada invisible", "Puntada de remate a mano", "Costura francesa", "Overlock"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función del prensatelas de dobladillo enrollado?",
                options = listOf("Doblar y coser dobladillos finos automáticamente", "Hacer ojales", "Coser cremalleras", "Marcar patrones"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para unir piezas con costura y recorte interno limpio?",
                options = listOf("Costura inglesa", "Costura francesa", "Pespunte doble", "Puntada en zigzag"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta de medición es clave en confección?",
                options = listOf("Cinta métrica flexible", "Regla metálica rígida", "Escuadra", "Compás"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es la función de la entretela termoadhesiva?",
                options = listOf("Decorar telas", "Fusionarse con la tela con calor para dar firmeza", "Proteger hilo", "Unir prendas"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Tejer" to listOf(
            QuizQuestion(
                question = "¿Qué herramienta se usa para tejer a crochet?",
                options = listOf("Agujas rectas", "Agujas circulares", "Aguja de ganchillo", "Dedal"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el material más común para tejer prendas de invierno?",
                options = listOf("Seda", "Algodón", "Lana", "Lino"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'punto derecho' en tejido a dos agujas?",
                options = listOf("La puntada básica","Un nudo", "Un punto decorativo", "Un error de tejido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de aguja se necesita para tejer calcetines?",
                options = listOf("Agujas circulares", "Agujas planas", "Agujas de doble punta", "Agujas de bordar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'punto bobo'?",
                options = listOf("Un patrón avanzado", "Solo puntos revés", "Una puntada torcida", "Solo puntos derechos en todas las vueltas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para evitar que se deshagan los puntos al descansar el tejido?",
                options = listOf("Ganchillo", "Capuchones", "Agujas de bordar", "Dedales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una madeja?",
                options = listOf("Una herramienta", "Una muestra", "Un ovillo de lana en forma alargada", "Una costura especial"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'bloquear' una prenda tejida?",
                options = listOf("Encogerla con agua caliente", "Rematarla con hilo grueso", "Darle forma final con humedad", "Coserla por los bordes"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material es ideal para proyectos de verano?",
                options = listOf("Lana merino", "Acrílico", "Cachemira", "Algodón"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de aguja se utiliza para tejer gorros sin costura?",
                options = listOf("Agujas rectas", "Agujas de bordado", "Agujas circulares", "Agujas curvas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'punto revés'?",
                options = listOf( "Un punto opuesto al derecho","Un patrón de ganchillo", "Una forma de coser", "Una puntada decorativa"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué hilo se recomienda para principiantes?",
                options = listOf("Hilo muy fino", "Lana gruesa", "Seda", "Cachemira"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una aguja lanera?",
                options = listOf("Para bordado en tela", "Para coser los extremos de la lana", "Para hacer ojales", "Para unir telas gruesas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa una 'X' en un patrón de crochet?",
                options = listOf("Un aumento", "Un punto alto", "Un punto bajo", "Un nudo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'aumento' en tejido?",
                options = listOf("Reducir puntos", "Dejar puntos sueltos", "Cambiar hilo", "Agregar puntos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el tamaño de aguja más grueso?",
                options = listOf("2 mm", "3.5 mm", "10 mm", "5 mm"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un ovillo?",
                options = listOf("Un hilo enrollado","Un patrón", "Una aguja", "Una puntada"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes hilos es sintético?",
                options = listOf("Algodón", "Lino", "Lana", "Acrílico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hace una marcadora de puntos?",
                options = listOf("Corta el hilo", "Marca el número de vueltas", "Señala posiciones en el tejido", "Une piezas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el punto jersey?",
                options = listOf("Todo en revés", "Intercalando derecho y revés", "Una puntada solo con crochet", "Punto alto doble"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se mide para comenzar un gorro tejido?",
                options = listOf("Circunferencia de la cabeza","Diámetro de la frente", "Longitud del cabello", "Ancho del cuello"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué instrumento ayuda a mantener la tensión del hilo?",
                options = listOf("Dedal", "Contador de vueltas", "Mano no dominante", "Marcador de hilo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'tejer en circular'?",
                options = listOf("Tejer con dos agujas", "Tejer en forma de espiral cerrada", "Tejer sin hilo", "Tejer cuadros"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una muestra o swatch?",
                options = listOf("La lana usada", "Una prueba de tejido", "Un punto decorativo", "Un tipo de nudo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'punto arroz'?",
                options = listOf("Un patrón de comida", "Un tipo de hilo", "Una técnica japonesa", "Una puntada que alterna derecho y revés"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'rematar' en tejido?",
                options = listOf("Deshacer el trabajo", "Coser el borde", "Cerrar los puntos al final", "Cortar el hilo al principio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica usa solo una aguja?",
                options = listOf("Dos agujas", "Crochet", "Tejido tunecino", "Punto inglés"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de lana es más suave?",
                options = listOf("Acrílico", "Algodón", "Lana gruesa", "Cachemira"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué aguja es ideal para tejer mantas grandes?",
                options = listOf("Aguja circular","Aguja tunecina", "Aguja corta", "Aguja curva"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'disminuir puntos'?",
                options = listOf("Aumentar ancho", "Cerrar puntos", "Tejer dos puntos juntos", "Agregar lana"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué accesorio sirve para enrollar hilo en ovillos?",
                options = listOf("Dedal", "Enrollador de lana", "Capuchón", "Anudador"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'pasar sin tejer'?",
                options = listOf("Tejer dos veces", "Pasar el punto sin trabajarlo", "Deshacerlo", "Coserlo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hilo es ideal para bebés?",
                options = listOf("Lana gruesa", "Cachemira áspera", "Hilo metálico", "Acrílico suave o algodón"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el símbolo universal para el punto alto en crochet?",
                options = listOf("X", "O", "T con raya", "V"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una trenza en tejido?",
                options = listOf("Una forma de rematar", "Un diseño cruzado con puntos", "Un error decorativo", "Un tipo de hilo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es más fácil para principiantes?",
                options = listOf("Tejer con seda", "Tejer con hilo fino", "Tejer con lana gruesa y aguja grande", "Tejer con hilo de bordar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una bufanda infinita?",
                options = listOf("Una bufanda que nunca se termina", "Una bufanda sin extremos (cerrada en círculo)", "Un patrón infinito", "Una bufanda de doble capa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del patrón indica cuántas repeticiones hacer?",
                options = listOf("Número de vueltas","Color del hilo", "Medidas finales", "Tamaño de la aguja"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pasa si no se mantiene la tensión del hilo?",
                options = listOf("El tejido se verá uniforme", "Será más firme", "Habrá diferencias de tamaño", "Será más fácil de rematar"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************


        "Marroquinería" to listOf(
            QuizQuestion(
                question = "¿Qué es la marroquinería?",
                options = listOf("El arte de fabricar zapatos deportivos", "El trabajo con metales preciosos", "El arte de trabajar y confeccionar objetos con cuero", "Una técnica de bordado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una herramienta básica para cortar cuero?",
                options = listOf("Bisturí quirúrgico", "Cúter o cuchilla afilada", "Tijeras de papel", "Cuchara de modelado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una 'gubia' en marroquinería?",
                options = listOf("Un tipo de cuero fino", "Una herramienta para hacer cortes decorativos o biselados", "Un adhesivo", "Un barniz para cuero"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de hilo se usa comúnmente para coser cuero a mano?",
                options = listOf("Hilo de algodón", "Hilo de nylon sin tratar", "Hilo de lana", "Hilo encerado"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para marcar los agujeros de costura en el cuero?",
                options = listOf("Compás", "Aguja", "Rueda marcadora o de costura", "Lijadora"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'cuero curtido al vegetal'?",
                options = listOf("Cuero artificial tratado con aceites", "Cuero teñido con tintes naturales", "Cuero tratado con taninos vegetales", "Cuero sin curtir"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un sacabocados?",
                options = listOf("Una herramienta para marcar líneas", "Una máquina de coser cuero", "Una herramienta para perforar agujeros redondos en el cuero", "Un tipo de cierre metálico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple el formón biselado?",
                options = listOf("Cortar piezas finas de tela", "Aplicar pegamento", "Pulir superficies metálicas", "Hacer cortes limpios en los bordes del cuero"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se usa para pulir los bordes del cuero?",
                options = listOf("Lija gruesa", "Cepillo de acero", "Bruñidor (burnisher)", "Rodillo de goma"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de costura es más común en marroquinería artesanal?",
                options = listOf("Costura de guarnicionero (saddle stitch)","Pespunte a máquina", "Costura tipo overlock",  "Costura invisible"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se usa para teñir el cuero manualmente?",
                options = listOf("Tinta china", "Acuarela", "Tinte para cuero a base de alcohol o agua", "Látex líquido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja del cuero curtido al vegetal?",
                options = listOf("Es impermeable desde fábrica", "Es más económico", "Permite grabado y moldeado con agua", "No requiere mantenimiento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para biselar los bordes del cuero?",
                options = listOf("Biseladora (edge beveler)", "Punzonadora", "Espátula metálica", "Trinche de costura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos objetos puede fabricarse con marroquinería?",
                options = listOf("Lámparas LED", "Llaveros, carteras, cinturones", "Cadenas de bicicleta", "Ropa de lana"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'grabado en cuero'?",
                options = listOf("Marcar el cuero con tinta", "Imprimir con láser", "Presionar diseños con calor o herramientas", "Teñir el cuero de negro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se necesita para hacer una costura tipo guarnicionero?",
                options = listOf("Una máquina industrial", "Dos agujas y hilo encerado", "Cinta adhesiva y cúter", "Una aguja de bordado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función del pegamento de contacto en marroquinería?",
                options = listOf("Sellar los bordes", "Colorear el cuero", "Impermeabilizar la superficie", "Unir temporalmente piezas antes de coserlas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'repujado' en marroquinería?",
                options = listOf("Biselar los bordes del cuero", "Aplicar calor al cuero", "Crear diseños en relieve con presión manual", "Lijar la superficie para suavizar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se usa para proteger y dar brillo al cuero una vez terminado?",
                options = listOf("Aceite vegetal", "Cera o sellador para cuero", "Agua oxigenada", "Bicarbonato de sodio"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'groover'?",
                options = listOf("Un tipo de cuero grueso", "Una cuchilla para hacer ranuras para costura", "Un tipo de punzón", "Una herramienta para lijar bordes"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función tiene el compás de puntadas?",
                options = listOf("Marcar la distancia entre agujeros de costura", "Medir el grosor del cuero", "Cortar círculos", "Curvar el cuero"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer antes de teñir el cuero?",
                options = listOf("Remojarlo con vinagre", "Lijarlo con lija gruesa", "Limpiar con alcohol o agua destilada", "Aplicar aceite"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué cuero es más fino y flexible para trabajar en marroquinería de lujo?",
                options = listOf("Cuero curtido al cromo", "Gamuza", "Cuero de cerdo", "Cuero de becerro"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de cuero se suele usar para cinturones rígidos?",
                options = listOf("Cuero de oveja", "Cuero curtido al vegetal", "Napa", "Sintético"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué material NO es comúnmente parte de la marroquinería?",
                options = listOf("Cuero", "Hilo encerado", "Metal para hebillas", "Plástico espumado"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Para qué sirve el punzón?",
                options = listOf("Perforar agujeros", "Sujetar piezas", "Pegar bordes", "Pintar detalles"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se usa para evitar que el hilo se deshilache al coser cuero?",
                options = listOf("Tijeras calientes", "Sellador de bordes", "Cera de abeja", "Pegamento blanco"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué diferencia hay entre cuero natural y sintético?",
                options = listOf("El sintético es más costoso", "El natural tiene fibras y es poroso", "Ambos son iguales", "El sintético dura más siempre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'split leather' o cuero dividido?",
                options = listOf("Cuero sintético", "La capa inferior del cuero, más económica", "Un tipo de curtido al cromo", "Una técnica de costura"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para ajustar y presionar costuras o uniones?",
                options = listOf("Piedra pulidora", "Rodillo de presión", "Compás", "Martillo de goma"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de hilo tiene mejor resistencia para la marroquinería?",
                options = listOf("Hilo de bordado", "Hilo de poliéster encerado", "Hilo de algodón suave", "Hilo de lana"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un molde en marroquinería?",
                options = listOf("Una herramienta para teñir", "Un patrón para cortar el cuero", "Un tipo de costura", "Una técnica de repujado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica permite que el cuero se amolde con agua?",
                options = listOf("Repujado", "Curtido", "Moldeado húmedo", "Teñido con alcohol"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo se llama el arte de grabar imágenes o texto en cuero con calor?",
                options = listOf("Tatuaje en cuero", "Pirograbado", "Curvado térmico", "Impresión en relieve"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer después de terminar una pieza de cuero?",
                options = listOf("Aplicar un sellador o acondicionador", "Lijar nuevamente", "Ponerla al sol directo", "Congelarla"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el filo del cuero?",
                options = listOf("El corte inicial", "El borde expuesto del cuero", "Una técnica de grabado", "El tipo de curtido"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Para qué sirve la piedra de afilar en marroquinería?",
                options = listOf("Pintar detalles", "Moldear cuero húmedo", "Mantener afiladas las herramientas de corte", "Marcar patrones"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué medida se usa habitualmente para indicar el grosor del cuero?",
                options = listOf("Milímetros o onzas (oz)", "Kilogramos", "Centímetros cuadrados", "Grados Celsius"),
                correctIndex = 0
            )
        ),


        //********************************************************************************************************************************


        "Escultura" to listOf(
            QuizQuestion(
                question = "¿Cuál de los siguientes materiales es comúnmente usado en escultura clásica?",
                options = listOf("Vidrio", "Bronce", "Cartón", "Látex"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para modelar arcilla?",
                options = listOf("Cincel", "Pincel", "Esteca", "Formón"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué escultor es autor de 'El David'?",
                options = listOf("Donatello", "Miguel Ángel", "Bernini", "Rodin"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica consiste en quitar material para formar una figura?",
                options = listOf("Moldeo", "Fundición", "Tallado", "Modelado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material es maleable y se usa comúnmente para modelado inicial?",
                options = listOf("Mármol", "Yeso", "Granito", "Arcilla"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una estatuilla?",
                options = listOf("Una escultura pequeña","Una estatua grande", "Un molde","Una herramienta de escultura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué escultor creó 'El Pensador'?",
                options = listOf("Brâncuși", "Rodin", "Canova", "Moore"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica utiliza cera para moldear antes de fundir en metal?",
                options = listOf("Mosaico", "Talla directa", "Modelado libre", "Cera perdida"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos NO es un tipo de escultura?",
                options = listOf("Bajorrelieve", "Altorrelieve", "Grabado", "Ronda o bulto redondo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material requiere horno para endurecerlo?",
                options = listOf("Yeso", "Arcilla cerámica", "Mármol", "Bronce"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué escultor es conocido por figuras humanas alargadas y delgadas?",
                options = listOf("Giotto", "Giacometti", "Rodin", "Moore"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una maqueta en escultura?",
                options = listOf("Una herramienta", "Un boceto en papel", "Un pigmento", "Un modelo a escala"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una esteca?",
                options = listOf("Un pigmento", "Un tipo de mármol", "Herramienta para modelar", "Una técnica de fundición"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la diferencia entre escultura y pintura?",
                options = listOf("La escultura se pinta", "La escultura es tridimensional", "La escultura es en papel", "La escultura solo se hace en piedra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se usa para proteger una escultura de madera?",
                options = listOf("Aceite o barniz", "Yeso", "Pintura acrílica", "Cera depilatoria"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se llama 'torso' en escultura?",
                options = listOf("Cabeza", "Piernas", "Tronco", "Manos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué escultor es conocido por sus obras abstractas y orgánicas en bronce?",
                options = listOf("Henry Moore","Rodin", "Michelangelo", "Bernini"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para evitar que una escultura de arcilla se agriete mientras seca?",
                options = listOf("Aceite", "Secado rápido", "Secado lento y controlado", "Pintura"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un método común de unión de piezas metálicas en escultura?",
                options = listOf("Pegamento", "Clavos", "Soldadura", "Tornillos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el mármol?",
                options = listOf("Metal fundido", "Piedra caliza metamórfica", "Tipo de resina", "Tipo de arena"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de escultura sobresale ligeramente de una superficie plana?",
                options = listOf("Escultura en bulto", "Altorrelieve", "Bajorrelieve", "Escultura aérea"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas técnicas es más usada para esculturas grandes en piedra?",
                options = listOf("Moldeo", "Modelado", "Fundición en arena", "Tallado"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se usa para pulir mármol?",
                options = listOf("Aceite vegetal", "Lija fina y agua", "Tijeras", "Pintura al óleo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué artista renacentista trabajó tanto en pintura como escultura?",
                options = listOf("Leonardo da Vinci", "Van Gogh", "Pablo Picasso", "Andy Warhol"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para tallar piedra?",
                options = listOf("Brocha", "Cincel", "Rodillo", "Espátula"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de escultura se puede ver desde todos los ángulos?",
                options = listOf("Bajorrelieve", "Frescos", "Escultura exenta o de bulto redondo", "Mural"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué sustancia se puede usar para hacer moldes flexibles?",
                options = listOf("Cemento", "Yeso", "Arena", "Silicona"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de obra es 'La Piedad' de Miguel Ángel?",
                options = listOf("Pintura mural", "Fresco", "Escultura en mármol", "Obra digital"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una fundición en bronce?",
                options = listOf("Técnica de esmaltado", "Pintura metálica", "Proceso de moldear metal fundido", "Talla sobre madera"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué movimiento artístico valoró la escultura abstracta?",
                options = listOf("Realismo", "Cubismo", "Renacimiento", "Barroco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de escultura se integra al entorno natural?",
                options = listOf("Land Art","Escultura cinética", "Instalación",  "Diorama"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué material es ideal para practicar modelado en casa?",
                options = listOf("Yeso dental", "Cera caliente", "Arcilla polimérica", "Hormigón armado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el modelado?",
                options = listOf("Pintar una escultura", "Agregar y formar con materiales blandos", "Cortar piedra", "Pulir con lija gruesa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de escultura depende del movimiento real o percibido?",
                options = listOf("Minimalista", "Cinética", "Futurista", "Realista"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de escultura es común en parques y plazas?",
                options = listOf("Miniatura", "Instalación digital", "Monumento público", "Grabado mural"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué artista del siglo XX usó materiales industriales para sus esculturas?",
                options = listOf("Michelangelo", "Rodin", "Richard Serra", "Donatello"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una escultura efímera?",
                options = listOf("Hecha con piedra", "Permanente", "Diseñada para durar", "Temporal y de corta duración"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estas esculturas es considerada una de las más famosas de la antigüedad griega?",
                options = listOf("David", "Venus de Milo", "El Pensador", "Discóbolo de Mirón"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de escultura se hace con hielo o arena?",
                options = listOf("Cinética", "Land art", "Efímera", "Mural"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material se usa comúnmente en esculturas contemporáneas por su ligereza?",
                options = listOf("Hormigón", "Acero inoxidable", "Granito", "Cartón o papel"),
                correctIndex = 3
            )
        ),


        //********************************************************************************************************************************


        "Bisutería" to listOf(
            QuizQuestion(
                question = "¿Qué se entiende por bisutería?",
                options = listOf("Joyería de oro", "Accesorios hechos a máquina", "Accesorios con piedras preciosas",
                    "Accesorios hechos con materiales no preciosos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes materiales se usa comúnmente en bisutería artesanal?",
                options = listOf("Platino", "Diamante", "Cristal", "Titanio puro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para cortar alambre fino en bisutería?",
                options = listOf("Pinza de punta plana", "Tijera de costura", "Alicate de corte", "Destornillador"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un broche langosta?",
                options = listOf("Un broche decorativo de mariscos", "Un tipo de cierre para collares y pulseras", "Una técnica de tejido", "Un adorno de metal pesado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para unir cuentas en una pulsera elástica?",
                options = listOf("Goma elástica o silicona","Hilo de cáñamo", "Hilo metálico", "Cinta de raso"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos materiales es ideal para bisutería ligera y colorida?",
                options = listOf("Piedra volcánica", "Plástico acrílico", "Plomo", "Vidrio templado grueso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para formar bucles con alambre?",
                options = listOf("Tijera", "Regla", "Cúter", "Pinza de punta redonda"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un dije en bisutería?",
                options = listOf("Un adorno colgante","Un tipo de cadena", "Un nudo decorativo","Una pinza de ajuste"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué hilo se usa comúnmente para hacer pulseras con nudos?",
                options = listOf("Alambre de cobre", "Hilo de pescar", "Cordón de goma", "Hilo encerado"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes se considera un engarce?",
                options = listOf("Una cuenta de plástico", "Un tipo de piedra", "Una forma de sujetar piedras", "Una herramienta para cortar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumplen las arandelas o anillas en bisutería?",
                options = listOf("Decoración", "Sujeción de cierres y dijes", "Cortar alambre", "Medir cuentas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se necesita para realizar un cierre de presión?",
                options = listOf("Pegamento", "Gancho en S", "Nudo doble", "Broche de presión"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el alambre de memoria?",
                options = listOf("Alambre que graba audio", "Alambre que cambia de color", "Alambre que conserva su forma circular",
                    "Alambre que se dobla fácilmente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de bisutería se usa comúnmente para eventos formales?",
                options = listOf("Bisutería con cristales o perlas","Cordones de plástico", "Joyas de madera",  "Pulseras tejidas de hilo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de cuentas cambian de color con la luz solar?",
                options = listOf("Cuentas magnéticas", "Cuentas opacas", "Cuentas metálicas", "Cuentas fotocromáticas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta ayuda a evitar que las cuentas se deslicen mientras se trabaja?",
                options = listOf("Tijeras", "Alfiletero", "Tapón de cuentas", "Martillo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de hilo se usa comúnmente en collares de macramé?",
                options = listOf("Hilo dental", "Hilo metálico", "Hilo encerado o algodón", "Hilo de bordar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material se puede usar para hacer bisutería ecológica?",
                options = listOf("Plástico reciclado", "Papel maché", "Madera", "Todas las anteriores"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de cierre se enrosca para asegurar collares?",
                options = listOf("Broche magnético", "Cierre tipo tornillo", "Broche en forma de T", "Clip automático"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple el alicate de punta plana?",
                options = listOf("Sujetar y doblar piezas","Cortar hilo", "Lijar piedras", "Engastar gemas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué diferencia hay entre bisutería y joyería?",
                options = listOf("La bisutería se hace con metales preciosos", "La joyería es más artesanal",
                    "La bisutería no usa materiales preciosos", "La joyería es descartable"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de pegamento es ideal para bisutería?",
                options = listOf("Cola blanca escolar", "Silicona líquida", "Epoxi o pegamento fuerte", "Adhesivo en barra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito del esmalte para bisutería?",
                options = listOf("Reducir peso", "Dar color o proteger piezas", "Cambiar el tamaño", "Limpiar alambre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica se utiliza para crear pulseras con cuentas y nudos?",
                options = listOf("Macramé", "Talla", "Filigrana", "Encastre"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes materiales es hipoalergénico?",
                options = listOf("Níquel", "Aluminio", "Bronce", "Acero inoxidable"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para abrir y cerrar anillas?",
                options = listOf("Tijeras", "Cúter", "Pinzas de bisutería", "Agujas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de cuentas están hechas de vidrio soplado?",
                options = listOf("Cuentas de madera", "Cuentas de cristal checo", "Cuentas metálicas", "Cuentas de arcilla"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de comenzar un diseño de bisutería?",
                options = listOf("Coser un patrón", "Dibujar o planificar el diseño", "Pintar el fondo", "Cortar telas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica se utiliza para envolver piedras con alambre?",
                options = listOf("Plegado libre", "Enrollado básico", "Wire wrapping", "Engarzado múltiple"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe usar para evitar que los nudos de una pulsera se deshagan?",
                options = listOf("Pegamento transparente", "Cinta adhesiva", "Agua", "Calor"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe un conjunto de collar, pulsera y aretes a juego?",
                options = listOf("Trío decorativo", "Pack básico", "Set de bisutería", "Combo brillante"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se puede usar para dar brillo a piezas metálicas de bisutería?",
                options = listOf("Paño de pulido","Lija gruesa", "Cera para madera", "Papel mojado"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de pinza se usa para presionar terminales o cierres?",
                options = listOf("Pinza de corte", "Pinza de crimpado", "Pinza de punta fina", "Pinza curva"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el crimpado?",
                options = listOf("Un tipo de engaste", "Un nudo", "Una técnica para sujetar terminales", "Un patrón de cuentas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe hacerse para evitar que la bisutería se oxide?",
                options = listOf("Mojarla seguido", "Dejarla al sol", "Usar perfumes sobre ella", "Guardarla en un lugar seco"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de bisutería se hace a base de hilos y nudos decorativos?",
                options = listOf("Filigrana", "Bisutería minimalista", "Macramé", "Cristal templado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué componente se usa para colgar aretes?",
                options = listOf("Pasador", "Ganchos o anzuelos", "Abalorios", "Topes de silicona"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué material es muy común en bisutería bohemia?",
                options = listOf("Madera y cuero","Perlas naturales", "Cristales Swarovski",  "Acero quirúrgico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja de la bisutería artesanal frente a la industrial?",
                options = listOf("Mayor precio", "Menor duración", "Diseños únicos y personalizados", "Uso de oro"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************


        "Maquillaje profesional" to listOf(
            QuizQuestion(
                question = "¿Qué tipo de base es mejor para pieles grasas?",
                options = listOf("Base en crema", "Base líquida hidratante", "Base en polvo", "Base con acabado luminoso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función principal del primer (prebase)?",
                options = listOf("Añadir color", "Iluminar el rostro", "Fijar el maquillaje", "Preparar la piel y suavizar poros"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué brocha se usa comúnmente para aplicar la base líquida?",
                options = listOf("Brocha abanico", "Brocha kabuki", "Brocha para labios", "Brocha de difuminar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué producto se utiliza para fijar el maquillaje?",
                options = listOf("Corrector", "Iluminador", "Spray fijador", "Rubor"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de subtono tiene una piel que se ve mejor con joyas plateadas?",
                options = listOf("Subtono cálido", "Subtono frío", "Subtono neutro", "Subtono oliva"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'cut crease' en maquillaje?",
                options = listOf("Aplicar base sobre el párpado", "Marcar la cuenca del ojo con un color contrastante", "Contornear la nariz", "Iluminar el pómulo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué producto se usa para cubrir ojeras?",
                options = listOf("Bronzer", "Corrector", "Iluminador", "Base en barra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué producto se utiliza para definir las cejas?",
                options = listOf("Rubor", "Gel fijador", "Lápiz o pomada para cejas", "Iluminador"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes es un tipo de delineado clásico?",
                options = listOf("Sombras difuminadas", "Párpado cortado", "Cut-out liner", "Cat eye"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se debe aplicar antes de la base para una piel seca?",
                options = listOf("Polvo traslúcido", "Iluminador", "Hidratante", "Bronzer"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes productos es ideal para hacer 'contouring'?",
                options = listOf("Rubor en polvo", "Base clara", "Bronzer o producto en crema oscuro", "Iluminador líquido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué brocha se utiliza comúnmente para aplicar sombras?",
                options = listOf("Brocha lengua de gato", "Brocha para base", "Brocha para rubor", "Brocha para cejas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué textura de labial dura más tiempo?",
                options = listOf("Labial en barra cremoso", "Gloss con brillo", "Bálsamo con color", "Labial líquido mate"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica para dar mayor volumen a los labios?",
                options = listOf("Contornear la nariz", "Usar tonos oscuros", "Dibujar ligeramente fuera del contorno natural", "Aplicar rubor sobre los labios"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué color neutraliza las ojeras moradas?",
                options = listOf("Verde", "Rojo", "Amarillo", "Naranja"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'baking' en maquillaje?",
                options = listOf("Aplicar rubor y difuminarlo", "Sellar la base con polvo y dejarlo actuar", "Colocar iluminador en capas", "Contornear la mandíbula"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué producto se recomienda para maquillar pieles maduras?",
                options = listOf("Base mate", "Polvo compacto", "Base ligera y humectante", "Corrector denso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes marcas es reconocida por sus correctores?",
                options = listOf("Anastasia Beverly Hills", "Fenty Beauty", "NYX", "Tarte"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la mejor forma de aplicar iluminador en crema?",
                options = listOf("Con brocha húmeda", "Con esponja seca", "Con los dedos", "Con brocha angular"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de maquillaje se usa en teatro y espectáculos?",
                options = listOf("Maquillaje natural", "Maquillaje HD", "Maquillaje de caracterización", "Maquillaje en barra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué producto se usa para cambiar la forma de los ojos?",
                options = listOf("Rubor", "Sombras", "Corrector", "Delineador"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tono de corrector se usa para iluminar?",
                options = listOf("Más oscuro que la piel", "Igual al de la base", "Un tono más claro", "Naranja intenso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función del polvo traslúcido?",
                options = listOf("Dar color", "Hidratar", "Sellar el maquillaje sin aportar color", "Dibujar líneas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo del contouring?",
                options = listOf("Dar volumen", "Corregir o definir la forma del rostro", "Hidratar la piel", "Dar color a los labios"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para curvar las pestañas?",
                options = listOf("Cepillo para cejas", "Rizador de pestañas", "Pinzas", "Brocha angular"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué brocha se usa para aplicar rubor?",
                options = listOf("Brocha de sombras", "Brocha en abanico", "Brocha biselada", "Esponja"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué efecto da el iluminador?",
                options = listOf("Oscurecer zonas", "Reducir volumen", "Aportar brillo y resaltar", "Fijar el maquillaje"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Dónde se aplica comúnmente el rubor?",
                options = listOf("Pómulos", "Frente", "Mentón", "Nariz"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un acabado de base?",
                options = listOf("Mate", "Satinado", "Metálico", "Natural"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de esponja es más usada para difuminar base líquida?",
                options = listOf("Esponja plana", "Beauty blender", "Esponja de látex seca", "Borrador de maquillaje"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple el corrector verde?",
                options = listOf("Neutralizar rojeces", "Iluminar el rostro", "Dar volumen a los labios", "Cubrir ojeras"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué maquillaje se recomienda para fotografía profesional?",
                options = listOf("Maquillaje con SPF", "Maquillaje HD", "Maquillaje a prueba de agua", "Maquillaje con brillo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de delineado agranda visualmente el ojo?",
                options = listOf("Delineado blanco en la línea de agua", "Delineado negro grueso", "Cat eye cerrado", "Delineado invertido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se usa para hacer que los labios se vean más carnosos?",
                options = listOf("Bálsamo hidratante", "Gloss con brillo", "Iluminador en el arco de cupido", "Delineador oscuro en todo el labio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe evitar al maquillar piel con acné activo?",
                options = listOf("Usar base oil-free", "Usar brochas limpias", "Usar productos comedogénicos", "Cubrir con corrector específico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una marca popular de maquillaje profesional?",
                options = listOf("Urban Outfitters", "Zara", "Bershka", "MAC Cosmetics"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'strobing'?",
                options = listOf("Dibujar cejas", "Técnica de iluminación intensa", "Maquillaje artístico", "Oscurecer pómulos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas herramientas se utiliza para eliminar el exceso de producto sin arrastrar?",
                options = listOf("Esponja húmeda", "Brocha kabuki", "Papel absorbente", "Cuchara de metal"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es lo más importante al preparar la piel antes del maquillaje?",
                options = listOf("Elegir la base", "Aplicar rubor", "Limpiar e hidratar la piel", "Poner polvo"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************

        "Programar" to listOf(
            QuizQuestion(
                question = "¿Qué lenguaje se utiliza comúnmente para desarrollo web junto con HTML y CSS?",
                options = listOf("Java", "Python", "C++", "JavaScript"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa HTML?",
                options = listOf("HyperText Markup Language", "HighText Modern Language", "HyperType Machine Language", "Home Tool Markup Language"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'bug' en programación?",
                options = listOf("Un tipo de archivo", "Un lenguaje de código", "Un dispositivo externo", "Un error en el software"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un lenguaje de programación?",
                options = listOf("Ruby", "C#", "HTML", "Python"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estructura de control permite ejecutar un bloque de código múltiples veces?",
                options = listOf("if", "loop", "class", "function"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de lenguaje es Python?",
                options = listOf("Lenguaje de bajo nivel", "Lenguaje de máquina", "Lenguaje de programación visual", "Lenguaje de alto nivel"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué símbolo se usa para comentarios en Python?",
                options = listOf("//", "/*", "#", "--"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'IDE' en programación?",
                options = listOf("Interactive Debugging Environment", "Integrated Development Environment", "Internal Design Execution",
                    "Integrated Data Engine"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes se usa para controlar versiones de código?",
                options = listOf("Git", "Node.js", "npm", "Python"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una función en programación?",
                options = listOf("Un archivo de código", "Una estructura de control", "Un conjunto reutilizable de instrucciones", "Una librería externa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué lenguaje es conocido por su lema 'Write once, run anywhere'?",
                options = listOf("C++", "Python", "Java", "Ruby"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué lenguaje se usa típicamente para scripts en servidores?",
                options = listOf("CSS", "JavaScript", "HTML", "PHP"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una API?",
                options = listOf("Un lenguaje de programación", "Un sistema operativo", "Una interfaz de programación de aplicaciones", "Un servidor web"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una variable?",
                options = listOf("Un tipo de archivo", "Un número constante", "Un lenguaje de consulta", "Un nombre para almacenar datos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué operador se usa para igualdad en la mayoría de lenguajes?",
                options = listOf("=", "==", "===", "!="),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué lenguaje se usa principalmente en ciencia de datos?",
                options = listOf("Java", "Swift", "Python", "C"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué framework de JavaScript es mantenido por Meta (Facebook)?",
                options = listOf("Angular", "Vue", "React", "Svelte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es JSON?",
                options = listOf("Un lenguaje de backend", "Un sistema operativo", "Un formato de intercambio de datos", "Una base de datos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué extensión tienen los archivos Python?",
                options = listOf(".py", ".java", ".html", ".js"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un tipo de bucle?",
                options = listOf("try-catch", "if-else", "for", "break"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'null' en programación?",
                options = listOf("Una cadena vacía", "Un error", "Una variable sin valor asignado", "Una función oculta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es GitHub?",
                options = listOf("Un lenguaje de programación", "Una red social", "Un sistema operativo", "Una plataforma para alojar código"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una base de datos relacional?",
                options = listOf("Una estructura basada en grafos", "Una colección de archivos", "Una colección organizada en tablas",
                    "Una secuencia de comandos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es 'front-end' en desarrollo web?",
                options = listOf("El código que se ejecuta en el servidor", "El lado visual y de interacción de la web", "La base de datos",
                    "La configuración del servidor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja del lenguaje C?",
                options = listOf("Muy fácil de leer", "No necesita compilación", "Acceso a bajo nivel y rapidez", "Orientado a objetos por defecto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué librería de Python es popular para análisis de datos?",
                options = listOf("NumPy", "TensorFlow", "OpenGL", "PyGame"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué lenguaje se usa en Android nativamente?",
                options = listOf("Python", "Kotlin", "Swift", "Ruby"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'refactorizar' código?",
                options = listOf("Cambiar el lenguaje", "Eliminar archivos", "Modificar el código sin cambiar su funcionalidad",
                    "Corregir errores sintácticos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'array'?",
                options = listOf("Una función", "Una clase", "Una interfaz gráfica", "Una estructura de datos que contiene una colección"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un algoritmo?",
                options = listOf("Una línea de código", "Una estructura de control", "Una secuencia de pasos para resolver un problema", "Un archivo ejecutable"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué lenguaje está basado en el navegador y es esencial para interactividad web?",
                options = listOf("Java", "Python", "JavaScript", "Ruby"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función en Python imprime texto en consola?",
                options = listOf("print()", "echo()", "write()", "console()"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué palabra clave se usa en Java para herencia?",
                options = listOf("extend", "implements", "inherits", "extends"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un 'commit' en Git?",
                options = listOf("Un error", "Una rama", "Un guardado de cambios", "Una solicitud de código"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una 'excepción' en programación?",
                options = listOf("Un tipo de bucle", "Una condición esperada", "Un error manejable en tiempo de ejecución", "Un tipo de archivo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué lenguaje fue creado por Guido van Rossum?",
                options = listOf("Java", "Python", "C#", "Swift"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una 'variable global'?",
                options = listOf("Una variable que existe solo dentro de una función", "Una variable que puede ser accedida en todo el programa",
                    "Una variable que almacena archivos", "Una variable local renombrada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'compilar' un programa?",
                options = listOf("Ejecutarlo directamente", "Convertir código fuente a lenguaje máquina", "Escribirlo en HTML", "Moverlo a la nube"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué lenguaje usa la extensión '.js'?",
                options = listOf("Java", "JSON", "Jupyter", "JavaScript"),
                correctIndex = 3
            ),
            QuizQuestion(question = "¿Qué significa la sigla HTML?",
            options = listOf("HyperText Markup Language", "Hyper Transfer Machine Language", "Home Tool Markup Language", "Hyperlink and Text Management Language"),
            correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos lenguajes es de tipado dinámico?",
                options = listOf("Java", "C#", "Python", "C++"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un bucle infinito?",
                options = listOf("Un error en HTML", "Un ciclo que nunca termina", "Un tipo de variable", "Una función de una sola línea"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Para qué se usa Git?",
                options = listOf("Crear gráficos", "Controlar versiones de código", "Editar bases de datos", "Compilar programas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estructura permite repetir instrucciones múltiples veces?",
                options = listOf("Condicional", "Loop", "Función", "Constante"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una función?",
                options = listOf("Un bucle", "Un conjunto de instrucciones agrupadas", "Un error del sistema", "Un valor constante"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un lenguaje de programación funcional?",
                options = listOf("Haskell", "C", "SQL", "CSS"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una variable?",
                options = listOf("Un bucle", "Una constante", "Un espacio para almacenar datos", "Un tipo de error"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de un compilador?",
                options = listOf("Traducir código fuente a código máquina", "Corregir errores automáticamente", "Escribir documentación", "Diseñar interfaces"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué operador se usa para comparar igualdad en la mayoría de lenguajes?",
                options = listOf("=", "==", "!=", "++"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un bug?",
                options = listOf("Un tipo de hardware", "Una falla en el código", "Una nueva versión", "Una función especial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un bug?",
                options = listOf("Un tipo de hardware", "Una falla en el código", "Una nueva versión", "Una función especial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un IDE?",
                options = listOf("Un lenguaje de programación", "Un compilador", "Un entorno de desarrollo integrado", "Un tipo de error"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa la extensión '.py'?",
                options = listOf("Python", "Perl", "PHP", "Pascal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué comando se usa para clonar un repositorio en Git?",
                options = listOf("git init", "git clone", "git fork", "git pull"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa comúnmente para manejar dependencias en proyectos Java?",
                options = listOf("Composer", "NPM", "Gradle", "Yarn"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una API?",
                options = listOf("Un lenguaje de programación", "Una base de datos", "Una interfaz de programación de aplicaciones", "Un compilador"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de dato usarías para representar una letra?",
                options = listOf("Booleano", "String", "Char", "Int"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa depurar un programa?",
                options = listOf("Eliminar partes del código", "Ejecutarlo", "Buscar y corregir errores", "Compilarlo manualmente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué simboliza `!=` en muchos lenguajes?",
                options = listOf("Asignación", "Igualdad", "Desigualdad", "Comparación estricta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hace un backend developer?",
                options = listOf("Diseña la interfaz", "Escribe código del lado del servidor", "Diseña logos", "Edita videos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa SQL?",
                options = listOf("Simple Query List", "Structured Query Language", "System Quick Logic", "Sequential Question Language"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas bases de datos es relacional?",
                options = listOf("MongoDB", "Redis", "MySQL", "Neo4j"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una condición if?",
                options = listOf("Una constante", "Un bucle", "Una estructura de decisión", "Un comentario"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué operador lógico representa la conjunción (Y)?",
                options = listOf("&&", "||", "!", "=="),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un commit en Git?",
                options = listOf("Una fusión", "Un error", "Un guardado de cambios", "Una reversión"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué lenguaje es conocido por su uso en ciencia de datos?",
                options = listOf("Ruby", "Python", "Swift", "Assembly"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un lenguaje compilado?",
                options = listOf("C++", "Go", "Python", "Rust"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hace una función recursiva?",
                options = listOf("Se ejecuta en bucle externo", "Llama a otra función", "Se llama a sí misma", "Es parte de una clase abstracta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un breakpoint?",
                options = listOf("Un tipo de error", "Una interrupción para debug", "Una función especial", "Una condición de bucle"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función de un front-end developer?",
                options = listOf("Diseñar la lógica del servidor", "Diseñar interfaces de usuario", "Optimizar servidores", "Configurar bases de datos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué comando Git crea una nueva rama?",
                options = listOf("git commit", "git merge", "git branch", "git init"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué librería se usa comúnmente con React?",
                options = listOf("NumPy", "Express", "Redux", "Django"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un booleano?",
                options = listOf("Número decimal", "Cadena de texto", "Tipo de dato que representa verdadero o falso", "Tipo de bucle"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa la extensión '.js'?",
                options = listOf("Java Symbol", "JavaScript", "JQuery Style", "JSON Script"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hace una API REST?",
                options = listOf("Conecta hardware", "Permite comunicación entre sistemas a través de HTTP", "Genera HTML dinámico", "Controla acceso a puertos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un error de sintaxis?",
                options = listOf("Falla en la lógica", "Falla en la conexión", "Falla por mal uso de lenguaje", "Falla del compilador"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa DRY en programación?",
                options = listOf("Don’t Repeat Yourself", "Debug and Run Yourself", "Develop Rapidly Yes", "Dynamic Runtime Yield"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué lenguaje usa llaves `{}` para bloques de código?",
                options = listOf("Python", "Ruby", "Java", "Lua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa refactorizar código?",
                options = listOf("Eliminar funciones", "Cambiar nombres de variables", "Modificar estructura sin cambiar funcionalidad", "Comprimir el archivo"),
                correctIndex = 2
            )
        ),





        //********************************************************************************************************************************

        "Videojuegos" to listOf(
            QuizQuestion(
                question = "¿Cuál es el personaje principal de la saga The Legend of Zelda?",
                options = listOf("Zelda", "Ganondorf", "Epona", "Link"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué compañía creó la consola PlayStation?",
                options = listOf("Nintendo", "Microsoft", "Sony", "Sega"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de juego es 'League of Legends'?",
                options = listOf("FPS", "MOBA", "RPG por turnos", "Simulador"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos fue lanzado primero?",
                options = listOf("Minecraft", "Fortnite", "Tetris", "Call of Duty: Warzone"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿En qué videojuego es protagonista un plomero italiano?",
                options = listOf("Sonic the Hedgehog", "Crash Bandicoot", "Halo", "Super Mario Bros"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del protagonista de la serie Halo?",
                options = listOf("Solid Snake", "Master Chief", "Shepard", "Marcus Fenix"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'RPG' en videojuegos?",
                options = listOf("Racing Pro Gear", "Realistic Power Game", "Role-Playing Game", "Retro Pixel Game"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del mundo principal en Minecraft?",
                options = listOf("Overworld", "Underworld", "Skyland", "End Dimension"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué saga de videojuegos tiene como protagonista a Kratos?",
                options = listOf("God of War", "Dark Souls", "Final Fantasy", "The Witcher"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué videojuego popular lanzó Epic Games en 2017?",
                options = listOf("PUBG", "Fortnite", "Apex Legends", "Overwatch"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué juego puedes capturar criaturas llamadas Pokémon?",
                options = listOf("Digimon World", "Yo-Kai Watch", "Monster Rancher", "Pokémon"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál fue la primera consola de videojuegos de Nintendo?",
                options = listOf("Nintendo 64", "Super Nintendo", "NES", "GameCube"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué animal es Sonic?",
                options = listOf("Zorro", "Gato", "Erizo", "Ardilla"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué empresa desarrolla la saga Grand Theft Auto?",
                options = listOf("Ubisoft", "Rockstar Games", "Activision", "Electronic Arts"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de juego es 'The Sims'?",
                options = listOf("FPS", "Simulación de vida", "MOBA", "Horror de supervivencia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos pertenece al género Battle Royale?",
                options = listOf("Counter-Strike", "Valorant", "Overwatch", "PUBG"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué personaje es un cazador de monstruos en un universo oscuro?",
                options = listOf("Geralt de Rivia", "Ezio Auditore", "Mario", "Kratos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿En qué juego puedes construir con bloques y explorar libremente?",
                options = listOf("Tetris", "Minecraft", "Call of Duty", "FIFA"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo principal en Pac-Man?",
                options = listOf("Disparar a enemigos", "Correr y esquivar obstáculos", "Comer puntos y evitar fantasmas", "Construir estructuras"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿En qué juego aparece la Trifuerza?",
                options = listOf("Elden Ring", "Dark Souls", "The Legend of Zelda", "Castlevania"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Quién es el creador de Super Mario?",
                options = listOf("Hideo Kojima", "Gabe Newell", "Cliff Bleszinski", "Shigeru Miyamoto"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué género combina acción con resolución de acertijos y plataformas?",
                options = listOf("Survival horror", "Shoot 'em up", "Metroidvania", "MMORPG"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿En qué juego debes escapar de criaturas llamadas Creepers?",
                options = listOf("Subnautica", "Ark", "Minecraft", "Terraria"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué juego popular fue desarrollado por Mojang?",
                options = listOf("Roblox", "Terraria", "Among Us", "Minecraft"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué juego incluye al personaje Lara Croft?",
                options = listOf("Horizon Zero Dawn", "Tomb Raider", "Genshin Impact", "Mass Effect"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos es una serie de disparos en primera persona?",
                options = listOf("Need for Speed", "The Sims", "Call of Duty", "Super Smash Bros"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué juego está ambientado en la ciudad ficticia de Raccoon City?",
                options = listOf("The Last of Us", "Silent Hill", "Resident Evil", "Dead Space"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'NPC' en videojuegos?",
                options = listOf("No Player Combat", "New Player Character", "Network Play Console", "Non-Playable Character"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué saga es conocida por su dificultad extrema?",
                options = listOf("Dark Souls", "Animal Crossing", "Mario Kart", "FIFA"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué consola compite directamente con Xbox y PlayStation?",
                options = listOf("Commodore 64", "Nintendo Switch", "Wii Fit", "Game Boy Color"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el juego más vendido de todos los tiempos (hasta 2025)?",
                options = listOf("GTA V", "Minecraft", "Tetris", "Wii Sports"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué empresa creó el juego 'The Witcher 3'?",
                options = listOf("Ubisoft", "CD Projekt Red", "Bethesda", "Rockstar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué videojuego popular permite bailar y construir durante combates?",
                options = listOf("Valorant", "PUBG", "Overwatch", "Fortnite"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos títulos es un juego de pelea?",
                options = listOf("Super Smash Bros", "Portal", "Stardew Valley", "Flight Simulator"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'easter egg' en videojuegos?",
                options = listOf("Modo difícil", "Objeto que cura", "Mensaje o secreto oculto", "Truco para ganar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿En qué juego puedes jugar como cazador o monstruo?",
                options = listOf("Left 4 Dead", "Monster Hunter", "Hollow Knight", "Celeste"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué personaje es parte de la franquicia de lucha Tekken?",
                options = listOf("Ken", "Scorpion", "Jin Kazama", "Zelda"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué compañía desarrolló 'The Elder Scrolls V: Skyrim'?",
                options = listOf("Valve", "Bethesda", "Blizzard", "Konami"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una expansión (DLC) en videojuegos?",
                options = listOf("Error del juego", "Modo multijugador", "Contenido adicional descargable", "Traducción del juego"),
                correctIndex = 2
            )
        ),

        
        //********************************************************************************************************************************


        "Juegos de mesa" to listOf(
            QuizQuestion(
                question = "¿Cuál es el objetivo principal del juego 'Catan'?",
                options = listOf("Construir imperios", "Conquistar continentes", "Colonizar Marte", "Acumular 10 puntos de victoria"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿En qué juego se usan recursos como madera, ladrillo y oveja?",
                options = listOf("Risk", "Catan", "Dominion", "Carcassonne"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué juego consiste en colocar losetas para formar ciudades, caminos y campos?",
                options = listOf("Azul", "Ticket to Ride", "Carcassonne", "Pandemic"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos es cooperativo?",
                options = listOf("Codenames", "Pandemic", "Splendor", "7 Wonders"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué juego utiliza trenes para conectar ciudades?",
                options = listOf("Ticket to Ride", "Power Grid", "Railroad Tycoon", "Monopoly"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos es de colocación de trabajadores?",
                options = listOf("Catan", "Terraforming Mars", "Agricola", "Uno"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué color no es uno de los tradicionales en el ajedrez?",
                options = listOf("Blanco", "Negro", "Rojo", "Todos son tradicionales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué juego consiste en construir vitrales usando dados?",
                options = listOf("Sagrada", "Azul", "Patchwork", "Dixit"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Quién diseñó el juego 'Catan'?",
                options = listOf("Reiner Knizia", "Klaus Teuber", "Bruno Cathala", "Eric Lang"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué juego se juega con palabras y pistas de un 'espía'?",
                options = listOf("Codenames", "Decrypto", "Pictionary", "Just One"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos utiliza cartas para construir mazos?",
                options = listOf("Catan", "Dominion", "Azul", "Hive"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de juego es 'Dixit'?",
                options = listOf("Juego de deducción", "Juego de memoria", "Juego de cartas abstractas", "Juego de asociación de imágenes"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos fue creado antes del 2000?",
                options = listOf("7 Wonders", "Catan", "Azul", "Wingspan"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué juego se pueden robar cartas de otros jugadores usando espías?",
                options = listOf("Love Letter", "Dominion", "Citadels", "Bang!"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué juego consiste en evitar una pandemia global?",
                options = listOf("Pathogenesis", "Plague Inc.", "Pandemic", "Virus!"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se colecciona en el juego 'Splendor'?",
                options = listOf("Tesoros", "Recursos naturales", "Cartas de nobleza", "Gemas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué juego tiene como objetivo adivinar palabras con pistas de una sola palabra?",
                options = listOf("Just One", "Dixit", "Tabú", "Time's Up"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos es asimétrico?",
                options = listOf("Carcassonne", "Root", "Sushi Go", "King of Tokyo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué juego se construye un zoológico con losetas?",
                options = listOf("Ark Nova", "Wingspan", "Everdell", "Parks"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué juego tiene como objetivo formar la mejor colección de aves?",
                options = listOf("Root", "Wingspan", "Pax Pamir", "Viticulture"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué mecánica es típica de los juegos tipo 'Legacy'?",
                options = listOf("Jugar solo una vez", "Modo solitario", "Juegos con app móvil", "Campañas continuas y cambios permanentes"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'AP' en el contexto de juegos de mesa?",
                options = listOf("Active Play", "Analysis Paralysis", "Action Points", "All Play"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué juego se inspira en el universo de Lovecraft?",
                options = listOf("Gloomhaven", "Clank!", "Lords of Waterdeep", "Arkham Horror"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué juego involucra conquistar el mundo con tropas?",
                options = listOf("Risk", "Carcassonne", "Azul", "Everdell"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se usa para determinar acciones en 'King of Tokyo'?",
                options = listOf("Cartas", "Losetas", "Dados", "Miniaturas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un famoso juego de roles ocultos?",
                options = listOf("Terraforming Mars", "Bang!", "Twilight Struggle", "Splendor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué juego compites para producir vino?",
                options = listOf("Brass: Birmingham", "Viticulture", "Food Chain Magnate", "Fresco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué juego se juega en varias eras con cartas simultáneas?",
                options = listOf("7 Wonders", "Azul", "Love Letter", "Everdell"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué juego tiene cartas con números y colores, y se debe deshacer de todas?",
                options = listOf("Uno", "Exploding Kittens", "Love Letter", "Dobble"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué diseñador es famoso por sus juegos con mecánicas matemáticas?",
                options = listOf("Uwe Rosenberg", "Reiner Knizia", "Eric Lang", "Isaac Childres"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se acumula en 'Terraforming Mars' para ganar?",
                options = listOf("Puntos de colonización", "Energía", "Puntos de terraformación", "Cristales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos es principalmente abstracto?",
                options = listOf("Hive", "Root", "Ticket to Ride", "Dominion"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué juego tiene como objetivo construir una ciudad medieval?",
                options = listOf("Citadels", "Pandemic", "Dominion", "Camel Up"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿En qué juego se gana completando misiones secretas?",
                options = listOf("7 Wonders", "Small World", "Secret Hitler", "Ticket to Ride: Europe"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta usan muchos jugadores para llevar el control de sus juegos?",
                options = listOf("BGG", "Reddit", "Steam", "Trello"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de juego es 'Pax Pamir'?",
                options = listOf("Juego de miniaturas", "Eurogame ligero", "Juego de política e influencia", "Juego de roles ocultos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué juego es famoso por su campaña y muchas miniaturas?",
                options = listOf("Gloomhaven", "Azul", "Ticket to Ride", "Splendor"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué juego se juega con cartas de sushi?",
                options = listOf("Love Letter", "Sushi Go", "Point Salad", "Timeline"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué juego popular fue creado por Elizabeth Hargrave?",
                options = listOf("Wingspan", "Dominion", "Azul", "Everdell"),
                correctIndex = 0
            )
        ),


        //********************************************************************************************************************************

        "Ajedrez" to listOf(
            QuizQuestion(
                question = "¿Quién fue campeón mundial de ajedrez durante 27 años consecutivos?",
                options = listOf("Bobby Fischer", "Garry Kasparov", "Magnus Carlsen", "Emanuel Lasker"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué pieza puede saltar sobre otras piezas?",
                options = listOf("Reina", "Peón", "Torre", "Caballo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el único movimiento en el que se mueven dos piezas a la vez?",
                options = listOf("Enroque", "Captura al paso", "Promoción", "Apertura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué jugador rompió la hegemonía soviética al ganar el Campeonato Mundial en 1972?",
                options = listOf("Anatoly Karpov", "Viswanathan Anand", "Garry Kasparov", "Bobby Fischer"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe la apertura 1.e4 c5?",
                options = listOf("Apertura Inglesa", "Defensa Francesa", "Defensa Siciliana", "Gambito de Rey"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pieza se promueve al llegar a la última fila?",
                options = listOf( "Caballo", "Torre", "Alfil","Peón"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué país ha tenido más campeones mundiales de ajedrez?",
                options = listOf("Estados Unidos", "India", "Rusia/URSS", "España"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué jugador fue el primer campeón mundial oficial?",
                options = listOf("Paul Morphy", "Wilhelm Steinitz", "José Raúl Capablanca", "Emanuel Lasker"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántas casillas tiene un tablero de ajedrez?",
                options = listOf("64", "100", "81", "72"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cómo se llama la jugada especial que permite capturar a un peón que acaba de avanzar dos casillas?",
                options = listOf("Enroque", "Ataque doble", "Captura al paso", "Gambito"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el Elo más alto registrado por un jugador?",
                options = listOf("2882", "2825", "2766", "2905"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas es una apertura de ajedrez?",
                options = listOf("Defensa Italiana", "Defensa Belga", "Ataque Americano", "Defensa Suiza"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pieza comienza en la esquina del tablero?",
                options = listOf("Rey", "Caballo", "Torre", "Alfil"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuántos peones hay al inicio de una partida por jugador?",
                options = listOf("6", "7", "8", "9"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué jugador es conocido como 'el Mozart del ajedrez'?",
                options = listOf("Magnus Carlsen", "Hikaru Nakamura", "Bobby Fischer", "José Raúl Capablanca"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la duración típica de una partida de ajedrez clásico?",
                options = listOf("3 minutos", "90 minutos + incremento", "15 minutos", "10 minutos sin incremento"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'tablas' en ajedrez?",
                options = listOf("Victoria", "Derrota", "Empate", "Enroque largo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pieza es más poderosa en el medio juego?",
                options = listOf("Peón", "Caballo", "Reina", "Rey"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué campeón mundial fue conocido por su estilo defensivo?",
                options = listOf("Garry Kasparov", "Bobby Fischer", "Tigran Petrosian", "Mikhail Tal"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué variante de ajedrez incluye una fase de 'duelo de preparación' antes del juego?",
                options = listOf("Ajedrez960", "Ajedrez por correspondencia", "Ajedrez Fischer Random", "Ajedrez Armagedón"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué evento de ajedrez se celebra anualmente en Wijk aan Zee?",
                options = listOf("Copa Sinquefield", "Torneo de Linares", "Tata Steel", "Copa de Candidatos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pieza NO puede cambiar de color de casilla en su movimiento?",
                options = listOf("Caballo", "Alfil", "Torre", "Rey"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo del ajedrez?",
                options = listOf("Comer todas las piezas", "Llegar al otro lado del tablero", "Dar jaque mate al rey", "Capturar la reina"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Quién escribió 'Mi Sistema'?",
                options = listOf("Aron Nimzowitsch", "Alexander Alekhine", "Vladimir Kramnik", "Mikhail Botvinnik"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué jugador fue famoso por su estilo táctico y agresivo en los 60s?",
                options = listOf("Anatoly Karpov", "Mikhail Tal", "Boris Spassky", "Tigran Petrosian"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del movimiento inicial 1.d4 d5 2.c4?",
                options = listOf("Gambito de Dama", "Defensa Francesa", "Apertura Inglesa", "Defensa Caro-Kann"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pieza puede moverse cualquier número de casillas en línea recta o diagonal?",
                options = listOf("Alfil", "Reina", "Torre", "Caballo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué torneo decide el retador al campeonato mundial?",
                options = listOf("Torneo de Candidatos", "Olimpiada de Ajedrez", "Tata Steel", "Grand Prix"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el movimiento más raro para dar jaque mate con solo dos movimientos?",
                options = listOf("Mate de Legal", "Mate del Loco", "Mate de Boden", "Mate de Rey y peón"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Quién fue campeón mundial inmediatamente antes de Magnus Carlsen?",
                options = listOf("Garry Kasparov", "Vladimir Kramnik", "Viswanathan Anand", "Sergey Karjakin"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'zugzwang'?",
                options = listOf("Captura forzada", "Situación en la que mover empeora la posición", "Apertura cerrada", "Cambio de dama"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'gambito' en ajedrez?",
                options = listOf("Capturar una pieza menor", "Perder una torre", "Entregar una pieza por iniciativa", "Cambio de alfiles"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos países NO ha tenido un campeón mundial?",
                options = listOf("India", "Cuba", "Brasil", "Noruega"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes casillas no pertenece a las casillas centrales del tablero de ajedrez?",
                options = listOf("d4", "e5", "e4", "c3"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo del gambito de rey?",
                options = listOf("Controlar el centro rápidamente", "Desarrollar el alfil de rey", "Proteger al rey", "Forzar el enroque del oponente"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos campeones mundiales es noruego?",
                options = listOf("Bobby Fischer", "Magnus Carlsen", "Ding Liren", "Garry Kasparov"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué campeona mundial femenina mantuvo el título 16 años?",
                options = listOf("Judit Polgar", "Maia Chiburdanidze", "Hou Yifan", "Nona Gaprindashvili"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuántas casillas tiene un tablero de ajedrez?",
                options = listOf("64", "72", "81", "100"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cómo se mueve el alfil?",
                options = listOf("En línea recta", "En L", "Diagonal", "Una casilla en cualquier dirección"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pieza puede realizar el enroque junto al rey?",
                options = listOf("Peón", "Reina", "Alfil", "Torre"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la única pieza que puede saltar sobre otras?",
                options = listOf("Reina", "Caballo", "Alfil", "Torre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa jaque mate?",
                options = listOf("Empate", "Rey no puede escapar al ataque", "Cambio de turno", "Captura de reina"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué pieza comienza en d1 para blancas?",
                options = listOf("Reina", "Rey", "Torre", "Alfil"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué sucede si un peón llega al final del tablero?",
                options = listOf("Gana la partida", "Captura automáticamente", "Se promociona", "Se convierte en rey"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuántas piezas mayores hay al inicio por jugador?",
                options = listOf("2", "3", "4", "5"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Quién fue campeón mundial desde 1985 hasta 2000?",
                options = listOf("Fischer", "Karpov", "Kasparov", "Carlsen"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué apertura comienza con e4 e5 Cf3 Cc6?",
                options = listOf("Defensa francesa", "Apertura italiana", "Gambito de dama", "Defensa siciliana"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué valor tiene usualmente una torre?",
                options = listOf("3", "5", "9", "1"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se considera una táctica?",
                options = listOf("Plan a largo plazo", "Maniobra inmediata para obtener ventaja", "Control del centro", "Enroque"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el enroque?",
                options = listOf("Cambio de reina", "Intercambio de torres", "Movimiento especial del rey y torre", "Empate técnico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué jugador popularizó la defensa Petrov?",
                options = listOf("Kramnik", "Petrosian", "Petrov", "Alekhine"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué representa el Elo en ajedrez?",
                options = listOf("Edad", "Nacionalidad", "Fuerza de juego", "Tiempo restante"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pasa si se repite una posición 3 veces?",
                options = listOf("Victoria blanca", "Victoria negra", "Empate", "Cambio de colores"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un zugzwang?",
                options = listOf("Empate", "Peón pasado", "Situación en la que mover empeora", "Ataque doble"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo del medio juego?",
                options = listOf("Capturar peones", "Intercambiar piezas", "Atacar al rey", "Desarrollar aperturas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué jugador argentino fue campeón mundial en 1927?",
                options = listOf("Najdorf", "Panno", "Fischer", "Capablanca"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué pasa si ambos reyes están en jaque?",
                options = listOf("Es legal", "No puede ocurrir", "Se repite la jugada", "Mate doble"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Modelismo" to listOf(
            QuizQuestion(
                question = "¿Qué es el modelismo?",
                options = listOf("Una rama del arte abstracto", "La fabricación de réplicas en miniatura de objetos reales", "Una técnica de escultura con arcilla", "Una forma de arquitectura digital"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué escala es común en el modelismo ferroviario?",
                options = listOf("1:2", "1:35", "1:1", "1:87 (escala H0)"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de pintura se usa comúnmente en modelismo?",
                options = listOf("Pintura a la tiza", "Acuarela", "Acrílica o esmalte", "Óleo artístico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una herramienta esencial para cortar piezas con precisión?",
                options = listOf("Martillo", "Sierra eléctrica", "Cúter de modelismo", "Llave inglesa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material es común en kits de modelismo plástico?",
                options = listOf("Poliestireno","Acero", "PVC expandido",  "Goma EVA"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa la escala 1:48?",
                options = listOf("Que la maqueta es 48 veces más grande", "Que 1 unidad en el modelo equivale a 48 en la realidad", "Que el modelo está a tamaño real", "Que el modelo mide 48 cm"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para unir piezas de plástico en modelismo?",
                options = listOf("Silicona fría", "Pegamento blanco", "Grapas", "Cemento para plástico"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para simular desgaste en modelos militares?",
                options = listOf("Envejecido (weathering)","Aerografía inversa", "Lavado acrílico",  "Pulido final"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una maqueta estática?",
                options = listOf("Una maqueta que tiene movimiento", "Una maqueta funcional", "Una maqueta fija sin partes móviles", "Una maqueta con sonido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de modelismo replica barcos y embarcaciones?",
                options = listOf("Modelismo ferroviario", "Modelismo naval", "Modelismo aéreo", "Modelismo arquitectónico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de modelismo implica aviones a control remoto?",
                options = listOf("Modelismo estático", "Modelismo arquitectónico", "Aeromodelismo", "Modelismo ferroviario"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un diorama en modelismo?",
                options = listOf("Una técnica de pintura", "Una escena completa en miniatura que incluye contexto", "Un tipo de vehículo", "Un modelo a escala real"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda usar para pintar modelos con mayor detalle y control?",
                options = listOf("Brocha de pared", "Aerógrafo", "Pincel para óleo", "Rociador de jardín"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de lija se recomienda para modelismo?",
                options = listOf("Grano grueso", "Grano medio", "Grano fino o micromesh", "Lija metálica"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se usa para rellenar imperfecciones en piezas de plástico?",
                options = listOf("Pegamento escolar", "Masilla para modelismo", "Silicona", "Cinta adhesiva"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para aplicar calcas o decals correctamente?",
                options = listOf("Vinagre", "Cola blanca", "Agua tibia y solución adhesiva", "Pintura mate"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué escala es más usada en modelos de aviones militares?",
                options = listOf("1:4", "1:144", "1:1", "1:72"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo del 'dry brushing'?",
                options = listOf("Lavar el modelo", "Dar brillo", "Cubrir errores de pintura", "Resaltar bordes y detalles"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de modelismo representa tanques y soldados?",
                options = listOf("Modelismo naval", "Modelismo civil", "Modelismo militar", "Modelismo ferroviario"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para sujetar piezas mientras se pegan?",
                options = listOf("Cinta aislante", "Sargento o pinzas de presión", "Regla metálica", "Aguja de coser"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un kit 'snap fit'?",
                options = listOf("Un modelo que se imprime en 3D", "Un modelo a escala 1:1", "Un modelo que no requiere pegamento", "Un modelo con partes electrónicas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué son las maquetas 'scratch built'?",
                options = listOf("Hechas desde cero con materiales libres", "Compradas ya armadas", "De madera únicamente", "Solo disponibles en museos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos materiales es común en modelismo naval tradicional?",
                options = listOf("Metal fundido", "Resina", "Madera", "Goma"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de pintar un modelo?",
                options = listOf("Lijarlo y lavarlo", "Dejarlo al sol", "Usar aceite", "Doblarlo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué diferencia hay entre una maqueta y un modelo funcional?",
                options = listOf("El color", "La escala", "El modelo funcional tiene partes móviles y operativas", "Ninguna"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué representa una escala 1:35?",
                options = listOf("Modelo más grande que el original", "El modelo es 35 veces más pequeño que el objeto real", "Tamaño real", "Un modelo conceptual"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un tipo de modelismo?",
                options = listOf("Naval", "Ferroviario", "Aéreo", "Virtual"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es una marca reconocida en modelismo plástico?",
                options = listOf("Bosch", "Tamiya", "Makita", "Coca-Cola"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se usa para simular óxido en maquetas?",
                options = listOf("Esmalte brillante", "Pigmentos y pintura marrón/naranja", "Papel de aluminio", "Lija gruesa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se puede usar para simular vegetación en un diorama?",
                options = listOf("Tijeras", "Plástico transparente", "Flock o espuma triturada", "Cinta de papel"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para conservar un modelo terminado?",
                options = listOf("Guardarlo al sol", "Barnizarlo y mantenerlo en vitrina", "Pintarlo cada semana", "Cubrirlo con cinta adhesiva"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de modelismo implica automóviles y camiones?",
                options = listOf("Modelismo ferroviario", "Modelismo naval", "Modelismo textil", "Modelismo civil"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe el modelismo de figuras fantásticas o ciencia ficción?",
                options = listOf("Modelismo realista", "Modelismo futurista", "Modelismo fantástico", "Modelismo técnico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja de usar imprimación en un modelo?",
                options = listOf("Lo hace más pesado", "Reduce detalles", "Permite mejor adherencia de la pintura", "Cambia la escala"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué escala es típica en trenes de jardín (grandes)?",
                options = listOf("1:24 (escala G)","1:1", "1:160",  "1:144"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué líquido ayuda a diluir pintura acrílica en modelismo?",
                options = listOf("Aceite de cocina", "Diluyente acrílico o agua destilada", "Alcohol isopropílico", "Cloro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del proceso se conoce como 'montaje en seco'?",
                options = listOf("Probar el ensamblado sin pegar", "Pintar sin barniz", "Lijar sin máscara", "Armar con calor"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué elemento se puede añadir para simular agua en dioramas?",
                options = listOf("Cristal", "Pegamento blanco", "Resina epóxica o gel acrílico", "Tierra real"),
                correctIndex = 2
            )
        ),



        //********************************************************************************************************************************


        "Hacer ejercicio" to listOf(
            QuizQuestion(
                question = "¿Qué músculo principal se trabaja al hacer sentadillas?",
                options = listOf("Tríceps", "Cuádriceps", "Bíceps femoral", "Pectorales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de ejercicio es mejor para mejorar la resistencia cardiovascular?",
                options = listOf("Flexiones", "Sprint corto", "Trote o carrera continua", "Levantamiento de pesas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa HIIT?",
                options = listOf("Heavy Intensity Interval Training", "High Intensity Interval Training", "Heavy Integrated Isometric Training", "High Integrated Isolated Training"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántos minutos de ejercicio moderado se recomienda por semana para adultos?",
                options = listOf("60", "150", "200", "300"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes es un ejercicio de peso corporal?",
                options = listOf("Prensa de piernas", "Curl de bíceps", "Plancha", "Peso muerto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué nutriente es la principal fuente de energía para el cuerpo durante el ejercicio?",
                options = listOf("Proteínas", "Vitaminas", "Grasas saturadas", "Carbohidratos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la mejor manera de evitar lesiones durante el ejercicio?",
                options = listOf("No descansar nunca", "Levantar siempre el máximo peso", "Hacer calentamiento previo", "No hidratarse"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se fortalece con los abdominales?",
                options = listOf("Pecho", "Espalda baja", "Zona media del torso (core)", "Piernas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa hacer una repetición (repet)?",
                options = listOf("Un conjunto de ejercicios diferentes", "Una ronda de cardio", "Hacer un solo movimiento completo de un ejercicio", "Un descanso entre series"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué grupo muscular trabaja principalmente el 'press de banca'?",
                options = listOf("Pectorales", "Espalda", "Abdominales", "Tríceps femoral"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué beneficio trae el entrenamiento de fuerza?",
                options = listOf("Pérdida de flexibilidad", "Disminución ósea", "Disminución de la movilidad", "Aumento de masa muscular y fuerza"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer después del entrenamiento para ayudar a la recuperación?",
                options = listOf("Dormir solo 2 horas", "Evitar líquidos", "Estiramientos y alimentación adecuada", "Comer solo dulces"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'calistenia'?",
                options = listOf("Ejercicio con pesas", "Ejercicio en agua", "Ejercicio con el propio peso corporal", "Ejercicio con máquinas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el músculo más grande del cuerpo humano?",
                options = listOf("Tríceps", "Glúteo mayor", "Pectoral mayor", "Sartorio"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos ejercicios mejora principalmente el equilibrio?",
                options = listOf("Peso muerto", "Flexiones", "Sentadillas con una pierna", "Curl de bíceps"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una serie en el contexto del entrenamiento?",
                options = listOf("Un circuito de cardio", "Una pausa prolongada", "Un tipo de ejercicio aeróbico", "Un grupo de repeticiones"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué músculo se trabaja principalmente con el curl de bíceps?",
                options = listOf("Bíceps braquial", "Deltoides", "Pectorales", "Trapecio"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ejercicio es más eficaz para fortalecer la espalda baja?",
                options = listOf("Flexiones", "Peso muerto", "Plancha", "Sentadillas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el VO2 máximo?",
                options = listOf("El máximo peso levantado", "La frecuencia cardíaca máxima", "La máxima cantidad de oxígeno que el cuerpo puede utilizar", "La velocidad máxima en sprint"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo trabaja principalmente el remo con barra?",
                options = listOf("Pecho", "Espalda", "Piernas", "Abdomen"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es mejor para aumentar masa muscular?",
                options = listOf("Ejercicio aeróbico continuo", "Pesas con pocas repeticiones y mucho peso", "Estiramientos", "Solo caminar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa tener una buena técnica de ejecución?",
                options = listOf("Ejercitar rápido", "Mover más peso sin importar cómo", "Usar solo una mano", "Hacer los movimientos correctamente y seguros"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué músculo se activa al hacer zancadas (lunges)?",
                options = listOf("Trapecios", "Deltoides", "Glúteos y cuádriceps", "Pectorales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ejercicio trabaja principalmente los hombros?",
                options = listOf("Press militar", "Sentadillas", "Plancha", "Curl de piernas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa la palabra 'cardio'?",
                options = listOf("Corazón", "Pulmones", "Resistencia", "Ejercicio con pesas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué líquido es vital consumir durante el ejercicio?",
                options = listOf("Bebida alcohólica", "Refrescos", "Agua", "Jugo de frutas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de ejercicio ayuda a mejorar la flexibilidad?",
                options = listOf("Sprint", "Estiramientos dinámicos o estáticos", "Saltos", "Entrenamiento de fuerza pura"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se fortalece con el puente de glúteos?",
                options = listOf("Espalda alta", "Hombros", "Glúteos y zona lumbar", "Pantorrillas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes es un ejercicio pliométrico?",
                options = listOf("Sentadilla isométrica", "Flexión de brazos", "Remo con barra", "Saltos en caja (box jumps)"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el entrenamiento funcional?",
                options = listOf("Solo con máquinas", "Entrenamiento que mejora movimientos cotidianos", "Ejercicio para culturismo", "Solo se hace en casa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una señal común de sobreentrenamiento?",
                options = listOf("Dormir bien", "Recuperación rápida", "Fatiga constante y bajo rendimiento", "Ganas de entrenar todo el día"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué músculo trabaja el ejercicio de dominadas (pull-ups)?",
                options = listOf("Dorsales","Pectorales", "Deltoides",  "Abdominales"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ejercicio es ideal para fortalecer el core?",
                options = listOf("Estocadas", "Plancha", "Curl de bíceps", "Press de banca"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué macronutriente es clave para la recuperación muscular?",
                options = listOf("Grasas", "Vitaminas", "Proteínas", "Minerales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un buen objetivo para un principiante que quiere entrenar fuerza?",
                options = listOf("Entrenar 7 días seguidos", "Hacer solo cardio", "Ejercitarse 3-4 veces por semana con progresión", "Evitar el descanso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué equipo se utiliza comúnmente en ejercicios de resistencia?",
                options = listOf("Pelota de yoga", "Cuerda de saltar", "Colchoneta", "Banda elástica (resistance band)"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de ejercicio es más efectivo para quemar grasa?",
                options = listOf("Yoga suave", "Entrenamiento con pesas y cardio combinado", "Solo caminar", "Estiramientos estáticos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué músculo se trabaja principalmente con el ejercicio 'peso muerto'?",
                options = listOf("Bíceps", "Pectorales", "Isquiotibiales y glúteos", "Deltoides"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe incluir una rutina equilibrada de entrenamiento?",
                options = listOf("Solo pesas", "Solo cardio", "Cardio, fuerza, flexibilidad y descanso", "Ejercicio sin días de pausa"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************

        "Trekking" to listOf(
            QuizQuestion(
                question = "¿Qué elemento es fundamental para orientarse en una ruta de trekking?",
                options = listOf("Linterna", "Mapa y brújula", "Silbato", "Termo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la mejor hora del día para comenzar una caminata larga en la montaña?",
                options = listOf("Mediodía", "Al amanecer", "Por la tarde", "Después del almuerzo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de calzado se recomienda para hacer trekking?",
                options = listOf("Sandalias deportivas", "Zapatillas de ciudad", "Zapatos de cuero", "Botas de trekking"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué hacer si te pierdes durante una caminata?",
                options = listOf("Seguir caminando sin rumbo", "Pedir ayuda a animales", "Volver sobre tus pasos y mantener la calma", "Correr hasta encontrar gente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'principio de no dejar rastro'?",
                options = listOf("No tomar fotos", "No llevar mapa", "No dejar basura ni alterar el entorno", "No hablar con nadie"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe llevar siempre en una mochila de trekking?",
                options = listOf("Perfume y maquillaje", "Laptop", "Cargador de celular", "Agua, comida, abrigo y primeros auxilios"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una 'capa base' en ropa para trekking?",
                options = listOf("La chaqueta impermeable", "Una camiseta interior térmica", "Pantalones cortos", "Guantes de lana"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hacer en caso de tormenta eléctrica durante una caminata?",
                options = listOf("Buscar un árbol alto", "Correr cuesta abajo", "Alejarse de lugares elevados y objetos metálicos", "Saltar repetidamente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de alimentación es adecuada durante una caminata larga?",
                options = listOf("Alimentos ligeros y energéticos","Comidas pesadas", "Comida rápida",  "Solo agua"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es la función de los bastones de trekking?",
                options = listOf("Asustar animales", "Ayudar en el equilibrio y reducir impacto en rodillas", "Excavar en la tierra", "Cargar cosas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'mal de altura'?",
                options = listOf("Un resfriado común", "Una enfermedad contagiosa", "Síntomas provocados por falta de oxígeno en altura", "Dolor muscular por caminar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento ayuda a evitar rozaduras en los pies?",
                options = listOf("Polainas", "Zapatillas de lona", "Bandas elásticas", "Medias técnicas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer antes de salir de trekking?",
                options = listOf("Planificar la ruta y avisar a alguien","No avisar a nadie", "Llevar solo el celular", "Salir sin revisar el clima"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una señal común de deshidratación durante el trekking?",
                options = listOf("Sueño", "Hambre", "Euforia", "Orina oscura y fatiga"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'trekking de altura'?",
                options = listOf("Caminar cerca del mar", "Trekking urbano", "Trekking por encima de los 3.000 metros", "Recorrer cuevas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta puede ayudarte si no tienes señal en el teléfono?",
                options = listOf("Brújula y mapa","Reloj de pulsera", "Powerbank",  "Auriculares"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una buena práctica al cruzar un arroyo?",
                options = listOf("Correr rápido", "Caminar descalzo", "Buscar zonas menos profundas y usar bastones", "Saltar con impulso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué capa de ropa debe ser impermeable?",
                options = listOf("Capa base", "Capa térmica", "Calcetines", "Capa externa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué beneficio tiene el trekking para la salud?",
                options = listOf("Reduce la capacidad pulmonar", "Aumenta el colesterol", "Mejora el sistema cardiovascular y reduce el estrés", "Provoca insomnio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de terreno es más exigente para los tobillos?",
                options = listOf("Descensos con piedras sueltas","Plano", "Asfalto",  "Bosques con niebla"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un GPS de montaña?",
                options = listOf("Un altímetro mecánico", "Un dispositivo que indica el clima", "Un aparato para orientarse sin conexión", "Una brújula tradicional"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de tienda es ideal para climas fríos y ventosos?",
                options = listOf("Tipo playa", "Monocapa", "Carpa de lona simple", "Cuatro estaciones"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué no debe hacerse en áreas protegidas?",
                options = listOf("Usar protector solar", "Caminar por senderos marcados", "Encender fuego fuera de los lugares permitidos", "Llevar agua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué animal puede representar peligro en zonas de trekking en la Patagonia?",
                options = listOf("Cóndor", "Zorro gris", "Puma", "Guanaco"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'refugio' en montaña?",
                options = listOf("Una tienda de campaña", "Un sitio seguro para observar", "Una construcción que ofrece abrigo a los caminantes", "Un depósito de agua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué indica una señal de sendero con colores blanco y rojo?",
                options = listOf("Acceso vehicular", "Sendero internacional de largo recorrido", "Zona de camping libre", "Ruta para bicicletas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una caminata de baja dificultad?",
                options = listOf("Con escalada técnica", "Para personas sin experiencia, por terreno fácil", "Con cruce de ríos", "Con uso de crampones"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer con los residuos durante una caminata?",
                options = listOf("Enterrarlos", "Quemarlos", "Dejarlos en la montaña", "Llevarlos de regreso"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un 'camelbak' en el trekking?",
                options = listOf("Una linterna frontal", "Una bolsa de agua con tubo para beber", "Un calzado", "Un filtro de aire"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de terreno es más propenso a resbalar después de la lluvia?",
                options = listOf("Roca húmeda y barro", "Arena seca", "Nieve pisada", "Grava seca"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué elemento permite filtrar agua de arroyos o lagunas?",
                options = listOf("Un pañuelo", "Una manguera", "Filtro portátil o pastillas purificadoras", "Botella común"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa la palabra 'trekking'?",
                options = listOf("Caminar por la ciudad", "Excursionismo o senderismo", "Correr en la montaña", "Escalar paredes"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hacer si aparece una tormenta con granizo durante la caminata?",
                options = listOf("Buscar refugio y protegerse la cabeza","Esconderse bajo un árbol alto", "Saltar constantemente", "Quitar la mochila"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué capa mantiene el calor corporal en climas fríos?",
                options = listOf("Capa base", "Capa intermedia térmica", "Impermeable externa", "Capa de algodón"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué animal es habitual encontrar en senderos andinos?",
                options = listOf("Cocodrilo", "Llama", "Oso panda", "Mono aullador"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una buena forma de evitar lesiones en caminatas largas?",
                options = listOf("No descansar nunca", "Caminar rápido todo el tiempo", "Estirar antes y después, y usar buen calzado", "Evitar llevar agua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una caminata de travesía?",
                options = listOf("Una caminata de varios días, con campamentos","Un recorrido turístico en bus", "Una ruta circular urbana",  "Una caminata sin mochila"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué debes hacer si encuentras un animal salvaje en tu camino?",
                options = listOf("Gritar fuerte", "Intentar tocarlo", "Mantener distancia y no molestarlo", "Darle comida"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función de las polainas en trekking?",
                options = listOf("Decorar el calzado", "Cubrir la mochila", "Proteger de agua, barro o nieve que entre por las botas", "Evitar el sudor"),
                correctIndex = 2
            )
        ),




        //********************************************************************************************************************************

        "Skate" to listOf(
            QuizQuestion(
                question = "¿Cómo se llama la parte superior del skate donde se colocan los pies?",
                options = listOf("Eje", "Tail", "Deck", "Grip"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del truco básico donde el skater salta con la tabla?",
                options = listOf("Kickflip", "Heelflip", "Shuvit", "Ollie"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué parte del skate permite girar el eje cuando el skater se inclina?",
                options = listOf("Ruedas", "Deck", "Rodamientos", "Bushings"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cómo se llama el extremo trasero de la tabla?",
                options = listOf("Nose", "Middle", "Tail", "Slide"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué marca es famosa por la línea de skates 'Tony Hawk'?",
                options = listOf("Element", "Birdhouse", "Santa Cruz", "Plan B"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué país nació el skateboarding?",
                options = listOf("Canadá", "Brasil", "Estados Unidos", "Australia"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa hacer un 'grind'?",
                options = listOf("Pisar fuerte la tabla", "Deslizarse con los ejes sobre un borde o tubo", "Hacer girar la tabla", "Frenar con el tail"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el papel rugoso que se pone sobre la tabla para dar agarre?",
                options = listOf("Lija o grip tape", "Espuma", "Cinta de tracción", "Rodillo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del truco en el que la tabla gira 360° sin que el skater gire?",
                options = listOf("Ollie 360", "Shuvit 360", "Hardflip", "Tre flip"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'nose' en un skate?",
                options = listOf("El rodamiento", "La parte trasera", "El eje", "La parte delantera de la tabla"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué componente del skate contiene los rodamientos?",
                options = listOf("Ejes", "Ruedas", "Grip", "Tail"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe usar para mayor seguridad al patinar?",
                options = listOf("Zapatillas nuevas", "Rodilleras, casco y coderas", "Sombrero", "Guantes de cuero"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el truco donde la tabla da una vuelta completa horizontalmente y también gira en el aire?",
                options = listOf("Kickflip", "Shuvit", "Pop shove-it", "Tre flip"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué parte del skate conecta el deck con las ruedas?",
                options = listOf("Grip", "Rodamiento", "Eje (truck)", "Tail"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de superficie es mejor para aprender a andar en skate?",
                options = listOf("Tierra", "Arena", "Superficie lisa y plana", "Grava"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un 'manual' en skate?",
                options = listOf("Patinar sentado", "Deslizar con el eje", "Ir sobre dos ruedas manteniendo el equilibrio", "Girar en el aire"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un truco de skate?",
                options = listOf("Nosegrind", "Backflip", "Hardflip", "Boardslide"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un skate 'cruiser'?",
                options = listOf("Un skate para hacer trucos técnicos", "Un patinete eléctrico", "Una tabla para desplazamientos suaves y largos", "Un skate sin grip"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'switch' en skate?",
                options = listOf("Andar en la posición contraria a la habitual", "Girar 180°", "Cambiar de tabla", "Patinar sin lija"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de patineta es más usada en skateparks y para hacer trucos?",
                options = listOf("Longboard", "Cruiser", "Freestyle board", "Street skate"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'pop' en el contexto del skate?",
                options = listOf("Hacer saltar la tabla golpeando el tail contra el suelo", "Sonido del rodamiento", "Chocar con la tabla", "Cambiar de dirección"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'half pipe'?",
                options = listOf("Una tabla cortada", "Un tipo de rampa en forma de U", "Un truco aéreo", "Un estilo de patinar sin curvas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hace un 'kickflip'?",
                options = listOf("La tabla gira en el aire sobre su eje longitudinal", "El skater salta hacia atrás", "La tabla se desliza", "Nada, es un error"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una de las competencias más reconocidas en el mundo del skate?",
                options = listOf("Tour de Skate", "World Skate Cup", "X Games", "Skate Clash"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué personaje famoso ayudó a popularizar el skate mundialmente?",
                options = listOf("Shaun White", "Tony Hawk", "Nyjah Huston", "Steve Caballero"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el eje que permite girar las ruedas?",
                options = listOf("Baseplate", "Kingpin", "Truck", "Rodamiento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el material más común del deck de skate?",
                options = listOf("Plástico", "Aluminio", "Madera de arce", "Fibra de vidrio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'regular' en skate?",
                options = listOf("Patinar con el pie izquierdo adelante", "Hacer trucos suaves", "Usar tabla mediana", "Girar hacia la izquierda"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo es más propensa a lesiones en skate?",
                options = listOf("Manos", "Rodillas", "Pies", "Cabeza"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe revisar regularmente en una tabla de skate?",
                options = listOf("Colores", "Logo", "Ruedas, ejes y tornillos", "Altura del grip"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'slide'?",
                options = listOf("Saltar con la tabla", "Deslizar la tabla sobre una superficie", "Frenar en seco", "Un tipo de giro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué accesorio ayuda a que el skate ruede suavemente?",
                options = listOf("Tornillos", "Bushings", "Rodamientos (bearings)", "Grip"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo se enfoca en patinar obstáculos urbanos como escaleras y barandas?",
                options = listOf("Vert", "Bowl", "Street", "Downhill"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo se llama la herramienta que se usa para ajustar ejes y ruedas?",
                options = listOf("Skate tool", "Grip wrench", "Screw adjuster", "Board key"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué truco implica deslizar la tabla mientras el skater está de lado?",
                options = listOf("Manual", "Boardslide", "Kickflip", "Switch ollie"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el truco donde la tabla gira hacia atrás mientras el skater salta?",
                options = listOf("Heelflip", "Varial flip", "Backside flip", "Hardflip"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'bail'?",
                options = listOf("Una caída o intento fallido de truco", "Un tipo de rodamiento", "Un giro perfecto", "Una técnica para girar más rápido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué país incluyó el skate por primera vez como deporte olímpico?",
                options = listOf("Estados Unidos", "Japón", "Reino Unido", "Australia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué ayuda a mantener el equilibrio al realizar trucos?",
                options = listOf("Frenar con el pie", "Usar casco", "Centro de gravedad bajo y postura correcta", "Ropa ajustada"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************


        "Escalada" to listOf(
            QuizQuestion(
                question = "¿Cuál es el equipo esencial para escalar con cuerda?",
                options = listOf("Crash pad", "Arnés, cuerda y mosquetón", "Casco y bastones", "Mochila y brújula"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'gri-gri' en escalada?",
                options = listOf("Un tipo de nudo", "Un sistema de poleas", "Un asegurador asistido", "Una cuerda de seguridad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se fortalece especialmente con la escalada?",
                options = listOf("Cuádriceps", "Pantorrillas", "Espalda y antebrazos", "Abdomen y cuello"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de escalada se realiza sin cuerda, en paredes bajas y con colchonetas?",
                options = listOf("Escalada deportiva", "Escalada artificial", "Búlder (bouldering)", "Escalada en hielo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un crux en una vía de escalada?",
                options = listOf("El inicio de la vía", "El tramo más fácil", "El paso más difícil", "El nudo final de seguridad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué sistema se usa para asegurar a un escalador desde abajo?",
                options = listOf("Rappel", "Autoaseguramiento", "Aseguramiento de segundo", "Top rope o escalada de primero"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de calzado se utiliza en escalada?",
                options = listOf("Botas de montaña", "Zapatillas normales", "Pies de gato", "Sandalias deportivas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de la magnesita en escalada?",
                options = listOf("Proteger las cuerdas", "Mejorar el agarre absorbiendo el sudor", "Evitar ampollas en los pies", "Lubricar las manos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de escalada se realiza en paredes naturales con seguros fijos?",
                options = listOf("Escalada tradicional", "Búlder", "Escalada deportiva", "Escalada libre"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'flash' en escalada?",
                options = listOf("Escalar una vía con caída controlada", "Escalar a vista sin información previa", "Escalar sin cuerda", "Escalar una vía en el primer intento con beta"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una vía ferrata?",
                options = listOf("Una escalada con poleas", "Una ruta equipada con cables, escalones y anclajes", "Una vía para bicicleta", "Un tipo de cuerda especial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la principal diferencia entre escalada deportiva y tradicional?",
                options = listOf("Uso de cuerda doble", "El tipo de roca", "Uso de casco obligatorio", "La instalación de los seguros"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'encadenar una vía'?",
                options = listOf("Escalarla con caídas", "Escalarla en varios días", "Superarla sin caídas ni descansos", "Escalarla con ayuda artificial"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un riesgo común en escalada sin cuerda?",
                options = listOf("Resbalar al montar la reunión", "Falta de peso en el arnés", "Anudar mal el descensor", "Caída sin protección"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'escalar de primero'?",
                options = listOf("Subir con la cuerda desde arriba", "Ir instalando las cintas exprés a medida que subes", "Asegurar desde la cima", "Escalar en solitario"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué nudo se usa habitualmente para atarse al arnés?",
                options = listOf("Nudo ocho", "Nudo llano", "Nudo pescador doble", "Nudo simple"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes no es un tipo de agarre?",
                options = listOf("Diedro","Regleta", "Bidedo",  "Manto"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué función cumple el asegurador en escalada?",
                options = listOf("Controlar el descenso con polea", "Asegurar que el escalador no caiga libremente", "Dirigir al escalador", "Medir la dificultad de la vía"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'descuelgue'?",
                options = listOf("El comienzo de la vía", "El punto más difícil", "El anclaje final de la vía", "Una cuerda que cae sola"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento conecta la cuerda al anclaje en escalada deportiva?",
                options = listOf("Mosquetón de seguridad", "Cinta exprés", "Cuerda auxiliar", "Piolet"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer antes de comenzar una vía?",
                options = listOf("Calentamiento, revisión del equipo y chequeo mutuo", "Subir sin pensar", "Tirar la cuerda al suelo", "Quitarse el arnés para mayor movilidad"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un crash pad?",
                options = listOf("Una cuerda de repuesto", "Un tipo de arnés", "Una colchoneta usada en búlder", "Una técnica de escalada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué dificultad representa la letra 'a' en el grado 6a?",
                options = listOf("Un tipo de anclaje", "Una vía de entrenamiento", "Una vía para niños", "Una subcategoría de dificultad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica permite ahorrar energía en desplomes?",
                options = listOf("Dinámico", "Bicicleta", "Reposo en extensión", "Taloneo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para mejorar en búlder?",
                options = listOf("Practicar resistencia", "Evitar la técnica", "Trabajar fuerza y técnica en movimientos cortos", "Correr largas distancias"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué músculo se utiliza más en escalada de dedos pequeños?",
                options = listOf("Deltoides", "Antebrazo y dedos", "Cuádriceps", "Trapecios"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se hace al llegar al descuelgue de una vía deportiva?",
                options = listOf("Desatarse", "Saltar hacia abajo", "Montar reunión o bajarse asegurado", "Quitar el arnés"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de escalada se practica en hielo o nieve?",
                options = listOf("Búlder", "Escalada tradicional", "Escalada en hielo", "Psicobloc"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función del casco en escalada?",
                options = listOf("Ver mejor la vía", "Proteger contra caídas de piedras o golpes", "Dar calor", "Sujetar el arnés"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'psicobloc'?",
                options = listOf("Escalada sobre hielo", "Escalada con bloque mental", "Escalada sin cuerda sobre agua", "Escalada de competición"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para descender con cuerda?",
                options = listOf("Top rope", "Rapel", "Dinámico", "Tracción"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'beta' en escalada?",
                options = listOf("Equipo de principiante", "Grado de dificultad", "Consejo o información sobre cómo escalar una vía", "Peso de la cuerda"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del equipo evita que caigas hasta el suelo?",
                options = listOf("Casco", "Arnés", "Asegurador y cuerda", "Mosquetón sin seguro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una regleta?",
                options = listOf("Una cuerda de seguridad", "Un tipo de presa estrecha para los dedos", "Un nudo de escalada", "Un tipo de calzado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer si un escalador cae mientras tú aseguras?",
                options = listOf("Saltar hacia atrás", "Soltar la cuerda", "Bloquear el dispositivo y mantener la calma", "Gritar y correr"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo es clave en la escalada eficiente?",
                options = listOf("Manos solamente", "Piernas", "Cuello", "Hombros solamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un mosquetón con seguro?",
                options = listOf("Un anclaje sin cierre", "Una cuerda flexible", "Un conector metálico con cierre de seguridad", "Un accesorio para mochilas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe revisar siempre antes de escalar?",
                options = listOf("El tiempo y el color del equipo", "La altura del muro", "Los nudos, el arnés y el asegurador", "El tamaño de la mochila"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'tiblar' en escalada?",
                options = listOf("Escalar sin cuerda", "Tener miedo extremo", "Temblar de brazos por fatiga", "Romper una presa"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************


        "Viajar" to listOf(
            QuizQuestion(
                question = "¿Cuál es el país más visitado del mundo según datos recientes?",
                options = listOf("Italia", "Estados Unidos", "Francia", "España"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué documento es imprescindible para viajar internacionalmente?",
                options = listOf("Pasaporte", "Licencia de conducir", "Tarjeta de crédito", "Recibo de hotel"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué moneda se usa en Japón?",
                options = listOf("Won", "Yuan", "Yen", "Ringgit"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un seguro recomendado para viajar?",
                options = listOf("Seguro dental", "Seguro de viaje", "Seguro automotor", "Seguro de vivienda"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué ciudad es famosa por la Torre Eiffel?",
                options = listOf("Londres", "París", "Roma", "Madrid"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué continente es conocido por tener 54 países?",
                options = listOf("Asia", "América", "África", "Oceanía"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de enchufe se usa comúnmente en Europa continental?",
                options = listOf("Tipo B", "Tipo A", "Tipo I", "Tipo C"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué ciudad está dividida por un muro histórico derribado en 1989?",
                options = listOf("Praga", "Viena", "Berlín", "Varsovia"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la capital de Australia?",
                options = listOf("Sídney", "Canberra", "Melbourne", "Brisbane"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el idioma oficial en Brasil?",
                options = listOf("Español", "Portugués", "Inglés", "Italiano"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la mejor época para visitar el sudeste asiático?",
                options = listOf("Temporada de monzones", "Verano europeo", "Temporada seca", "Invierno canadiense"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué país es famoso por las auroras boreales?",
                options = listOf("Italia", "Finlandia", "España", "Egipto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué isla caribeña tiene influencia francesa?",
                options = listOf("Jamaica", "Martinica", "Barbados", "Bahamas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se necesita para ingresar a la zona Schengen como turista?",
                options = listOf("Visa ETIAS (cuando aplica)", "Licencia internacional", "Tarjeta de vacunación", "Carné de estudiante"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué país alberga el Machu Picchu?",
                options = listOf("Bolivia", "Colombia", "Perú", "Chile"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué aerolínea es conocida por sus tarifas ultra económicas en Europa?",
                options = listOf("British Airways", "Ryanair", "Lufthansa", "Iberia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la moneda de Tailandia?",
                options = listOf("Rupia", "Baht", "Dólar taiwanés", "Yuan"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos NO es un país miembro de la Unión Europea?",
                options = listOf("Noruega", "Portugal", "Grecia", "Austria"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ciudad es conocida como 'La Gran Manzana'?",
                options = listOf("Los Ángeles", "Londres", "Chicago", "Nueva York"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué montaña es la más alta del mundo?",
                options = listOf("Kilimanjaro", "Aconcagua", "Monte Everest", "Alpes suizos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué país es famoso por sus fiordos?",
                options = listOf("Suecia", "Islandia", "Escocia", "Noruega"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué vacuna fue ampliamente requerida durante la pandemia para viajar?",
                options = listOf("Fiebre amarilla", "COVID-19", "Tétanos", "Gripe común"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la ciudad más poblada del mundo actualmente?",
                options = listOf("Tokio", "Delhi", "Shanghái", "Ciudad de México"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué país es conocido como 'La Tierra del Sol Naciente'?",
                options = listOf("China", "Vietnam", "Japón", "Corea del Sur"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes no es un método de alojamiento común en viajes?",
                options = listOf("Hotel", "Camping", "Hostal", "Aeropuerto"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la mejor forma de evitar el jet lag?",
                options = listOf("Dormir justo antes del vuelo", "Beber mucho alcohol", "Adaptarse al horario de destino", "Comer en exceso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el país más grande del mundo por superficie?",
                options = listOf("Canadá", "China", "Estados Unidos", "Rusia"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué país es famoso por sus templos en Angkor Wat?",
                options = listOf("Camboya", "Myanmar", "Vietnam", "Laos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer con los líquidos al viajar en avión?",
                options = listOf("Llevar en frascos de más de 200 ml", "Declararlos en aduana", "Llevar en envases pequeños y transparentes", "Empacarlos en bolsas negras"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ciudad es conocida por su sistema de canales como calles?",
                options = listOf("Venecia", "Bruselas", "Florencia", "Ámsterdam"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un destino famoso por sus safaris?",
                options = listOf("Sudáfrica", "Egipto", "Túnez", "Argelia"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué país tiene forma de bota?",
                options = listOf("España", "Italia", "Grecia", "Francia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué sistema permite a viajeros quedarse gratis en casas de locales?",
                options = listOf("Airbnb", "Booking", "Couchsurfing", "Hostelworld"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento es esencial para el equipaje de mano?",
                options = listOf("Almohada grande", "Navaja", "Perfume en envase grande", "Cargador"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un riesgo común en zonas tropicales?",
                options = listOf("Enfermedad de Lyme", "Malaria", "Escorbuto", "Hipotermia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos países pertenece a Oceanía?",
                options = listOf("Nueva Zelanda", "Sri Lanka", "Sudáfrica", "Filipinas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué aplicación se usa mucho para encontrar vuelos baratos?",
                options = listOf("TripAdvisor", "Skyscanner", "Facebook", "WhatsApp"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer antes de un viaje internacional?",
                options = listOf("No revisar el clima", "No sacar seguro", "Informarse sobre visados", "Ignorar costumbres locales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la capital de Marruecos?",
                options = listOf("Casablanca", "Fez", "Marrakech", "Rabat"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es una de las razones para llevar una mochila en lugar de maleta?",
                options = listOf("Ocupa más espacio", "Se ve más elegante", "Es más práctica para moverse", "Pesa más"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************


        "Camping" to listOf(
            QuizQuestion(
                question = "¿Qué elemento es esencial para acampar al aire libre?",
                options = listOf("Televisor", "Carpa (tienda de campaña)", "Aspiradora", "Sofá inflable"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de saco de dormir se recomienda para temperaturas bajo cero?",
                options = listOf("Modelo de verano ligero", "Saco de manta", "Saco de plumón o sintético con alta aislación", "Toalla grande"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Para qué sirve un aislante o colchoneta en el campamento?",
                options = listOf("Decorar la carpa", "Proteger del frío del suelo y ganar comodidad", "Para limpiar utensilios", "Colgar la ropa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento es importante para encender fuego de forma segura?",
                options = listOf("Papel, leña, yesca y fósforos o encendedor", "Licor", "Teléfono móvil", "Cuerda de nailon"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de calzado es más adecuado para acampar?",
                options = listOf("Zapatos de vestir", "Chanclas", "Botas de montaña o trail running", "Zapatillas de tacón"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un grupo electrógeno portátil útil para camping?",
                options = listOf("Un tipo de carpa", "Fuente de energía para luz o carga de dispositivos", "Una linterna pequeña", "Un recipiente de agua"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento se usa para filtrar agua de fuentes naturales?",
                options = listOf("Fósforos", "Sal de cocina", "Arena de playa", "Filtro portátil o pastillas purificadoras"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es una buena práctica para evitar dejar basura?",
                options = listOf("Quemar todo lo que no sirve", "Enterrar los desperdicios", "Traer bolsas y recoger tus desechos", "Dejarlo en la fogata"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta es útil para limpiar utensilios de cocina al acampar?",
                options = listOf("Cepillo o esponja biodegradable y agua", "Champú", "Detergente industrial", "Cloro directo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Por qué es importante elegir un terreno nivelado para la carpa?",
                options = listOf("Para evitar que ruede al dormir", "Para ver las estrellas", "Para mejor recepción de señal", "Para que entre más gente"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer con la comida en el campamento?",
                options = listOf("Dejarla fuera de la carpa", "Guardarla en contenedores herméticos y colgarla si hay animales", "Dejarla en la tienda abierta", "Enterrarla"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de linterna es útil en camping?",
                options = listOf("Linterna frontal (frontal)", "Linterna de coche", "Antorcha de gasolina", "Lámpara de mesa"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de un hornillo de gas portátil?",
                options = listOf("Calentar la carpa", "Cocinar alimentos de forma controlada", "Iluminar", "Secar ropa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué ropa es adecuada para camping en clima frío?",
                options = listOf("Ropa de algodón húmeda", "Shorts y camiseta", "Zapatos abiertos", "Capas aislantes y ropa técnica"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un toldo o tarp en camping?",
                options = listOf("Un saco de dormir extra", "Un refugio adicional impermeable sin paredes", "Un colchón inflable", "Una mochila"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Por qué es importante hidratarse con frecuencia?",
                options = listOf("Para sentirse pesado", "Para dormir más", "Para hacer más fuego", "Para prevenir deshidratación y mantener energía"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué indica un pronóstico de lluvia en campaña?",
                options = listOf("Buen momento para nadar", "Llevar carpa impermeable y cubierta adicional", "Hacer fogata sin protección", "No pasa nada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un nudo de cabuyería útil para acampar?",
                options = listOf("Nudo de corbata", "Nudo bola", "Nudo de mariposa o nudo simple confiable", "Nudo de hamaca"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Para qué se usa un botiquín en camping?",
                options = listOf("Para guardar comida", "Para emergencias médicas", "Para afilar cuchillos", "Para encender fuego"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer en caso de lluvia dentro de la carpa?",
                options = listOf("Ignorar la filtración", "Secar rápidamente, ventilar y cubrir con tarp", "Salir a nadar", "Empacar y regresar a casa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el Leave No Trace en camping?",
                options = listOf("Una marca de carpas", "Un tipo de comida", "Un modelo de saco", "Un enfoque de mínimo impacto ambiental"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de combustible se usa en hornillos portátiles?",
                options = listOf("Gas butano o propano", "Gasolina del auto", "Alcohol comercial", "Aceite de cocina usado"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué utensilio es práctico para cocinar en campamento?",
                options = listOf("Sartén y olla livianas de aluminio o titanio", "Batería eléctrica", "Microondas", "Plancha"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Por qué es importante ventilar la carpa?",
                options = listOf("Para evitar que se caliente demasiado", "Para mantener el aire fresco y reducir condensación", "Para que entre insectos", "Para filtrar luz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un refugio de emergencia ligero?",
                options = listOf("Un cobertor de supervivencia plateado ultraligero", "Una carpa grande", "Un toldo", "Una hamaca"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda llevar contra insectos?",
                options = listOf("Perfume fuerte", "Repelente, mosquitero o uso de ropa adecuada", "Flores frescas", "Film plástico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de mochila es adecuada para camping de varios días?",
                options = listOf("Mochila escolar", "Mochila compacta de diario", "Mochila de trekking con soporte lumbar", "Bolso de mano"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es recomendable hacer antes de ir de camping?",
                options = listOf("No revisar nada", "Planificar ruta, chequear clima y preparar equipo", "Llevar muchas mudas de ropa solo", "Comprar cosas sin revisar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de linterna usa manos libres?",
                options = listOf("De mano", "De pie", "Frontal (headlamp)", "De casco militar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Por qué es importante llevar una navaja o cuchillo multiusos?",
                options = listOf("Para defensa", "Para cortar, preparar comida y bricolaje en campamento", "Para limpieza", "No sirve de nada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un punto de acampada permitido?",
                options = listOf("Cualquier lugar en la naturaleza", "Donde los animales viven", "Una zona sin árboles", "Un lugar autorizado y regulado para acampar"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se usa para orientarse sin GPS?",
                options = listOf("Pelota de goma", "Mapa y brújula", "Sólo el smartphone", "Motor de búsqueda"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué deberías hacer si te pierdes en el bosque?",
                options = listOf("Quedarte en un lugar visible y buscar ayuda", "Seguir caminando sin rumbo", "Gritar sin parar", "Salir corriendo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué equipo protege contra la lluvia durante la noche?",
                options = listOf("Cobijas", "Sábana","Carpa con cubierta impermeable y costuras selladas", "Toalla"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué acción ayuda a prevenir hipotermia?",
                options = listOf("Quedarse congelado", "Vestirse en capas y mantenerse seco", "Tomar alcohol frío", "Dormir sin saco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer con las brasas al final del día?",
                options = listOf("Apagarlas completamente y enterrarlas","Dejarlas encendidas",  "Apagarlas y cubrir con tierra solo si llueve", "Dejar solo brasas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una esterilla o tapete protectora?",
                options = listOf("Tela decorativa", "Un colchón inflable", "Accesorio inútil", "Aislante para poner debajo de la carpa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Por qué es útil una cuerda en camping?",
                options = listOf("Para decorar", "Para tender ropa, asegurar toldo o improvisar refugio", "Para pescar", "Para llevar la carpa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para dormir bien en camping?",
                options = listOf("Sin saco de dormir", "Cortar leña dentro", "Usar saco adecuado y mantener ambiente limpio y seco", "Dormir sin ropa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un camping de bicicleta o bikepacking?",
                options = listOf("Acampar con carpa grande", "Acampar en bicicleta y transportar equipo ligero", "Acampar en ciudad", "Acampar al lado de un coche"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Meditar" to listOf(
            QuizQuestion(
                question = "¿Cuál es el objetivo principal de la meditación mindfulness?",
                options = listOf("Dormir profundamente", "Estar consciente del momento presente", "Visualizar el futuro", "Ignorar los pensamientos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué postura es común para meditar?",
                options = listOf("Sentado con la espalda recta", "Acostado boca abajo", "Corriendo", "De pie con los brazos cruzados"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué palabra o frase repetida durante la meditación se llama?",
                options = listOf("Mantra", "Dharma", "Mandala", "Karma"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica común de meditación enfocada en la respiración?",
                options = listOf("Contar pasos", "Cantar en voz alta", "Escribir un diario", "Observar la respiración"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tradición espiritual popularizó la meditación zen?",
                options = listOf("Cristianismo", "Islam","Budismo", "Judaísmo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es uno de los beneficios reconocidos de la meditación regular?",
                options = listOf("Aumentar el estrés", "Mejorar la concentración", "Perder masa muscular", "Dañar la memoria"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'chakra' en la meditación y espiritualidad?",
                options = listOf("Un tipo de postura", "Un mantra especial", "Una técnica de respiración", "Centros de energía en el cuerpo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de meditación se basa en observar los pensamientos sin juzgarlos?",
                options = listOf("Meditación guiada", "Mindfulness", "Meditación transcendental", "Yoga dinámico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa meditar en silencio?",
                options = listOf("No hablar ni hacer ruido mientras se medita", "Escuchar música fuerte", "Cantar canciones", "Leer un libro"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es un instrumento comúnmente usado para marcar el ritmo en la meditación budista?",
                options = listOf( "Tambor", "Guitarra", "Piano","Campana"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un 'mudra' en la práctica de meditación?",
                options = listOf("Un tipo de mantra", "Una posición de los pies","Una postura de las manos con significado simbólico",  "Una herramienta musical"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica de meditación usa una repetición silenciosa de un sonido o palabra?",
                options = listOf("Mindfulness", "Meditación transcendental", "Yoga dinámico", "Visualización"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿En qué parte del cuerpo se recomienda enfocar la atención durante la respiración meditativa?",
                options = listOf( "Las manos", "Los pies", "Las orejas","El estómago o la nariz"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué efecto tiene la meditación en el sistema nervioso autónomo?",
                options = listOf("Activa la respuesta de lucha o huida", "Aumenta la tensión muscular", "Disminuye la circulación sanguínea", "Promueve la relajación y reduce el estrés"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es la 'meditación guiada'?",
                options = listOf( "Meditar sin moverse", "Repetir mantras en grupo","Meditación acompañada por instrucciones o voz", "Meditar sin ayuda"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un tipo común de meditación?",
                options = listOf("Meditación zen", "Meditación transcendental", "Meditación de concentración", "Meditación explosiva"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer con los pensamientos durante la meditación mindfulness?",
                options = listOf("Ignorarlos por completo", "Observarlos sin juzgar y dejarlos pasar", "Luchar contra ellos", "Intentar controlarlos activamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento es importante para crear un espacio ideal para meditar?",
                options = listOf("Ruido constante", "Un lugar tranquilo y cómodo", "Mucha luz brillante", "Multitud de personas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'samadhi' en la meditación?",
                options = listOf("Estado de concentración profunda y absorción", "Tipo de postura", "Un mantra especial", "Un tipo de respiración"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de practicar la respiración abdominal o diafragmática en la meditación?",
                options = listOf("Incrementar la tensión muscular", "Aumentar el estrés", "Inducir relajación y calma", "Hacer la respiración más superficial"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer al final de una sesión de meditación?",
                options = listOf("Abrir los ojos lentamente y estirarse", "Salir corriendo", "No moverse durante 10 minutos más", "Abrir los ojos de golpe"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'mantra' en la meditación transcendental?",
                options = listOf("Una palabra o frase repetida silenciosamente para enfocar la mente", "Un tipo de postura", "Un instrumento musical", "Una técnica de respiración"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es la diferencia entre meditación activa y pasiva?",
                options = listOf("La activa es solo para expertos", "No hay diferencia", "La pasiva requiere saltar","La activa implica movimiento, la pasiva es estar quieto"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la meditación 'metta'?",
                options = listOf("Meditación para aprender idiomas", "Ejercicio físico intenso", "Una técnica para dormir","Práctica para cultivar sentimientos de amor y compasión"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué papel juega la respiración en la meditación?",
                options = listOf( "No tiene importancia", "Se debe contener la respiración","Es un ancla para mantener la atención", "Se debe respirar rápido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la 'atmósfera meditativa' ideal?",
                options = listOf( "Lugar muy ruidoso", "Lugar con mucha luz y movimiento", "Un espacio abarrotado","Silencio o sonidos suaves, lugar cómodo y sin distracciones"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un 'koan' en la meditación zen?",
                options = listOf("Un tipo de postura", "Un instrumento musical","Una pregunta o historia paradójica para provocar la iluminación", "Un mantra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica de meditación usa visualización creativa?",
                options = listOf("Meditación zen","Meditación guiada", "Mindfulness sin enfoque", "Respiración rápida"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es importante evitar para una sesión de meditación efectiva?",
                options = listOf("Estar cómodo", "Respirar tranquilamente","Distracciones y ruidos fuertes",  "Cerrar los ojos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la meditación 'vipassana'?",
                options = listOf("Una técnica de meditación que significa 'ver claramente' y fomenta la introspección", "Un tipo de mantra", "Un instrumento musical", "Una postura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Por cuánto tiempo se recomienda iniciar la meditación para principiantes?",
                options = listOf("5 a 10 minutos", "2 horas", "30 segundos", "3 horas continuas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es un efecto común de la práctica constante de meditación?",
                options = listOf( "Mayor estrés", "Pérdida de memoria", "Dolores musculares","Mejor control emocional y reducción de ansiedad"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'atención plena' en la meditación?",
                options = listOf("Olvidar lo que pasa alrededor", "Concentrarse solo en el futuro", "Evitar pensar en nada","Ser consciente y aceptar el momento presente sin juzgar"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el significado de 'asana' en la práctica de yoga y meditación?",
                options = listOf( "Tipo de mantra", "Técnica de respiración","Postura corporal", "Instrumento musical"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'retreat' o retiro de meditación?",
                options = listOf("Un período dedicado a meditar intensamente y en silencio", "Un tipo de postura", "Un instrumento", "Un mantra especial"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es un buen consejo para meditar en casa?",
                options = listOf( "Meditar solo cuando tengas tiempo libre", "Meditar con televisión encendida","Establecer un horario y lugar fijo para meditar", "Meditar mientras caminas sin concentración"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la 'respiración consciente'?",
                options = listOf("Prestar atención voluntaria a la inhalación y exhalación", "Respirar rápidamente", "Contener la respiración", "No prestar atención a la respiración"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es un beneficio mental de la meditación regular?",
                options = listOf("Reducción del estrés y ansiedad", "Aumento del estrés", "Olvido rápido", "Confusión mental"),
                correctIndex = 0
            )
        ),



        //********************************************************************************************************************************


        "Astronomía" to listOf(
            QuizQuestion(
                question = "¿Cuál es el planeta más grande del sistema solar?",
                options = listOf("Saturno", "Neptuno", "Tierra", "Júpiter"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la estrella más cercana a la Tierra después del Sol?",
                options = listOf("Betelgeuse", "Sirius", "Proxima Centauri", "Vega"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué instrumento se utiliza para observar objetos celestes?",
                options = listOf("Microscopio", "Periscopio", "Telescopio", "Binoculares de teatro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué planeta es conocido como el planeta rojo?",
                options = listOf("Venus", "Júpiter", "Marte", "Urano"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué objeto astronómico define el centro de una galaxia?",
                options = listOf("Estrella", "Planeta gigante", "Agujero negro supermasivo", "Nebulosa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué fase lunar viene después de la luna llena?",
                options = listOf("Luna nueva", "Cuarto creciente", "Cuarto menguante", "Luna gibosa creciente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el satélite natural de la Tierra?",
                options = listOf("Europa", "Luna", "Fobos", "Titán"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué planeta tiene un sistema de anillos muy visible?",
                options = listOf("Júpiter", "Neptuno", "Urano", "Saturno"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de galaxia es la Vía Láctea?",
                options = listOf("Elíptica", "Irregular", "Espiral", "Anular"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué astrónomo propuso el modelo heliocéntrico?",
                options = listOf("Ptolomeo", "Kepler", "Copérnico", "Galileo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué planeta tiene el día más largo en comparación a su año?",
                options = listOf("Venus", "Mercurio", "Júpiter", "Neptuno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué misión llevó al primer ser humano a la Luna?",
                options = listOf("Apolo 13", "Sputnik 1", "Apolo 11", "Soyuz 1"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe un grupo de estrellas que forman una figura reconocible?",
                options = listOf("Nebulosa", "Constelación", "Cinturón", "Aglomerado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué planeta gira de forma retrógrada respecto a los demás?",
                options = listOf("Júpiter", "Urano", "Tierra", "Venus"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el planeta más cercano al Sol?",
                options = listOf("Venus", "Tierra", "Mercurio", "Marte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué telescopio fue lanzado en 2021 para reemplazar al Hubble?",
                options = listOf("Spitzer", "James Webb", "Kepler", "Chandra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el punto más brillante de una órbita elíptica?",
                options = listOf("Perigeo", "Afelio", "Perihelio", "Zenit"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué planeta tiene más lunas conocidas hasta la fecha?",
                options = listOf("Júpiter", "Saturno", "Urano", "Neptuno"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué fenómeno ocurre cuando la Luna bloquea la luz del Sol?",
                options = listOf("Lluvia de meteoros", "Eclipse lunar", "Aurora boreal", "Eclipse solar"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué gas es predominante en la atmósfera de Júpiter?",
                options = listOf("Oxígeno", "Dióxido de carbono", "Hidrógeno", "Nitrógeno"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué planeta tiene vientos supersónicos y un color azul intenso?",
                options = listOf("Urano", "Neptuno", "Saturno", "Marte"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la edad estimada del universo?",
                options = listOf("1,3 mil millones de años", "4,6 mil millones de años", "13,8 mil millones de años", "100 mil millones de años"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué científico explicó la gravitación universal que rige los cuerpos celestes?",
                options = listOf("Newton", "Einstein", "Galileo", "Tycho Brahe"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe una estrella en proceso de morir que explota?",
                options = listOf("Enana blanca", "Nova", "Supernova", "Cuásar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué planeta fue degradado a planeta enano en 2006?",
                options = listOf("Ceres", "Plutón", "Makemake", "Haumea"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué planeta podría flotar en agua por su baja densidad?",
                options = listOf("Neptuno", "Júpiter", "Urano", "Saturno"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué parte del Sol se ve durante un eclipse total?",
                options = listOf("Núcleo", "Corona solar", "Fotosfera", "Manchas solares"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama la galaxia más cercana a la Vía Láctea?",
                options = listOf("Triángulo", "Andrómeda", "Pequeña Nube de Magallanes", "Sagitario A*"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué constelación contiene las estrellas del cinturón de Orión?",
                options = listOf("Orión", "Casiopea", "Tauro", "Leo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se observa principalmente con un telescopio radioastronómico?",
                options = listOf("Rayos gamma", "Luz visible", "Microondas", "Ondas de radio"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cómo se llama el vehículo robótico que llegó a Marte en 2021?",
                options = listOf("Curiosity", "Perseverance", "Opportunity", "Spirit"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe la explosión que se cree dio origen al universo?",
                options = listOf("Gran Eclipse", "Gran Expansión", "Big Crunch", "Big Bang"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el segundo planeta desde el Sol?",
                options = listOf("Marte", "Venus", "Tierra", "Mercurio"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué planeta tiene una inclinación extrema y gira casi de lado?",
                options = listOf("Urano", "Neptuno", "Saturno", "Venus"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe el camino aparente del Sol sobre la esfera celeste?",
                options = listOf("Elipse", "Tránsito solar", "Zodíaco", "Eclíptica"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es la unidad de medida usada para distancias estelares?",
                options = listOf("Años luz", "Kilómetros", "Parsecs", "Unidades astronómicas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué fenómeno produce las auroras boreales?",
                options = listOf("Lluvias de estrellas", "Choque de meteoritos", "Viento solar interactuando con el campo magnético", "Fases lunares"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué planeta tiene una enorme mancha roja que es una tormenta?",
                options = listOf("Neptuno", "Júpiter", "Saturno", "Urano"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes cuerpos no es un planeta enano?",
                options = listOf("Makemake", "Ceres", "Plutón", "Io"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué planeta tiene estaciones extremas debido a su eje de inclinación?",
                options = listOf("Tierra", "Urano", "Marte", "Neptuno"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Avistamiento de aves" to listOf(
            QuizQuestion(
                question = "¿Cuál es el nombre común del ave más pequeña del mundo?",
                options = listOf("Gorrión pigmeo", "Colibrí abeja", "Tordo enano", "Reyezuelo menor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué instrumento es esencial para el avistamiento de aves?",
                options = listOf("Telescopio astronómico", "Microscopio", "Binoculares", "Catalejo náutico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué comportamiento indica que un ave está anidando cerca?",
                options = listOf("Vuela en círculos sin rumbo", "Canta en voz alta", "Transporta ramas o pasto en el pico", "Nada en línea recta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'aves migratorias'?",
                options = listOf("Aves que viven en el mismo lugar todo el año", "Aves que nadan largas distancias",
                    "Aves que cambian de región según la estación", "Aves que cantan al amanecer"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una guía de campo popular para identificar aves?",
                options = listOf("Guía Michelin", "Atlas Mundial", "Enciclopedia Británica", "Guía de Sibley"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de hábitat prefieren la mayoría de los patos?",
                options = listOf("Desierto", "Bosques tropicales", "Cumbres nevadas", "Humedales y lagos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué característica es clave para identificar aves desde lejos?",
                options = listOf("Forma del pico y silueta","Color de los ojos", "Longitud exacta",  "Cantidad de plumas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué grupo de aves es conocido por su canto complejo?",
                options = listOf("Rapaces", "Anátidas", "Paseriformes", "Caradriformes"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de ave es un martín pescador?",
                options = listOf("Ave marina", "Ave de presa", "Ave nocturna", "Ave que se alimenta de peces en ríos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estas aves es nocturna?",
                options = listOf("Gaviota", "Golondrina", "Búho", "Zorzal"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función tiene el canto en muchas especies de aves?",
                options = listOf("Marcar territorio y atraer pareja","Dormir mejor",  "Espantar depredadores", "Regular la temperatura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una lista de vida (life list) en el avistamiento de aves?",
                options = listOf("Un registro de aves favoritas", "Lista de aves vistas en un año", "Lista de todas las especies observadas por una persona",
                    "Inventario de aves migratorias"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un plumaje nupcial?",
                options = listOf("El plumaje de los polluelos", "Plumas caídas", "Plumaje de invierno", "Coloración especial en época de reproducción"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál es el mejor momento del día para observar aves?",
                options = listOf("Al amanecer","Mediodía", "A media tarde", "Medianoche"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas aves es un ave rapaz?",
                options = listOf("Jilguero", "Gavilán", "Tórtola", "Pingüino"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué continente tiene la mayor diversidad de aves?",
                options = listOf("Europa", "África", "América del Sur", "Oceanía"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda llevar al salir a observar aves?",
                options = listOf("Sombrero elegante", "Cámara profesional sin binoculares", "Binoculares, guía de campo y cuaderno de notas",
                    "Bocina para atraer aves"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué color de ropa es mejor para no espantar aves?",
                options = listOf("Colores neutros o tierra","Rojo brillante", "Negro intenso",  "Azul eléctrico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'pishing' en avistamiento de aves?",
                options = listOf("Método de fotografía nocturna", "Técnica de emisión de sonidos para atraer aves", "Tipo de nido", "Cebo especial para colibríes"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa que un ave sea endémica?",
                options = listOf("Que vuela muy alto", "Que es difícil de encontrar", "Que solo vive en una región específica", "Que tiene plumaje brillante"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una bandada mixta?",
                options = listOf("Grupo de aves con diferentes edades", "Grupo de aves acuáticas y terrestres",
                    "Grupo de diferentes especies que se mueven juntas", "Grupo de aves de distintos colores"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un ave zancuda?",
                options = listOf("Flamenco", "Pato criollo", "Cacatúa", "Gavilán"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué sonido hace comúnmente un cuco?",
                options = listOf("Pío pío", "Cucú", "Kraa", "Chirr"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se estudia con el anillado de aves?",
                options = listOf("Edad exacta del ave", "Distancia del vuelo diario", "Colores del plumaje", "Migración, longevidad y comportamiento"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una rapaz diurna?",
                options = listOf("Ave que canta de día", "Ave que se alimenta de frutas", "Ave de presa activa durante el día", "Ave que vive en desiertos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un colibrí?",
                options = listOf("Zorzal", "Chimango", "Picaflor", "Carancho"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Dónde suelen anidar los vencejos?",
                options = listOf("En cavidades de edificios o acantilados","En el suelo", "Sobre ramas bajas",  "En nidos flotantes"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué comen la mayoría de los pinzones?",
                options = listOf("Peces", "Semillas e insectos", "Carne", "Alga marina"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el ave voladora más grande del mundo?",
                options = listOf("Cóndor andino", "Águila real", "Pelícano blanco", "Garza real"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el plumaje críptico?",
                options = listOf("Plumaje fluorescente", "Plumaje muy pesado", "Coloración que camufla al ave", "Plumas de muda"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué zona es ideal para observar aves costeras?",
                options = listOf("Cimas de montañas", "Playas, estuarios y marismas", "Cuevas", "Ciudades muy urbanizadas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué sentido está más desarrollado en la mayoría de las aves?",
                options = listOf("Olfato", "Vista", "Gusto", "Tacto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa cuando un ave realiza cortejo aéreo?",
                options = listOf("Canta en lo alto de un árbol", "Vuela de forma elaborada para atraer pareja", "Busca comida en el cielo", "Evita depredadores"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una especie residente?",
                options = listOf("Especie migratoria", "Ave que habita en zoológicos", "Ave que permanece todo el año en la misma zona", "Ave que habita solo en invierno"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ave es conocida por su habilidad para imitar sonidos?",
                options = listOf("Golondrina", "Estornino pinto", "Pato mandarín", "Tordo músico"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué papel juegan las aves en el ecosistema?",
                options = listOf("Solo decorativo", "Propagan enfermedades", "Controlan plagas, polinizan y dispersan semillas", "Ninguno"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué región de América es famosa por su alta biodiversidad de aves?",
                options = listOf("Alaska", "Amazonas", "Tierra del Fuego", "Desierto de Sonora"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe evitar al observar aves?",
                options = listOf("Hablar en voz baja", "Llevar binoculares", "Molestar nidos o acercarse demasiado", "Permanecer quieto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos registros es útil para observadores de aves?",
                options = listOf("Planificador financiero", "Registro de especies observadas con fecha y lugar", "Hoja de puntuación", "Agenda escolar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos comportamientos sugiere que el ave se siente amenazada?",
                options = listOf("Canto tranquilo", "Peinar sus plumas", "Aleteo agitado y llamadas de alarma", "Picoteo de ramas"),
                correctIndex = 2
            )
        ),


        //********************************************************************************************************************************

        "Adiestramiento de animales" to listOf(
            QuizQuestion(
                question = "¿Qué método de adiestramiento se basa en recompensar conductas deseadas?",
                options = listOf("Castigo positivo", "Refuerzo negativo", "Refuerzo positivo", "Desensibilización"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes animales es más comúnmente adiestrado como animal de servicio?",
                options = listOf("Gato", "Perro", "Conejo", "Loro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa comúnmente en el adiestramiento con clicker?",
                options = listOf("Silbato", "Correa de estrangulamiento", "Clicker", "Chaleco táctico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'imprinting' en animales?",
                options = listOf("Un tipo de castigo", "Una técnica de exposición",
                "El reconocimiento de un objeto como figura parental", "Un estilo de caminar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas razas es famosa por su facilidad para el adiestramiento?",
                options = listOf("Chow Chow", "Border Collie", "Pekinés", "Shar Pei"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'refuerzo negativo'?",
                options = listOf("Quitar algo agradable para reducir una conducta", "Aplicar castigo",
                "Quitar algo desagradable para aumentar una conducta", "Ignorar al animal completamente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica consiste en exponer gradualmente al animal a un estímulo que teme?",
                options = listOf("Condicionamiento clásico", "Refuerzo positivo", "Desensibilización sistemática", "Shaping", "Desensibilización sistemática"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el 'shaping' o moldeado?",
                options = listOf("Forzar al animal a realizar una acción", "Castigar una mala conducta",
                "Premiar aproximaciones sucesivas al comportamiento deseado", "Asociar palabras con gestos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la edad ideal para empezar el adiestramiento básico en un cachorro?",
                options = listOf("12 semanas", "6 meses", "8 años", "1 año"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'clicker training'?",
                options = listOf("Un entrenamiento de obediencia avanzada", "Un tipo de ejercicio físico",
                "Un método de refuerzo positivo basado en sonido", "Una forma de castigo leve"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un ejemplo de conducta operante?",
                options = listOf("Respirar", "Pestañear", "Salivar al oler comida", "Sentarse al dar una orden"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué profesional se especializa en problemas de comportamiento animal?",
                options = listOf("Etólogo","Veterinario general", "Psicólogo humano",  "Nutricionista animal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo del adiestramiento en positivo?",
                options = listOf("Castigar comportamientos no deseados", "Reprimir al animal",
                "Recompensar comportamientos deseados", "Obligar a obedecer sin pensar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué animal es comúnmente adiestrado en espectáculos marinos?",
                options = listOf("Canguro", "Caballo","Gato", "Orca"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa que un perro esté 'reactivo'?",
                options = listOf("Es muy dormilón", "Se distrae con facilidad", "Reacciona de forma exagerada a estímulos",
                    "Solo responde con comida"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos NO es un tipo de refuerzo?",
                options = listOf("Premio", "Caricia", "Juego", "Corrección física"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es un reforzador secundario?",
                options = listOf("Un premio que no tiene valor natural, como un click", "Un juguete", "Una golosina", "Una necesidad biológica"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué raza de perro es muy usada para detectar sustancias?",
                options = listOf("Dálmata", "Beagle", "Bóxer", "Pastor de Brie"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué animal se adiestra comúnmente para buscar personas en desastres?",
                options = listOf("Canario", "Perro", "Gato", "Iguana"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué comando básico suele enseñarse primero a los perros?",
                options = listOf("Túmbate", "Ven", "Quieto", "Siéntate"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es el condicionamiento clásico?",
                options = listOf("Asociar una acción con una recompensa", "Asociar un estímulo neutro con uno significativo", "Enseñar trucos complejos", "Reforzar una conducta existente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la habituación?",
                options = listOf("Un tipo de castigo", "Reacción excesiva a un estímulo", "Pérdida de respuesta a estímulo repetido", "Un adiestramiento con clicker"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas especies es más difícil de adiestrar?",
                options = listOf("Caballo", "Perro", "Gato", "Delfín"),
                options = listOf("Caballo", "Perro", "Delfín"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué caracteriza al método de adiestramiento tradicional?",
                options = listOf("Uso de refuerzos positivos", "Estímulos aversivos", "Basado en juegos", "Solo en casa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'generalización' en adiestramiento?",
                options = listOf("Usar el mismo comando para todo", "Aprender varios comandos a la vez", "Aplicar una conducta aprendida en diferentes contextos", "Olvidar un comportamiento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué comando se enseña para evitar que un perro jale de la correa?",
                options = listOf("Túmbate", "Quieto", "Arriba", "Junto"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué raza es popular en competencias de obediencia?",
                options = listOf("Yorkshire Terrier", "Border Collie", "Gran Danés", "Mastín Napolitano"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple el refuerzo intermitente?",
                options = listOf("Castigar malas conductas", "Enseñar trucos nuevos", "Mantener una conducta ya aprendida", "Ignorar conductas no deseadas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué especie es más sensible al uso del castigo?",
                options = listOf("Perro", "Gato", "Caballo", "Todas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta ayuda a mantener la atención del animal durante el adiestramiento?",
                options = listOf("Clicker", "Correa retráctil", "Bozal", "Arnés"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'señal' en adiestramiento?",
                options = listOf("Una palabra o gesto que provoca una conducta", "Un objeto decorativo", "Una herramienta de castigo", "Una raza de perro"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es la extinción de conducta?",
                options = listOf("Eliminar un animal del entrenamiento", "Ignorar una conducta hasta que desaparezca", "Reforzar una conducta negativa", "Premiar sin motivo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un target en adiestramiento?",
                options = listOf("Un objetivo de aprendizaje", "Una herramienta para castigo", "Un objeto que el animal debe tocar", "Un tipo de collar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué animal es entrenado con frecuencia para terapia asistida?",
                options = listOf("Serpiente", "Perro", "Pato", "Gato"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos animales puede ser adiestrado con refuerzo positivo?",
                options = listOf("Delfín", "Rata", "Perro", "Todos los anteriores"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué problema se puede presentar si se usa solo comida como refuerzo?",
                options = listOf("Obesidad", "Agresividad", "Falta de motivación", "Ninguno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es importante para la efectividad del refuerzo?",
                options = listOf("Que sea inmediato", "Que se repita muchas veces", "Que sea costoso", "Que sea inesperado"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de adiestramiento mejora el vínculo humano-animal?",
                options = listOf("Aversivo", "Refuerzo positivo", "Represivo", "Castigo intermitente"),
                correctIndex = 1
            )
        ),


        //********************************************************************************************************************************


        "Manicura" to listOf(
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para empujar la cutícula?",
                options = listOf("Lima de uñas", "Alicate", "Cortaúñas", "Empujador de cutícula"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una manicura francesa?",
                options = listOf("Uñas rojas con decoración", "Uñas con esmalte negro", "Uñas cuadradas y mates", "Uñas con puntas blancas y base natural"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué material se utiliza para hacer uñas acrílicas?",
                options = listOf("Gel y lámpara", "Esmalte regular", "Polvo acrílico y monómero", "Removedor de esmalte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el monómero en uñas acrílicas?",
                options = listOf("Una lima especial", "Una resina de secado rápido", "Un desinfectante", "Un líquido que se mezcla con el polvo acrílico"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué función cumple la base coat?",
                options = listOf("Dar brillo", "Fijar los cristales", "Proteger la uña natural", "Secar el esmalte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de lámpara se utiliza para secar esmalte en gel?",
                options = listOf("Lámpara incandescente", "Lámpara UV/LED", "Lámpara halógena", "Secador de cabello"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué producto se usa para eliminar esmalte en gel?",
                options = listOf("Alcohol", "Monómero", "Acetona pura", "Removedor con agua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para dar forma a las uñas?",
                options = listOf("Pinza", "Brocha", "Tijeras", "Lima"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué forma de uña es puntiaguda y termina en pico?",
                options = listOf("Cuadrada", "Ovalada", "Stiletto", "Almendra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la principal función del top coat?",
                options = listOf("Eliminar impurezas", "Aportar color", "Crear textura", "Proteger y dar brillo al esmalte"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una manicura semipermanente?",
                options = listOf("Uso de productos naturales", "Dura 1-2 días", "Utiliza esmalte tradicional", "Esmalte en gel que dura más de una semana"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de aplicar esmalte en gel?",
                options = listOf("Aplicar aceite de cutícula", "Humedecer las uñas", "Desengrasar y pulir la uña", "Pintar con esmalte regular"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'nail art'?",
                options = listOf("Corte de uñas", "Decoración creativa en uñas", "Tinte de uñas", "Tratamiento para cutículas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se usa para adherir cristales o decoraciones a la uña?",
                options = listOf("Top coat", "Alcohol", "Pegamento para uñas", "Desinfectante"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué causa el lifting en uñas acrílicas?",
                options = listOf("Uso de top coat", "Secado con lámpara", "Buena preparación", "Mala adherencia o preparación de la uña"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'cutícula'?",
                options = listOf("La forma de la uña", "La base del esmalte", "La piel que protege la matriz de la uña", "Un tipo de esmalte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función del primer en uñas acrílicas?",
                options = listOf("Eliminar cutículas", "Sellar la uña", "Ayudar en la adhesión del producto", "Dar color"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material se utiliza para crear uñas de gel?",
                options = listOf("Polvo acrílico y monómero", "Gel UV y lámpara", "Acetona y base coat", "Cristales y resina"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta eléctrica se usa para retirar uñas acrílicas?",
                options = listOf("Pinza térmica", "Taladro o torno eléctrico", "Lámpara UV", "Cortaúñas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una uña encapsulada?",
                options = listOf("Una uña cubierta con esmalte tradicional", "Una técnica sin decoración", "Una decoración protegida dentro del acrílico o gel", "Una uña con esmalte mate"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede provocar infecciones en las uñas?",
                options = listOf("Mala higiene o humedad","Uso de top coat", "Herramientas esterilizadas",  "Secado rápido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte de la uña es responsable del crecimiento?",
                options = listOf("Cutícula", "Lecho ungueal", "Matriz", "Punta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer si una clienta presenta hongos en las uñas?",
                options = listOf("Recomendar visitar al dermatólogo","Aplicar acrílico", "Ignorarlo",  "Cubrir con esmalte oscuro"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una lima 100/180?",
                options = listOf("Una herramienta para pulir cutículas", "Un tipo de pincel", "Una lima con diferentes granos de abrasividad", "Un desinfectante"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el primer paso en una manicura básica?",
                options = listOf("Aplicar esmalte", "Pulir la uña", "Limpiar y desinfectar manos", "Colocar aceite de cutícula"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuánto suele durar el esmalte en gel correctamente aplicado?",
                options = listOf("1-2 semanas", "1 día", "3-5 días", "1 mes"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué color es tradicional en una manicura francesa?",
                options = listOf("Negro", "Rojo", "Blanco", "Dorado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'nail stamping'?",
                options = listOf("Técnica de alisado", "Decoración con pegatinas", "Técnica de decoración con placas y sellos", "Tipo de esculpido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer después de usar cada herramienta?",
                options = listOf("Desecharla", "Guardarla sin limpiar", "Esterilizar o desinfectar", "Dejarla al aire"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué producto se aplica para hidratar la cutícula?",
                options = listOf("Top coat", "Aceite de cutícula", "Removedor de esmalte", "Base coat"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica permite alargar la uña natural con moldes?",
                options = listOf("Nail art", "Manicura exprés", "Esculpido con acrílico o gel", "Decorado con esmalte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes productos es usado para pulir la superficie de la uña?",
                options = listOf("Alicate", "Removedor de cutícula", "Buffer o pulidor", "Top coat"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué forma de uña es más resistente?",
                options = listOf("Stiletto", "Almendra", "Ovalada", "Cuadrada con bordes redondeados"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'nail prep'?",
                options = listOf("Aplicar esmalte", "Preparar la cutícula", "Preparación de la uña natural para mayor adherencia", "Secado de gel"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pasa si se aplica gel sobre una uña húmeda?",
                options = listOf("Se adhiere mejor", "No ocurre nada", "Se forma hongo", "Puede despegarse o causar lifting"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué indica un esmalte con símbolo de libre de '3-free'?",
                options = listOf("Solo para uñas postizas", "Que es resistente al agua", "Que no contiene 3 químicos tóxicos comunes", "Que solo dura 3 días"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para proteger las uñas después de remover gel o acrílico?",
                options = listOf("No hacer nada", "Usar alcohol", "Aplicar aceite y fortalecedor", "Pintarlas con esmalte negro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de esmalte necesita curado en lámpara?",
                options = listOf("Esmalte regular", "Esmalte en gel", "Esmalte en spray", "Esmalte mate"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué uña se suele decorar más en el 'nail art'?",
                options = listOf("Índice", "Pulgar", "Meñique", "Anular"),
                correctIndex = 3
            )
        ),



        //********************************************************************************************************************************


        "Diseño floral" to listOf(
            QuizQuestion(
                question = "¿Cuál es el objetivo principal del diseño floral?",
                options = listOf("Aromatizar un espacio", "Colorear las paredes", "Crear composiciones estéticas con flores", "Evitar que se marchiten las flores"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para cortar tallos con precisión?",
                options = listOf("Tijeras de papel", "Cuchillo de cocina", "Podadora o tijeras de florista", "Lima metálica", "Podadora o tijeras de florista"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para mantener las flores hidratadas en un arreglo?",
                options = listOf("Aire comprimido", "Espuma floral (oasis)", "Tierra seca", "Arena"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de flor es ideal para diseños florales duraderos?",
                options = listOf("Girasol", "Lirio", "Crisantemo", "Orquídea silvestre"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'follaje' en un arreglo floral?",
                options = listOf("Las flores más grandes", "Decoraciones plásticas", "Las hojas verdes que acompañan las flores", "Las cintas decorativas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes es un principio del diseño floral?",
                options = listOf("Pesadez", "Desorden", "Opacidad", "Equilibrio"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'armonía' en un arreglo floral?",
                options = listOf("Que las flores sean del mismo tipo", "Que haya muchas flores", "Que los elementos del diseño combinen entre sí", "Que no se utilice follaje"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué color se asocia con tranquilidad en el diseño floral?",
                options = listOf("Azul","Rojo", "Amarillo",  "Naranja"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica común en arreglos florales contemporáneos?",
                options = listOf("Asimetría", "Simetría estricta", "Flores artificiales", "Uso exclusivo de rosas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para fijar flores en estructuras?",
                options = listOf("Pegamento escolar", "Clavos", "Cinta floral", "Silicona líquida"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'línea' en diseño floral?",
                options = listOf("La forma de una flor", "El tipo de recipiente", "La dirección visual que guía el ojo", "Una cuerda decorativa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se logra al usar flores en diferentes etapas de floración?",
                options = listOf("Desorden", "Armonía visual", "Pérdida de color", "Menor duración"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de arreglo se usa comúnmente en bodas?",
                options = listOf("Centro de mesa bajo", "Arreglo fúnebre", "Ramo en cascada", "Jarrón de exterior"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué flores se asocian comúnmente con el romanticismo?",
                options = listOf("Margaritas", "Cactus", "Rosas rojas", "Girasoles"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de arreglo floral se utiliza típicamente en funerales?",
                options = listOf("Bouquet de novia", "Centro de mesa redondo", "Ramillete de solapa", "Corona floral"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué propiedad ayuda a mantener las flores frescas por más tiempo?",
                options = listOf("Altas temperaturas", "Cambios bruscos de luz", "Agua limpia y fresca", "Ambientes secos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una flor común en diseño floral japonés (ikebana)?",
                options = listOf("Girasol", "Clavel", "Crisantemo", "Azucena"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se busca al crear un punto focal en un arreglo?",
                options = listOf("Que todas las flores sean iguales", "Dirigir la atención hacia un área específica", "Reducir el uso de flores", "Alinear los tallos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué flor se usa comúnmente en arreglos secos?",
                options = listOf("Hortensia", "Lirio de agua", "Tulipán", "Gladiolo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'proporción' en diseño floral?",
                options = listOf("Cantidad de agua usada", "Relación entre flores y recipiente", "Cantidad de color", "Número exacto de flores"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué flor es conocida por su fragancia intensa?",
                options = listOf("Crisantemo", "Peonía", "Lavanda", "Dalia"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un arreglo monocromático?",
                options = listOf("Hecho con un solo tipo de flor", "Hecho sin hojas", "Hecho en un solo color", "Hecho solo con tallos largos", "Hecho en un solo color"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué flor simboliza la amistad?",
                options = listOf("Rosa roja", "Girasol", "Lirio blanco", "Rosa negra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer con los tallos antes de colocarlos en agua?",
                options = listOf("Pintarlos", "Enrollarlos", "Cortarlos en diagonal", "Secarlos al sol"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de floración dura más en florero?",
                options = listOf("Rosas abiertas", "Tulipanes", "Claveles", "Lirios completamente abiertos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para dar altura en un diseño floral?",
                options = listOf("Flores de base", "Follaje rastrero", "Tallos largos o estructuras", "Flores pequeñas", "Tallos largos o estructuras"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué color suele utilizarse en arreglos elegantes y sobrios?",
                options = listOf("Fucsia", "Amarillo neón", "Blanco", "Verde lima"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de arreglo floral se lleva en la solapa?",
                options = listOf("Boutonniere","Corsage", "Ramo de novia",  "Corona de flores"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes es una flor de temporada primavera-verano?",
                options = listOf("Poinsettia", "Crisantemo", "Tulipán", "Acebo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué flor es muy usada en arreglos tropicales?",
                options = listOf("Hortensia", "Ave del paraíso", "Rosa", "Clavel"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo floral enfatiza la línea y el espacio negativo?",
                options = listOf("Moderno europeo", "Campestre", "Ikebana", "Minimalista urbano"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material se puede usar para estructuras modernas?",
                options = listOf("Cartón", "Ramas secas, alambres o bambú", "Tierra húmeda", "Paños húmedos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para pelar tallos gruesos?",
                options = listOf("Cuchillo de mantequilla", "Cepillo de uñas", "Pelador o cuchillo floral", "Tenedor de jardinería"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'balance' visual en un arreglo?",
                options = listOf("El peso del florero", "Cantidad de agua usada", "Distribución armoniosa del peso visual", "Igual número de flores en cada lado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se puede hacer para evitar que las flores se marchiten rápido?",
                options = listOf("Dejarlas al sol directo", "No cambiar el agua", "Cortar tallos cada pocos días", "Ponerles sal", "Cortar tallos cada pocos días"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué flor es conocida por su forma redonda y textura densa?",
                options = listOf("Girasol", "Dalia", "Geranio", "Jazmín"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'textura' en el diseño floral?",
                options = listOf("Color de las flores", "Cantidad de flores", "Sensación visual o táctil de las superficies", "Tipo de aroma"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una buena práctica al transportar arreglos florales?",
                options = listOf("Ponerlos en bolsas cerradas", "Mantenerlos sin agua", "Sujetar firmemente y proteger del calor", "Voltearlos para que respiren"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo floral es más natural y suelto?",
                options = listOf("Lineal japonés", "Romántico clásico", "Simétrico ceremonial", "Campestre o rústico"),
                correctIndex = 3
            )
        ),



        //********************************************************************************************************************************



        "Lepidopterología" to listOf(
            QuizQuestion(
                question = "¿Qué tipo de antenas tienen las mariposas?",
                options = listOf("Filiformes", "Capitadas", "Plumosas", "Pectinadas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función de la espiritrompa en los lepidópteros?",
                options = listOf("Succionar líquidos", "Masticar alimentos sólidos", "Perforar frutos", "Depositar huevos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué color es común en las alas traseras de los adultos de la familia Sphingidae?",
                options = listOf("Azul brillante", "Amarillo y negro", "Rosa con bandas negras", "Verde"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo se mueven las larvas de algunos géneros de la familia Noctuidae?",
                options = listOf("Caminan rápido", "Rápidamente y en zigzag", "Como falsos medidores", "En forma circular"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué insecto es común en la familia Pieridae?",
                options = listOf("Polilla tigre", "Hespéridos", "Mariposa búho", "Gusano de la col"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es característico en las larvas de la familia Arctiidae?",
                options = listOf("Son de colores claros", "Presentan mechones de pelos", "No tienen patas", "Tienen pseudopatas en A3 y A6"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué característica especial poseen las larvas de la familia Papilionidae?",
                options = listOf("Cabeza grande", "Color verde", "Glándula osmeterio", "Pseudopatas adicionales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué color es común en las mariposas búho de la familia Brassolidae?",
                options = listOf("Amarillo y negro", "Pardos o azul brillante", "Verde con rojo", "Blanco y negro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Dónde suelen alimentarse las larvas de la familia Hesperiidae?",
                options = listOf("En la tierra", "Dentro de hojas enrolladas", "En flores", "En cuerpos de agua"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué coloración es común en las alas de los adultos de la familia Pieridae?",
                options = listOf("Blanco con amarillo y/o negro", "Azul y blanco", "Verde y marrón", "Rojo y amarillo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué estructura en las larvas de la familia Papilionidae produce un olor desagradable?",
                options = listOf("Proboscis", "Espiritrompa", "Osmeterio", "Escolus"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Dónde pupan las larvas de la familia Sphingidae?",
                options = listOf("Celdas en el suelo", "Dentro de hojas", "En frutos", "Sobre rocas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de antenas poseen los adultos de la familia Saturniidae?",
                options = listOf("Bipectinadas o plumosas", "Filiformes", "Setáceas", "Capitadas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de las siguientes familias incluye a insectos que pueden tener color metálico en sus alas?",
                options = listOf("Pieridae", "Hesperiidae", "Brassolidae", "Lionetidae"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué coloración es común en las larvas de la familia Brassolidae?",
                options = listOf("Azul brillante","Amarilla con líneas", "Negra con puntos rojos", "Verde"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué hábito tienen las larvas de la familia Gelechiidae?",
                options = listOf("Succionadoras de savia","Cazan insectos", "Minadoras y tejedoras de hojas", "Viven en agua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué característica especial tienen algunos adultos de la familia Noctuidae?",
                options = listOf("Cuerpo delgado","Prosboscis mmodificada para perforar frutos", "Cabeza grande", "Sin alas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de alas tienen los adultos de la familia Papilionidae?",
                options = listOf("Metatorácicas con prolongaciones en forma de colitas","Mesotorácicas redondeadas", "Metatorácicas lineales", "Alas completamente transparentes"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué familia de mariposas tiene adultos que pueden emitir un sonido crepitante al volar?",
                options = listOf("Noctuidae","Brassolidae", "Sphingidae", "Pieridae"),
                correctIndex = 1
            )
        ),



        //************************************************************************************************************************


        "Escribir" to listOf(
            QuizQuestion(
                question = "¿Qué se entiende por narrador omnisciente?",
                options = listOf("Que sabe todo lo que ocurre", "Que narra en primera persona", "Que participa en la historia", "Que solo describe acciones"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos géneros pertenece a la escritura creativa?",
                options = listOf("Cuento", "Informe técnico", "Manual de usuario", "Carta formal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué figura literaria compara dos elementos usando 'como'?",
                options = listOf("Metáfora", "Personificación", "Símil", "Hipérbole"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un personaje plano?",
                options = listOf("Tiene evolución compleja", "Es cambiante", "Es simple y no evoluciona", "Rompe la cuarta pared"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de una historia presenta el conflicto principal?",
                options = listOf("Introducción", "Nudo", "Desenlace", "Epílogo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de narrador usa el 'yo' para contar la historia?",
                options = listOf("Omnisciente", "Testigo", "Protagonista", "Editorial"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de un borrador al escribir?",
                options = listOf("Publicarlo directamente", "Organizar y desarrollar ideas", "Eliminar ideas", "Usarlo como resumen"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'show, don't tell' en escritura?",
                options = listOf("Decir lo que pasa claramente", "Mostrar con acciones en vez de explicar", "Usar adjetivos siempre", "Evitar el diálogo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el antónimo de escritura persuasiva?",
                options = listOf("Narrativa", "Informativa", "Argumentativa", "Crítica"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se revisa en una corrección de estilo?",
                options = listOf("Ortografía solamente", "Contenido factual", "Fluidez, tono y coherencia", "Diseño visual"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un ensayo?",
                options = listOf("Texto en verso", "Narración corta", "Reflexión argumentativa", "Resumen biográfico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de texto intenta convencer al lector?",
                options = listOf("Narrativo", "Expositivo", "Argumentativo", "Lírico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del texto expresa la idea principal?",
                options = listOf("Conclusión", "Introducción", "Tesis", "Desarrollo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una sinestesia?",
                options = listOf("Contradicción poética", "Unión de sentidos diferentes", "Exageración extrema", "Rima interna"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple un diálogo en narrativa?",
                options = listOf("Decorar el texto", "Dar ritmo", "Mostrar acciones", "Revelar carácter y avanzar la trama"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'voz narrativa'?",
                options = listOf("Volumen del texto", "Tono de los personajes", "Perspectiva del narrador", "Lenguaje figurado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una anáfora?",
                options = listOf("Repetición al principio de frases", "Oposición de ideas", "Enumeración caótica", "Rima inesperada"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una crónica?",
                options = listOf("Relato ordenado de hechos reales", "Cuento fantástico", "Opinión breve", "Artículo técnico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué recurso estilístico hay en 'el silencio gritaba'?",
                options = listOf("Hipérbole", "Paradoja", "Personificación", "Ironía"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuento resuelve el conflicto?",
                options = listOf("Clímax", "Desenlace", "Nudo", "Giro argumental"),
                correctIndex = 1
            )
        ),


        //************************************************************************************************************************

        "Dibujo" to listOf(
            QuizQuestion(
                question = "¿Qué es el claroscuro en dibujo?",
                options = listOf("Técnica de color digital", "Contraste entre luces y sombras", "Dibujo con tinta blanca", "Técnica de escultura"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos elementos define la perspectiva?",
                options = listOf("Sombras", "Líneas de fuga", "Textura", "Volumen"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para difuminar grafito?",
                options = listOf("Lápiz rojo", "Difumino", "Regla", "Compás"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa la línea de horizonte en perspectiva?",
                options = listOf("La base del dibujo", "El límite del cielo", "La altura del ojo del observador", "El final del papel"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'boceto'?",
                options = listOf("Dibujo terminado", "Versión en tinta", "Esbozo inicial", "Retrato realista"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de lápiz deja una línea más oscura?",
                options = listOf("H", "HB", "2H", "6B"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de plano se usa para dibujar rostros realistas?",
                options = listOf("Perspectiva aérea", "Plano técnico", "Proporciones faciales", "Escala de grises"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'valor tonal' en dibujo?",
                options = listOf("Uso de la línea", "Brillo y sombra de un color", "Color exacto", "Grosor del trazo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte de la cara se encuentra a mitad del cráneo en proporciones clásicas?",
                options = listOf("Boca", "Ojos", "Nariz", "Mentón"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica usa puntos para crear sombras?",
                options = listOf("Rayado cruzado", "Sfumato", "Punteado", "Esgrafiado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la forma básica del cuerpo humano en dibujo académico?",
                options = listOf("Cubo", "Esfera", "Figura de palitos", "Bloques geométricos"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué artista es conocido por su manejo del dibujo anatómico?",
                options = listOf("Leonardo da Vinci", "Van Gogh", "Monet", "Dalí"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué papel es más adecuado para acuarela?",
                options = listOf("Opalina", "Papel manteca", "Papel de alto gramaje", "Papel cebolla"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento da profundidad en un dibujo?",
                options = listOf("Color primario", "Sombra", "Perspectiva", "Contorno fuerte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta NO se usa normalmente en dibujo tradicional?",
                options = listOf("Difumino", "Lápiz", "Tablet", "Regla"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se busca con los ejercicios de línea continua?",
                options = listOf("Crear sombras", "Ganar confianza y fluidez", "Aumentar el contraste", "Definir volumen"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se logra con la técnica de rayado cruzado?",
                options = listOf("Color", "Volumen y sombra", "Proporción", "Composición"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una silueta?",
                options = listOf("Forma interior", "Luz secundaria", "Contorno sólido sin detalles", "Boceto a color"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa dibujar del natural?",
                options = listOf("Inventar figuras", "Dibujar desde fotografía", "Copiar de otro dibujo", "Observar y dibujar desde la realidad"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un principio del dibujo académico?",
                options = listOf("Perspectiva", "Proporción", "Expresión emocional", "Sombra y luz"),
                correctIndex = 2
            )
        ),


        //************************************************************************************************************************

        "Crochet" to listOf(
            QuizQuestion(
                question = "¿Qué es el crochet?",
                options = listOf("Técnica para coser botones", "Técnica textil con una aguja", "Tipo de bordado", "Tipo de telar industrial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta principal se utiliza en el crochet?",
                options = listOf("Aguja recta", "Aguja de gancho", "Tijera", "Dedal"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de hilo es más usado en crochet?",
                options = listOf("Hilo de pescar", "Cuerda de yute", "Algodón", "Nylon grueso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un patrón en crochet?",
                options = listOf("Un tipo de hilo", "Una guía escrita de cómo tejer", "Una técnica de cosido", "Una aguja especial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'amigurumi'?",
                options = listOf("Una bufanda tejida", "Una técnica japonesa de muñecos tejidos", "Un tipo de punto", "Un hilo grueso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se necesita para empezar a tejer crochet?",
                options = listOf("Hilo, aguja de gancho y patrón", "Agujas rectas y lana", "Telar y gancho", "Máquina de coser"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué punto básico crea una base firme y densa?",
                options = listOf("Punto alto", "Punto enano", "Punto cadena", "Punto bajo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se forma con el 'círculo mágico' en crochet?",
                options = listOf("Un patrón decorativo", "El inicio de tejidos circulares", "Una puntada final", "Una forma rectangular"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Para qué sirve el marcador de puntos?",
                options = listOf("Marcar el inicio o final de una vuelta", "Contar cuántos hilos hay", "Sujetar el hilo", "Cortar el hilo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué punto es ideal para tejer bufandas sueltas?",
                options = listOf("Punto bajo", "Punto alto", "Punto enano", "Punto cruzado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de gancho se recomienda para principiantes?",
                options = listOf("Gancho muy pequeño", "Gancho grande (5mm o más)", "Gancho de acero", "Gancho doble"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué pasa si apretás demasiado los puntos?",
                options = listOf("El tejido queda flojo", "No afecta nada", "Es más fácil tejer", "El tejido se pone rígido y difícil de trabajar"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué parte del hilo debe estar tensa al tejer?",
                options = listOf("La cola", "La hebra de trabajo", "El centro", "Ninguna"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'bloqueo' en crochet?",
                options = listOf("Repetir una vuelta", "Planchar y dar forma al tejido final", "Cortar un error", "Unir dos piezas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica permite cambiar de color prolijamente?",
                options = listOf("Anudar", "Esconder hilos", "Cambiar hilo antes del último paso del punto", "Cortar y empezar de nuevo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'tejer en espiral'?",
                options = listOf("Tejer en vueltas sin cerrar", "Tejer con forma de zigzag", "Tejer en líneas rectas", "Tejer con hilo torcido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el punto cadena?",
                options = listOf("Punto decorativo", "El punto de inicio para muchas labores", "Un error común", "Un punto para finalizar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función de una aguja lanera?",
                options = listOf("Tejer puntos pequeños", "Coser piezas tejidas y esconder hilos", "Tejer bufandas", "Cortar hilos gruesos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'tejido a crochet' en inglés?",
                options = listOf("Knitting", "Crochet", "Sewing", "Spinning"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del gancho se usa para tomar el hilo?",
                options = listOf("La cabeza", "El mango", "El eje", "La base"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ocurre si el gancho es demasiado pequeño para el hilo?",
                options = listOf("El tejido queda flojo", "El tejido es imposible", "El tejido queda apretado y rígido", "No afecta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'tejer en redondo'?",
                options = listOf("Tejer en vueltas cerradas", "Tejer con hilo rojo", "Tejer con dos agujas", "Tejer sin patrón"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Para qué sirve la tensión en el tejido?",
                options = listOf("Para cortar el hilo", "Para determinar el tamaño final del proyecto", "Para cambiar el color", "Para hacer puntos más rápido"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué punto se usa comúnmente para unir piezas?",
                options = listOf("Punto alto", "Punto cangrejo", "Punto deslizado", "Punto redondo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un gráfico de crochet?",
                options = listOf("Una imagen decorativa", "Un dibujo técnico del patrón", "Una foto del producto terminado", "Una medida del hilo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'punto popcorn'?",
                options = listOf("Un punto básico", "Un punto que crea textura tridimensional", "Una forma de cerrar el tejido", "Un hilo especial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hilo es ideal para hacer amigurumis?",
                options = listOf("Hilo elástico", "Hilo de algodón", "Hilo de seda", "Hilo peludo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'aumentar puntos'?",
                options = listOf("Reducir el tamaño del tejido", "Agregar puntos adicionales en una fila", "Terminar el proyecto", "Volver a empezar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'punto relieve'?",
                options = listOf("Un error común", "Un punto tejido por delante o por detrás del punto base para generar textura", "Un punto de inicio", "Una forma de cortar el hilo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para hacer flores en crochet?",
                options = listOf("Punto cangrejo", "Tejido circular con aumentos", "Punto escondido", "Técnica plana"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué pasa si cambiás el tipo de hilo respecto al patrón original?",
                options = listOf("El color cambia", "El tamaño del proyecto puede variar", "No se puede tejer", "Se rompe el hilo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'punto puff'?",
                options = listOf("Un error", "Un punto decorativo con varias lazadas", "Un punto deslizado", "Un remate"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué punto se suele usar para terminar un proyecto?",
                options = listOf("Punto cadena", "Punto bajo", "Punto deslizado", "Punto en espiral"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'tensión de muestra'?",
                options = listOf("La velocidad de tejido", "La cantidad de puntos y filas en una muestra de 10x10 cm", "El tiempo que toma terminar una prenda", "La temperatura del ambiente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué gancho es ideal para hilos finos?",
                options = listOf("De 10 mm", "De 6 mm", "De 2.5 mm o menos", "De madera gruesa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué punto es más cerrado?",
                options = listOf("Punto alto", "Punto bajo", "Punto cadena", "Punto triple"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de empezar un proyecto nuevo?",
                options = listOf("Lavar el hilo", "Tejer una muestra de tensión", "Cortar los hilos sobrantes", "Unir los extremos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es 'rematar' en crochet?",
                options = listOf("Repetir una vuelta", "Cerrar el tejido de forma prolija", "Coser con hilo de otro color", "Cambiar el patrón"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué símbolo representa normalmente un punto bajo en gráficos?",
                options = listOf("X", "O", "-", "*"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'patrón gratuito'?",
                options = listOf("Una técnica especial", "Un patrón que no tiene costo y está disponible online", "Un patrón sin instrucciones", "Una variante improvisada"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************


        "Dardos" to listOf(
            QuizQuestion(
                question = "¿A qué distancia estándar se lanza un dardo en competencias oficiales?",
                options = listOf("1 metro", "2.37 metros", "3 metros", "4.5 metros"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el puntaje más alto que se puede obtener con un solo dardo?",
                options = listOf("60", "50", "40", "100"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del tablero vale 50 puntos?",
                options = listOf("Doble 25", "Borde exterior", "Bullseye", "Triple 20"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el número más alto en el tablero de dardos?",
                options = listOf("20", "25", "50", "100"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa el área 'doble' en el tablero?",
                options = listOf("Multiplica por tres", "Puntaje doble", "Pierde puntos", "Es una zona de penalización"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué pasa si un dardo cae antes de contarse?",
                options = listOf("Cuenta como cero", "Se repite el tiro", "Se suma igual", "Pierde el turno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué material es común para las puntas de los dardos electrónicos?",
                options = listOf("Acero", "Plástico", "Aluminio", "Madera"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el nombre del tiro que cierra una partida exactamente?",
                options = listOf("Cierre", "Finisher", "Checkout", "Game shot"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuántos dardos se lanzan por turno en una partida estándar?",
                options = listOf("1", "2", "3", "5"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué sección del tablero puntúa el triple de su valor?",
                options = listOf("El anillo exterior", "El anillo interior delgado", "El bullseye", "La zona negra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se considera un '180' en dardos?",
                options = listOf("Tres dardos en triple 20", "Un dardo en bullseye", "Una partida ganada", "Puntaje mínimo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del tablero es el 'bullseye'?",
                options = listOf("El anillo externo", "Centro rojo", "Anillo triple", "Zona superior"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'Bust' en una partida?",
                options = listOf("Empatar", "Superar el puntaje requerido y anular el turno", "Perder automáticamente", "Fallar un lanzamiento"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte de un dardo se agarra al lanzarlo?",
                options = listOf("Punta", "Caña", "Vástago", "Cuerpo o barril"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué se necesita para ganar una partida de 501?",
                options = listOf("Llegar a 500", "Terminar en cero con un doble", "Llegar a 1", "Lanzar 3 dardos seguidos al bullseye"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica un tablero con sectores numerados de 1 al 20?",
                options = listOf("Partida rápida", "Tablero oficial", "Tablero de práctica", "Juego infantil"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de dardos se usan con tableros de cerdas?",
                options = listOf("De plástico", "Magnéticos", "Con punta de acero", "Con velcro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pasa si un dardo rebota del tablero?",
                options = listOf("Cuenta como fallo", "Se vuelve a lanzar", "Vale medio punto", "Puntaje parcial"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del dardo influye más en la aerodinámica?",
                options = listOf("Punta", "Cuerpo", "Aletas o plumas", "Caña"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo se llama el lanzamiento que empieza una partida?",
                options = listOf("Lanzamiento libre", "Tiro de inicio", "Lanzamiento al bull", "Primera ronda"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se considera una buena estrategia al jugar 501?",
                options = listOf("Ir por los números bajos primero", "Evitar el bullseye", "Buscar triples altos y planificar el cierre con dobles", "Tirar siempre al mismo sector"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué indica una puntuación de 26 con tres dardos?",
                options = listOf("Un tiro perfecto", "Un error común al apuntar al 20", "Un cierre de partida", "Triple 8, triple 8, doble 1"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'oche'?",
                options = listOf("La línea desde donde se lanzan los dardos", "El centro del tablero", "Una técnica de lanzamiento", "Un error común"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el grosor típico de un dardo profesional?",
                options = listOf("Muy delgado como un clip", "Entre 6-8 mm", "Más de 1 cm", "No tiene grosor fijo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se necesita para practicar puntería en dardos?",
                options = listOf("Velocidad", "Fuerza", "Precisión y repetición", "Tablero electrónico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué zona del tablero es más difícil de acertar?",
                options = listOf("Triple 20", "Bullseye", "Doble 1", "Triple 5"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del dardo se puede cambiar para ajustar el vuelo?",
                options = listOf("Punta", "Cuerpo", "Plumas o aletas", "Color"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'double out'?",
                options = listOf("Salir de una partida con cualquier puntuación", "Terminar con un dardo en la zona doble", "Fallar dos tiros", "Jugar con dos personas a la vez"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de tablero usan los jugadores profesionales?",
                options = listOf("De plástico", "De velcro", "De cerdas", "De cartón"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el mejor lugar para practicar dardos en casa?",
                options = listOf("Sobre el piso", "En una pared sólida con protección", "Cerca de ventanas", "Encima de una mesa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puntaje equivale a tres dardos en triple 19?",
                options = listOf("57", "76", "81", "60"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una partida de 'cricket' en dardos?",
                options = listOf("Un juego en el que se buscan cerrar números del 15 al 20 y el bullseye", "Una variante infantil", "Un juego de velocidad", "Una partida sin puntaje"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del dardo puede estar hecha de tungsteno?",
                options = listOf("Punta", "Plumas", "Barril o cuerpo", "Caña"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué permite una caña más larga?",
                options = listOf("Mayor precisión para algunos jugadores", "Menor alcance", "Mayor velocidad", "Lanzar con efecto"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda al apuntar en dardos?",
                options = listOf("Fijar la mirada en el tablero y relajar el brazo", "Cerrar un ojo", "Mirar el dardo", "Mover el brazo completo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué factor NO influye en el lanzamiento de un dardo?",
                options = listOf("Forma del barril", "Tipo de zapatilla", "Peso del dardo", "Longitud de la caña"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hace un árbitro en competencias profesionales?",
                options = listOf("Coloca los dardos", "Supervisa las reglas y anota puntajes", "Reemplaza al jugador", "Controla la música"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué sucede si un dardo no queda clavado en el tablero?",
                options = listOf("Se cuenta igual", "Se anula el turno completo", "No se cuenta", "Se penaliza con -10"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la diferencia entre el bullseye interno y externo?",
                options = listOf("Ninguna", "El interno vale 50 y el externo 25 puntos", "El interno no puntúa", "El externo es decorativo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de lanzamiento es ideal en dardos?",
                options = listOf("Fuerte y rápido", "Controlado y recto", "Curvado", "Con rebote"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Manualidades" to listOf(
            QuizQuestion(
                question = "¿Qué son las manualidades?",
                options = listOf("Trabajos hechos con las manos, usualmente decorativos o útiles", "Ejercicios físicos", "Obras musicales", "Tareas de oficina"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes materiales es común en manualidades?",
                options = listOf("Cartón", "Líquido refrigerante", "Plomo", "Aceite de motor"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para cortar papel con precisión?",
                options = listOf("Regla", "Tijera", "Cúter", "Aguja"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de pegamento se usa para papel y cartulina?",
                options = listOf("Silicona caliente", "Cola vinílica", "Superglue", "Adhesivo epóxico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el scrapbooking?",
                options = listOf("Técnica para unir madera", "Decoración de cuadernos o álbumes con fotos, recortes y adornos", "Una técnica de tejido", "Pintura sobre vidrio"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se usa para hacer origami?",
                options = listOf("Papel", "Tela", "Plástico", "Cartón grueso"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'DIY' en el contexto de manualidades?",
                options = listOf("Distribuye y Yarda", "Dibuja y Yunta", "Do It Yourself", "Diseño Idealizado Yermo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica implica moldear objetos con las manos?",
                options = listOf("Pirograbado", "Modelado", "Sublimación", "Bordado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de pintura es ideal para manualidades en madera?",
                options = listOf("Acuarela", "Acrílica", "Óleo", "Esmalte sintético"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para calentar y aplicar pegamento termofusible?",
                options = listOf("Cúter", "Sierra eléctrica", "Pistola de silicona", "Pincel"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se necesita para comenzar con el bordado básico?",
                options = listOf("Hilo, aguja e hilo de pescar", "Tela, aguja, hilo y bastidor", "Cartón, tijera y pegamento", "Lana y pincel"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es la goma eva?",
                options = listOf("Tipo de pintura", "Material espumoso flexible para decorar", "Adhesivo fuerte", "Tinta para sublimar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas es una técnica de decoración sobre vidrio?",
                options = listOf("Decoupage", "Transferencia térmica", "Pintura en frío", "Tinte directo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de papel se usa comúnmente en origami?",
                options = listOf("Papel corrugado", "Papel glasé", "Papel especial cuadrado y fino", "Cartulina gruesa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se logra con el decoupage?",
                options = listOf("Coser dos piezas", "Pegar recortes decorativos sobre superficies", "Modelar figuras", "Bordar letras"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se necesita para hacer velas artesanales?",
                options = listOf("Agua, cartón, hilo", "Cera, mecha, molde", "Aceite, lana, hilo", "Silicona y papel"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué material es común en bisutería artesanal?",
                options = listOf("Perlas, mostacillas, hilos", "Piedras volcánicas", "Tornillos y clavos", "Vidrio templado"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se usa para proteger una superficie de trabajo?",
                options = listOf("Una tapa", "Un mantel decorado", "Un tapete o base de corte", "Un cartón doblado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica consiste en enrollar tiras de papel para formar figuras?",
                options = listOf("Scrapbooking", "Quilling", "Plegado japonés", "Cardado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una plantilla en manualidades?",
                options = listOf("Un molde reutilizable para repetir una forma", "Una regla de medir", "Una herramienta de coser", "Un tipo de tijera"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se puede usar para sellar superficies pintadas en manualidades?",
                options = listOf("Acrílico blanco", "Barniz o sellador transparente", "Pintura en aerosol", "Agua con cola vinílica"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta es útil para hacer agujeros precisos en papel o goma eva?",
                options = listOf("Punzón", "Tijera", "Cinta adhesiva", "Cúter"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito del bastidor en bordado?",
                options = listOf("Cortar la tela", "Estirar la tela para facilitar el bordado", "Pintar sobre ella", "Enrollar hilo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica utiliza hilo y aguja para formar imágenes o textos sobre tela?",
                options = listOf("Pintura textil", "Estampado", "Bordado", "Modelado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de pintar madera en manualidades?",
                options = listOf("Sumergirla en agua", "Pintar directamente", "Lijar la superficie", "Barnizarla"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa repujar?",
                options = listOf("Coser en zigzag", "Dar relieve a una superficie metálica", "Cortar tela gruesa", "Moldear con las manos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una guirnalda en manualidades?",
                options = listOf("Una estructura de madera", "Una tira decorativa colgante", "Una técnica de tejido", "Un tipo de pintura"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se puede usar para decorar frascos de vidrio?",
                options = listOf("Solo pintura en aerosol", "Servilletas, cintas, pintura acrílica", "Silicona líquida", "Tela gruesa y pegamento"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el fieltro?",
                options = listOf("Una pintura", "Un pegamento textil", "Un tipo de tela gruesa y suave", "Un hilo metálico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué son las mostacillas?",
                options = listOf("Piedras grandes para escultura", "Pequeñas cuentas para decorar", "Láminas de goma eva", "Tijeras curvas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se usa para pintar en tela sin que se corra?",
                options = listOf("Acuarela", "Témpera", "Pintura para tela", "Tinta china"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de nudo es común en macramé?",
                options = listOf("Nudo llano", "Nudo corredizo", "Nudo francés", "Nudo triple inverso"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una perforadora de formas?",
                options = listOf("Una herramienta para costura", "Un molde metálico", "Una tijera dentada", "Un cortador que genera figuras decorativas en papel"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué técnica permite transferir imágenes impresas a madera o tela?",
                options = listOf("Quilling", "Estampado", "Transferencia", "Barnizado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'reciclado creativo' en manualidades?",
                options = listOf("Desechar materiales", "Reutilizar objetos para crear decoraciones", "Usar pinturas costosas", "Solo trabajar con papel reciclado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento se usa para hacer pompones de lana?",
                options = listOf("Tenedor", "Cinta", "Cartón o herramienta circular", "Gancho de crochet"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de hilo se usa comúnmente para pulseras artesanales?",
                options = listOf("Hilo dental", "Hilo de bordar o hilo encerado", "Hilo de pescar", "Hilo invisible"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para decorar objetos con pequeñas piedras o brillos?",
                options = listOf("Brillantina", "Piedrería o strass", "Esmaltado", "Serigrafía"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de una regla metálica en manualidades?",
                options = listOf("Cortar con cúter sin dañarla", "Medir con más color", "Reforzar papel", "Diseñar plantillas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se logra al usar plantillas para estarcido (stencil)?",
                options = listOf("Coser figuras", "Moldear formas", "Pintar patrones repetidos con precisión", "Cortar más rápido"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Creación de contenido" to listOf(
            QuizQuestion(
                question = "¿Qué es un 'creador de contenido'?",
                options = listOf("Alguien que comparte contenido digital con un público", "Un productor de televisión", "Un editor de libros", "Un programador de videojuegos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas plataformas es común para creadores de contenido en video?",
                options = listOf("YouTube", "Dropbox", "Google Maps", "WhatsApp"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'stream'?",
                options = listOf("Un tipo de video editado", "Una transmisión en vivo por internet", "Un podcast grabado", "Una imagen animada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué aplicación es ideal para editar videos desde el celular?",
                options = listOf("CapCut", "Waze", "Excel", "Notion"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué elemento mejora la calidad del audio al grabar?",
                options = listOf("Un trípode", "Un micrófono externo", "Una lámpara LED", "Un fondo verde"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'reel' en redes sociales?",
                options = listOf("Una imagen viral", "Un video corto y dinámico", "Un comentario destacado", "Un hashtag"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos formatos es típico para podcasts?",
                options = listOf("Audio grabado", "Video vertical", "Texto animado", "Post de blog"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué función cumple un 'ring light'?",
                options = listOf("Estabilizar la cámara", "Iluminar de forma pareja el rostro", "Transmitir en vivo", "Editar el sonido"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué red social es conocida por el formato de video corto y viral?",
                options = listOf("TikTok", "LinkedIn", "Google Drive", "Pinterest"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'algoritmo' en redes sociales?",
                options = listOf("Una herramienta de edición", "El sistema que decide qué mostrar al usuario", "Un filtro de cámara", "Un tipo de audio viral"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'contenido orgánico'?",
                options = listOf("Contenido pagado", "Contenido que se genera sin promoción paga", "Contenido de comida", "Contenido con filtros"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas herramientas permite grabar la pantalla del celular?",
                options = listOf("Grabador de pantalla", "Spotify", "Trello", "Grammarly"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué hace un editor de video?",
                options = listOf("Organiza grabaciones, corta y agrega efectos o música", "Diseña videojuegos", "Escribe textos académicos", "Desarrolla software"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'guion' en creación de contenido?",
                options = listOf("Un texto para saber qué decir y grabar", "Un efecto visual", "Una canción de fondo", "Un subtítulo automático"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'engagement'?",
                options = listOf("La calidad del audio", "La cantidad de likes, comentarios y participación del público", "La duración de un video", "El número de videos vistos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué formato se usa comúnmente para publicaciones en Instagram?",
                options = listOf("Cuadrado o vertical", "Horizontal solamente", "Formato de Word", "Texto plano"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas opciones mejora la iluminación al grabar con celular?",
                options = listOf("Luz natural o aros LED", "Modo nocturno", "Brillo automático", "Filtro sepia"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'viralizar' un contenido?",
                options = listOf("Eliminarlo de internet", "Compartirlo con pocos amigos", "Que se difunda rápidamente por muchas personas", "Publicarlo en secreto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas es una plataforma para hacer transmisiones en vivo?",
                options = listOf("Twitch", "Photoshop", "Google Docs", "Duolingo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué rol cumple la música en los videos de contenido?",
                options = listOf("Sirve como relleno", "Agrega ritmo, emoción o ambiente al contenido", "Cambia la calidad del video", "Evita que se escuche la voz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'thumbnail' en YouTube?",
                options = listOf("La imagen previa del video que invita a hacer clic", "Un tipo de comentario", "Una animación final", "Un efecto de sonido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué representa un 'hashtag'?",
                options = listOf("Una cuenta bloqueada", "Una etiqueta para clasificar contenido", "Un archivo multimedia", "Una mención privada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'programar publicaciones'?",
                options = listOf("Publicar en vivo siempre", "Configurar cuándo se publicará un contenido automáticamente", "Eliminar contenido antiguo", "Etiquetar usuarios"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas apps permite editar imágenes para contenido digital?",
                options = listOf("Canva", "Spotify", "Telegram", "Audacity"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'feedback' de la audiencia?",
                options = listOf("El ruido en los micrófonos", "La retroalimentación que los seguidores dan al contenido", "Un resumen del video", "Una herramienta de edición"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'monetizar' contenido?",
                options = listOf("Eliminar publicaciones", "Ganar dinero a través del contenido", "Cambiar el diseño", "Actualizar la biografía"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'colaboración' entre creadores?",
                options = listOf("Copiar ideas", "Bloquearse mutuamente", "Crear contenido juntos o cruzado", "Usar el mismo fondo musical"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta permite ver las estadísticas de un video?",
                options = listOf("YouTube Studio", "Google Translate", "Spotify", "Zoom"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer al grabar en exteriores?",
                options = listOf("Ignorar el ruido ambiente", "Usar micrófono con protección de viento y buena iluminación", "Grabar sin trípode", "Evitar el sol completamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'call to action'?",
                options = listOf("Un error en edición", "Una invitación clara a que el público haga algo", "Un tipo de video viral", "Una técnica de iluminación"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple un trípode?",
                options = listOf("Sujetar la cámara o celular de forma estable", "Agregar efectos visuales", "Grabar audio", "Reducir el tamaño del video"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'bloopers reel'?",
                options = listOf("Una lista de hashtags", "Una recopilación de errores divertidos durante la grabación", "Un tipo de música viral", "Una herramienta de edición"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se busca con un buen título en YouTube?",
                options = listOf("Evitar visitas", "Confundir al público", "Llamar la atención y generar clics", "Incluir solo hashtags"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'contenido evergreen'?",
                options = listOf("Contenido que solo sirve una vez", "Contenido que envejece mal", "Contenido útil y relevante a lo largo del tiempo", "Contenido navideño"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta ayuda a hacer transmisiones en vivo desde PC?",
                options = listOf("OBS Studio", "PowerPoint", "Slack", "Excel"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'script' en la planificación de un video?",
                options = listOf("Un texto que detalla lo que se va a decir y mostrar", "Una animación", "Un efecto de sonido", "Una intro automática"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda evitar al subir videos con música?",
                options = listOf("Usar música libre de derechos", "Ignorar los derechos de autor", "Usar títulos cortos", "Hacer ediciones lentas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué ayuda a mejorar la presencia en redes sociales?",
                options = listOf("Publicar de forma constante y conocer a la audiencia", "Borrar contenido viejo", "Evitar las tendencias", "Copiar exactamente a otros creadores"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué son los 'shorts' en YouTube?",
                options = listOf("Videos cortos en formato vertical", "Miniaturas animadas", "Resúmenes de series", "Audios virales"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una 'intro' en creación de videos?",
                options = listOf("El resumen del final", "Un video de bienvenida breve y con identidad", "Un texto en miniatura", "Una transición entre escenas"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Andar en bicicleta" to listOf(
            QuizQuestion(
                question = "¿Qué parte de la bicicleta se utiliza para frenar?",
                options = listOf("Los pedales", "El manubrio", "Los frenos", "El asiento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función del casco al andar en bicicleta?",
                options = listOf("Proteger del sol", "Guardar objetos", "Proteger la cabeza en caso de caída", "Hacer más rápido al ciclista"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento se recomienda usar de noche al andar en bicicleta?",
                options = listOf("Luz delantera y trasera", "Gafas de sol", "Guantes gruesos", "Camiseta oscura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de bicicleta es ideal para caminos de tierra y montaña?",
                options = listOf("Bicicleta urbana", "Bicicleta de montaña (MTB)", "Bicicleta de ruta", "Bicicleta plegable"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe revisar antes de salir a andar en bicicleta?",
                options = listOf("Presión de neumáticos, frenos y cadena", "Color del cuadro", "Estilo del casco", "Música del celular"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'pedaleo eficiente'?",
                options = listOf("Pedalear sin usar las manos", "Utilizar cambios correctamente para ahorrar energía", "Frenar constantemente", "Usar el celular mientras se pedalea"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la altura adecuada del asiento?",
                options = listOf("Donde los pies queden completamente en el suelo", "Tan alto como sea posible", "Donde la pierna se estire casi por completo al pedalear", "Donde la espalda esté curva"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué equipo básico de seguridad debería tener un ciclista?",
                options = listOf("Sombrero, lentes, guantes", "Casco, luces, reflectantes", "Botella de agua, gorra, mochila", "Parlantes, celular, gorro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte conecta los pedales con la rueda trasera?",
                options = listOf("Manubrio", "Cadena", "Asiento", "Guardabarros"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se usa para inflar las ruedas?",
                options = listOf("Compresor de aire", "Inflador de bicicleta", "Aceite", "Destornillador"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple el cambio de marchas?",
                options = listOf("Cambiar la música", "Regular la velocidad y el esfuerzo del pedaleo", "Frenar más rápido", "Aumentar el tamaño de la rueda"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica una ciclovía?",
                options = listOf("Zona para correr", "Carril exclusivo o compartido para bicicletas", "Estacionamiento", "Zona peatonal con luces"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Por qué es importante hidratarse durante una salida en bicicleta?",
                options = listOf("Para no tener hambre", "Para evitar calambres y fatiga", "Para ir más lento", "Para gastar menos energía"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una señal de mano para girar a la izquierda?",
                options = listOf("Brazo izquierdo extendido hacia el costado", "Mano derecha levantada", "Ambas manos en alto", "No se hace señal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de neumáticos se usan para ciudad?",
                options = listOf("Gruesos con tacos", "Lisos y delgados", "Rígidos de madera", "De clavos metálicos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede causar una cadena oxidada?",
                options = listOf("Mayor velocidad", "Mayor fricción y posibles roturas", "Mejor tracción", "Menos peso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué accesorio sirve para guardar herramientas o una cámara de repuesto?",
                options = listOf("Bolso bajo asiento", "Reflectante", "Timbre", "Guarda cadena"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'bikepacking'?",
                options = listOf("Competencia profesional", "Viajar en bicicleta llevando equipaje liviano", "Andar sin frenos", "Armar la bicicleta uno mismo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué precaución se debe tomar al cruzar vías del tren en bicicleta?",
                options = listOf("Pasar rápido y en diagonal", "Evitar frenar", "Cruzar perpendicularmente y con precaución", "Cruzar en zigzag"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué beneficio físico tiene andar en bicicleta?",
                options = listOf("Aumenta el estrés", "Mejora la salud cardiovascular y fortalece piernas", "Disminuye la resistencia", "Baja la capacidad pulmonar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica un timbre en la bicicleta?",
                options = listOf("Sirve para avisar la presencia a peatones u otros ciclistas", "Sirve para cambiar de marcha", "Es solo decorativo", "Mide la velocidad"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de frenos requiere menos mantenimiento?",
                options = listOf("Frenos de disco hidráulicos", "Frenos de contrapedal", "Frenos V-Brake", "Frenos de zapata"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función de un cuadro en una bicicleta?",
                options = listOf("Sujetar los frenos", "Decorar el diseño", "Estructura principal que une todos los componentes", "Sostener el asiento solamente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta es útil para ajustar tuercas en una bicicleta?",
                options = listOf("Martillo", "Llave Allen o inglesa", "Destornillador plano", "Cúter"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'gravel bike'?",
                options = listOf("Bicicleta para niños", "Bicicleta urbana", "Bicicleta versátil para caminos de tierra y asfalto", "Bicicleta con tres ruedas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la presión adecuada de las ruedas en ciudad?",
                options = listOf("Alta, para reducir fricción", "Baja, para mayor tracción", "Siempre la más baja posible", "Depende del clima únicamente"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda llevar en una salida larga en bicicleta?",
                options = listOf("Solo el celular", "Herramientas, agua, repuestos y comida ligera", "Nada, para ir más liviano", "Una silla plegable"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte permite girar la dirección de la bicicleta?",
                options = listOf("Cadena", "Sillín", "Manubrio", "Pedal"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Por qué se usan reflectores en la bicicleta?",
                options = listOf("Para decorar", "Para evitar pinchazos", "Para aumentar visibilidad en condiciones de poca luz", "Para medir velocidad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué recomienda la ley en muchos países respecto al uso del casco?",
                options = listOf("Es opcional", "Es obligatorio en ciclovías", "Es obligatorio en todos los casos", "Solo es obligatorio para mayores de 60"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de la bicicleta debe mantenerse lubricada regularmente?",
                options = listOf("Cuadro", "Manubrio", "Cadena", "Asiento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una bicicleta eléctrica?",
                options = listOf("Una bicicleta con luces LED decorativas", "Una bicicleta que funciona exclusivamente a batería", "Una bicicleta con asistencia de motor eléctrico para pedalear", "Una bicicleta de carreras"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué indica el término 'cadencia' en ciclismo?",
                options = listOf("La presión de los neumáticos", "La frecuencia de pedaleo (vueltas por minuto)", "La distancia entre frenos", "La altura del asiento"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué riesgo hay al usar auriculares mientras se pedalea en ciudad?",
                options = listOf("Ninguno si están a volumen bajo", "Se pierde concentración y percepción sonora del entorno", "Mejora la experiencia", "Ayuda a seguir el ritmo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica una señal de tránsito con bicicleta dibujada?",
                options = listOf("Está prohibido andar en bici", "Estacionamiento exclusivo", "Zona compartida con ciclistas o ciclovía", "Cruce peatonal"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte permite cambiar de velocidad en la bicicleta?",
                options = listOf("Piñón y plato", "Frenos", "Guardabarros", "Sillín"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué indica una bicicleta con canasto delantero?",
                options = listOf("Es para niños", "Sirve para transporte urbano ligero", "Es solo para mujeres", "Es de paseo solamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué precaución tomar en días de lluvia?",
                options = listOf("Aumentar la velocidad", "Frenar más fuerte", "Evitar giros bruscos y frenar con anticipación", "Usar casco sin ventilación"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ventaja tiene el uso del ciclocomputador o GPS para bicicletas?",
                options = listOf("Solo muestra la hora", "Mejora el frenado", "Permite ver velocidad, distancia y rutas", "Evita el uso del manubrio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el sillín de una bicicleta?",
                options = listOf("El freno trasero", "El asiento", "El manubrio", "La cadena"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Armar rompecabezas" to listOf(
            QuizQuestion(
                question = "¿Qué es un rompecabezas?",
                options = listOf("Un juego de mesa con dados", "Una figura que se arma encajando piezas", "Un juguete electrónico", "Un libro para colorear"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué material es más común en los rompecabezas tradicionales?",
                options = listOf("Metal", "Plástico", "Cartón", "Vidrio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estrategia es útil al comenzar un rompecabezas?",
                options = listOf("Empezar por el centro", "Armar primero los bordes", "Comenzar sin mirar la imagen", "Revolver las piezas constantemente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del rompecabezas suele armarse primero?",
                options = listOf("Las piezas centrales", "Las piezas de un solo color", "Las piezas del borde", "Las que tienen formas raras"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué indica que una pieza es de borde?",
                options = listOf("Tiene una forma curva", "Tiene al menos un lado recto", "Es la más pequeña", "Tiene colores oscuros"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué beneficio tiene armar rompecabezas?",
                options = listOf("Disminuye la creatividad", "Desarrolla concentración y pensamiento espacial", "Reduce la memoria", "Aumenta la ansiedad"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de imagen es más fácil para un rompecabezas?",
                options = listOf("Imagen con muchos colores y detalles", "Imagen completamente blanca", "Imagen en blanco y negro", "Imagen borrosa"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa clasificar las piezas por colores o formas?",
                options = listOf("Desordenarlas", "Separarlas por patrones visuales similares", "Romperlas", "Dibujar encima"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas frases es verdadera?",
                options = listOf("Todas las piezas encajan con cualquiera", "Cada pieza tiene una ubicación única", "Las piezas se doblan para encajar", "No hay una forma correcta de armarlos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué ayuda a no perder piezas del rompecabezas?",
                options = listOf("Armar en una superficie plana y limpia", "Tirarlas en una caja abierta", "Guardarlas en el piso", "Jugar con ellas en exteriores"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué indica el número de piezas en una caja de rompecabezas?",
                options = listOf("La edad recomendada", "El tamaño del rompecabezas armado", "La dificultad aproximada", "El peso total del rompecabezas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de rompecabezas requiere usar más habilidades espaciales?",
                options = listOf("Rompecabezas 2D", "Rompecabezas 3D", "Rompecabezas con letras", "Rompecabezas virtuales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un tapete enrollable para rompecabezas?",
                options = listOf("Un mantel para comer", "Una base para pintar", "Una superficie que permite guardar el rompecabezas sin desmontarlo", "Un juego de cartas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede dificultar armar un rompecabezas?",
                options = listOf("Buena iluminación", "Piezas faltantes o repetidas", "Una imagen clara", "Superficie firme"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un rompecabezas personalizado?",
                options = listOf("Un puzzle con piezas gigantes", "Un puzzle con tu propia foto o diseño", "Un juego de cartas", "Un puzzle sin imagen"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una señal de que una pieza no encaja?",
                options = listOf("Entra muy forzada o queda suelta", "Tiene colores similares", "Es de borde", "Tiene una forma común"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'puzzle mat'?",
                options = listOf("Una herramienta para limpiar piezas", "Un accesorio para guardar y transportar el rompecabezas armado o a medio hacer", "Un tipo de rompecabezas gigante", "Un juego de rompecabezas online"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede indicar una pieza con una forma muy particular?",
                options = listOf("Que encaja en cualquier lugar", "Que pertenece a un borde", "Que es clave para una sección específica", "Que está mal fabricada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hacer si una pieza parece encajar pero la imagen no coincide?",
                options = listOf("Forzarla igual", "Dejarla ahí", "Buscar otra pieza que encaje tanto en forma como en imagen", "Doblarla para que entre"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa armar un rompecabezas colaborativo?",
                options = listOf("Hacerlo entre varias personas", "Ver a otro hacerlo", "Jugar con cronómetro", "Competir contra otros"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué beneficio tiene armar rompecabezas en grupo?",
                options = listOf("Reduce la comunicación", "Aumenta la frustración", "Fomenta la cooperación y el trabajo en equipo", "Hace más difícil el proceso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué suele indicar una pieza completamente blanca en un rompecabezas con fondo blanco?",
                options = listOf("Que es del borde", "Que es fácil de colocar", "Que será difícil de ubicar", "Que está mal impresa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica común al avanzar en un rompecabezas grande?",
                options = listOf("Armar secciones por colores o elementos de la imagen", "Armar solo con piezas rectas", "Tirar las piezas y mezclarlas bien", "Pegar las piezas con cinta"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué puede ayudar a conservar un rompecabezas armado?",
                options = listOf("Volver a guardarlo en la caja", "Pegarlo con adhesivo especial y enmarcarlo", "Separarlo por colores", "Cortar las piezas con cúter"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué implica que un rompecabezas sea de 'mil piezas'?",
                options = listOf("Que es para niños", "Que tiene una imagen infantil", "Que requiere mayor tiempo y paciencia", "Que es muy fácil de armar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un rompecabezas de doble cara?",
                options = listOf("Tiene piezas reversibles con imágenes distintas en ambos lados", "Es más fácil de armar", "Tiene piezas imantadas", "Se puede usar como espejo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué recomienda la mayoría de aficionados antes de comenzar?",
                options = listOf("Tirar todas las piezas al piso", "Separar y clasificar por colores y bordes", "Armar sin mirar la imagen", "Elegir piezas al azar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de superficie es ideal para armar un rompecabezas?",
                options = listOf("Inclinada", "Con textura", "Plana y firme", "Desnivelada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta puede ayudarte si pierdes una pieza?",
                options = listOf("Cinta adhesiva", "Una lupa para buscar bien en la zona", "Regla metálica", "Pintura acrílica"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un puzzle 'sin borde'?",
                options = listOf("No tiene una imagen definida", "No tiene piezas rectas para el marco externo", "No se puede terminar", "Tiene forma circular solamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué característica tienen los rompecabezas para niños pequeños?",
                options = listOf("Piezas grandes y fáciles de manipular", "Muchos colores repetidos", "Piezas del mismo tamaño", "Dificultad extrema"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas acciones puede arruinar un rompecabezas?",
                options = listOf("Guardarlo en caja con cuidado", "Armarlo sobre una manta", "Exponerlo a humedad o líquidos", "Usar pinzas para mover piezas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué pasa si se fuerza una pieza en lugar incorrecto?",
                options = listOf("Nada", "Puede deformar la pieza y afectar el encaje", "Encaja igual", "Se arregla después"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de puzzles son populares en formato digital?",
                options = listOf("Rompecabezas de paisajes", "Rompecabezas 3D físicos", "Cubos Rubik", "Sudokus"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de ilustraciones suelen ser más complejas de armar?",
                options = listOf("Con colores planos", "Con mucha repetición de formas y patrones", "Con figuras geométricas simples", "Con textos grandes"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Por qué es útil guardar la imagen de referencia visible?",
                options = listOf("Para ignorarla", "Para hacer una competencia", "Para usarla como guía visual constante", "Para ocultarla a otros"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué acción facilita el avance cuando hay muchas piezas similares?",
                options = listOf("Separarlas por forma de encaje", "Tirarlas de nuevo", "Pintarlas", "Reiniciar todo el armado"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa que una pieza tenga 'forma única'?",
                options = listOf("No encaja en ningún lugar", "Puede ser una pista clave para ubicarla fácilmente", "Es un error de fabricación", "Es de borde siempre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de puzzle puede tener forma circular o irregular?",
                options = listOf("Puzzle tradicional", "Puzzle temático o artístico", "Puzzle matemático", "Puzzle con letras"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué habilidad desarrolla principalmente armar rompecabezas complejos?",
                options = listOf("Fuerza física", "Memoria espacial y resolución de problemas", "Rapidez con números", "Expresión oral"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Bloggear" to listOf(
            QuizQuestion(
                question = "¿Qué es un blog?",
                options = listOf("Una red social", "Un sitio web personal o temático donde se publican artículos", "Una aplicación de mensajería", "Un juego en línea"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se llama 'entrada' o 'post' en un blog?",
                options = listOf("El pie de página", "Cada artículo publicado", "El formulario de contacto", "El título del blog"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué plataforma es popular para crear blogs?",
                options = listOf("Excel", "WordPress", "Discord", "Photoshop"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una buena práctica al escribir para un blog?",
                options = listOf("Escribir sin estructura", "No usar subtítulos", "Incluir párrafos claros y bien organizados", "Evitar imágenes"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede ayudar a que un blog tenga más visitas?",
                options = listOf("Ocultar los posts", "No actualizarlo nunca", "Compartirlo en redes sociales y aplicar SEO", "Usar títulos genéricos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el SEO en el contexto de los blogs?",
                options = listOf("Una herramienta de diseño gráfico", "Una técnica de optimización para motores de búsqueda", "Un error de formato", "Una red social privada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una palabra clave ('keyword')?",
                options = listOf("Una contraseña para el blog", "Una palabra que define el tema del post y ayuda al posicionamiento", "Un error ortográfico", "Una función para cambiar el fondo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué formato suele usarse para el contenido de un blog?",
                options = listOf("Videos exclusivamente", "Texto con imágenes, enlaces y listas", "Solo emojis", "Tablas complejas sin explicación"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para analizar visitas a un blog?",
                options = listOf("Paint", "Google Analytics", "Google Maps", "PowerPoint"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una categoría en un blog?",
                options = listOf("Un tema general que agrupa varios posts", "El diseño del menú", "La edad del lector", "Una aplicación para comentarios"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ventaja tiene escribir un blog personal?",
                options = listOf("Permite expresar ideas, compartir experiencias y crear comunidad", "Es ilegal en muchos países", "Solo sirve para famosos", "No tiene ningún uso útil"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué contenido es ideal para mantener a los lectores interesados?",
                options = listOf("Copiar y pegar de otros sitios", "Publicaciones variadas, útiles y originales", "Contenido desactualizado", "Títulos confusos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'plugin' en plataformas como WordPress?",
                options = listOf("Un tipo de post", "Un complemento que agrega funcionalidades al blog", "Un comentario", "Una sección fija"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué importancia tiene el título de un post?",
                options = listOf("Ninguna", "Es clave para captar atención y mejorar posicionamiento", "Debe ser siempre largo", "Debe evitarse"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué permite una plantilla o 'theme' en un blog?",
                options = listOf("Editar solo los comentarios", "Cambiar la apariencia y diseño general del blog", "Traducir el contenido", "Cerrar el blog automáticamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una entrada destacada?",
                options = listOf("Una entrada oculta", "Una entrada antigua", "Una publicación resaltada en la portada", "Una página de error"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'actualizar contenido' en un blog?",
                options = listOf("Borrar todo", "Editar posts antiguos para mantenerlos vigentes y útiles", "Publicar cada minuto", "Cerrar el blog"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumplen los comentarios en un blog?",
                options = listOf("Romper el diseño", "Generar spam", "Fomentar la interacción con los lectores", "Eliminar contenido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe incluir el 'about me' o sección 'sobre mí' en un blog personal?",
                options = listOf("Datos bancarios", "Una biografía breve y contexto del autor", "Solo emojis", "Contraseñas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una página de contacto en un blog?",
                options = listOf("Una entrada antigua", "Una sección donde los lectores pueden enviar mensajes o consultas", "Una sección privada", "Una lista de compras"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una entrada programada en un blog?",
                options = listOf("Una publicación que se sube manualmente", "Una entrada que se publica automáticamente en una fecha y hora definidas", "Una entrada que se borra sola", "Un comentario fijado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Por qué es útil insertar imágenes en un post?",
                options = listOf("Para hacerlo más largo", "Para ilustrar y complementar el contenido", "Para ocultar el texto", "Para ralentizar la carga"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple un enlace interno en un blog?",
                options = listOf("Lleva a sitios externos", "Conecta con otra entrada dentro del mismo blog", "Redirige a una red social", "Descarga archivos automáticamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'call to action' (CTA)?",
                options = listOf("Un tipo de imagen", "Una invitación al lector para hacer algo (comentar, suscribirse, etc.)", "Una categoría", "Un error de diseño"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué debe tener un buen encabezado H1?",
                options = listOf("Ser largo y confuso", "Tener errores ortográficos", "Reflejar claramente el tema del post", "Estar oculto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta ayuda a revisar la legibilidad del texto?",
                options = listOf("Yoast SEO", "Excel", "Audacity", "Photoshop"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué importancia tiene la frecuencia de publicación en un blog?",
                options = listOf("Ninguna", "Es clave para mantener el interés y el tráfico", "Cansa al lector", "Está prohibida por las plataformas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'bounce rate' o tasa de rebote?",
                options = listOf("La cantidad de comentarios", "El número de enlaces en un post", "La proporción de visitantes que abandonan el sitio sin interactuar", "Una técnica de edición de texto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ventaja tiene un blog con diseño responsivo?",
                options = listOf("No se puede ver en celular", "Carga más lento", "Se adapta a distintos dispositivos (celular, tablet, PC)", "No tiene imágenes"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'slug' en una entrada de blog?",
                options = listOf("Una parte de la URL amigable para buscadores", "Un tipo de plugin", "Una plantilla", "Un fondo animado"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas acciones mejora el posicionamiento de un post?",
                options = listOf("Usar keywords relevantes en el título y subtítulos", "No incluir imágenes", "Copiar otros contenidos", "Publicar sin revisar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué puede provocar el uso excesivo de palabras clave?",
                options = listOf("Mejor posicionamiento", "Penalizaciones por parte de los buscadores", "Mayor claridad", "Más visitas automáticas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hace un formulario de suscripción?",
                options = listOf("Permite que los lectores reciban novedades por correo", "Elimina lectores", "Impide ver los posts", "Agrega anuncios"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una estrategia efectiva para fidelizar lectores?",
                options = listOf("No actualizar el contenido", "Publicar contenido útil y responder comentarios", "Desactivar el buscador", "Eliminar entradas anteriores"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de imágenes es mejor usar en un blog?",
                options = listOf("Imágenes grandes sin optimizar", "Fotos pixeladas", "Imágenes propias o libres de derechos", "Capturas borrosas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa monetizar un blog?",
                options = listOf("Cerrar el blog", "Ganar dinero a través de publicidad, afiliación o contenido patrocinado", "Eliminar comentarios", "Crear encuestas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una entrada 'evergreen'?",
                options = listOf("Una entrada que expira", "Una entrada de temática navideña", "Una publicación que se mantiene útil y relevante con el tiempo", "Un borrador sin publicar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una etiqueta (tag)?",
                options = listOf("Una marca de agua", "Una palabra clave que organiza los posts según temas específicos", "Una imagen del post", "Una página nueva"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué acción ayuda a fortalecer la marca personal del autor?",
                options = listOf("Escribir con voz propia, coherencia visual y constancia", "Usar plantillas distintas cada vez", "No firmar los posts", "Evitar redes sociales"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué aspecto técnico puede mejorar la velocidad de carga del blog?",
                options = listOf("Subir archivos pesados", "No usar plugins", "Optimizar imágenes y elegir un buen hosting", "Evitar actualizar el CMS"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Diseño gráfico" to listOf(
            QuizQuestion(
                question = "¿Qué es el diseño gráfico?",
                options = listOf("La creación de bases de datos", "El arte de comunicar visualmente ideas usando texto e imágenes", "La edición de video exclusivamente", "Una técnica para imprimir documentos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos programas es comúnmente usado en diseño gráfico?",
                options = listOf("Excel", "Illustrator", "Zoom", "Premiere Pro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una paleta de colores?",
                options = listOf("Una lista de herramientas", "Un conjunto de colores armónicos seleccionados para un diseño", "Un menú de impresión", "Un fondo animado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa el formato PNG?",
                options = listOf("Un formato de video", "Un tipo de audio", "Una imagen con fondo transparente", "Una fuente tipográfica"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una tipografía?",
                options = listOf("Un tipo de imagen", "Un estilo de letra o fuente", "Una animación", "Un filtro de cámara"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa que un diseño tenga 'buena legibilidad'?",
                options = listOf("Tiene muchos adornos", "Se entiende fácilmente el texto", "Solo usa imágenes", "Está todo en mayúsculas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el contraste en diseño gráfico?",
                options = listOf("Una herramienta de recorte", "La diferencia visual entre elementos para destacar algo", "Un tipo de archivo", "Un color específico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se entiende por jerarquía visual?",
                options = listOf("El orden de instalación de programas", "El orden en que se presentan elementos según su importancia", "La gama de colores", "Un plugin de texto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta permite editar imágenes rasterizadas?",
                options = listOf("Photoshop", "Notepad", "Excel", "Canva"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué formato es más adecuado para impresión de alta calidad?",
                options = listOf("JPG de baja calidad", "PDF en CMYK", "GIF animado", "SVG con fondo negro"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un mockup?",
                options = listOf("Un boceto dibujado a mano", "Una presentación realista de cómo se verá un diseño aplicado", "Un tipo de tipografía", "Un programa de código"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa CMYK?",
                options = listOf("Un sistema de colores para impresión (Cian, Magenta, Amarillo y Negro)", "Un programa de edición de sonido", "Un tipo de fuente", "Un estilo de animación"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el diseño responsive?",
                options = listOf("Un diseño que responde preguntas", "Un diseño que se adapta a distintos dispositivos y tamaños de pantalla", "Una plantilla para imprenta", "Una animación interactiva"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un archivo vectorial?",
                options = listOf("Una imagen basada en píxeles", "Una imagen que puede escalarse sin perder calidad", "Un documento de texto", "Un archivo comprimido"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué programa es ideal para trabajar con vectores?",
                options = listOf("Microsoft Word", "Adobe Illustrator", "VLC Media Player", "FL Studio"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas opciones mejora la accesibilidad de un diseño?",
                options = listOf("Texto pequeño y opaco", "Alto contraste y fuentes legibles", "Colores iguales en fondo y texto", "Evitar todo texto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el espacio negativo en diseño?",
                options = listOf("Una crítica al diseño", "El área vacía que rodea los elementos y da equilibrio", "Un filtro de color", "Una parte de la interfaz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una guía de estilo?",
                options = listOf("Un software de edición", "Un conjunto de reglas visuales para mantener coherencia en una marca", "Una guía turística", "Una herramienta de codificación"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se busca con la alineación en un diseño?",
                options = listOf("Desordenar los elementos", "Aumentar la saturación", "Organizar visualmente de manera coherente", "Reducir el tamaño del archivo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué rol tiene el color en diseño gráfico?",
                options = listOf("No tiene importancia", "Comunica emociones y mensajes", "Sirve solo como relleno", "Debe evitarse en marcas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una retícula o grid en diseño gráfico?",
                options = listOf("Un patrón de impresión", "Una estructura guía de líneas que organiza el contenido", "Un tipo de pincel", "Un fondo decorativo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos elementos puede romper la armonía visual si se usa mal?",
                options = listOf("El contraste", "La alineación", "Las sombras", "El uso excesivo de fuentes distintas"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué programa es popular para diseño gráfico en línea?",
                options = listOf("Canva", "Notepad++", "Audacity", "AutoCAD"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué implica exportar un archivo para impresión?",
                options = listOf("Guardar en cualquier formato", "Guardar en CMYK y con sangrías", "Usar formato .mp3", "Reducir su resolución"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una ilustración vectorial?",
                options = listOf("Un collage", "Una imagen formada por líneas y curvas escalables", "Una fotografía editada", "Una infografía estática"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué ventaja tienen los archivos SVG?",
                options = listOf("Son más pesados", "Pueden escalarse sin perder calidad y son ideales para web", "No son compatibles con navegadores", "Tienen fondo opaco siempre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para elegir una buena tipografía?",
                options = listOf("Elegir varias por estética", "Usar muchas diferentes en un mismo diseño", "Priorizar legibilidad y coherencia con el mensaje", "Usar solo fuentes decorativas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una tendencia actual en diseño gráfico?",
                options = listOf("Imágenes pixeladas", "Diseños minimalistas y uso estratégico del espacio blanco", "Texto sin formato", "Colores neón exclusivamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'flat design'?",
                options = listOf("Diseño con muchas sombras", "Diseño tridimensional", "Diseño simple, sin efectos 3D ni sombras", "Diseño fotográfico realista"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para optimizar un diseño para redes sociales?",
                options = listOf("Usar mucho texto", "No pensar en el tamaño", "Adaptar la resolución y formato al tipo de red (ej. cuadrado para Instagram)", "Poner letras muy pequeñas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple un briefing en diseño gráfico?",
                options = listOf("Describir requisitos, objetivos y expectativas de un proyecto", "Presentar memes", "Hacer encuestas", "Diseñar sin límites"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'kerning' en tipografía?",
                options = listOf("El color del texto", "El espaciado entre letras", "El estilo de negrita", "El interlineado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un logo escalable?",
                options = listOf("Uno que cambia solo", "Uno que pierde calidad al agrandarlo", "Uno creado como vector para mantener su calidad en cualquier tamaño", "Uno animado siempre"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un moodboard?",
                options = listOf("Un tablero visual con inspiración de estilo, color y concepto", "Un tipo de presentación", "Una red social", "Un plugin de Photoshop"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Por qué es importante la coherencia visual?",
                options = listOf("Porque desorganiza el diseño", "Porque transmite un mensaje claro y profesional", "Porque evita que se vea moderno", "Porque ahorra tinta"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un favicon?",
                options = listOf("Una fuente tipográfica", "Un ícono pequeño que representa un sitio web en la pestaña del navegador", "Una herramienta de diseño", "Una marca de agua"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el interlineado?",
                options = listOf("El espacio entre párrafos", "El espacio entre líneas de texto", "El margen del documento", "El grosor del trazo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa un diseño saturado?",
                options = listOf("Uno con buen equilibrio", "Uno limpio", "Uno recargado de elementos visuales que compiten entre sí", "Uno monocromático"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo principal del diseño gráfico?",
                options = listOf("Hacer diseños para imprimir", "Comunicar visualmente ideas y emociones de forma efectiva", "Aprender programas", "Usar muchos colores"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un diseño centrado en el usuario?",
                options = listOf("Uno que prioriza la estética", "Uno que está pensado en función de la experiencia y necesidades del público", "Uno complejo y artístico", "Uno difícil de entender"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Correr" to listOf(
            QuizQuestion(
                question = "¿Cuál es uno de los principales beneficios físicos de correr regularmente?",
                options = listOf("Mejorar la digestión", "Fortalecer el sistema cardiovascular", "Reducir la visión", "Desarrollar habilidades manuales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'ritmo' al correr?",
                options = listOf("La cantidad de calorías quemadas", "La distancia entre pasos", "El tiempo promedio por kilómetro o milla", "El número de zancadas por minuto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de calzado es ideal para correr?",
                options = listOf("Botas de montaña", "Zapatillas con buena amortiguación y soporte", "Sandalias deportivas", "Zapatos formales cómodos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Por qué es importante el calentamiento antes de correr?",
                options = listOf("Para sudar más", "Para evitar lesiones y preparar el cuerpo", "Para gastar energía antes", "Para mejorar la digestión"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué músculo se trabaja especialmente al correr?",
                options = listOf("Bíceps", "Gemelos", "Trapecio", "Pectorales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa hacer una carrera de 10K?",
                options = listOf("Correr durante 10 minutos", "Correr 10 kilómetros", "Correr con 10 personas", "Correr 10 vueltas a una pista"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué rol cumple la hidratación durante una carrera?",
                options = listOf("Disminuir la motivación", "Mejorar el humor", "Mantener el rendimiento y evitar calambres", "Ayudar a correr más lento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una señal de sobreentrenamiento en corredores?",
                options = listOf("Sueño reparador", "Aumento progresivo del rendimiento", "Fatiga constante y dolor persistente", "Más hambre por la noche"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'fartlek'?",
                options = listOf("Una marca de calzado", "Una técnica de respiración", "Un entrenamiento con cambios de ritmo", "Un tipo de terreno"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué superficie es más blanda para correr y menos agresiva para las articulaciones?",
                options = listOf("Asfalto", "Hormigón", "Césped o tierra", "Baldosas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple un pulsómetro o smartwatch al correr?",
                options = listOf("Medir la calidad del aire", "Detectar animales en ruta", "Controlar el ritmo cardíaco y el esfuerzo", "Reproducir videos en carrera"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una 'media maratón'?",
                options = listOf("Una carrera de 10 km", "Una carrera de 21.097 km", "Una maratón no competitiva", "Una carrera sin público"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'carrera en trail'?",
                options = listOf("Correr en pistas de atletismo", "Correr en montaña o senderos naturales", "Correr sobre una cinta en el gimnasio", "Correr en playas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas bebidas es la más recomendable tras correr?",
                options = listOf("Jugo con gas", "Agua o bebida isotónica", "Refresco azucarado", "Cerveza"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se busca al estirar después de correr?",
                options = listOf("Fortalecer los brazos", "Evitar lesiones y relajar los músculos", "Aumentar la frecuencia cardíaca", "Quemar más grasa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una técnica común de respiración al correr?",
                options = listOf("Respirar solo por la nariz", "Inspirar y exhalar de forma rítmica según el paso", "Contener la respiración", "Hiperventilar rápidamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'tiempo neto' en una carrera oficial?",
                options = listOf("El tiempo total desde el disparo de salida", "El tiempo real desde que cruzás la línea de largada hasta llegar a la meta", "El promedio del equipo", "El tiempo descontando pausas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica una buena postura al correr?",
                options = listOf("Hombros encorvados", "Mirada baja", "Espalda recta, mirada al frente y brazos relajados", "Zancadas muy largas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué suele incluir un plan de entrenamiento para correr?",
                options = listOf("Días de descanso, rutinas progresivas, técnica y estiramientos", "Solo carreras largas", "Ejercicios de fuerza sin correr", "Entrenamiento de brazos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué puede causar dolor en la espinilla al correr (periostitis)?",
                options = listOf("Usar ropa ajustada", "Zapatillas desgastadas o técnica incorrecta", "Correr en ayunas", "No usar medias"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una carrera de relevos?",
                options = listOf("Una competencia de velocidad en bicicleta", "Una carrera donde cada integrante corre una parte del recorrido y pasa un testigo", "Una maratón individual", "Una caminata de larga distancia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué efecto tiene correr en la salud mental?",
                options = listOf("Puede aumentar el estrés", "No tiene impacto", "Favorece la liberación de endorfinas y reduce el estrés", "Daña la memoria a corto plazo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda comer antes de una carrera larga?",
                options = listOf("Comida muy grasosa", "Alimentos livianos con carbohidratos complejos", "Solo frutas ácidas", "Nada en absoluto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'marcapasos' en una carrera?",
                options = listOf("Un chip en el cuerpo", "Un corredor que mantiene un ritmo constante para guiar a otros", "Una app de música", "Un monitor de sueño"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se mide con el VO2 max en corredores?",
                options = listOf("Nivel de hidratación", "Velocidad promedio", "Máxima capacidad de oxígeno utilizada en ejercicio", "Frecuencia cardíaca en reposo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa entrenar en 'zona aeróbica'?",
                options = listOf("Entrenar solo con pesas", "Correr bajo un puente", "Ejercicio moderado con suficiente oxígeno para sostener el esfuerzo", "Correr al máximo todo el tiempo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja de correr por la mañana?",
                options = listOf("Hay más tráfico", "Ayuda a establecer una rutina y mejora el estado de ánimo del día", "Hay menos oxígeno", "Evita dormir bien"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué accesorio ayuda a mantener objetos personales al correr?",
                options = listOf("Riñonera o cinturón de hidratación", "Bufanda", "Guantes de lana", "Bastón de trekking"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué puede causar una mala técnica de zancada?",
                options = listOf("Mejor oxigenación", "Fatiga muscular más lenta", "Lesiones en rodillas y tobillos", "Mayor flexibilidad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'desnivel acumulado' en una carrera?",
                options = listOf("La distancia total recorrida", "El cambio total de altura ganado o perdido durante la ruta", "La cantidad de personas inscritas", "El tiempo de descanso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué ropa es recomendable para correr con frío?",
                options = listOf("Ropa de algodón gruesa", "Múltiples capas transpirables y gorro", "Shorts y musculosa", "Impermeables pesados"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede producir una mala hidratación al correr?",
                options = listOf("Sueño profundo", "Deshidratación, calambres o bajo rendimiento", "Más resistencia", "Mayor velocidad"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'pace' en running?",
                options = listOf("Ritmo de carrera por kilómetro o milla", "Cantidad de carreras por mes", "Frecuencia cardíaca", "Cantidad de pasos por minuto"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se debe fortalecer para evitar lesiones al correr?",
                options = listOf("Orejas", "Tobillos, rodillas y core", "Cuello", "Manos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué suele indicar una frecuencia cardíaca muy elevada al correr a ritmo moderado?",
                options = listOf("Bajo rendimiento físico", "Calidad de sueño óptima", "Buen estado físico", "Estás trotando correctamente"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué factor puede mejorar tu rendimiento en carrera con el tiempo?",
                options = listOf("Dormir mal", "Ingesta desordenada", "Entrenamiento progresivo y constante", "Evitar el calentamiento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué suele causar ampollas al correr?",
                options = listOf("Buena hidratación", "Zapatillas nuevas sin ablandar o calcetines inadecuados", "Estiramientos", "Respirar por la nariz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de carrera se realiza en una cinta de correr?",
                options = listOf("Trail", "Indoor running", "Carrera de obstáculos", "Fartlek extremo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es lo ideal al correr en bajadas?",
                options = listOf("Tirarse hacia adelante", "Aterrizar con control y pasos cortos", "Zancadas largas y rápidas", "Cerrar los ojos por la velocidad"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es un error común en principiantes al empezar a correr?",
                options = listOf("Calentar correctamente", "Empezar demasiado rápido sin preparación", "Usar ropa deportiva", "Elegir zapatillas cómodas"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Voluntariado" to listOf(
            QuizQuestion(
                question = "¿Qué es el voluntariado?",
                options = listOf("Una obligación escolar", "Una actividad no remunerada que busca ayudar a otros o al entorno", "Una competencia deportiva", "Un empleo a tiempo parcial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas actividades es un ejemplo de voluntariado?",
                options = listOf("Cobrar entradas en un cine", "Cuidar animales en un refugio sin recibir pago", "Dar clases en una universidad privada", "Trabajar en una empresa de tecnología"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué característica define al voluntariado?",
                options = listOf("Se hace por obligación", "Es remunerado", "Es solidario y altruista", "Debe durar al menos un año"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué motivación personal es común en personas voluntarias?",
                options = listOf("Ganar dinero", "Ser famoso", "Contribuir al bienestar social", "Recibir un título académico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿En qué sectores se puede hacer voluntariado?",
                options = listOf("Salud, educación, medio ambiente, inclusión social, cultura", "Solo en empresas", "Únicamente en iglesias", "Exclusivamente en el extranjero"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el voluntariado ambiental?",
                options = listOf("Ayudar en hospitales", "Cuidar parques y promover el cuidado del planeta", "Dar clases particulares", "Asistir a reuniones escolares"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una forma común de ayudar en comedores comunitarios?",
                options = listOf("Diseñar afiches", "Tocar música", "Preparar y servir alimentos a quienes lo necesitan", "Dar entrevistas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué actitud es fundamental en el voluntariado?",
                options = listOf("Egoísmo", "Competencia", "Empatía y compromiso", "Ambición financiera"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué rol puede cumplir un voluntario en eventos deportivos solidarios?",
                options = listOf("Organizar apuestas", "Cocinar para el equipo", "Coordinar inscripciones o repartir agua", "Vender entradas para beneficio propio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas no es una motivación válida para hacer voluntariado?",
                options = listOf("Ayudar a otros", "Conocer gente nueva", "Fortalecer el currículum", "Buscar lucro personal"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Por qué es importante el compromiso en el voluntariado?",
                options = listOf("Para recibir beneficios económicos", "Para asegurarse de que haya cámaras", "Porque muchas organizaciones dependen del esfuerzo voluntario regular", "Para competir con otros voluntarios"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'responsabilidad social' en el contexto del voluntariado?",
                options = listOf("Delegar tareas", "Participar activamente en mejorar la comunidad", "Supervisar empleados", "Obtener ganancias de la ayuda"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede aprender un voluntario al participar en una ONG?",
                options = listOf("Solamente tareas físicas", "Política internacional", "Trabajo en equipo, empatía, gestión de recursos", "Técnicas militares"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué grupo suele recibir ayuda en voluntariados sociales?",
                options = listOf("Personas con recursos suficientes", "Empresas privadas", "Personas en situación de vulnerabilidad", "Comerciantes exitosos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué habilidad interpersonal es clave en el voluntariado?",
                options = listOf("Autoridad", "Empatía", "Negociación agresiva", "Competitividad"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el voluntariado internacional?",
                options = listOf("Solo se hace en el país de origen", "Consiste en ayudar en proyectos de otros países", "Un tipo de turismo", "Un curso en línea"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué actitud se espera de alguien que se ofrece como voluntario?",
                options = listOf("Pasividad", "Interés genuino y disposición a colaborar", "Pedir beneficios", "No involucrarse demasiado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es un valor promovido por el voluntariado?",
                options = listOf("Competitividad", "Individualismo", "Solidaridad", "Inmediatez"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede hacer un voluntario en un refugio de animales?",
                options = listOf("Asustar animales para que corran", "Dibujar los carteles", "Ayudar a limpiar, alimentar y socializar con los animales", "Comprar nuevos animales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hace que una experiencia de voluntariado sea significativa?",
                options = listOf("Cantidad de horas", "Contribución genuina y aprendizaje personal", "Lugar del voluntariado", "Cantidad de fotos publicadas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se entiende por voluntariado corporativo?",
                options = listOf("Voluntarios que trabajan solo para empresas", "Iniciativas donde empresas impulsan a sus empleados a hacer voluntariado", "Actividades de marketing disfrazadas", "Donaciones obligatorias de los trabajadores"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa ser voluntario en una campaña de reforestación?",
                options = listOf("Vender árboles", "Talar con permisos", "Ayudar a plantar árboles y promover el cuidado ambiental", "Recolectar hojas secas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué rol puede tener un voluntario en emergencias o catástrofes?",
                options = listOf("Evitar actuar para no molestar", "Coordinar redes de ayuda, donar, colaborar en centros de evacuados", "Hacer transmisiones en redes sociales", "Recaudar fondos personales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede aportar el voluntariado a tu desarrollo personal?",
                options = listOf("Confusión profesional", "Fatiga emocional", "Crecimiento en empatía, trabajo en equipo y perspectiva social", "Aislamiento"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos NO es un tipo de voluntariado habitual?",
                options = listOf("Voluntariado cultural", "Voluntariado deportivo", "Voluntariado en cárceles", "Voluntariado de especulación financiera"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa 'acción solidaria sostenida'?",
                options = listOf("Una ayuda puntual", "Una actividad que ocurre una sola vez", "Un compromiso constante en el tiempo con una causa", "Una campaña en redes sociales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es clave para que una organización reciba bien a nuevos voluntarios?",
                options = listOf("Capacitación inicial, acompañamiento y claridad en las tareas", "Exigencias excesivas", "Pedir resultados inmediatos", "Que se trabaje sin contacto con otros"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el voluntariado digital?",
                options = listOf("Hacer posteos pagados", "Ayudar desde casa usando herramientas digitales", "Usar tecnología para beneficio personal", "Subir videos a redes sociales sin causa solidaria"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué valor se fortalece al trabajar con personas de distintas realidades sociales?",
                options = listOf("Prejuicio", "Empatía y tolerancia", "Competitividad", "Distanciamiento"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Por qué es importante la escucha activa en el voluntariado?",
                options = listOf("Para discutir más", "Para planear discursos", "Para comprender realmente las necesidades de las personas o comunidades", "Para corregir a los demás"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una forma efectiva de apoyar a una organización si no podés participar presencialmente?",
                options = listOf("Enviar memes", "Difundir su trabajo, donar, o ayudar online", "Ignorar sus publicaciones", "Enviar cartas sin contexto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué beneficio adicional puede tener el voluntariado para jóvenes estudiantes?",
                options = listOf("Conseguir excusas para faltar a clase", "Acceder a entrevistas laborales más rápido por su compromiso social", "Tener más tiempo libre", "Evitar hacer tareas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué valor ético debe tener todo voluntario?",
                options = listOf("Competencia desleal", "Solidaridad y respeto", "Afanar protagonismo", "Buscar recompensas personales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta puede utilizar una ONG para organizar sus voluntarios?",
                options = listOf("Un grupo de WhatsApp o una plataforma de gestión de tareas", "Un diario íntimo", "Carteles en la calle", "Llamadas aleatorias"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué frase refleja mejor el espíritu del voluntariado?",
                options = listOf("Hacerlo si me pagan", "Ayudo cuando tenga tiempo libre únicamente", "Doy lo mejor de mí para construir un mundo más justo", "Solo si hay beneficios a cambio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se espera de un voluntario que trabaja con personas mayores?",
                options = listOf("Velocidad y eficiencia", "Paciencia, escucha y respeto", "Competencia y retos", "Que los ignore si no lo entienden"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de voluntariado se puede hacer en bibliotecas populares?",
                options = listOf("Dar clases de surf", "Ayudar a organizar libros, alfabetizar o coordinar talleres", "Vender libros a altos precios", "Escribir grafitis en los libros"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hace más efectivo el trabajo voluntario en grupo?",
                options = listOf("Competir entre los voluntarios", "No comunicarse", "Tener objetivos claros y colaborar de forma coordinada", "Imponer decisiones"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una característica clave de las ONG que organizan voluntariado?",
                options = listOf("Fines lucrativos", "Independencia y misión social clara", "Secretismo", "Pertenencia obligatoria al Estado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una jornada solidaria?",
                options = listOf("Una reunión social común", "Un día dedicado a una acción concreta de voluntariado", "Un día feriado", "Un festejo escolar"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Restaurar muebles" to listOf(
            QuizQuestion(
                question = "¿Qué se entiende por restaurar un mueble?",
                options = listOf("Reemplazarlo por uno nuevo", "Mejorar o devolverle funcionalidad y estética a uno viejo", "Pintarlo sin lijarlo", "Romperlo para usar sus piezas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función de la lija en la restauración de muebles?",
                options = listOf("Manchar la madera", "Eliminar impurezas y preparar la superficie", "Pegar partes sueltas", "Barnizar directamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de pintar un mueble viejo?",
                options = listOf("Encerrarlo", "Aplicar barniz directamente", "Lijarlo y limpiarlo adecuadamente", "Mojarlo con detergente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué producto se usa comúnmente para proteger la madera tras pintarla?",
                options = listOf("Pintura acrílica", "Goma de borrar", "Aceite de cocina", "Barniz o cera para madera"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta es útil para retirar clavos o tornillos oxidados de muebles antiguos?",
                options = listOf("Serrucho", "Destornillador plano", "Pinza o tenaza", "Martillo de goma"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'decapar' un mueble?",
                options = listOf("Repararlo con clavos nuevos", "Cubrirlo con tela", "Quitar la pintura o barniz antiguo", "Colocarle vidrio encima"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de aplicar sellador en la restauración?",
                options = listOf("Evitar que la pintura se adhiera", "Proteger y sellar la superficie para que dure más el acabado", "Volver más rústico el mueble", "Pegar los cajones"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de pintura se suele usar para un estilo vintage?",
                options = listOf("Pintura brillante al aceite", "Pintura epoxi", "Chalk paint (pintura a la tiza)", "Esmalte sintético negro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una patina en restauración?",
                options = listOf("Un barniz brillante", "Un recubrimiento de vidrio", "Un efecto envejecido en la pintura", "Un tipo de mueble plegable"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer si un mueble tiene carcoma (bichos de la madera)?",
                options = listOf("Pintarlo encima", "Lijarlo sin más", "Aplicar un tratamiento anticarcoma", "Cubrirlo con telas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento de seguridad es esencial al usar productos químicos en restauración?",
                options = listOf("Gafas de sol", "Guantes y máscara", "Ropa formal", "Zapatos abiertos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un paso básico en cualquier restauración?",
                options = listOf("Pulverizar el mueble", "Revisar y reparar estructura, limpiar, lijar, pintar", "Congelar el mueble", "Clavar sin revisar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de pegamento se recomienda para unir partes de madera en un mueble?",
                options = listOf("Silicona líquida", "Cola vinílica o adhesivo para madera", "Pegamento escolar", "Cemento de contacto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede indicar un mueble con mal olor y manchas oscuras internas?",
                options = listOf("Buen estado", "Presencia de humedad o moho", "Exceso de barniz", "Uso reciente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta es ideal para cortar piezas de madera con precisión?",
                options = listOf("Cinta métrica", "Destornillador", "Sierra de calar", "Pinzas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una masilla para madera?",
                options = listOf("Un barniz líquido", "Un relleno para grietas o agujeros", "Un tinte decorativo", "Un tipo de lija"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué precaución se debe tomar al usar un soplete decorativo en madera?",
                options = listOf("Usarlo sobre alfombras", "Controlar el fuego y usar protección", "Soplar con fuerza", "Aplicarlo en lugares cerrados sin ventilación"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de iluminación ayuda a detectar imperfecciones al restaurar muebles?",
                options = listOf("Luz de velas", "Luz tenue", "Luz blanca fuerte o natural", "Luz de colores cálidos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo de restauración busca conservar al máximo la apariencia original del mueble?",
                options = listOf("Rústico extremo", "Minimalista", "Restauración conservadora", "Industrial agresivo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué beneficio tiene restaurar muebles en lugar de desecharlos?",
                options = listOf("Contaminar más", "Gastar más dinero", "Reducir residuos y dar valor a lo antiguo", "Tener menos muebles en casa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hace un decapante químico en un mueble?",
                options = listOf("Sella la pintura", "Quita capas viejas de barniz o pintura", "Aumenta la durabilidad", "Le da brillo final"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué riesgo puede haber al lijar sin barbijo?",
                options = listOf("Ruido", "Inhalación de polvo tóxico o dañino", "Falta de luz", "Gasto energético excesivo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el uso de la goma laca en restauración?",
                options = listOf("Como capa base para pintura", "Para limpiar herramientas", "Para dar un acabado brillante y proteger la madera", "Para fijar clavos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué maderas suelen usarse en muebles antiguos?",
                options = listOf("Plástico reciclado", "Madera prensada", "Roble, nogal, cedro", "Fibra de vidrio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué diferencia hay entre restaurar y reciclar un mueble?",
                options = listOf("Restaurar es decorarlo con papeles, reciclar es lo mismo", "Restaurar devuelve la funcionalidad original; reciclar implica una transformación creativa", "Reciclar es para tirar cosas", "No hay diferencia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se logra aplicando cera sobre un mueble restaurado?",
                options = listOf("Volverlo más pesado", "Oscurecerlo sin protección", "Brillo, suavidad y protección final", "Eliminar el color completamente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es la técnica del decapado con vela?",
                options = listOf("Usar velas para decorar", "Quemar pintura vieja", "Crear un efecto envejecido dejando zonas sin pintar", "Derretir cera sobre la madera"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es importante hacer antes de aplicar pintura a la tiza?",
                options = listOf("Hervir el mueble", "Pulverizar con agua", "Lijar suavemente y limpiar el polvo", "Cubrirlo con plástico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué efecto tiene aplicar betún de judea en muebles?",
                options = listOf("Color uniforme y moderno", "Brillo intenso", "Efecto envejecido y tonos oscuros", "Decoloración completa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta eléctrica agiliza el proceso de lijado?",
                options = listOf("Aspiradora", "Cepillo de dientes eléctrico", "Lijadora orbital", "Sierra circular"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Por qué conviene desmontar un mueble antes de restaurarlo?",
                options = listOf("Para romperlo más fácil", "Para limpiar mejor cada parte y evitar zonas inaccesibles", "Para cambiarle todas las piezas", "Para no tener que pintarlo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una restauración 'intervencionista'?",
                options = listOf("Sin cambiar nada", "Rehacer piezas y cambiar funcionalidad original", "Solo limpiar el mueble", "Usar solo materiales digitales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se puede usar para limpiar restos de pegamento viejo?",
                options = listOf("Agua con sal", "Solvente específico o alcohol", "Jabón de manos", "Tierra seca"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué precaución tomar al usar un barniz inflamable?",
                options = listOf("Dejarlo al sol", "Ventilar bien el espacio y alejar fuentes de calor", "Guardarlo con papel", "Agitarlo en exceso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa hacer una restauración ecológica?",
                options = listOf("Usar plásticos nuevos", "Evitar productos tóxicos y reutilizar materiales", "Tirar muebles grandes", "Decorar con aerosoles brillantes"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para un acabado suave al tacto?",
                options = listOf("Dejar la madera al natural", "Lijar entre capas y finalizar con cera o barniz", "No lijar nunca", "Solo pintar con brocha gruesa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de pincel es ideal para pintura a la tiza?",
                options = listOf("De cerdas suaves y planas", "Cepillo de alambre", "Rodillo de lana", "Pincel escolar redondo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué beneficio tiene aplicar imprimación antes de pintar?",
                options = listOf("Hace más feo el mueble", "Permite mejor adherencia de la pintura y mayor durabilidad", "Lo hace más pesado", "Sirve como barniz final"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple la cinta de pintor en restauración?",
                options = listOf("Decorar bordes", "Evitar manchas y delimitar zonas", "Unir piezas", "Reemplazar clavos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica una grieta en una pata del mueble?",
                options = listOf("Que es nuevo", "Que es moderno", "Posible debilidad estructural que debe repararse", "Que está limpio"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Golf" to listOf(
            QuizQuestion(
                question = "¿Cuál es el objetivo principal en el golf?",
                options = listOf("Hacer el mayor número de golpes", "Llevar la pelota al hoyo en el menor número de golpes", "Evitar los obstáculos del campo", "Jugar en el menor tiempo posible"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el golpe inicial desde el área de salida?",
                options = listOf("Putt", "Swing", "Drive", "Chip"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'par' en golf?",
                options = listOf("Un error común", "La cantidad estándar de golpes que se espera para un hoyo", "Un tipo de palo", "Una penalización"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'birdie'?",
                options = listOf("Hacer un golpe más que el par", "Hacer un hoyo en un solo golpe", "Hacer un golpe menos que el par", "Golpear un pájaro accidentalmente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué instrumento se usa para golpear la pelota en el green?",
                options = listOf("Driver", "Wedge", "Iron", "Putter"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué sucede si la pelota cae en un bunker?",
                options = listOf("Debe dejarse allí", "Se puede levantar sin penalización", "Debe jugarse desde allí con un golpe de recuperación", "Se repite el tiro sin sanción"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'handicap' en golf?",
                options = listOf("Una lesión común", "Un tipo de torneo", "Un sistema para igualar el nivel entre jugadores", "Una forma de contar los hoyos ganados"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuántos hoyos tiene una ronda estándar de golf profesional?",
                options = listOf("9", "12", "18", "24"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'eagle'?",
                options = listOf("Hacer dos golpes menos que el par", "Fallar dos veces seguidas", "Hacer un hoyo en uno", "Un tipo de palo largo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué jugador es conocido por revolucionar el golf moderno?",
                options = listOf("Jack Nicklaus", "Tiger Woods", "Phil Mickelson", "Arnold Palmer"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de palo se usa normalmente para golpes cortos y elevados?",
                options = listOf("Putter", "Iron 3", "Wedge", "Driver"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se considera una penalización?",
                options = listOf("Golpear la pelota con la cara del palo", "Tardar demasiado en jugar", "Perder una pelota o golpear fuera de límites", "Usar un palo nuevo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un hoyo en uno?",
                options = listOf("Completar un hoyo con un solo golpe", "Hacer tres golpes menos que el par", "Hacer un birdie en par 5", "Sacar la pelota del green en un solo intento"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué superficie es conocida como 'fairway'?",
                options = listOf("Zona de salida", "Zona con césped corto entre el tee y el green", "Área de descanso", "Terreno fuera de límites"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'bogey'?",
                options = listOf("Un hoyo completado en un golpe", "Un golpe más que el par", "Un tipo de pelota", "Una falta técnica"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué pasa si golpeás la pelota dos veces seguidas con el mismo movimiento?",
                options = listOf("Es válido", "Cuenta como un solo golpe", "Cuenta como dos golpes", "Se repite el tiro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'green fee'?",
                options = listOf("El palo especial para el green", "La tarifa que se paga para jugar en un campo de golf", "Un tipo de césped", "El color del marcador en el green"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué zona está rodeada por el rough?",
                options = listOf("El tee de salida", "El green", "El fairway", "La zona de penalización"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple el caddie?",
                options = listOf("Anotar el puntaje", "Transportar los palos y asistir al golfista", "Cortar el césped", "Observar los fuera de límites"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué torneo forma parte del Grand Slam del golf?",
                options = listOf("US Open", "Ryder Cup", "FedEx Cup", "Players Championship"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'swing' en golf?",
                options = listOf("La forma en que se sostiene el palo", "El movimiento completo del golpe", "Un tipo de pelota", "El recorrido del carrito"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica un marcador con un círculo en la tarjeta de puntuación?",
                options = listOf("Birdie", "Bogey", "Par", "Eagle"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de palo se recomienda usar en un golpe corto sobre un obstáculo?",
                options = listOf("Driver", "Putter", "Wedge", "Hierro 2"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del campo está especialmente diseñada para finalizar el hoyo?",
                options = listOf("Fairway", "Green", "Tee", "Bunker"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se llama el torneo más prestigioso del golf británico?",
                options = listOf("British Masters", "Ryder Cup", "The Open Championship", "St. Andrews Trophy"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué acción es considerada una falta de etiqueta en golf?",
                options = listOf("Aplaudir un buen golpe", "Caminar por la línea de putt de otro jugador", "Esperar en silencio", "Limpiar la pelota"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'drop' en golf?",
                options = listOf("Dejar caer la pelota para reanudar el juego tras una penalización", "Bajar el nivel del juego", "Golpear desde el aire", "Finalizar un hoyo con bogey"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se mide en yardas o metros en una tarjeta de score?",
                options = listOf("La distancia total del recorrido", "La distancia entre jugadores", "La altura del campo", "La longitud del carrito"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ocurre si una pelota se pierde?",
                options = listOf("No pasa nada", "El jugador puede seguir jugando con otra sin penalización", "Se cobra penalización y se juega desde el punto anterior", "Se borra el hoyo de la tarjeta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos torneos forma parte del Grand Slam masculino?",
                options = listOf("The Players", "US Open", "WGC Championship", "Copa del Mundo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué jugador tiene más majors ganados en la historia?",
                options = listOf("Tiger Woods", "Jack Nicklaus", "Rory McIlroy", "Seve Ballesteros"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de césped es habitual en el green?",
                options = listOf("Césped alto y salvaje", "Césped artificial", "Césped muy corto y liso", "Arena compacta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'rough' en un campo de golf?",
                options = listOf("Zona con césped largo y difícil", "Área para prácticas", "El hoyo en sí", "La parte de descanso"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se busca evitar en un swing?",
                options = listOf("La fuerza", "El ritmo", "El slice", "El follow-through"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del palo golpea la pelota?",
                options = listOf("Grip", "Cabeza del palo", "Shaft", "Cuello del palo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la penalización por jugar desde el lugar equivocado?",
                options = listOf("Ninguna", "Un golpe", "Dos golpes", "Descalificación directa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'approach' en golf?",
                options = listOf("El golpe final dentro del hoyo", "El primer golpe desde el tee", "Un golpe para acercar la pelota al green", "Un tipo de penalización"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué acción NO está permitida antes de ejecutar un putt?",
                options = listOf("Leer la caída", "Limpiar la pelota", "Probar el golpe en el green con otro palo", "Acomodar la postura"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ocurre si el clima se vuelve peligroso durante una ronda?",
                options = listOf("Se termina el juego", "Se pausa temporalmente", "Se reduce a 9 hoyos", "Se juega igual pero sin score oficial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa el 'tee' en golf?",
                options = listOf("La zona de práctica", "El palo de inicio", "El soporte donde se coloca la pelota para el golpe inicial", "El tipo de hierba del green"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Bordado" to listOf(
            QuizQuestion(
                question = "¿Qué es el bordado?",
                options = listOf("Una técnica de tejido con agujas circulares", "Una forma de decoración utilizando hilos sobre tela", "Una forma de escultura textil", "Un tipo de estampado con calor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza para sostener la tela mientras se borda?",
                options = listOf("Bastidor", "Aguja curva", "Dedal", "Grapadora"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes es un punto básico del bordado?",
                options = listOf("Punto en cruz", "Punto revés", "Punto cadena simple", "Punto jersey"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de hilo se utiliza comúnmente en bordado?",
                options = listOf("Hilo encerado", "Hilo de bordar mouliné", "Hilo de yute", "Hilo metálico industrial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la función del dedal en el bordado?",
                options = listOf("Afilar la aguja", "Sujetar la tela", "Evitar que la aguja traspase el bastidor", "Proteger el dedo al empujar la aguja"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de tela es ideal para bordado en punto de cruz?",
                options = listOf("Lino", "Aida", "Seda", "Fieltro grueso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se logra con el punto satén en el bordado?",
                options = listOf("Efecto de relieve", "Efecto de relleno liso y brillante", "Contorno definido", "Sombra en la tela"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'bordado a mano libre'?",
                options = listOf("Usar máquina sin patrón", "Bordar sin seguir un diseño preestablecido", "Bordar con hilo invisible", "Bordar con los dedos solamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos puntos se utiliza comúnmente para contornos?",
                options = listOf("Punto satén", "Punto de cadeneta", "Punto atrás", "Punto de nudo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del bastidor se ajusta para sujetar la tela?",
                options = listOf("La base", "La argolla externa", "La tuerca", "La bisagra interior"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer con la tela antes de comenzar a bordar?",
                options = listOf("Lavarla y plancharla", "Coser los bordes", "Estirarla sin lavarla", "Teñirla con anilina"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué punto se caracteriza por formar pequeños bucles o nudos?",
                options = listOf("Punto atrás", "Punto satén", "Nudo francés", "Punto festón"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa deshilachar en bordado?",
                options = listOf("Cortar la tela a mano", "Separar los hilos para dar textura", "Quitar hebras de la tela para crear diseño", "Enhebrar mal la aguja"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes es un estilo tradicional de bordado japonés?",
                options = listOf("Sashiko", "Mandala", "Zentangle", "Nanduti"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta puede ayudarte a ver mejor los detalles del bordado?",
                options = listOf("Lupa con luz", "Regla de corte", "Cúter rotativo", "Guante antiestático"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué punto es ideal para bordar letras o texto?",
                options = listOf("Punto cruz", "Punto atrás", "Punto satén", "Punto nudo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de bordado se hace con cintas en lugar de hilo?",
                options = listOf("Bordado ruso", "Bordado floral", "Bordado en cinta", "Bordado crewel"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para marcar diseños sobre la tela antes de bordar?",
                options = listOf("Lápiz de grafito", "Tiza de sastre", "Marcador al agua o lápiz soluble", "Corrector líquido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el bordado crewel?",
                options = listOf("Técnica con hilos metálicos", "Técnica en relieve con lana sobre lino", "Técnica con punto cruz geométrico", "Técnica con máquina de coser"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué característica tiene el hilo mouliné?",
                options = listOf("Es metálico", "Es de goma", "Tiene varios cabos divisibles", "Es rígido y grueso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es la función del bastidor en el bordado?",
                options = listOf("Sujetar los hilos", "Evitar que se tuerzan las puntadas", "Mantener la tela tensa para bordar", "Cubrir el diseño terminado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer con el hilo mouliné antes de bordar?",
                options = listOf("Separar los cabos", "Calentar el hilo", "Coserlo a la tela", "Lavar con agua fría"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el bordado mexicano tenango?",
                options = listOf("Un tipo de punto tradicional", "Un estilo colorido con motivos animales y florales", "Un bordado en lino blanco", "Un bordado con cintas gruesas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de aguja es más usada para bordado a mano?",
                options = listOf("Aguja curva", "Aguja con ojo grande", "Aguja de coser recta", "Aguja de cuero"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué efecto se logra con el punto festón?",
                options = listOf("Contorno con decoración", "Relleno sólido", "Sombra interior", "Nudos decorativos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una característica del bordado a máquina?",
                options = listOf("Usa solo punto cruz", "No necesita bastidor", "Sigue patrones digitales", "Se hace sin aguja"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'enhebrar la aguja'?",
                options = listOf("Cortar el hilo", "Pasar el hilo por el ojo de la aguja", "Doblar el hilo", "Empujar la aguja en la tela"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se puede hacer para evitar que el hilo se enrede al bordar?",
                options = listOf("Usar hilo seco", "Tensarlo con una plancha", "Utilizar tramos cortos y enhebrar bien", "Humedecerlo constantemente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un bastidor magnético?",
                options = listOf("Un bastidor que se adhiere a superficies metálicas", "Uno que sujeta la tela sin tornillos usando imanes", "Un bastidor de bordado para electricidad", "Una herramienta para bordar en cuero"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué define al bordado 'blackwork'?",
                options = listOf("Usar hilo negro para crear patrones geométricos", "Un bordado abstracto con manchas negras", "Un bordado tradicional africano", "Un bordado moderno de estilo libre"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'esquema' en bordado?",
                options = listOf("Un patrón o diseño gráfico que indica los puntos a bordar", "Un hilo especial", "Un tipo de tela", "Un tipo de puntada"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué material es común en bastidores para bordar?",
                options = listOf("Vidrio", "Acero", "Plástico o madera", "Cartón"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puntada suele usarse para bordar flores?",
                options = listOf("Punto de nudo", "Punto cadena", "Punto satén", "Todas las anteriores"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos estilos de bordado se asocia con la India?",
                options = listOf("Tenango", "Sashiko", "Kantha", "Crewel"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Para qué se usa un marcador al agua en bordado?",
                options = listOf("Marcar tela temporalmente", "Pintar los hilos", "Resaltar el diseño terminado", "Fijar los puntos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué puntada se usa para bordar bordes decorativos en servilletas?",
                options = listOf("Punto festón", "Punto cruz", "Punto atrás", "Punto de nudo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'rematar el hilo' al finalizar una sección?",
                options = listOf("Cortarlo sin anudar", "Pasarlo por varias puntadas para fijarlo", "Pintarlo de otro color", "Desenrollarlo del bastidor"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué caracteriza al bordado noruego 'Hardanger'?",
                options = listOf("Uso de hilo grueso sobre fieltro", "Diseños geométricos y recortes en la tela", "Punto cruz con colores fuertes", "Técnicas con cintas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puntada forma una línea continua con aspecto de cadena?",
                options = listOf("Punto satén", "Punto cadena", "Punto de cruz", "Punto de margarita"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del hilo mouliné se utiliza al bordar?",
                options = listOf("Los 6 cabos siempre juntos", "Se separan de 1 a 6 cabos según el efecto deseado", "Solo el hilo central", "Solo el borde del hilo trenzado"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Crucigramas" to listOf(
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
        ),

        //************************************************************************************************************************

        "Origami" to listOf(
            QuizQuestion(
                question = "¿Qué es el origami?",
                options = listOf("Una técnica para pintar papel", "Un arte de plegado de papel sin cortes ni pegamento", "Un juego de cartas japonés", "Una forma de escultura con arcilla"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el significado de la palabra 'origami'?",
                options = listOf("Corte de papel", "Arte en papel", "Papel doblado", "Figura decorativa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué animal es un símbolo tradicional del origami japonés?",
                options = listOf("Tigre", "Grulla", "Serpiente", "Pez koi"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la regla más tradicional del origami clásico?",
                options = listOf("Solo usar tijeras pequeñas", "No usar colores", "No cortar ni pegar el papel", "Doblar con guantes"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de papel se usa comúnmente en origami?",
                options = listOf("Cartón grueso", "Papel kraft", "Papel origami delgado y cuadrado", "Papel encerado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda antes de intentar una figura compleja en origami?",
                options = listOf("Usar pegamento para reforzar", "Practicar los dobleces básicos", "Recortar las esquinas", "Sumergir el papel en agua"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa una línea discontinua en una instrucción de origami?",
                options = listOf("Un corte", "Una costura", "Un pliegue oculto", "Una doblez que debe realizarse"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué doblez básico se utiliza para dividir el papel en dos mitades iguales?",
                options = listOf("Doblez de montaña", "Doble pliegue en Z", "Doble de libro o en valle", "Doble en espiral"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe un doblez en el que los bordes exteriores del papel se doblan hacia el centro?",
                options = listOf("Doble inverso", "Doble preliminar", "Doble puerta", "Doble de cerradura"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué figura se considera un desafío avanzado en origami tradicional?",
                options = listOf("Grulla", "Caja", "Dragón", "Flor de loto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos beneficios puede aportar la práctica del origami?",
                options = listOf("Fuerza física", "Agilidad en deportes", "Concentración y motricidad fina", "Conocimiento de álgebra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'origami modular'?",
                options = listOf("Usar pegamento para unir figuras", "Construir figuras con múltiples papeles ensamblados", "Origami hecho con papel mojado", "Usar figuras geométricas complejas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta puede usarse para marcar pliegues con precisión?",
                options = listOf("Cúter", "Pincel", "Plegadera", "Tijeras"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué sucede si el papel no es perfectamente cuadrado en origami?",
                options = listOf("La figura queda mal proporcionada", "El diseño se corrige solo", "No afecta en nada", "Es más fácil de plegar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué doblez tiene forma de montaña al abrirse?",
                options = listOf("Doble en espiral", "Doble inverso", "Doble valle", "Doble montaña"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estos conceptos está relacionado con origami matemático?",
                options = listOf("Teorema de Pitágoras", "Axiomas de Huzita-Hatori", "Suma de ángulos interiores", "Regla del paralelogramo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de simetría se encuentra frecuentemente en figuras de origami?",
                options = listOf("Simetría radial", "Simetría bilateral", "Asimetría total", "Simetría en espiral"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué figura de origami representa un deseo de paz en la cultura japonesa?",
                options = listOf("Mariposa", "Grulla", "Flor", "Estrella"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué figura se puede hacer comúnmente con origami modular?",
                options = listOf("Cubo", "Flor simple", "Estrella ninja", "Corazón plano"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja de usar papel de origami específico?",
                options = listOf("Es más fácil de cortar", "Tiene aroma", "Es más delgado, flexible y cuadrado perfecto", "Permite dibujar figuras sin doblar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué figura de origami se asocia a Sadako Sasaki y la paz mundial?",
                options = listOf("Dragón", "Grulla", "Rana", "Cisne"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'wet-folding' en origami?",
                options = listOf("Plegado con papel mojado para formas más escultóricas", "Doblado solo en días lluviosos", "Uso de agua para cortar papel", "Origami hecho bajo el agua"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué figura básica se utiliza como base para muchas otras en origami?",
                options = listOf("Base rana", "Base cometa", "Base preliminar", "Base pez"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de papel es ideal para origami complejo?",
                options = listOf("Cartulina gruesa", "Papel de aluminio", "Papel muy fino y resistente como el washi", "Papel manteca"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una dificultad común al hacer figuras 3D en origami?",
                options = listOf("Corte del papel", "Pérdida de color", "Papel muy grueso que no permite pliegues precisos", "Tamaño de la figura final"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué figura tradicional se asocia con buena suerte y se cuelga como decoración?",
                options = listOf("Estrella modular", "Flor de loto", "Grulla", "Caja decorativa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer antes de comenzar una figura complicada?",
                options = listOf("Doblarla directamente sin ver el patrón", "Leer todo el diagrama y practicar bases simples", "Pintar el papel", "Recortar los bordes"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja del origami modular?",
                options = listOf("Permite usar pegamento libremente", "Cada módulo es independiente y ensamblable", "Es más simple que el origami clásico", "Usa papel redondo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede ayudar a lograr líneas de pliegue más precisas?",
                options = listOf("Un lápiz y una regla", "Una plegadera o incluso una uña", "Un marcador negro", "Tijeras afiladas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de origami permite crear estructuras que se abren y cierran como mecanismos?",
                options = listOf("Origami artístico", "Origami técnico", "Origami cinético", "Origami interactivo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se necesita para que una figura de origami conserve su forma con el tiempo?",
                options = listOf("Secar al sol", "Lacado o uso de papel especial como kami", "Guardarla en un libro", "Doblarla muchas veces"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué base comparte la grulla y la rana en origami?",
                options = listOf("Base pez", "Base preliminar", "Base pájaro", "Base flor"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una desventaja del papel demasiado delgado?",
                options = listOf("Rompe fácilmente en pliegues complejos", "Ocupa mucho espacio", "Es difícil de encontrar", "No se puede pintar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una 'plegadura invertida' en origami?",
                options = listOf("Una doblez que mete parte del papel hacia adentro", "Una figura doblada al revés", "Una línea diagonal", "Un error de diseño"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de origami suele inspirarse en animales o flores?",
                options = listOf("Origami industrial", "Origami tradicional", "Origami futurista", "Origami cúbico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa el acto de hacer mil grullas en la cultura japonesa?",
                options = listOf("Buena suerte en los negocios", "Sabiduría ancestral", "Un deseo de salud, paz o longevidad", "Fuerza física"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué forma se puede lograr fácilmente usando la base rana?",
                options = listOf("Flor", "Caja", "Salamandra", "Rana saltarina"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estas acciones rompe la regla tradicional del origami?",
                options = listOf("Doblar con las manos", "Usar pegamento o tijeras", "Marcar con uña", "Usar papel de color"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué característica tiene el origami modular bien ensamblado?",
                options = listOf("Cada pieza es independiente pero se sostiene sin pegamento", "Es rígido porque se grapa", "Requiere recortar las piezas", "Se usa con alambres internos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una figura geométrica frecuente en origami modular?",
                options = listOf("Hexágono", "Octaedro", "Tetraedro", "Cubo"),
                correctIndex = 3
            )
        ),


        //************************************************************************************************************************

        "Poesía" to listOf(
            QuizQuestion(
                question = "¿Quién escribió 'Veinte poemas de amor y una canción desesperada'?",
                options = listOf("Federico García Lorca", "Octavio Paz", "Pablo Neruda", "César Vallejo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un haiku?",
                options = listOf("Un poema épico largo", "Un verso libre moderno", "Un poema japonés de 3 versos y 17 sílabas", "Una oda en prosa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos poetas pertenece al Siglo de Oro español?",
                options = listOf("Rubén Darío", "Luis de Góngora", "Mario Benedetti", "Jorge Luis Borges"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué poeta escribió 'La tierra baldía'?",
                options = listOf("Walt Whitman", "T. S. Eliot", "John Keats", "Emily Dickinson"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una elegía?",
                options = listOf("Una oda a la alegría", "Un canto épico", "Un poema sobre la muerte o la pérdida", "Un soneto religioso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Quién escribió 'Cien sonetos de amor'?",
                options = listOf("Nicanor Parra", "Pablo Neruda", "Julio Cortázar", "Gabriela Mistral"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué métrica tiene un soneto clásico?",
                options = listOf("14 versos de 11 sílabas", "8 versos de 8 sílabas", "10 versos de 12 sílabas", "12 versos de 10 sílabas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué autor es conocido por el poemario 'Poeta en Nueva York'?",
                options = listOf("Octavio Paz", "Jaime Sabines", "Federico García Lorca", "Alfonsina Storni"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué poeta es considerado el fundador del Modernismo en lengua española?",
                options = listOf("Juan Ramón Jiménez", "Rubén Darío", "César Vallejo", "Jorge Guillén"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos poetas fue también filósofo?",
                options = listOf("Antonio Machado", "Platón", "Walt Whitman", "Friedrich Hölderlin"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué poeta escribió extensamente sobre la naturaleza y la muerte en Estados Unidos en el siglo XIX?",
                options = listOf("Robert Frost", "Emily Dickinson", "Sylvia Plath", "Allen Ginsberg"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'verso libre'?",
                options = listOf("Versos sin ningún tipo de lenguaje poético", "Versos que no riman ni siguen métrica fija", "Versos con estrofas de 4 líneas", "Versos rimados en pares"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué poeta chilena ganó el Premio Nobel de Literatura?",
                options = listOf("Gabriela Mistral", "Isabel Allende", "Violeta Parra", "María Luisa Bombal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos escritores también fue poeta y novelista del realismo mágico?",
                options = listOf("Carlos Fuentes", "Julio Cortázar", "Gabriel García Márquez", "Ernesto Cardenal"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué poeta español escribió 'Campos de Castilla'?",
                options = listOf("Juan Ramón Jiménez", "Antonio Machado", "Luis Cernuda", "Pedro Salinas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una metáfora?",
                options = listOf("Una exageración", "Una comparación indirecta", "Una contradicción lógica", "Una repetición sonora"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el tema central del poema 'If' de Rudyard Kipling?",
                options = listOf("La paternidad", "La religión", "La guerra", "La paciencia y madurez"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué poeta argentino escribió 'El Aleph' y también cultivó la poesía?",
                options = listOf("Ernesto Sábato", "Jorge Luis Borges", "Leopoldo Lugones", "Ricardo Piglia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué corriente poética se caracteriza por la ruptura de normas clásicas y el uso del absurdo?",
                options = listOf("Simbolismo", "Romanticismo", "Dadaísmo", "Modernismo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una anáfora en poesía?",
                options = listOf("Una figura que cambia el orden de las palabras", "Repetición de una o varias palabras al inicio del verso", "Una palabra inventada", "Uso de lenguaje técnico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué poeta es conocido por 'Leaves of Grass'?",
                options = listOf("Walt Whitman", "Robert Frost", "T. S. Eliot", "Ezra Pound"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes no es un tipo de poema?",
                options = listOf("Oda", "Soneto", "Novela", "Égloga"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué poeta escribió 'Altazor o el viaje en paracaídas'?",
                options = listOf("Vicente Huidobro", "Octavio Paz", "Jorge Teillier", "Pablo Neruda"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué recurso poético se usa en la frase 'el viento susurra'?",
                options = listOf("Metáfora", "Hipérbaton", "Personificación", "Epíteto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Quién fue el máximo exponente del Romanticismo en la poesía española?",
                options = listOf("Gustavo Adolfo Bécquer", "Antonio Machado", "Luis de Góngora", "Pedro Calderón de la Barca"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué poeta escribió sobre el amor y el dolor con el seudónimo de Alfonsina?",
                options = listOf("Gabriela Mistral", "Rosario Castellanos", "Alfonsina Storni", "Juana de Ibarbourou"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué movimiento poético surgió como respuesta a la industrialización y el racionalismo?",
                options = listOf("Romanticismo", "Modernismo", "Neoclasicismo", "Vanguardismo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué poeta francés escribió 'Las flores del mal'?",
                options = listOf("Arthur Rimbaud", "Charles Baudelaire", "Paul Verlaine", "Victor Hugo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué país es la cuna del haiku?",
                options = listOf("China", "Japón", "Corea", "Vietnam"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué poeta se destaca por usar el humor y la ironía en sus poemas antipoéticos?",
                options = listOf("Mario Benedetti", "Julio Cortázar", "Jorge Drexler", "Nicanor Parra"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué poeta español fue asesinado al inicio de la Guerra Civil Española?",
                options = listOf("Antonio Machado", "Luis Cernuda", "Federico García Lorca", "Miguel Hernández"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de poema se caracteriza por su tono solemne y está dedicado a una persona o idea?",
                options = listOf("Elegía", "Oda", "Égloga", "Haiku"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué poeta mexicano escribió 'Piedra de sol'?",
                options = listOf("Carlos Pellicer", "José Emilio Pacheco", "Manuel Acuña", "Octavio Paz"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué poeta inglés escribió 'Ode to a Nightingale'?",
                options = listOf("William Wordsworth", "Percy Shelley", "John Keats", "Lord Byron"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué poeta nicaragüense escribió 'Azul...'?",
                options = listOf("Rubén Darío", "José Coronel Urtecho", "Ernesto Cardenal", "Carlos Martínez Rivas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué término describe la repetición de sonidos consonantes en poesía?",
                options = listOf("Rima asonante", "Aliteración", "Anáfora", "Epíteto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué poeta es conocido por su relación con la Generación del 27?",
                options = listOf("Federico García Lorca", "Pablo Neruda", "Jorge Guillén", "Vicente Aleixandre"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué poeta de habla inglesa escribió 'Do Not Go Gentle into That Good Night'?",
                options = listOf("W. H. Auden", "Ted Hughes", "Dylan Thomas", "T. S. Eliot"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Caligrafía" to listOf(
            QuizQuestion(
                question = "¿Qué es la caligrafía?",
                options = listOf("El arte de escribir correctamente", "Una técnica de pintura", "Un estilo de impresión digital", "El dibujo técnico con tinta"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes instrumentos es más usado en caligrafía tradicional?",
                options = listOf("Lápiz mecánico", "Bolígrafo", "Pluma estilográfica", "Marcador fluorescente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el término para referirse al espacio entre letras?",
                options = listOf("Kerning", "Leading", "Tracking", "Baseline"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'serif' en tipografía?",
                options = listOf("Un estilo sin decoraciones", "Una línea decorativa al final de un trazo", "Un trazo curvo en la letra", "Una fuente digital"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué país es conocido por su estilo de caligrafía Kanji?",
                options = listOf("Corea del Sur", "China", "Japón", "Vietnam"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de pluma se usa comúnmente para hacer letras góticas?",
                options = listOf("Pluma redonda", "Pincel plano", "Pluma de punta ancha", "Bolígrafo de gel"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un 'downstroke' en caligrafía?",
                options = listOf("Un trazo descendente", "Un trazo curvo", "Un trazo que cambia de color", "Un trazo decorativo en la parte superior"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta se utiliza comúnmente para la caligrafía con tinta china?",
                options = listOf("Rotulador", "Pincel", "Tiza", "Acuarela"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo caligráfico era común en la Edad Media?",
                options = listOf("Copperplate", "Italic", "Gótico", "Modern Script"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para practicar trazos en caligrafía moderna?",
                options = listOf("Lijas", "Papel milimetrado", "Hojas de práctica con guías", "Tela de lino"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de la letra se llama 'ascendente'?",
                options = listOf("La línea inferior", "La parte del trazo que sube por encima de la altura media", "El trazo que baja por debajo de la línea base", "El trazo horizontal central"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo caligráfico es más utilizado en invitaciones formales?",
                options = listOf("Brush lettering", "Gótico", "Copperplate", "Sans serif"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es 'brush lettering'?",
                options = listOf("Un tipo de escritura con bolígrafo", "Escritura con plumilla rígida", "Escritura con pincel o marcador flexible", "Una técnica de grabado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una diferencia entre tipografía y caligrafía?",
                options = listOf("Tipografía es digital, caligrafía es manual", "Ambas son lo mismo", "Caligrafía usa fuentes tipográficas", "Tipografía es más artística"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'x-height' en caligrafía?",
                options = listOf("La altura total de una mayúscula", "La distancia entre la línea base y la altura media",
                    "El espacio entre palabras", "La inclinación de la letra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de papel es ideal para caligrafía con tinta líquida?",
                options = listOf("Papel reciclado", "Papel satinado sin poros", "Papel con textura rugosa", "Papel para acuarela grueso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes estilos es cursivo y elegante?",
                options = listOf("Gótico", "Roman capital", "Italic", "Stencil"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta digital permite practicar caligrafía en una tablet?",
                options = listOf("Teclado mecánico", "Puntero láser", "Ratón óptico", "Lápiz digital o stylus"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'ligadura' en caligrafía y tipografía?",
                options = listOf("Un error de escritura", "Una conexión entre dos letras", "Un tipo de tinta", "Una regla para medir líneas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Quién fue Edward Johnston?",
                options = listOf("Un escultor moderno", "El creador de la tipografía sans serif", "El padre de la caligrafía moderna occidental",
                    "Un poeta renacentista"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa 'baseline'?",
                options = listOf("La línea sobre la que se apoyan las letras", "La parte superior de las letras", "El espacio entre letras", "La curvatura de las letras"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de tinta se usa comúnmente en caligrafía tradicional?",
                options = listOf("Tinta acrílica", "Tinta de bolígrafo", "Tinta de impresora", "Tinta china o india"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué es una 'flourish' en caligrafía?",
                options = listOf("Un error en el trazo", "Una decoración o adorno en las letras", "Una mancha de tinta", "Un estilo de papel"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la diferencia principal entre una pluma de punta flexible y una rígida?",
                options = listOf("La tinta que usan", "El peso", "La variación en el grosor del trazo", "El color del trazo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo es popular en caligrafía moderna por su fluidez y apariencia informal?",
                options = listOf("Roman Capitals", "Gótico", "Modern Calligraphy", "Copperplate"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de una letra sobresale por debajo de la línea base?",
                options = listOf("Ascendente", "Descendente", "Flourish", "Remate"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de marcador es ideal para el brush lettering?",
                options = listOf("Marcador permanente", "Marcador con punta pincel", "Marcador fosforescente", "Marcador de pizarra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué nombre recibe una letra decorada con detalles florales y colores en manuscritos antiguos?",
                options = listOf("Letra ilustrada", "Letra capital", "Letra gótica", "Letra itálica"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un 'nib' en caligrafía?",
                options = listOf("El mango del pincel", "La punta metálica de una pluma", "Una guía de letras", "Un tipo de papel"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de fuente se inspira en la escritura a mano cursiva?",
                options = listOf("Sans serif", "Script", "Monoespaciada", "Stencil"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos estilos no es un estilo caligráfico tradicional?",
                options = listOf("Roman", "Italic", "Comic Sans", "Uncial"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe evitarse al practicar caligrafía?",
                options = listOf("Usar una superficie inclinada", "Usar tinta resistente al agua", "Escribir con prisa", "Seguir guías de práctica"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'leading' en tipografía?",
                options = listOf("El espacio entre letras", "El tamaño de la fuente", "El color de la letra", "El espacio entre líneas de texto"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de papel puede hacer que la tinta se corra o sangre?",
                options = listOf("Papel satinado", "Papel poroso o muy absorbente", "Papel vegetal", "Cartón plastificado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un 'layout' en caligrafía?",
                options = listOf("El diseño general de una composición escrita", "Una fuente digital", "Un trazo de sombra", "Una hoja de papel especial"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes no es un estilo de letra caligráfica?",
                options = listOf("Copperplate", "Gótica", "Helvetica", "Uncial"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'tracking' en diseño de letras?",
                options = listOf("Espaciado uniforme entre letras", "La inclinación del texto", "La decoración en la letra capital", "La altura de las mayúsculas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo principal de la caligrafía?",
                options = listOf("Aumentar la velocidad de escritura", "Mejorar la legibilidad de documentos técnicos", "Expresar belleza a través de la escritura", "Codificar mensajes secretos"),
                correctIndex = 2
            )
        ),


        //************************************************************************************************************************


        "Vidriería artística" to listOf(
            QuizQuestion(
                question = "¿Qué es la vidriería artística?",
                options = listOf("Técnica de pintura al óleo sobre tela", "Arte de crear figuras con cerámica",
                    "Arte de trabajar con vidrio decorativo, especialmente vitrales", "Técnica para esmaltar metales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material se utiliza para unir piezas de vidrio en un vitral tradicional?",
                options = listOf("Cinta adhesiva", "Pasta de cal", "Aluminio líquido", "Plomo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para cortar vidrio?",
                options = listOf("Sierra de mano", "Cortavidrios o rulina", "Torno", "Cúter de metal"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el grisalla?",
                options = listOf("Un tipo de vidrio azul", "Una herramienta para pulir vidrio",
                    "Pigmento aplicado al vidrio para sombrear o detallar", "Un esmalte protector de vidrio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica consiste en aplicar calor para fundir diferentes vidrios?",
                options = listOf("Vidrio soplado", "Fusing", "Empalmado", "Arenado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué estilo de arte popularizó el uso decorativo del vitral en interiores?",
                options = listOf("Renacimiento", "Minimalismo", "Art Nouveau", "Dadaísmo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de soldadura se usa en vitrales con técnica Tiffany?",
                options = listOf("Soldadura TIG", "Soldadura con estaño y cobre", "Soldadura por arco eléctrico", "Soldadura autógena"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el vidrio catedral?",
                options = listOf("Vidrio totalmente opaco", "Vidrio claro con textura rugosa", "Vidrio usado exclusivamente en catedrales",
                    "Vidrio tallado con diamante"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la principal función de la cinta de cobre en la técnica Tiffany?",
                options = listOf("Dar color al vidrio", "Pintar los bordes", "Permitir la unión de piezas con soldadura", "Sujetar el vidrio al marco"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué artista es famoso por sus obras en vidrio y vitrales Art Nouveau?",
                options = listOf("Antoni Gaudí", "Louis Comfort Tiffany", "Henri Matisse", "René Magritte"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de vidrio cambia de color dependiendo del ángulo de luz?",
                options = listOf("Vidrio polarizado", "Vidrio de seguridad", "Vidrio dicroico", "Vidrio pulido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para alisar soldaduras en vitrales?",
                options = listOf("Martillo", "Cautín o soldador", "Pinzas", "Pulidora de disco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para proteger y sellar un vitral tradicional?",
                options = listOf("Laca acrílica", "Masilla o cemento para vitral", "Barniz de poliuretano", "Yeso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una vidriera emplomada?",
                options = listOf("Un vidrio fundido en un molde", "Una ventana hecha con piezas de vidrio unidas por plomo",
                    "Una técnica de grabado sobre vidrio", "Una pintura sobre vidrio esmerilado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de vidrio tiene apariencia de escarcha o hielo?",
                options = listOf("Vidrio float", "Vidrio arenado", "Vidrio esmerilado", "Vidrio opalino"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué proceso usa arena o partículas para dar textura mate al vidrio?",
                options = listOf("Esmerilado", "Termoformado", "Fusing", "Vitrofusión"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos vidrios es ideal para difundir la luz sin perder color?",
                options = listOf("Vidrio opaco", "Vidrio espejo", "Vidrio translúcido", "Vidrio polarizado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para pulir los bordes del vidrio después del corte?",
                options = listOf("Cautín", "Escofina", "Lija metálica", "Esmeriladora o pulidora de vidrio"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de los siguientes NO es un paso en la creación de vitrales?",
                options = listOf("Diseño o patrón", "Corte de vidrio", "Impresión digital sobre vidrio", "Soldadura de uniones"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de vidrio contiene óxidos metálicos para lograr colores vivos?",
                options = listOf("Vidrio templado", "Vidrio reciclado", "Vidrio de laboratorio", "Vidrio teñido en masa"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué técnica se usa para pintar detalles finos en un vitral?",
                options = listOf("Esmaltado por inmersión", "Técnica de grisalla", "Sopleteado", "Barnizado acrílico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de vidrio se usa a menudo para representar cielos en vitrales?",
                options = listOf("Vidrio rojo rubí", "Vidrio azul catedral", "Vidrio espejado", "Vidrio ácido"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento se funde con el vidrio para obtener color verde?",
                options = listOf("Oro", "Plomo", "Cobalto", "Cobre"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué propiedad tiene el vidrio soplado?",
                options = listOf("Mayor resistencia térmica", "Textura y burbujas únicas", "Es irrompible", "Total opacidad"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de soldar piezas con cinta de cobre?",
                options = listOf("Pintarlas", "Pulirlas con ácido", "Aplicar fundente (flux)", "Remojarlas en agua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo de vidriería es característico por sus colores planos y contornos marcados?",
                options = listOf("Gótico", "Cubismo", "Románico", "Realismo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es un patrón o 'cartón' en vidriería artística?",
                options = listOf("Papel decorativo para envolver", "Esquema con las formas y colores del vitral", "Muestra del vidrio",
                    "Plantilla para cortar soldadura"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de vidrio se corta con mayor facilidad?",
                options = listOf("Vidrio float común","Vidrio templado", "Vidrio opaco", "Vidrio dicroico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el 'fusing' en vidriería artística?",
                options = listOf("Proceso de templado del vidrio", "Fusión de piezas de vidrio a alta temperatura", "Técnica de pintar con fuego",
                    "Esmerilado decorativo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de vidrio tiene una superficie ondulada y textura única?",
                options = listOf("Vidrio de botella", "Vidrio craquelado", "Vidrio acrílico", "Vidrio soplado artesanal"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué significa la palabra 'vitral'?",
                options = listOf("Pintura sobre vidrio", "Vidrio tallado", "Vidrio coloreado ensamblado en una ventana", "Espejo antiguo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué medida de seguridad es fundamental al cortar vidrio?",
                options = listOf("Usar guantes de lana", "Trabajar descalzo", "Usar lentes de protección", "Rociar el vidrio con agua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de vidrio se usa para lograr transparencia y resistencia básica?",
                options = listOf("Vidrio templado", "Vidrio float", "Vidrio blindado", "Vidrio óptico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica permite crear formas curvas en vidrio usando calor y moldes?",
                options = listOf("Pulido ácido", "Soplado", "Termoformado o slump", "Arenado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué técnica se utiliza para proteger un vitral del viento o golpes exteriores?",
                options = listOf("Pintarlo con barniz", "Instalar vidrio laminado detrás", "Pegar cinta adhesiva", "Cubrir con plástico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el mejor método para limpiar un vitral antiguo?",
                options = listOf("Con ácido diluido", "Con detergente y cepillo metálico", "Con agua destilada y paño suave", "Con solventes industriales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos elementos es tóxico y se debe manipular con cuidado en vitralería?",
                options = listOf("Silicio", "Estaño", "Plomo", "Sodio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué característica tiene el vidrio opalescente?",
                options = listOf("Es transparente como el agua", "Tiene reflejo tipo espejo", "Tiene apariencia lechosa o perlada", "Es completamente negro"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Coleccionismo" to listOf(
            QuizQuestion(
                question = "¿Qué es el coleccionismo?",
                options = listOf("La práctica de vender artículos usados", "La acumulación compulsiva de objetos", "La actividad de reunir objetos de valor personal, histórico o estético", "Una forma de reciclaje creativo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué motiva a muchas personas a coleccionar?",
                options = listOf("Competencia económica", "Sentido de nostalgia, historia o pasión personal", "Recomendación médica", "Modas pasajeras"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se suele considerar una colección auténtica?",
                options = listOf("Un conjunto de objetos iguales", "Una serie organizada y curada de objetos con un criterio común", "Cosas que se encuentran al azar", "Todo lo que se acumula sin límite"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de objetos se coleccionan comúnmente?",
                options = listOf("Solo monedas", "Todo lo que no se usa", "Artículos específicos como monedas, sellos, juguetes, libros, etc.", "Ropa vieja exclusivamente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una razón para catalogar una colección?",
                options = listOf("Para venderla rápido", "Para saber cuántos objetos se han perdido", "Para mantener un registro organizado y saber qué se posee", "Para compararla con otras colecciones"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se entiende por 'valor sentimental' en el coleccionismo?",
                options = listOf("El valor económico", "Lo que el objeto vale en subasta", "El vínculo emocional personal con ciertos objetos", "El valor que tiene al ser reciclado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un coleccionista filatélico?",
                options = listOf("Quien colecciona libros antiguos", "Quien colecciona billetes", "Quien colecciona sellos postales", "Quien colecciona monedas de oro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas prácticas ayuda a conservar una colección física en buen estado?",
                options = listOf("Dejarla al sol", "Usarla todos los días", "Almacenar en lugares secos, limpios y protegidos de la luz", "Guardarla en cajas sin revisar nunca"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa que un objeto sea 'de edición limitada'?",
                options = listOf("Que es caro", "Que fue producido en una cantidad restringida", "Que tiene muchos usos", "Que se puede modificar fácilmente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede hacer que una colección aumente su valor con el tiempo?",
                options = listOf("El deterioro del objeto", "El uso constante", "La rareza, estado y demanda de los objetos", "El número de veces que se publica en redes"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué importancia tiene el estado de conservación en una colección?",
                options = listOf("Ninguna, lo importante es el objeto", "Es clave para determinar el valor estético y económico", "Solo importa si es nuevo", "Depende del tipo de objeto, pero rara vez importa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué característica hace que un objeto sea considerado 'de colección'?",
                options = listOf("Ser usado diariamente", "Tener más de 5 años", "Tener algún valor simbólico, histórico o artístico", "Haber sido comprado en rebaja"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta es útil para clasificar una colección digitalmente?",
                options = listOf("Un marco de fotos", "Una app o planilla de inventario", "Una lupa", "Un contador manual"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el coleccionismo temático?",
                options = listOf("Coleccionar cualquier cosa sin orden", "Reunir objetos siguiendo una línea común como personajes, épocas o países", "Solo coleccionar objetos nuevos", "Intercambiar objetos duplicados"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué suelen hacer los coleccionistas cuando tienen objetos repetidos?",
                options = listOf("Los tiran", "Los guardan sin uso", "Los intercambian o venden con otros coleccionistas", "Los regalan sin control"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué evento suele interesar a coleccionistas?",
                options = listOf("Ferias, convenciones o encuentros temáticos", "Concursos deportivos", "Desfiles de moda", "Charlas de nutrición"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja emocional del coleccionismo?",
                options = listOf("Genera ansiedad", "Estimula la nostalgia, la concentración y la satisfacción personal", "Hace perder tiempo", "Impide pensar en otras cosas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué criterio puede seguir una colección de libros?",
                options = listOf("Colores del lomo", "Autores, géneros o primeras ediciones", "Tamaño de letra", "Precio de compra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hace un coleccionista serio cuando obtiene un nuevo objeto?",
                options = listOf("Lo guarda sin revisarlo", "Lo muestra sin contexto", "Lo documenta, cataloga y cuida", "Lo sube a redes y lo olvida"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una colección 'cerrada'?",
                options = listOf("Una colección sin terminar", "Una colección sin fotos", "Una colección que ya tiene todos los elementos posibles dentro de un tema", "Una colección con objetos en cajas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una pieza 'rara' dentro de una colección?",
                options = listOf("Un objeto popular y fácil de conseguir", "Un ítem producido en grandes cantidades", "Un objeto difícil de hallar por su escasez o contexto histórico", "Un objeto que no tiene valor sentimental"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Por qué algunos coleccionistas prefieren objetos sin usar?",
                options = listOf("Porque ocupan menos espacio", "Porque aumentan su valor si están en estado original", "Porque no les interesa el objeto en sí", "Porque son más coloridos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'mint condition' en el mundo del coleccionismo?",
                options = listOf("Objeto con olor a menta", "Objeto usado ligeramente", "Objeto en perfecto estado, como nuevo", "Objeto restaurado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué implica el coleccionismo digital?",
                options = listOf("Coleccionar archivos en carpetas desordenadas", "Acumular videojuegos sin jugar", "Reunir objetos digitales como NFTs, cromos virtuales o juegos retro en emuladores", "Guardar capturas de pantalla"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hace más valiosa a una figura de acción coleccionable?",
                options = listOf("Que se haya usado en películas", "Que tenga articulaciones móviles", "Que esté en su empaque original y sea de edición limitada", "Que tenga muchos colores"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de seguro pueden contratar algunos coleccionistas?",
                options = listOf("Seguro para viajes", "Seguro para mascotas", "Seguro para colecciones valiosas", "Seguro automotor"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple la documentación de procedencia en una colección?",
                options = listOf("Sirve para vender más rápido", "Aumenta el valor histórico y prueba la autenticidad", "Permite ocultar el precio original", "Evita que se pierda el objeto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede afectar negativamente una colección física?",
                options = listOf("Ambientes húmedos, luz directa, plagas o manipulación inadecuada", "Tenerla bien expuesta", "Fotografiarla con frecuencia", "Limpiarla con productos especializados"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una 'pieza central' dentro de una colección?",
                options = listOf("El objeto más pequeño", "La figura más reciente", "El objeto más valioso o simbólicamente importante", "Una pieza sin contexto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué diferencia al coleccionismo de una simple acumulación?",
                options = listOf("Nada, son lo mismo", "La acumulación tiene criterio, el coleccionismo no", "El coleccionismo tiene un criterio y organización clara", "El coleccionismo no tiene límites"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede impulsar una moda de coleccionismo repentina?",
                options = listOf("Cambios climáticos", "Tendencias culturales o relanzamientos de productos clásicos", "La política internacional", "El precio del dólar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'mercado secundario' en coleccionismo?",
                options = listOf("Venta entre particulares después del lanzamiento oficial", "Tienda oficial de lanzamiento", "Mercado de alimentos", "Intercambio de productos nuevos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas afirmaciones es verdadera sobre el valor en coleccionismo?",
                options = listOf("Siempre está relacionado con la edad del objeto", "Es subjetivo y depende de la oferta, demanda y contexto", "Los objetos más nuevos valen más", "Solo depende de la marca"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué rol cumplen las comunidades online en el coleccionismo moderno?",
                options = listOf("Complican el proceso", "No tienen importancia", "Facilitan el intercambio, la información y validación de objetos", "Restringen el acceso a objetos valiosos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede hacer un coleccionista para mejorar su conocimiento?",
                options = listOf("Solo ver fotos de objetos", "Comprar sin investigar", "Leer libros, participar en foros y asistir a eventos", "Esperar a que otros le cuenten"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de objetos pueden formar parte del coleccionismo arqueológico?",
                options = listOf("Objetos de construcción moderna", "Artefactos históricos hallados legalmente", "Cualquier cosa que se encuentre", "Objetos reciclables"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se suele hacer con una colección al finalizarla?",
                options = listOf("Se regala sin registro", "Se guarda en cajas sin mostrar", "Se exhibe, se protege o se vende según el interés del coleccionista", "Se elimina para empezar otra"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede ser considerado coleccionismo temático digital?",
                options = listOf("Guardar memes sin orden", "Organizar fondos de pantalla por estilo o autor", "Reunir solo imágenes borrosas", "Descargar juegos y no jugarlos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una réplica en el mundo del coleccionismo?",
                options = listOf("Una imitación exacta sin ser original", "El mismo objeto en dos versiones", "Una parte de la colección original", "Una versión antigua del objeto"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Por qué algunos coleccionistas valoran los errores de fabricación?",
                options = listOf("Porque son más baratos", "Porque son defectuosos", "Porque pueden ser piezas únicas y raras", "Porque no funcionan bien"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Ilusionismo" to listOf(
            QuizQuestion(
                question = "¿Qué es el ilusionismo?",
                options = listOf("El arte de leer la mente", "El arte de crear efectos visuales con tecnología", "El arte de entretener creando ilusiones mediante técnicas físicas y psicológicas", "Una ciencia exacta aplicada a juegos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué nombre suele recibir un profesional del ilusionismo?",
                options = listOf("Ilusionista o mago", "Hipnotista", "Adivino", "Mentalista clínico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué diferencia al ilusionismo del engaño con mala intención?",
                options = listOf("Nada, ambos buscan manipular", "El ilusionismo es un arte consensuado para entretener", "El ilusionismo oculta verdades peligrosas", "El engaño siempre es legal"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas ramas es parte del ilusionismo?",
                options = listOf("Prestidigitación", "Tiro con arco", "Mímica", "Canto lírico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué herramienta es fundamental en los trucos de cartas?",
                options = listOf("Iluminación especial", "Marcadores permanentes", "Habilidad con las manos y misdirection", "Un mazo electrónico"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el 'misdirection'?",
                options = listOf("Manipular cartas con imanes", "Utilizar espejos en el escenario", "Desviar la atención del público para ejecutar el truco", "Una técnica de distracción sonora"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas figuras es icónica en la historia del ilusionismo?",
                options = listOf("Harry Houdini", "Einstein", "Tesla", "Mozart"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué implica la magia de cerca?",
                options = listOf("Trucos con grandes aparatos", "Ilusionismo realizado en grandes teatros", "Trucos realizados a corta distancia del público", "Hipnosis colectiva"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué papel juega la psicología en el ilusionismo?",
                options = listOf("Ninguno, es solo técnica", "Es fundamental para entender y manipular la percepción del público", "Solo sirve para distraer", "Sirve solo en trucos mentales"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué elemento es común en las ilusiones ópticas?",
                options = listOf("Cambios de clima", "Luz, ángulos y perspectiva", "Sonidos repetitivos", "Velocidad extrema"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de magia involucra grandes aparatos y escenarios?",
                options = listOf("Magia de salón", "Magia de cerca", "Grandes ilusiones", "Mentalismo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un truco de escapismo?",
                options = listOf("Ilusionismo con fuego", "Liberarse de ataduras, cajas cerradas o cadenas en condiciones difíciles", "Trucos de predicción", "Juegos con fuego y humo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas afirmaciones es verdadera sobre la magia clásica?",
                options = listOf("Siempre usa tecnología moderna", "Evita el contacto con el público", "Se basa en habilidades manuales y técnicas tradicionales", "Usa efectos visuales digitales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se necesita para ser un buen ilusionista?",
                options = listOf("Fuerza física", "Conocimiento técnico, práctica, carisma y control de la atención del público", "Memorizar trucos", "Ser rápido con los pies"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué papel juegan los accesorios en el ilusionismo?",
                options = listOf("Son decorativos", "Son esenciales para la ejecución y el engaño visual", "Son reemplazables por apps", "Solo sirven en televisión"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué distingue al mentalismo dentro del ilusionismo?",
                options = listOf("No se considera magia", "Es el arte de simular habilidades psíquicas como la predicción o lectura de mentes", "Usa disfraces", "Depende de trucos ópticos exclusivamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué famoso truco realizó Houdini repetidamente?",
                options = listOf("Desaparición de una persona", "Cortar a alguien por la mitad", "Escapismo de camisas de fuerza y cajas cerradas", "Levitación sobre el público"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué efecto produce un buen truco de ilusionismo en el espectador?",
                options = listOf("Risa", "Frustración", "Asombro, sorpresa y confusión deliberada", "Enojo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos no es un elemento esencial en la preparación de un acto de ilusionismo?",
                options = listOf("Práctica constante", "Dominio escénico", "Vestimenta atractiva", "Aburrimiento deliberado"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de reacción busca el ilusionismo en el público?",
                options = listOf("Razonamiento lógico inmediato", "Asombro, emoción y suspensión de la incredulidad", "Desagrado", "Distancia emocional"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué diferencia a un acto de ilusionismo bien logrado?",
                options = listOf("El uso de pantallas LED", "Que el espectador no pueda descubrir el truco y quede maravillado", "Que el ilusionista grite mucho", "La cantidad de humo en el escenario"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'acto de cierre' en un espectáculo de ilusionismo?",
                options = listOf("Un truco improvisado", "La despedida sin más", "El truco final, usualmente el más impactante", "El primer truco que se presenta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué rol cumplen las pausas y el ritmo en una presentación?",
                options = listOf("Desconectan al público", "Son usadas para manipular la atención y crear tensión", "Sirven para descansar al mago", "No tienen importancia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se busca al ensayar repetidamente un truco?",
                options = listOf("Memorizar el guion", "Evitar errores, perfeccionar movimientos y tiempos", "Cansarse para luego sorprender", "Copiar a otros magos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función puede tener la música en un acto de ilusionismo?",
                options = listOf("Distracción molesta", "Rellenar silencios", "Enfatizar el clima emocional y acompañar el ritmo del truco", "Tapar errores"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Por qué algunos ilusionistas usan ayudantes?",
                options = listOf("Para entretener mientras descansan", "Porque no saben hacer magia", "Para colaborar en trucos complejos y desviar la atención", "Por decoración escénica"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué importancia tiene el lenguaje corporal en el ilusionismo?",
                options = listOf("Es irrelevante", "Es clave para dirigir la atención y generar credibilidad", "Solo importa en televisión", "Sirve para intimidar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una 'fuerza' en cartomagia?",
                options = listOf("Una carta con peso especial", "Una forma de hacer que el espectador elija una carta específica sin saberlo", "Un truco con cartas dobles", "Una baraja gigante"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se busca al mirar directamente al público durante un truco?",
                options = listOf("Intimidar", "Generar una conexión emocional y controlar su foco de atención", "Buscar aprobación", "Ver si alguien lo descubre"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hace única a la magia improvisada?",
                options = listOf("No requiere habilidades", "Es espontánea, usando objetos cotidianos en situaciones reales", "Solo sirve para niños", "No genera impacto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué caracteriza al ilusionismo callejero?",
                options = listOf("Trucos de gran escala", "Uso de cámaras ocultas", "Actuaciones en espacios públicos con cercanía al público", "Solo se hace en festivales"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo de usar historias o narrativas en un truco?",
                options = listOf("Distraer del error", "Alargar el tiempo", "Aumentar la inmersión y el impacto emocional", "Evitar que el público piense"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'sleight of hand'?",
                options = listOf("Ilusión sonora", "Juego de cartas especial", "Habilidad manual para realizar trucos sin que se note", "Truco con humo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Por qué algunos ilusionistas revelan trucos después de sus actos?",
                options = listOf("Por error", "Para mostrar su ego", "Como parte del show educativo o para inspirar", "Porque los olvidan"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué relación tiene la confianza del público con el éxito de un acto?",
                options = listOf("Ninguna", "Es esencial: si confían en el mago, suspenden su incredulidad", "Solo sirve si hay niños", "Se pierde al usar luces"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica se utiliza cuando el mago realiza un movimiento falso para cubrir otro?",
                options = listOf("Cambio de baraja", "Misdirection inverso", "Movimiento de cobertura", "Forcing emocional"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el mentalismo?",
                options = listOf("Una forma de hipnosis clínica", "La ilusión de habilidades mentales como lectura de pensamientos o predicciones", "Una técnica de meditación", "Un tipo de música"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué distingue al ilusionismo televisado del presencial?",
                options = listOf("No requiere ensayos", "Depende de cámaras y edición para ciertos efectos", "Siempre es mejor", "No se usa misdirection"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un gimmick en el ilusionismo?",
                options = listOf("Un elemento secreto diseñado para facilitar un truco", "Una aplicación digital", "Un error común", "Una historia inventada"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué actitud debería evitar un ilusionista frente al público?",
                options = listOf("Confianza escénica", "Actitud desafiante o de superioridad", "Empatía", "Manejo del silencio"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Pilates" to listOf(
            QuizQuestion(
                question = "¿Quién fue el creador del método Pilates?",
                options = listOf("Joseph Pilates", "Marie Kondo", "B.K.S. Iyengar", "David Belle"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es uno de los principios fundamentales del Pilates?",
                options = listOf("Velocidad", "Fuerza máxima", "Control", "Competencia"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cuerpo se considera el 'centro de poder' en Pilates?",
                options = listOf("Las piernas", "El cuello", "El core (zona abdominal y lumbar)", "Los brazos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se busca mejorar principalmente con Pilates?",
                options = listOf("Masa muscular bruta", "Fuerza explosiva", "Postura, flexibilidad y control del cuerpo", "Velocidad de reacción"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de respiración se usa en Pilates?",
                options = listOf("Respiración torácica lateral", "Respiración bucal rápida", "Respiración clavicular", "Respiración nasal cerrada"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué accesorio es común en Pilates para intensificar ejercicios?",
                options = listOf("Pelota suiza", "Pesas rusas", "Cuerda de saltar", "Tubo de oxígeno"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué diferencia al Pilates del yoga tradicional?",
                options = listOf("Pilates tiene enfoque más en el movimiento consciente desde el centro corporal", "Yoga siempre se hace de pie", "Pilates se practica solo con máquinas", "Yoga busca el estrés físico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es un beneficio mental del Pilates?",
                options = listOf("Incremento del estrés", "Reducción de la concentración", "Mayor conexión mente-cuerpo", "Ansiedad prolongada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué aparato fue diseñado por el creador de Pilates?",
                options = listOf("El Reformer", "La cinta de correr", "El bosu", "La bicicleta estática"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué aspecto técnico se trabaja mucho en Pilates?",
                options = listOf("El impacto contra el piso", "La movilidad sin control", "El alineamiento corporal y la respiración consciente", "La resistencia al dolor"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué población puede beneficiarse del Pilates?",
                options = listOf("Solo atletas jóvenes", "Personas mayores, embarazadas y en rehabilitación también", "Solo culturistas", "Niños exclusivamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se busca evitar durante la práctica de Pilates?",
                options = listOf("El enfoque en la respiración", "La tensión innecesaria y movimientos bruscos", "El control del cuerpo", "La alineación postural"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de movimientos predominan en Pilates?",
                options = listOf("Explosivos y rápidos", "Descontrolados", "Controlados, fluidos y precisos", "Irracionales y de impacto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento se enfatiza para prevenir lesiones en Pilates?",
                options = listOf("Saltos constantes", "Desafíos físicos extremos", "Alineación y control", "Carga excesiva de peso"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo influye Pilates en la respiración diaria?",
                options = listOf("No influye", "Empeora la capacidad respiratoria", "Mejora la conciencia y el control respiratorio", "Reduce la capacidad pulmonar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué rol tiene la concentración en Pilates?",
                options = listOf("Ninguno", "Sirve solo al principio", "Es uno de los principios clave para ejecutar correctamente", "Solo ayuda a los profesores"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa la precisión en el contexto del método Pilates?",
                options = listOf("Hacer ejercicios lo más rápido posible", "Copiar al instructor sin pensar", "Realizar cada movimiento con atención y técnica", "Usar cronómetros"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué impacto tiene Pilates sobre el estrés?",
                options = listOf("Lo incrementa por la exigencia", "Ayuda a reducirlo mediante control respiratorio y atención plena", "Lo mantiene igual", "No tiene efectos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo se adapta Pilates a personas con lesiones?",
                options = listOf("No es recomendable", "Puede adaptarse con ejercicios suaves y supervisión", "Solo para atletas", "Requiere máquinas costosas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué diferencia al Reformer del mat (colchoneta)?",
                options = listOf("El Reformer agrega resistencia mediante resortes y poleas", "El mat es más avanzado", "Solo el mat fortalece el core", "Ambos son lo mismo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo final de la práctica constante de Pilates?",
                options = listOf("Competir profesionalmente", "Alcanzar fuerza bruta", "Aumentar la conciencia corporal y el control físico-mental", "Desarrollar velocidad atlética"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué principio del Pilates implica moverse con intención y exactitud?",
                options = listOf("Relajación", "Velocidad", "Precisión", "Potencia"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estas afirmaciones es verdadera respecto al Pilates?",
                options = listOf("Solo se puede practicar en gimnasios", "Es una práctica exclusivamente para mujeres", "Mejora la coordinación y equilibrio", "No tiene impacto en la vida diaria"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se busca al controlar la respiración en cada movimiento de Pilates?",
                options = listOf("Aumentar la presión arterial", "Distraer la mente", "Favorecer el control muscular y mental", "Hacer más difícil el ejercicio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una señal de que el ejercicio está mal ejecutado?",
                options = listOf("No se suda", "Hay tensión en cuello o espalda", "Se escucha la respiración", "Se siente el abdomen activado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué diferencia a Pilates de otros entrenamientos como el HIIT?",
                options = listOf("Se basa en movimientos explosivos", "Enfatiza la técnica por encima de la cantidad de repeticiones", "No fortalece el cuerpo", "Solo se realiza acostado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el 'Powerhouse' en Pilates?",
                options = listOf("Una máquina especial", "Nombre de una clase avanzada", "El centro de energía del cuerpo: abdomen, lumbares y glúteos", "Un tipo de respiración"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se busca evitar al hacer ejercicios de Pilates?",
                options = listOf("Tensión innecesaria en hombros y cuello", "Activar el abdomen", "Controlar la respiración", "Trabajar con accesorios"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se logra con una práctica regular de Pilates?",
                options = listOf("Postura encorvada", "Menor movilidad", "Mayor control corporal y postura erguida", "Fatiga crónica"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Por qué es importante concentrarse en el cuerpo durante Pilates?",
                options = listOf("Para compararse con otros", "Para evitar el aburrimiento", "Para lograr un entrenamiento consciente y seguro", "Para entrenar sin respirar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué grupo muscular se activa constantemente en Pilates?",
                options = listOf("Trapecios", "Bíceps", "Core (zona abdominal y lumbar)", "Cuádriceps"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es un beneficio funcional del Pilates en la vida cotidiana?",
                options = listOf("Mayor capacidad para levantar peso sin técnica", "Mejor equilibrio y coordinación al caminar o agacharse", "Capacidad de correr maratones", "Facilitar movimientos explosivos"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué accesorio se usa en Pilates para intensificar la estabilidad?",
                options = listOf("Balón medicinal", "Cinturón de lastre", "Círculo mágico (magic circle)", "Sandbag"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede indicar que un ejercicio de Pilates está siendo mal realizado?",
                options = listOf("Sensación de estabilidad", "Dolor agudo en articulaciones", "Activación del core", "Buena alineación postural"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la importancia de realizar el movimiento con fluidez?",
                options = listOf("Se ve estético solamente", "Evita impactos y favorece la coordinación muscular", "Permite distraerse", "No tiene relevancia"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cómo ayuda Pilates a personas con estrés o ansiedad?",
                options = listOf("Aumentando la presión psicológica", "Favoreciendo la conexión cuerpo-mente mediante respiración y control", "Obligándolas a competir", "Eliminando el descanso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Por qué Pilates es útil para prevenir lesiones deportivas?",
                options = listOf("Porque no se mueve mucho", "Porque fortalece la musculatura estabilizadora y mejora el control postural", "Porque reemplaza a la fisioterapia", "Porque solo se usan máquinas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la postura base más común para comenzar en Pilates?",
                options = listOf("De pie", "Tendido boca arriba", "En cuclillas", "Sentado en el suelo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el rol del instructor en una clase de Pilates?",
                options = listOf("Solo contar repeticiones", "Controlar que cada alumno mantenga buena forma y respiración", "Ejercitar más que los alumnos", "Criticar posturas ajenas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'alineación corporal' en Pilates?",
                options = listOf("La forma de sentarse derecho", "La alineación de las extremidades respecto al eje del cuerpo", "Ejercicios de rotación", "Caminar en línea recta"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de personas pueden comenzar con Pilates?",
                options = listOf("Solo personas en forma", "Cualquiera, con adaptaciones si es necesario", "Solo deportistas", "Solo jóvenes"),
                correctIndex = 1
            )
        ),

        //************************************************************************************************************************

        "Tarot" to listOf(
            QuizQuestion(
                question = "¿Qué es el tarot?",
                options = listOf("Un juego de mesa", "Un método de adivinación simbólica con cartas", "Una técnica de hipnosis", "Un libro antiguo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántas cartas tiene una baraja de tarot tradicional?",
                options = listOf("52", "64", "78", "88"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo se dividen las cartas del tarot?",
                options = listOf("Palos y figuras", "Arcanos mayores y menores", "Cartas de poder y suerte", "Cartas activas y pasivas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuántos Arcanos Mayores hay en el tarot?",
                options = listOf("12", "22", "36", "44"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa la carta del Loco en el tarot?",
                options = listOf("Inmadurez y fracaso", "Comienzos, libertad y espontaneidad", "Traición", "Estabilidad emocional"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estas cartas simboliza transformación y renacimiento?",
                options = listOf("El Sol", "La Rueda de la Fortuna", "La Muerte", "El Diablo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué carta representa equilibrio y armonía?",
                options = listOf("La Templanza", "El Diablo", "El Juicio", "La Torre"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué palo está presente en los Arcanos Menores?",
                options = listOf("Bastos", "Flores", "Rocas", "Árboles"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué elemento se asocia con el palo de Copas?",
                options = listOf("Fuego", "Tierra", "Aire", "Agua"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué carta suele asociarse con cambios inesperados?",
                options = listOf("La Estrella", "La Torre", "El Mago", "La Emperatriz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa el palo de Espadas?",
                options = listOf("Emociones y sentimientos", "Pensamiento, conflicto y decisión", "Abundancia material", "Alegría y celebración"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la finalidad principal de una lectura de tarot?",
                options = listOf("Predecir el futuro exacto", "Conocer el pasado", "Guiar a través de símbolos y reflexión personal", "Adivinar números ganadores"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué carta puede simbolizar el ego o las ataduras internas?",
                options = listOf("El Diablo", "El Sol", "La Justicia", "El Carro"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué carta puede indicar iluminación y éxito?",
                options = listOf("La Luna", "La Estrella", "El Sol", "El Colgado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una práctica común antes de leer las cartas?",
                options = listOf("Encender una vela", "Gritar fuerte", "Escribir el horóscopo", "Jugar con dados"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué representa el Juicio en el tarot?",
                options = listOf("Fracaso inevitable", "Culpa emocional", "Renacimiento, reflexión y cambio de rumbo", "Pasividad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué carta representa el dominio y liderazgo?",
                options = listOf("La Sacerdotisa", "El Loco", "El Emperador", "La Templanza"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el número de la carta de La Rueda de la Fortuna?",
                options = listOf("VI", "X", "XIV", "IX"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa la carta de La Luna?",
                options = listOf("Claridad total", "Falsedad, intuición y confusión", "Control y acción", "Inmadurez emocional"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una tirada de tarot de tres cartas?",
                options = listOf("Pasado, presente y futuro", "Una carta por día", "Tres cartas de un solo palo", "Tres cartas del tarot egipcio"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa que una carta salga invertida en una tirada de tarot?",
                options = listOf("Que no debe interpretarse", "Que se anula su efecto", "Puede representar bloqueos o aspectos internos", "Es una carta inválida"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué carta representa intuición y sabiduría interior?",
                options = listOf("La Torre", "El Emperador", "La Sacerdotisa", "El Juicio"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué representa la carta del Colgado?",
                options = listOf("Fracaso", "Castigo", "Pausa, reflexión y cambio de perspectiva", "Éxito inmediato"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué carta simboliza poder, manifestación y acción?",
                options = listOf("El Mago", "El Loco", "La Luna", "La Justicia"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué palo del tarot representa emociones y relaciones?",
                options = listOf("Bastos", "Espadas", "Copas", "Oros"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué carta suele representar celebración y éxito social?",
                options = listOf("El Diablo", "Cuatro de Copas", "Tres de Copas", "Cinco de Espadas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede indicar la carta del Ermitaño?",
                options = listOf("Soledad voluntaria, introspección y búsqueda espiritual", "Felicidad pública", "Viaje inmediato", "Inmadurez"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué elemento se asocia con el palo de Bastos?",
                options = listOf("Agua", "Fuego", "Aire", "Tierra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué representa el palo de Oros?",
                options = listOf("Relaciones personales", "Trabajo y emociones", "Aspectos materiales y financieros", "Incertidumbre espiritual"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué carta está asociada con liberación y revelación?",
                options = listOf("El Sol", "La Luna", "La Sacerdotisa", "El Juicio"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Cuál de estas cartas simboliza justicia, verdad y equilibrio?",
                options = listOf("El Colgado", "La Justicia", "El Emperador", "La Rueda de la Fortuna"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede simbolizar la carta de la Estrella?",
                options = listOf("Esperanza, guía e inspiración", "Engaño y temor", "Soledad profunda", "Furia reprimida"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué carta representa control y determinación?",
                options = listOf("La Fuerza", "El Carro", "La Muerte", "El Loco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué carta representa dominio interno y compasión?",
                options = listOf("La Fuerza", "El Emperador", "El Diablo", "El Mago"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de tirada utiliza una carta por cada aspecto de una situación (mente, cuerpo, espíritu)?",
                options = listOf("Tirada de la cruz celta", "Tirada de tres cartas", "Tirada del triángulo", "Tirada lunar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué actitud se recomienda tener al consultar el tarot?",
                options = listOf("Escepticismo absoluto", "Dependencia emocional", "Reflexión y apertura simbólica", "Obsesión con el resultado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el significado de la carta de La Emperatriz?",
                options = listOf("Destrucción y pérdida", "Creatividad, fertilidad y abundancia", "Silencio", "Inmadurez emocional"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué carta puede reflejar un momento de crisis profunda pero necesaria?",
                options = listOf("El Sol", "La Luna", "La Torre", "El Colgado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito del tarot en contextos terapéuticos?",
                options = listOf("Reemplazar al psicólogo", "Brindar certeza exacta", "Facilitar la introspección y el autoconocimiento", "Dar órdenes específicas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe considerarse al interpretar las cartas del tarot?",
                options = listOf("La posición en la tirada, la carta, y la pregunta formulada", "Solo el nombre de la carta", "El orden del mazo", "La hora del día"),
                correctIndex = 0
            )
        ),

        //************************************************************************************************************************

        "Hacer velas" to listOf(
            QuizQuestion(
                question = "¿Cuál es el ingrediente base más común para hacer velas caseras?",
                options = listOf("Manteca", "Cera", "Aceite de oliva", "Glicerina"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de cera es más ecológica y de origen vegetal?",
                options = listOf("Cera de abeja", "Cera de parafina", "Cera de soja", "Cera de palma"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para perfumar una vela de forma natural?",
                options = listOf("Colorante alimenticio", "Esencias artificiales", "Aceites esenciales", "Vinagre"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte de la vela es responsable de la combustión?",
                options = listOf("La cera", "El colorante", "La mecha", "El molde"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una función del molde al hacer velas?",
                options = listOf("Evaporar la cera", "Evitar que ardan", "Dar forma a la vela", "Agregar color"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede ocurrir si se agrega demasiado aceite esencial a la cera?",
                options = listOf("La vela será más brillante", "La vela no se solidificará correctamente", "Arderá por más tiempo", "No afectará en nada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja de la cera de soja sobre la de parafina?",
                options = listOf("Es más barata", "Es natural y produce menos humo", "Se derrite más rápido", "No requiere mecha"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de verter la cera en el molde?",
                options = listOf("Congelarlo", "Lubricarlo con aceite", "Colocar la mecha centrada", "Agregar detergente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material es común para hacer mechas caseras?",
                options = listOf("Nylon", "Hilo de algodón", "Cobre", "Papel"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede causar que una vela se derrita de forma dispareja?",
                options = listOf("Cera vegetal", "Mecha mal posicionada", "Colorante natural", "Molde de silicona"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de recipiente es seguro para velas en frascos?",
                options = listOf("Frascos de plástico", "Vasos finos de vidrio", "Cerámica o vidrio resistente al calor", "Cartón encerado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede suceder si se sobrecalienta la cera?",
                options = listOf("Se vuelve más aromática", "Mejora la textura", "Puede inflamarse", "Se vuelve más transparente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito de curar una vela después de hacerla?",
                options = listOf("Hacerla más colorida", "Eliminar impurezas", "Mejorar la liberación del aroma y quemado", "Derretir la mecha"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento puede añadirse para decoración sin afectar la combustión?",
                options = listOf("Purpurina metálica", "Flores secas en el exterior", "Papel aluminio", "Plástico picado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para mantener centrada la mecha mientras se solidifica la vela?",
                options = listOf("Cinta adhesiva", "Palillo o soporte de mecha", "Imán", "Aguja de coser"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una forma efectiva de evitar burbujas en la cera al verterla?",
                options = listOf("Verter muy rápido", "No derretir completamente", "Verter lentamente y en temperatura adecuada", "Usar agua fría en el molde"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer si la vela tiene grietas al solidificarse?",
                options = listOf("Romperla y comenzar de nuevo", "Agregar agua", "Volver a calentar la superficie suavemente", "Pintarla encima"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una temperatura aproximada segura para derretir cera de soja?",
                options = listOf("40°C", "60–70°C", "100°C", "130°C"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica una vela con túnel en el centro después de varios usos?",
                options = listOf("Cera de mala calidad", "Mecha mal posicionada o muy delgada", "Cera demasiado caliente", "Fragancia muy intensa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué precaución de seguridad es importante al hacer velas en casa?",
                options = listOf("Hacerlo en un lugar bien ventilado y sin niños cerca", "Usar cera sin calentar", "Soplar la mecha mientras se seca", "Agregar agua para enfriar más rápido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es una vela aromática?",
                options = listOf("Una vela que huele mal", "Una vela con perfume incorporado", "Una vela sin mecha", "Una vela con decoración externa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué color de vela se asocia comúnmente con la relajación?",
                options = listOf("Rojo", "Azul", "Negro", "Amarillo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué cera es más recomendable para personas alérgicas?",
                options = listOf("Parafina", "Cera de soja sin fragancia", "Cera de abeja con perfume", "Cera reciclada"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple un termómetro en el proceso de hacer velas?",
                options = listOf("Medir el tamaño del molde", "Calcular el aroma", "Evitar sobrecalentar la cera", "Cortar la mecha"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ocurre si no se cura adecuadamente una vela antes de usarla?",
                options = listOf("No se enciende", "Arde de forma irregular y libera menos aroma", "Se quiebra", "Se derrite más rápido"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se puede usar para colorear velas de forma segura?",
                options = listOf("Tinta de impresora", "Acuarela", "Colorante para velas o crayones sin tóxicos", "Esmalte de uñas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una característica de una vela bien hecha?",
                options = listOf("Se derrite solo en el centro", "Genera humo negro", "Se quema uniformemente", "Se apaga sola en 5 minutos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe hacerse con los restos de cera sobrante?",
                options = listOf("Desecharlos inmediatamente", "Reutilizarlos en nuevas velas", "Mezclarlos con jabón", "Usarlos como lubricante"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Por qué es importante derretir la cera a baño maría en lugar de fuego directo?",
                options = listOf("Para acelerar el proceso", "Porque huele mejor", "Para evitar que la cera se inflame", "Para evitar grumos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué accesorio se puede añadir al recipiente para facilitar la limpieza después del uso?",
                options = listOf("Papel aluminio", "Agua", "Cera de silicona", "Aceite desmoldante en el interior"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué mechas producen una llama más estable?",
                options = listOf("De papel", "De algodón trenzado", "De metal", "De silicona"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué indica una llama que parpadea mucho?",
                options = listOf("Buena calidad", "Exceso de oxígeno", "Mecha mal cortada o corriente de aire", "Aroma fuerte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede generar humo excesivo al quemar una vela?",
                options = listOf("Cera de soja", "Colorante natural", "Mecha demasiado larga", "Esencia suave"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué puede causar que una vela se consuma muy rápido?",
                options = listOf("Mecha muy gruesa", "Color claro", "Cera natural", "Uso de moldes metálicos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una forma de hacer velas en capas de diferentes colores?",
                options = listOf("Congelar entre capas", "Verter toda la cera junta", "Usar doble mecha", "Evitar usar moldes"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pasa si la mecha es muy fina para el diámetro de la vela?",
                options = listOf("Generará una llama muy grande", "Se apagará rápidamente", "Quemará muy rápido", "Derretirá toda la cera de golpe"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es una medida de seguridad al encender una vela aromática?",
                options = listOf("Colocarla cerca de cortinas", "No dejarla desatendida", "Ponerla sobre madera", "Encenderla con fósforos mojados"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa 'velas ecológicas'?",
                options = listOf("Se reciclan al usarlas", "Están hechas con materiales renovables y menos contaminantes", "No se derriten", "No tienen aroma"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es un uso alternativo para restos de cera de velas aromáticas?",
                options = listOf("Hacer crayones", "Aromatizar cajones o closets", "Enfriar alimentos", "Usar como pegamento"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué diferencia a una vela decorativa de una funcional?",
                options = listOf("La decorativa no se puede encender", "La decorativa tiene más aroma", "La decorativa prioriza la estética sobre la duración o funcionalidad", "La decorativa dura más"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Peluquería" to listOf(
            QuizQuestion(
                question = "¿Cuál es la herramienta principal para cortar el cabello?",
                options = listOf("Peine", "Tijeras", "Cepillo", "Secador"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué función cumple el peine en el corte de cabello?",
                options = listOf("Medir temperatura", "Separar y ordenar el cabello", "Cortar capas", "Teñir el cabello"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de tijera se usa para adelgazar o desmechar el cabello?",
                options = listOf("Tijera de entresacar", "Tijera curva", "Tijera de punta roma", "Tijera de costura"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué producto se utiliza para fijar peinados de forma temporal?",
                options = listOf("Acondicionador", "Laca o spray", "Shampoo", "Tintura"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer antes de teñir el cabello?",
                options = listOf("Aplicar calor", "Lavar con shampoo", "Realizar una prueba de alergia", "Cortar las puntas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de corte se caracteriza por tener el mismo largo en toda la cabeza?",
                options = listOf("Corte en capas", "Bob", "Corte recto", "Degradado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué aparato se usa para alisar el cabello aplicando calor?",
                options = listOf("Secador", "Rizador", "Cepillo térmico", "Plancha de pelo"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué producto se usa para proteger el cabello del calor antes de usar plancha o secador?",
                options = listOf("Acondicionador sin enjuague", "Gel fijador", "Protector térmico", "Tinta capilar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer para evitar puntas abiertas?",
                options = listOf("Cortar las puntas regularmente", "Usar agua muy caliente", "Aplicar laca diariamente", "Teñir con frecuencia"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para ondular el cabello sin calor?",
                options = listOf("Cepillo redondo", "Bigudíes o ruleros", "Peine de dientes finos", "Secador de aire frío"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo del shampoo en el lavado del cabello?",
                options = listOf("Dar brillo", "Fijar el color", "Eliminar la suciedad y grasa", "Deshidratar el cuero cabelludo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué corte favorece a rostros redondos al alargar visualmente la cara?",
                options = listOf("Flequillo recto", "Corte pixie", "Corte en capas largas", "Corte carré"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué instrumento se utiliza para cortar el cabello en zonas como la nuca o patillas?",
                options = listOf("Tijera común", "Cepillo", "Navaja de afeitar", "Máquina de cortar cabello"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué tipo de peine es mejor para desenredar el cabello mojado?",
                options = listOf("Peine de dientes finos", "Peine metálico", "Peine de dientes anchos", "Peine con púas calientes"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe tener en cuenta al realizar un corte en cabello rizado?",
                options = listOf("Cortar en seco y considerar el encogimiento", "Cortar solo en mojado", "Usar navaja", "Cepillarlo con fuerza"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué corte de cabello es conocido por su estilo corto en la nuca y largo hacia adelante?",
                options = listOf("Corte bob invertido", "Corte recto", "Degradado clásico", "Corte militar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué producto se utiliza para hidratar el cabello después de lavarlo?",
                options = listOf("Gel", "Acondicionador", "Fijador", "Shampoo seco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se considera una buena práctica al atender a un cliente en peluquería?",
                options = listOf("Apurar el corte", "No usar capa", "Consultar sus preferencias y explicar el proceso", "Evitar el espejo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de cepillo es ideal para dar volumen al secar el cabello?",
                options = listOf("Cepillo plano", "Cepillo redondo", "Cepillo de púas metálicas", "Cepillo doble"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué técnica de coloración implica teñir solo las puntas del cabello?",
                options = listOf("Mechas californianas", "Reflejos", "Balayage", "Decoloración total"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué indica un cuero cabelludo con picazón y descamación constante?",
                options = listOf("Cabello saludable", "Piojos", "Caspa u otra afección dérmica", "Uso de shampoo caro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo de corte se caracteriza por transiciones suaves entre largos?",
                options = listOf("Degradado", "Carré", "Corte recto", "Rapado completo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es la mejor forma de mantener las herramientas de peluquería limpias?",
                options = listOf("Enjuagarlas con agua caliente", "Pasarles alcohol o desinfectante", "Guardarlas sin limpiar", "Limpiarlas con perfume"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué beneficio tiene el masaje capilar durante el lavado?",
                options = listOf("Estimula la circulación sanguínea", "Corta el cabello", "Aumenta la grasa", "Hace crecer las uñas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de cabello suele necesitar más hidratación?",
                options = listOf("Lacio", "Graso", "Rizado o afro", "Corto"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ocurre si se usa un shampoo no adecuado al tipo de cabello?",
                options = listOf("No se nota ninguna diferencia", "Se cae más el cabello", "Puede causar sequedad o grasa excesiva", "Vuelve el cabello blanco"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el balayage?",
                options = listOf("Un corte militar", "Una técnica de coloración gradual desde la raíz", "Un shampoo especial", "Una forma de peinar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la principal diferencia entre un alisado y una permanente?",
                options = listOf("El alisado da volumen", "El alisado estira el cabello y la permanente lo riza", "La permanente es para cabello corto", "Ambas hacen lo mismo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál de estos productos es ideal para controlar el frizz?",
                options = listOf("Laca", "Acondicionador", "Aceite capilar o serum", "Shampoo sólido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué corte suele usarse para hombres con poco cabello en la coronilla?",
                options = listOf("Corte militar", "Degradado bajo", "Rapado total", "Pompadour"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer si un cliente tiene una reacción alérgica al tinte?",
                options = listOf("Enjuagar y aplicar crema hidratante", "Ignorarlo", "Cubrir con laca", "Lavar con shampoo con sal"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué es el flequillo tipo 'curtain bangs'?",
                options = listOf("Un flequillo recto", "Un flequillo que se abre a los costados como cortinas", "Flequillo invisible", "Flequillo con trenzas"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué hábito ayuda a mantener el cabello saludable?",
                options = listOf("Lavarlo todos los días con agua caliente", "Dormir con el pelo mojado", "Cepillarlo con suavidad y usar productos adecuados", "Usar laca a diario"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de corte es ideal para cabellos con mucho volumen?",
                options = listOf("Corte en capas", "Corte recto", "Corte pixie", "Carré corto"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el riesgo de aplicar decoloración sin conocimiento?",
                options = listOf("Cabello más brillante", "Aroma fuerte", "Daño severo al cabello y cuero cabelludo", "Color perfecto garantizado"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es una línea de corte en peluquería?",
                options = listOf("Una raya dibujada con lápiz", "Una referencia visual para guiar el corte", "Una mecha sin cortar", "Una técnica para peinar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de peine se recomienda para aplicar tintura?",
                options = listOf("Peine de dientes anchos", "Peine con punta fina", "Peine redondo", "Peine metálico grueso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué corte suele resaltar los rasgos de un rostro alargado?",
                options = listOf("Corte largo recto", "Capas cortas y flequillo", "Rapado lateral", "Corte militar"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué instrumento es ideal para perfilar la barba o nuca con precisión?",
                options = listOf("Tijera", "Cepillo", "Máquina con peine largo", "Navaja o trimmer fino"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué aspecto influye al elegir un corte de cabello?",
                options = listOf("Forma del rostro y tipo de cabello", "Precio del shampoo", "Cantidad de toallas", "Color del secador"),
                correctIndex = 0
            )
        ),

        //************************************************************************************************************************

        "Decoración de interiores" to listOf(
            QuizQuestion(
                question = "¿Qué es el estilo minimalista en decoración?",
                options = listOf("Uso excesivo de colores", "Ambientes con pocos elementos, funcionales y ordenados", "Decoración con muchos adornos", "Diseños rústicos con madera natural"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué color se considera neutro en decoración?",
                options = listOf("Verde lima", "Rojo", "Gris", "Violeta"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una función principal de la iluminación en el diseño interior?",
                options = listOf("Reducir el consumo de agua", "Cambiar el color de los muebles", "Crear ambientes y resaltar espacios", "Evitar que se ensucie la casa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se busca con el feng shui en decoración?",
                options = listOf("Maximizar el espacio físico", "Mejorar el flujo de energía y armonía", "Agregar plantas artificiales", "Evitar usar madera"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de muebles son ideales para espacios pequeños?",
                options = listOf("Muebles grandes y oscuros", "Muebles multifuncionales y claros", "Muebles ornamentados", "Muebles fijos y pesados"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa el término 'paleta de colores' en decoración?",
                options = listOf("La pintura usada para un cuadro", "El menú de un restaurante", "Conjunto de colores seleccionados para un ambiente", "La gama de perfumes del hogar"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento suele dar sensación de amplitud en un ambiente?",
                options = listOf("Alfombras pequeñas", "Espejos", "Cortinas gruesas", "Cuadros grandes"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se busca al aplicar texturas diferentes en un mismo ambiente?",
                options = listOf("Uniformidad", "Disminuir la luz", "Agregar profundidad y riqueza visual", "Reducir la temperatura"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo combina elementos antiguos con modernos?",
                options = listOf("Estilo escandinavo", "Vintage", "Contemporáneo", "Industrial"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de iluminación es más recomendable para una sala de estar?",
                options = listOf("Fría y directa", "Natural y cálida", "Oscura e indirecta", "Azul y puntual"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe tener en cuenta al colgar cuadros en una pared?",
                options = listOf("El color del techo", "La dirección del sol", "La proporción y altura respecto al mobiliario", "El peso de los muebles cercanos"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una ventaja de usar plantas naturales en el interior?",
                options = listOf("Aumentan el polvo", "Reducen oxígeno", "Mejoran el aire y aportan vida al ambiente", "Dificultan la limpieza"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué estilo es conocido por usar madera, cuero y hierro en ambientes rústicos?",
                options = listOf("Minimalista", "Bohemio", "Industrial", "Colonial"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué característica tiene el estilo escandinavo?",
                options = listOf("Colores vibrantes y pesados", "Espacios recargados", "Simplicidad, colores claros y funcionalidad", "Decoración barroca"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de piso es más cálido para una habitación?",
                options = listOf("Cerámico", "Porcelanato", "Madera o flotante", "Piedra natural"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple una alfombra en decoración?",
                options = listOf("Evitar que se mojen los muebles", "Reducir la electricidad", "Delimitar espacios y dar confort", "Aumentar el ruido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ventaja tiene pintar las paredes de blanco?",
                options = listOf("Se ensucian menos", "Reduce el calor", "Amplía visualmente los espacios", "Absorbe humedad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda al decorar una habitación infantil?",
                options = listOf("Evitar colores", "Colocar muebles pesados", "Usar colores vivos y materiales seguros", "Colocar adornos frágiles"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué objeto puede funcionar como punto focal en una habitación?",
                options = listOf("Una silla común", "Una lámpara llamativa o un cuadro central", "Un enchufe", "Una puerta interior"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el mobiliario modular?",
                options = listOf("Muebles fijos", "Muebles que se adaptan y combinan en distintas configuraciones", "Muebles de metal", "Muebles usados para exteriores"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para lograr un ambiente acogedor?",
                options = listOf("Usar luces frías", "Evitar textiles", "Incluir iluminación cálida y texturas suaves", "Pintar todo de negro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos elementos ayuda a mejorar la acústica de una habitación?",
                options = listOf("Pisos cerámicos", "Cortinas gruesas y alfombras", "Ventanas abiertas", "Lámparas de techo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué significa el concepto de 'open concept'?",
                options = listOf("Separar espacios con muros", "Usar colores oscuros", "Ambientes integrados sin divisiones físicas", "Ambientes sin ventanas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué material es ideal para dar un toque natural a un espacio?",
                options = listOf("Plástico", "Vidrio esmerilado", "Madera", "Acrílico brillante"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una tendencia actual en decoración?",
                options = listOf("Recargar espacios", "Colores chillones", "Uso de materiales reciclados y sostenibles", "Ignorar la iluminación"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se logra con una buena distribución del mobiliario?",
                options = listOf("Mayor desorden", "Espacios incómodos", "Mejor circulación y funcionalidad", "Reducción del espacio visual"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de lámpara es ideal para generar una atmósfera relajada?",
                options = listOf("Lámpara LED fría", "Lámpara colgante intensa", "Luz cálida tenue como lámpara de mesa", "Foco blanco directo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué textura se asocia con sensación de calidez?",
                options = listOf("Metal", "Vidrio", "Madera o lana", "Azulejo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un error común al decorar un ambiente pequeño?",
                options = listOf("Usar espejos", "Colores claros", "Saturarlo de muebles y objetos", "Muebles multifunción"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda para dar mayor altura visual a una habitación?",
                options = listOf("Pintar el techo de color oscuro", "Usar cortinas desde el techo hasta el suelo", "Poner muebles bajos", "Colgar cuadros en el piso"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es una mesa auxiliar?",
                options = listOf("Mesa principal del comedor", "Mesa de jardín", "Mesa pequeña usada como soporte decorativo o funcional", "Mesa fija de madera maciza"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una función de los cojines en decoración?",
                options = listOf("Molestar visualmente", "Agregar textura, color y confort", "Sostener cuadros", "Reflejar la luz"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de decoración se caracteriza por su libertad y mezcla de colores y estilos?",
                options = listOf("Minimalismo", "Estilo clásico", "Estilo bohemio", "Estilo escandinavo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué elemento se usa comúnmente para dividir ambientes sin construir muros?",
                options = listOf("Papel tapiz", "Biombos, estanterías abiertas o plantas grandes", "Cuadros", "Cortinas pesadas de terciopelo"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe evitar al elegir una lámpara para lectura?",
                options = listOf("Que sea ajustable", "Luz cálida", "Ubicación lateral", "Luz tenue o insuficiente"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué estilo se caracteriza por líneas rectas, tonos neutros y funcionalidad?",
                options = listOf("Barroco", "Contemporáneo", "Art déco", "Bohemio"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un cabecero tapizado?",
                options = listOf("Una alfombra", "Una mesa antigua", "El respaldo acolchado y decorativo de una cama", "Una lámpara de pie"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple un espejo grande en una pared?",
                options = listOf("Disminuir la luz", "Cargar el ambiente", "Multiplicar visualmente el espacio", "Hacer ruido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se debe considerar al decorar una oficina en casa?",
                options = listOf("Colores oscuros y muchos adornos", "Buena iluminación, ergonomía y orden", "Muebles fijos y pesados", "Estilo gótico"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se busca al crear un punto focal en una habitación?",
                options = listOf("Un objeto que capte la atención y dé identidad al espacio", "Evitar el color", "Distraer la vista del mobiliario", "Eliminar la iluminación"),
                correctIndex = 0
            )
        ),

        //************************************************************************************************************************

        "Damas" to listOf(
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
        ),

        //************************************************************************************************************************

        "Bonsái" to listOf(
            QuizQuestion(
                question = "¿Qué es un bonsái?",
                options = listOf("Una planta tropical", "Un árbol en miniatura cultivado en maceta", "Un tipo de cactus", "Un estilo de pintura japonesa"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿De qué país proviene la tradición del bonsái?",
                options = listOf("China", "Corea", "Japón", "Vietnam"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es uno de los objetivos del bonsái?",
                options = listOf("Que dé frutos grandes", "Imitar la forma de un árbol maduro en la naturaleza", "Lograr flores coloridas", "Que crezca lo más alto posible"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta es común en el cuidado de bonsáis?",
                options = listOf("Tijeras de podar pequeñas", "Martillo", "Paleta de albañil", "Pico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué función cumple el alambrado en el bonsái?",
                options = listOf("Fijar el árbol a la maceta", "Guiar el crecimiento de ramas y tronco", "Evitar que florezca", "Medir la humedad"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de tierra se usa frecuentemente en bonsáis?",
                options = listOf("Tierra negra común", "Tierra con fertilizante universal", "Sustrato drenante como akadama", "Arena gruesa de construcción"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Por qué es importante el drenaje en una maceta de bonsái?",
                options = listOf("Evita que la planta florezca", "Facilita el alambrado", "Previene el encharcamiento y la pudrición de raíces", "Hace crecer más rápido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cada cuánto se debe podar un bonsái en promedio?",
                options = listOf("Cada semana", "Una vez al año", "Depende de la especie y la estación", "Nunca se poda"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué indica que un bonsái está saludable?",
                options = listOf("Hojas secas y amarillas", "Crecimiento vigoroso, hojas verdes y raíces fuertes", "Pérdida de hojas", "Tronco blando"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué parte del bonsái se poda para mantener la forma?",
                options = listOf("Raíces solamente", "Ramas y hojas", "Flores", "Sólo el tronco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es un bonsái estilo 'chokkan'?",
                options = listOf("De copa plana", "De ramas colgantes", "De tronco recto y vertical", "En forma de cascada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa la palabra japonesa 'bonsái'?",
                options = listOf("Árbol pequeño", "Naturaleza viva", "Árbol plantado en bandeja", "Hoja decorativa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué debe hacerse antes de trasplantar un bonsái?",
                options = listOf("Pintar la maceta", "Quitarle todas las hojas", "Reducir el riego y preparar el nuevo sustrato", "Dejarlo al sol directo varios días"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un error común al comenzar con bonsáis?",
                options = listOf("Usar poca agua", "No podar nunca", "Colocarlo en sombra total o regarlo en exceso", "Cambiar de maceta seguido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué sucede si no se poda un bonsái regularmente?",
                options = listOf("Crece más sano", "Mantiene su forma", "Pierde su estética y se descontrola el crecimiento", "Se convierte en una flor"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos árboles es común en bonsáis?",
                options = listOf("Roble", "Manzano", "Pino", "Álamo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de luz necesita la mayoría de los bonsáis?",
                options = listOf("Luz fluorescente", "Sombra total", "Luz natural indirecta o sol directo según especie", "Oscuridad continua"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una maceta adecuada para bonsái?",
                options = listOf("Profunda y ancha", "Alta y cerrada", "Plana y con buen drenaje", "De plástico sin agujeros"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hace el pinzado en un bonsái?",
                options = listOf("Fortalece el tronco", "Estimula la brotación y controla el tamaño", "Limpia las raíces", "Elimina la corteza"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué aspecto del bonsái se busca imitar con su diseño?",
                options = listOf("Un arbusto sin forma", "Un árbol anciano y equilibrado en la naturaleza", "Una planta de interior", "Un adorno moderno"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Cuál es la mejor época para trasplantar la mayoría de los bonsáis?",
                options = listOf("Verano", "Invierno", "Primavera", "Otoño"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué ocurre si el sustrato no drena bien?",
                options = listOf("Las raíces se fortalecen", "La planta florece más", "Puede producirse pudrición de raíces", "El bonsái crece más rápido"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se utiliza para modelar las ramas en bonsái?",
                options = listOf("Alambres de cobre o aluminio", "Hilos de lana", "Cintas adhesivas", "Clips metálicos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de corte se hace al podar una rama gruesa?",
                options = listOf("En espiral", "En diagonal limpia y con sellado", "Corte en cruz", "Corte horizontal irregular"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué es el jin en bonsái?",
                options = listOf("Una técnica de injerto", "Una parte del riego", "Un estilo de rama muerta decorativa", "Una enfermedad"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué función cumple el musgo en la base del bonsái?",
                options = listOf("Solo estética", "Conserva la humedad y embellece", "Evita que crezca", "Sirve como fertilizante"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para recortar raíces?",
                options = listOf("Tijera de raíces", "Pala de jardín", "Cuchillo de cocina", "Pinza de depilar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué sucede si se alambran mal las ramas?",
                options = listOf("Nada", "Se fortalecen", "Pueden dañarse o dejar marcas permanentes", "Pierden hojas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una señal de que el bonsái necesita trasplante?",
                options = listOf("Crecimiento excesivo", "Falta de brotes nuevos", "Raíces sobresaliendo de la maceta", "Ramas largas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de riego es más adecuado para bonsái?",
                options = listOf("Riego por inmersión ocasional", "Riego constante por goteo", "Rociado superficial", "Dejarlo secar por semanas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es un error común en principiantes al alambrar?",
                options = listOf("Usar alambre de aluminio", "Quitar el alambre después de una semana", "Apretar demasiado el alambre", "Usar alambre en invierno"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuánto tiempo puede tomar darle forma a un bonsái?",
                options = listOf("Unos días", "Semanas", "Meses o incluso años", "Unas pocas horas"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué es el nebari en el bonsái?",
                options = listOf("Una técnica de poda", "La base visible de las raíces en la superficie", "Una plaga común", "El nombre japonés de una maceta"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué árbol es ideal para principiantes en bonsái?",
                options = listOf("Ficus", "Olivo", "Cerezo", "Secuoya"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer si el bonsái pierde muchas hojas?",
                options = listOf("Regarlo menos", "Exponerlo al sol directo fuerte", "Revisar riego, luz y raíces", "Pintar las hojas con spray"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es el propósito del defoliado en algunos bonsáis?",
                options = listOf("Eliminar plagas", "Favorecer brotes nuevos más pequeños", "Cambiar el color de las hojas", "Acelerar la floración"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué debe tener una maceta adecuada para bonsái?",
                options = listOf("Brillo estético", "Profundidad extra", "Agujeros de drenaje", "Color oscuro"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué tipo de agua es preferible para regar un bonsái?",
                options = listOf("Agua con cloro", "Agua dura de canilla", "Agua de lluvia o declorada", "Agua gaseosa"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es un beneficio emocional de cuidar bonsáis?",
                options = listOf("Ayuda a competir", "Reduce el estrés y fomenta la paciencia", "Genera adrenalina", "Desarrolla fuerza física"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede indicar que el bonsái está recibiendo demasiada agua?",
                options = listOf("Hojas secas", "Tierra extremadamente seca", "Hojas amarillentas y blandas", "Raíces largas por fuera"),
                correctIndex = 2
            )
        ),

        //************************************************************************************************************************

        "Sudoku" to listOf(
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
        ),

        //************************************************************************************************************************

        "Sopa de letras" to listOf(
            QuizQuestion(
                question = "¿Qué es una sopa de letras?",
                options = listOf("Un juego donde se forman palabras con letras al azar", "Un crucigrama complicado", "Una receta con letras", "Un sudoku con letras"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el objetivo principal de la sopa de letras?",
                options = listOf("Tachar todas las letras", "Formar frases", "Encontrar palabras ocultas en una cuadrícula", "Rellenar con nuevas letras"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿En qué direcciones pueden aparecer las palabras?",
                options = listOf("Solo de arriba hacia abajo", "Solo de izquierda a derecha", "En múltiples direcciones: horizontal, vertical y diagonal", "En sentido horario únicamente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué habilidad estimula jugar sopa de letras?",
                options = listOf("Memoria a largo plazo", "Coordinación motora fina", "Atención visual y concentración", "Pensamiento abstracto matemático"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una buena estrategia para comenzar una sopa de letras?",
                options = listOf("Tachar letras al azar", "Buscar palabras largas primero", "Tapar la cuadrícula", "Empezar por las esquinas solamente"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué sucede si una palabra se encuentra en diagonal invertida?",
                options = listOf("No se puede marcar", "Está mal colocada", "Es válida si está en la lista", "Debe ignorarse"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál de estos es un error común al resolver una sopa de letras?",
                options = listOf("Marcar una palabra que no está en la lista", "Buscar palabras con calma", "Tachar con lápiz", "Usar colores distintos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué beneficio cognitivo aporta jugar regularmente a sopas de letras?",
                options = listOf("Aumenta la creatividad", "Mejora la orientación espacial", "Desarrolla el reconocimiento visual y vocabulario", "Enseña gramática avanzada"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Es posible crear sopas de letras temáticas?",
                options = listOf("No, siempre son aleatorias", "Solo en aplicaciones premium", "Sí, con palabras de un tema específico", "Solo con números"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué hace más desafiante una sopa de letras?",
                options = listOf("Tener muchas palabras repetidas", "Tener letras con colores", "Tener palabras ocultas en muchas direcciones", "Tener una cuadrícula vacía"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué parte del cerebro se activa especialmente con este juego?",
                options = listOf("Corteza auditiva", "Hipotálamo", "Lóbulo parietal y occipital (asociados a lo visual)", "Cerebelo"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo puede aumentar la dificultad de una sopa de letras?",
                options = listOf("Usando letras mayúsculas solamente", "Usando palabras más largas o con letras similares", "Quitando el reloj", "Dejando espacios en blanco"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué se debe hacer cuando se encuentra una palabra?",
                options = listOf("Borrarla del tablero", "Subrayarla o encerrarla", "Cambiarla por otra", "Tacharla con tinta roja"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué característica tiene una buena sopa de letras educativa?",
                options = listOf("Palabras sin relación", "Temática clara y palabras útiles", "Solo palabras en desorden", "Números mezclados con letras"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué tipo de letra se suele usar en las sopas de letras?",
                options = listOf("Cursiva decorativa", "Gótica", "Mayúscula legible y uniforme", "Tipografía manuscrita"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cómo suelen marcarse las palabras encontradas en formato impreso?",
                options = listOf("Tachándolas con una X", "Encerrándolas en un círculo o línea", "Pegando un sticker", "Subrayándolas con corrector"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué ocurre si la misma palabra aparece más de una vez?",
                options = listOf("Debe marcarse solo una vez", "Es un error del creador", "Puede marcarse todas las veces que aparece", "No cuenta si se repite"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué variante se puede usar para aumentar la diversión?",
                options = listOf("Sopa de letras musical", "Sopa de letras con pistas en lugar de palabras", "Sopa de letras sin letras", "Sudoku combinado"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué rol cumple la lista de palabras al costado del juego?",
                options = listOf("Decora el tablero", "Sirve como referencia para buscar las palabras", "Marca el puntaje", "Indica el orden del alfabeto"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede mejorar el rendimiento en sopas de letras?",
                options = listOf("Mirar una sola vez la cuadrícula", "Leer en voz alta", "Practicar con frecuencia", "Resolverlas con música fuerte"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer si no encontrás una palabra?",
                options = listOf("Pasar a otra y volver después", "Borrar todo", "Cerrar el juego", "Tachar cualquier palabra similar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué mejora la capacidad para encontrar palabras rápidamente?",
                options = listOf("Ver series", "Practicar sopas de letras regularmente", "Hacer ejercicio físico", "Resolver ecuaciones"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué suele suceder con palabras cortas en una sopa de letras?",
                options = listOf("Son más difíciles de encontrar", "Están en negrita", "No se incluyen", "Están repetidas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué formato suelen tener las sopas de letras digitales?",
                options = listOf("Interactivo y con opción de resaltar", "Papel cuadriculado escaneado", "Texto plano", "Aplicación de cocina"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué variante incluye tiempo límite para resolver?",
                options = listOf("Sopa competitiva", "Sopa exprés o cronometrada", "Sopa extendida", "Sopa de desafío"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué puede hacer más fácil resolver una sopa de letras compleja?",
                options = listOf("Conocer bien las palabras del tema", "Tener una calculadora", "Rotar el tablero", "Eliminar letras sobrantes"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué diferencia a una sopa de letras en inglés de una en español?",
                options = listOf("Nada", "Número de letras del alfabeto", "Dirección de lectura y estructura gramatical", "Cantidad de vocales solamente"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Cuál es una buena práctica al final del juego?",
                options = listOf("Contar las palabras marcadas y revisar si falta alguna", "Romper el papel", "Guardar el lápiz", "Cortar la hoja en tiras"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué alternativa tecnológica permite crear sopas personalizadas?",
                options = listOf("Google Maps", "Editores en línea como PuzzleMaker", "Spotify", "Photoshop"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué pasa si te concentrás demasiado tiempo sin descanso?",
                options = listOf("Ves mejor", "Podés perder eficacia visual y cansarte", "Resolvés más rápido", "Ganas puntos extra"),
                correctIndex = 1
            ),
            QuizQuestion(
                question = "¿Qué podés hacer para entrenar el reconocimiento de patrones visuales?",
                options = listOf("Hacer sopas de letras", "Escuchar música", "Leer en voz alta", "Hacer flexiones"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué forma tienen usualmente las cuadrículas de sopa de letras?",
                options = listOf("Rectangular o cuadrada", "Triangular", "Circular", "Aleatoria"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué podés hacer si no entendés el significado de una palabra en la lista?",
                options = listOf("Buscarla en un diccionario", "Ignorarla", "Tacharla de la lista", "Inventar otra"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué ventaja tiene una sopa temática educativa?",
                options = listOf("Aprendés vocabulario específico mientras jugás", "Tiene más letras", "Dura menos tiempo", "No se puede resolver"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué permite desarrollar la práctica frecuente de sopas de letras en niños?",
                options = listOf("Ortografía, atención y vocabulario", "Habilidades culinarias", "Conocimiento musical", "Técnicas de dibujo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué variante permite incluir imágenes en lugar de palabras escritas?",
                options = listOf("Sopa pictográfica", "Sopa con íconos", "Sopa visual", "Sopa ilustrada"),
                correctIndex = 3
            ),
            QuizQuestion(
                question = "¿Qué acción no debe hacerse en una sopa de letras?",
                options = listOf("Tachar palabras que no están en la lista", "Marcar solo con lápiz", "Revisar la lista", "Leer palabra por palabra"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué parte del proceso es clave para mantener la concentración?",
                options = listOf("Evitar distracciones y trabajar en silencio", "Leer en voz alta", "Tener hambre", "Hacer otra cosa al mismo tiempo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa que una sopa esté 'cargada'?",
                options = listOf("Tiene muchas palabras y letras similares", "Está en una app", "Tiene trucos ocultos", "Requiere energía para abrirse"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una variante cooperativa de sopa de letras?",
                options = listOf("Resolución en equipo donde cada uno busca palabras distintas", "Juego solitario", "Doble sopa espejo", "Desafío oculto"),
                correctIndex = 0
            )
        ),

        //************************************************************************************************************************

        "Bingo" to listOf(
            QuizQuestion(
                question = "¿Qué es el Bingo?",
                options = listOf("Un juego de azar donde se marcan números en un cartón", "Un deporte de precisión", "Una ruleta de colores", "Un juego de cartas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cómo se eligen los números en el Bingo tradicional?",
                options = listOf("Al azar, mediante un bolillero", "Por turnos entre los jugadores", "Por votación", "Mediante dados"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué objetivo tiene el jugador en el Bingo?",
                options = listOf("Cantar Bingo antes que los demás", "Acumular más puntos", "Evitar bolillas repetidas", "Llenar la tabla sin errores"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se grita cuando un jugador gana?",
                options = listOf("¡Gol!", "¡Victoria!", "¡Bingo!", "¡Acierto!"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué herramienta se usa para extraer los números?",
                options = listOf("Bolillero", "Cronómetro", "Tablero digital", "Dado especial"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pasa si se canta Bingo erróneamente?",
                options = listOf("Se revisa el cartón y puede ser descalificado", "Se repite la ronda", "Gana automáticamente", "Debe volver a empezar"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cómo suelen estar organizados los cartones de Bingo?",
                options = listOf("En filas y columnas con números", "Con letras y emojis", "Solo números impares", "En forma de rompecabezas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué variante es común en el Bingo?",
                options = listOf("Línea, dos líneas y cartón lleno", "Tablero invertido", "Formación en zigzag", "Cantar de a dos bolillas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué letras acompañan a los números en el Bingo americano?",
                options = listOf("B-I-N-G-O", "A-E-I-O-U", "L-O-T-E-R", "S-U-E-R-T"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué emoción suele generar el Bingo?",
                options = listOf("Suspenso y diversión", "Enojo", "Tristeza", "Frustración matemática"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se puede usar para marcar los números en el cartón?",
                options = listOf("Tinta, fichas o lapicera", "Tijeras", "Dados", "Cinta adhesiva"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué sucede si dos personas cantan Bingo al mismo tiempo?",
                options = listOf("Ganan ambas si tienen razón", "Se anula el juego", "Gana el que gritó más fuerte", "Se repite la partida"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es el número tradicionalmente asociado con 'La edad de Cristo'?",
                options = listOf("33", "21", "40", "12"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué representa el número 90 en la lotería tradicional?",
                options = listOf("El abuelo", "El miedo", "La vejez", "La fortuna"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué significa que un cartón esté 'lleno'?",
                options = listOf("Que se marcaron todos los números", "Que está mal impreso", "Que no se puede jugar más", "Que contiene errores"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué variante del juego se juega mucho en eventos benéficos?",
                options = listOf("Bingo solidario", "Bingo por tiempo", "Bingo en silencio", "Bingo escondido"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿En qué país se originó el Bingo moderno?",
                options = listOf("Italia", "Estados Unidos", "Francia", "España"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué puede usarse como premio en una partida de Bingo informal?",
                options = listOf("Comida, juguetes o dinero", "Títulos académicos", "Vacaciones", "Puntajes digitales"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué suele decir el locutor al sacar cada bolilla?",
                options = listOf("El número y su letra correspondiente", "Solo la letra", "Solo la cifra", "La suma de varias bolillas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estos juegos se parece más al Bingo?",
                options = listOf("Lotería", "Poker", "Dominó", "Dados"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué aspecto genera mayor emoción en una partida de Bingo?",
                options = listOf("La cercanía a completar el cartón", "El número inicial", "La duración del juego", "El color de las fichas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa tener 'una línea' en Bingo?",
                options = listOf("Completar una fila horizontal", "Completar el cartón entero", "Tener cinco números iguales", "Cantar dos veces"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pasa si nadie gana en varias rondas?",
                options = listOf("Se sigue hasta que alguien lo haga", "Se anula la partida", "Se suman los cartones", "Se sortea el premio"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué letra corresponde al número 75 en el Bingo americano?",
                options = listOf("O", "G", "B", "N"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una estrategia común al jugar Bingo?",
                options = listOf("Prestar atención constante a los números llamados", "Pedir ayuda a otro jugador", "Marcar todos los números posibles", "Usar un solo cartón siempre"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué se recomienda hacer si se juega con varios cartones?",
                options = listOf("Organizarlos para no confundirse", "Tenerlos desordenados", "Marcar con dos colores diferentes", "Cantar antes de tiempo"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué sucede si no se marca un número llamado?",
                options = listOf("Se puede perder la oportunidad de ganar", "Se repite automáticamente", "No importa", "Se suma al puntaje"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué rol cumple el locutor en el Bingo?",
                options = listOf("Canta los números y mantiene el ritmo del juego", "Entrega los cartones", "Cuenta los puntos", "Arma las reglas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cómo se llama el recipiente donde giran las bolillas?",
                options = listOf("Bolillero", "Tambor musical", "Contenedor de puntos", "Cilindro lógico"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué beneficio social tiene el Bingo?",
                options = listOf("Fomenta la interacción y el entretenimiento grupal", "Mejora la fuerza física", "Desarrolla habilidades de dibujo", "Fomenta el aislamiento"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué puede dificultar una partida de Bingo digital?",
                options = listOf("Conexión lenta o errores en la app", "Tener buena vista", "Usar muchos cartones", "Falta de fichas físicas"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de premios pueden encontrarse en Bingos grandes?",
                options = listOf("Dinero en efectivo, electrodomésticos o autos", "Libros usados", "Certificados de nacimiento", "Fichas de ajedrez"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál de estas no es una variante del Bingo?",
                options = listOf("Bingo inverso", "Bingo en forma de X", "Bingo japonés zen", "Bingo blackout"),
                correctIndex = 2
            ),
            QuizQuestion(
                question = "¿Qué se hace si hay un error al cantar el número?",
                options = listOf("Se corrige inmediatamente", "Se reinicia la partida", "Se ignora", "Se cancela el cartón ganador"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Cuál es una razón común para que personas mayores jueguen Bingo?",
                options = listOf("Socializar y ejercitar la mente", "Prepararse para concursos", "Ganar mucho dinero", "Practicar números romanos"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué significa 'Bingo blackout'?",
                options = listOf("Cartón completo, se deben marcar todos los números", "Solo se marcan los pares", "Juego sin bolillero", "Cartón con una sola línea"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué emoción puede provocar estar a un número del Bingo?",
                options = listOf("Ansiedad y emoción intensa", "Desinterés", "Olvido", "Confusión matemática"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué tipo de concentración requiere el Bingo?",
                options = listOf("Visual y auditiva", "Física", "Mecánica", "Olfativa"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué pasa si te distraés durante una partida?",
                options = listOf("Podés perder números importantes", "Te dan otro cartón", "Ganás por sorpresa", "Nada cambia"),
                correctIndex = 0
            ),
            QuizQuestion(
                question = "¿Qué otro nombre se le da al 'Bingo' en algunos países?",
                options = listOf("Lotería", "Tómbola", "Banca", "Dominó numérico"),
                correctIndex = 1
            )
        )
    )
}