package com.alexis.moviesapp.data.retrofit.repository

import com.alexis.moviesapp.data.retrofit.response.toDomain
import com.alexis.moviesapp.data.retrofit.service.MoviePopularService
import com.alexis.moviesapp.domain.model.Movie
import com.alexis.moviesapp.domain.repository.IMoviePopularRepository
import javax.inject.Inject

class MoviePopularRepositoryImpl @Inject constructor(
    private val moviePopularService: MoviePopularService
) : IMoviePopularRepository {
    override suspend fun getMovies(): Result<List<Movie>> {
        return try {
            // Llama al servicio para obtener la lista de películas populares
            val response = moviePopularService.getMovies().movies
            // Mapea la respuesta del servicio al dominio de la aplicación y devuelve un Result.success
            Result.success(response.map { it.toDomain() })
        } catch (exception: Throwable) {
            // En caso de error, devuelve un Result.failure con la excepción capturada
            Result.failure(exception)
        }
    }
}
