package tpo.seminario.breakbuddy.util

import tpo.seminario.breakbuddy.util.questions.*


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
        "Actuar" to ActuarQuestions.questions,
        "Adiestramiento de animales" to AdiestramientoAnimalesQuestions.questions,
        "Ajedrez" to AjedrezQuestions.questions,
        "Astronomía" to AstronomiaQuestions.questions,
        "Avistamiento de aves" to AvistamientoAvesQuestions.questions,
        "Bailar" to BaileQuestions.questions,
        "Basket" to BasketQuestions.questions,
        "Andar en bicicleta" to BicicletaQuestions.questions,
        "Bingo" to BingoQuestions.questions,
        "Bisutería" to BisuteriaQuestions.questions,
        "Bloggear" to BloguearQuestions.questions,
        "Bonsái" to BonsaiQuestions.questions,
        "Bordado" to BordadoQuestions.questions,
        "Caligrafía" to CaligrafiaQuestions.questions,
        "Camping" to CampingQuestions.questions,
        "Canto" to CantoQuestions.questions,
        "Carpintería" to CarpinteriaQuestions.questions,
        "Cerámica" to CeramicaQuestions.questions,
        "Cocinar" to CocinarQuestions.questions,
        "Coleccionismo" to ColeccionismoQuestions.questions,
        "Correr" to CorrerQuestions.questions,
        "Corte y confección" to CorteYConfeccionQuestions.questions,
        "Creación de contenido" to CreacionContenidoQuestions.questions,
        "Crochet" to CrochetQuestions.questions,
        "Crucigramas" to CrucigramaQuestions.questions,
        "Damas" to DamasQuestions.questions,
        "Dardos" to DardosQuestions.questions,
        "Decoración de interiores" to DecoracionInterioresQuestions.questions,
        "Dibujo" to DibujoQuestions.questions,
        "Diseño gráfico" to DisenioGraficoQuestions.questions,
        "Diseño floral" to DisenioFloralQuestions.questions,
        "Ejercicio" to EjercicioQuestions.questions,
        "Escalada" to EscaladaQuestions.questions,
        "Escribir" to EscribirQuestions.questions,
        "Escuchar música" to EscuchaMusicaQuestions.questions,
        "Escultura" to EsculturaQuestions.questions,
        "Fotografía" to FotografiaQuestions.questions,
        "Fútbol" to FutbolQuestions.questions,
        "Golf" to GolfQuestions.questions,
        "Hacer ejercicio" to EjercicioQuestions.questions,
        "Aprender idiomas" to IdiomasQuestions.questions,
        "Ilusionismo" to IlusionismoQuestions.questions,
        "Tocar un instrumento musical" to InstrumentoQuestions.questions,
        "Jardinería" to JardineriaQuestions.questions,
        "Juegos de mesa" to JuegosMesaQuestions.questions,
        "Leer" to LeerQuestions.questions,
        "Lepidopterología" to LepidopterologiaQuestions.questions,
        "Manicura" to ManicuraQuestions.questions,
        "Manualidades" to ManualidadesQuestions.questions,
        "Maquillaje profesional" to MaquillajeQuestions.questions,
        "Marroquinería" to MarroquineriaQuestions.questions,
        "Meditar" to MeditarQuestions.questions,
        "Modelismo" to ModelismoQuestions.questions,
        "Natación" to NatacionQuestions.questions,
        "Origami" to OrigamiQuestions.questions,
        "Ver películas" to PeliculasQuestions.questions,
        "Peluquería" to PeluqueriaQuestions.questions,
        "Pescar" to PescarQuestions.questions,
        "Pilates" to PilatesQuestions.questions,
        "Pintar" to PintarQuestions.questions,
        "Poesía" to PoesiaQuestions.questions,
        "Programar" to ProgramarQuestions.questions,
        "Repostería" to ReposteriaQuestions.questions,
        "Restaurar muebles" to RestaurarMueblesQuestions.questions,
        "Armar rompecabezas" to RompecabezasQuestions.questions,
        "Skate" to SkateQuestions.questions,
        "Sopa de letras" to SopaLetrasQuestions.questions,
        "Sudoku" to SudokuQuestions.questions,
        "Tarot" to TarotQuestions.questions,
        "Tejer" to TejerQuestions.questions,
        "Trekking" to TrekkingQuestions.questions,
        "Hacer velas" to VelasQuestions.questions,
        "Viajar" to ViajarQuestions.questions,
        "Videojuegos" to VideojuegosQuestions.questions,
        "Vidriería artística" to VidrieriaArtisticaQuestions.questions,
        "Volley" to VolleyQuestions.questions,
        "Voluntariado" to VoluntariadoQuestions.questions
    )
}