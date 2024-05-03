package com.alexis.moviesapp.data.retrofit.response

import com.google.gson.annotations.SerializedName

data class MoviePopularResponse(
    @SerializedName("page") val page: Int,            // Número de página de la respuesta
    @SerializedName("results") val movies: List<MovieResponse>  // Lista de películas en la respuesta
)
