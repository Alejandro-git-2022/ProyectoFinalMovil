package com.alexis.moviesapp.data.core

// Este objeto contiene constantes que se utilizan a lo largo de la aplicación.
object Constants {
    // TOKEN es una constante que almacena el token de autorización para las peticiones API.
    const val TOKEN =
        "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3ODQ3ODU4NTlkYjY2NGZhN2ZmYWJhMGYzNmQ0OGM3ZCIsInN1YiI6IjVjMzRjNDJjMGUwYTI2NTRiZWQ4YzliNSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.VAwb2dB69P72JXKo1ady1l4zp-vy1dsCS3XP-cGE6fY"

    // AUTHORIZATION es el nombre del encabezado utilizado para pasar el token de autorización en las peticiones HTTP.
    const val AUTHORIZATION = "Authorization"

    // BASE_URL es la URL base de la API de The Movie Database (TMDb).
    const val BASE_URL = "https://api.themoviedb.org/3/movie/"

    // MOVIE_DATA_BASE_NAME es el nombre de la base de datos local donde se almacenan los datos de las películas.
    const val MOVIE_DATA_BASE_NAME = "MovieAppDataBase"

    // MOVIE_NOT_FOUND es un mensaje que se muestra cuando una película no se encuentra en la base de datos.
    const val MOVIE_NOT_FOUND = "The movie you are trying to search for is not stored in the database"

    // MOVIE_NOT_COULD es una parte de mensaje que se utiliza para construir mensajes de error.
    private const val MOVIE_NOT_COULD = "The movie could not be "

    // MOVIE_ADDED es un mensaje que indica que una película ha sido agregada.
    const val MOVIE_ADDED = "Added"

    // MOVIE_NOT_ADDED es un mensaje que indica que una película no ha sido agregada.
    const val MOVIE_NOT_ADDED = "$MOVIE_NOT_COULD$MOVIE_ADDED"

    // MOVIE_DELETED es un mensaje que indica que una película ha sido eliminada.
    const val MOVIE_DELETED = "Deleted"

    // MOVIE_NOT_DELETED es un mensaje que indica que una película no ha sido eliminada.
    const val MOVIE_NOT_DELETED = "$MOVIE_NOT_COULD$MOVIE_DELETED"

    // RESPONSE_ERROR_ROOM es un código de error utilizado para indicar un problema con la base de datos Room.
    const val RESPONSE_ERROR_ROOM = 0
}
