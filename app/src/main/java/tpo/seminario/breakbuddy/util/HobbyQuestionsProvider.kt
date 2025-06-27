package tpo.seminario.breakbuddy.util

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

        "Cocinar" to listOf(
            QuizQuestion(
                question = "¿A qué temperatura hierve el agua al nivel del mar?",
                options = listOf("90 °C", "95 °C", "100 °C", "105 °C"),
                correctIndex = 2
            )
        ),

        //********************************************************************************************************************************

        "Leer" to listOf(
            QuizQuestion(
                question = "¿Cuál es considerado el libro más leído del mundo?",
                options = listOf("Don Quijote", "La Biblia", "El Principito", "1984"),
                correctIndex = 1
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