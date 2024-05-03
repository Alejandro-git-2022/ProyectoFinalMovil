package com.alexis.moviesapp.data.retrofit.service

import com.alexis.moviesapp.data.retrofit.response.MoviePopularResponse
import com.alexis.moviesapp.data.retrofit.response.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface MoviePopularService {
    // Método GET para obtener la lista de películas populares
    @GET("popular")
    suspend fun getMovies(): MoviePopularResponse

    // Método GET para obtener los detalles de una película específica por su ID
    @GET("{idMovie}")
    suspend fun getDetailMovie(@Path("idMovie") idMovie: Int): MovieResponse

}