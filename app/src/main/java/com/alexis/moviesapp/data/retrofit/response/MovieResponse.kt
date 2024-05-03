package com.alexis.moviesapp.data.retrofit.response

import com.alexis.moviesapp.domain.model.Movie
import com.alexis.moviesapp.domain.model.MovieDetail
import com.google.gson.annotations.SerializedName

// Clase de datos que representa la respuesta de una solicitud de información de película
data class MovieResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("original_title") val title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("backdrop_path") val backdropPath: String,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("release_date") val releaseDate: String
)

// Extensión de función que convierte un objeto MovieResponse en un objeto Movie
fun MovieResponse.toDomain() =
    Movie(id, title, overview, backdropPath, posterPath, releaseDate)

// Extensión de función que convierte un objeto MovieResponse en un objeto MovieDetail
fun MovieResponse.toMovieDetailDomain() = MovieDetail(toDomain(), false)
