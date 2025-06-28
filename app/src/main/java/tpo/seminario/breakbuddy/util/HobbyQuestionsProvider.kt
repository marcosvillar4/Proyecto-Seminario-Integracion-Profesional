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