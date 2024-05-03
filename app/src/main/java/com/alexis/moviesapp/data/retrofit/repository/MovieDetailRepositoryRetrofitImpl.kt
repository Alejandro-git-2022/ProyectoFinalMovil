package com.alexis.moviesapp.data.retrofit.repository

import com.alexis.moviesapp.data.retrofit.response.toMovieDetailDomain
import com.alexis.moviesapp.data.retrofit.service.MoviePopularService
import com.alexis.moviesapp.domain.model.MovieDetail
import com.alexis.moviesapp.domain.repository.IMovieDetailRepository
import javax.inject.Inject

class MovieDetailRepositoryRetrofitImpl @Inject constructor(
    private val movieService: MoviePopularService
) : IMovieDetailRepository {
    override suspend fun getDetailMovie(idMovie: Int): Result<MovieDetail> {
        return try {
            // Llama al servicio de películas para obtener los detalles de la película con el id proporcionado
            val response = movieService.getDetailMovie(idMovie)
            // Convierte la respuesta del servicio a un objeto MovieDetail del dominio y la envuelve en un Result.success
            Result.success(response.toMovieDetailDomain())
        } catch (exception: Throwable) {
            // En caso de error, devuelve un Result.failure con la excepción capturada
            Result.failure(exception)
        }
    }
}
