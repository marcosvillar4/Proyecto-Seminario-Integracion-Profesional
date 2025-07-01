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
        "Adiestramiento de Animales" to AdiestramientoAnimalesQuestions.questions,
        "Ajedrez" to AjedrezQuestions.questions,
        "Astronomia" to AstronomiaQuestions.questions,
        "Avistamiento de Aves" to AvistamientoAvesQuestions.questions,
        "Baile" to BaileQuestions.questions,
        "Basket" to BasketQuestions.questions,
        "Andar en Bicicleta" to BicicletaQuestions.questions,
        "Bingo" to BingoQuestions.questions,
        "Bisutería" to BisuteriaQuestions.questions,
        "Bloguear" to BloguearQuestions.questions,
        "Bonsai" to BonsaiQuestions.questions,
        "Bordado" to BordadoQuestions.questions,
        "Caligrafía" to CaligrafiaQuestions.questions,
        "Camping" to CampingQuestions.questions,
        "Canto" to CantoQuestions.questions,
        "Carpintería" to CarpinteriaQuestions.questions,
        "Cerámica" to CeramicaQuestions.questions,
        "Cocinar" to CocinarQuestions.questions,
        "Coleccionismo" to ColeccionismoQuestions.questions,
        "Correr" to CorrerQuestions.questions,
        "Corte Y Confección" to CorteYConfeccionQuestions.questions,
        "Creación Contenido" to CreacionContenidoQuestions.questions,
        "Crochet" to CrochetQuestions.questions,
        "Crucigrama" to CrucigramaQuestions.questions,
        "Damas" to DamasQuestions.questions,
        "Dardos" to DardosQuestions.questions,
        "Decoracion Interiores" to DecoracionInterioresQuestions.questions,
        "Dibujo" to DibujoQuestions.questions,
        "Diseño Gráfico" to DisenioGraficoQuestions.questions,
        "Diseño Floral" to DisenioFloralQuestions.questions,
        "Ejercicio" to EjercicioQuestions.questions,
        "Escalada" to EscaladaQuestions.questions,
        "Escribir" to EscribirQuestions.questions,
        "Escuchar Música" to EscuchaMusicaQuestions.questions,
        "Escultura" to EsculturaQuestions.questions,
        "Fotografía" to FotografiaQuestions.questions,
        "Golf" to GolfQuestions.questions,
        "Idiomas" to IdiomasQuestions.questions,
        "Ilusionismo" to IlusionismoQuestions.questions,
        "Instrumento" to InstrumentoQuestions.questions,
        "Jardinería" to JardineriaQuestions.questions,
        "Juegos de Mesa" to JuegosMesaQuestions.questions,
        "Leer" to LeerQuestions.questions,
        "Lepidopterología" to LepidopterologiaQuestions.questions,
        "Manicura" to ManicuraQuestions.questions,
        "Manualidades" to ManualidadesQuestions.questions,
        "Maquillaje" to MaquillajeQuestions.questions,
        "Marroquinería" to MarroquineriaQuestions.questions,
        "Meditar" to MeditarQuestions.questions,
        "Modelismo" to ModelismoQuestions.questions,
        "Natación" to NatacionQuestions.questions,
        "Origami" to OrigamiQuestions.questions,
        "Peliculas" to PeliculasQuestions.questions,
        "Peluquería" to PeluqueriaQuestions.questions,
        "Pescar" to PescarQuestions.questions,
        "Pilates" to PilatesQuestions.questions,
        "Pintar" to PintarQuestions.questions,
        "Poesia" to PoesiaQuestions.questions,
        "Programar" to ProgramarQuestions.questions,
        "Repostería" to ReposteriaQuestions.questions,
        "Restauración de Muebles" to RestaurarMueblesQuestions.questions,
        "Rompecabezas" to RompecabezasQuestions.questions,
        "Skate" to SkateQuestions.questions,
        "Sopas de Letras" to SopaLetrasQuestions.questions,
        "Sudoku" to SudokuQuestions.questions,
        "Tarot" to TarotQuestions.questions,
        "Tejer" to TejerQuestions.questions,
        "Trekking" to TrekkingQuestions.questions,
        "Velas" to VelasQuestions.questions,
        "Viajar" to ViajarQuestions.questions,
        "Videojuegos" to VideojuegosQuestions.questions,
        "Vidriería Artística" to VidrieriaArtisticaQuestions.questions,
        "Volley" to VolleyQuestions.questions,
        "Voluntariado" to VoluntariadoQuestions.questions
    )
}