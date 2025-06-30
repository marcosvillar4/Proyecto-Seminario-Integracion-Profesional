package tpo.seminario.breakbuddy.util


/*Hasta ahora esta (mas o menos):
Natación / Cocinar / Repostería / Leer / Fotografía / Pescar / Jardineria / Escuchar música / Canto / Tocar un instrumento musical / Bailar / Ver películas /
Actuar / Aprender idiomas / Carpinteria / Pintar / Cerámica / Corte y confección / Tejer / Marroquineria / Escultura / Bisutería / Maquillaje profesional /
Videojuegos / Juegos de mesa / Modelismo / Hacer ejercicio / Trekking / Skate / Escalada / Viajar / Camping / Meditar / Astronomía / Avistamiento de aves /
Lepidopterologia /
*/

/*TODAVIA FALTAN: "Manualidades", "Creación de contenido",
        "Andar en bicicleta",  "Armar rompecabezas", ,
        "Escribir", "Bloggear", "Programar", "Diseño gráfico",
        "Correr", , "Ajedrez", ,
        "Voluntariado", "Restaurar muebles","Basket", "Volley", "Golf"
	,"Bordado","Crucigramas",,"Origami",
        , "Dibujo","Coleccionismo","Adiestramiento de animales",,
        ,"Ilusionismo","Crochet","Pilates","Dardos","Tarot",,
        "Caligrafia","Vidrieria artistica","Hacer velas","Poesia","Diseño floral","Arcilla","Manicura",
        "Peluqueria","Decoracion de interiores","Damas", Rummy Burako",
        "Bonsai","Prensado de flores","Sudoku","Sopa de letras","Bingo"*/


object HobbyQuestionsProvider{
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

        //********************************************************************************************************************************

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
        )
    )
}