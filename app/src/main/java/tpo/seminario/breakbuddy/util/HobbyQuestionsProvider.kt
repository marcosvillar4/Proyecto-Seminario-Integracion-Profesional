package tpo.seminario.breakbuddy.util


/*Hasta ahora esta (mas o menos):
Cocinar / Leer / Fotografía / Pescar / Jardineria / Escuchar música / Canto / Tocar un instrumento musical / Aprender idiomas /  Pintar / Marroquineria /
Modelismo / Hacer ejercicio / Skate / Escalada / Lepidopterologia /
*/

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


        "Marroquineria" to listOf(
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