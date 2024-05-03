package com.alexis.moviesapp.data.core.di

import android.content.Context
import androidx.room.Room
import com.alexis.moviesapp.data.core.AuthInterceptor
import com.alexis.moviesapp.data.core.Constants.BASE_URL
import com.alexis.moviesapp.data.core.Constants.MOVIE_DATA_BASE_NAME
import com.alexis.moviesapp.data.retrofit.repository.MovieDetailRepositoryRetrofitImpl
import com.alexis.moviesapp.data.retrofit.repository.MoviePopularRepositoryImpl
import com.alexis.moviesapp.data.retrofit.service.MoviePopularService
import com.alexis.moviesapp.data.room.MovieDataBase
import com.alexis.moviesapp.data.room.dao.MovieDao
import com.alexis.moviesapp.data.room.repository.MovieDetailRepositoryRoomImpl
import com.alexis.moviesapp.data.room.repository.MovieRepositoryImpl
import com.alexis.moviesapp.domain.repository.IMovieDetailRepository
import com.alexis.moviesapp.domain.repository.IMoviePopularRepository
import com.alexis.moviesapp.domain.repository.IMovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

@Module // Indica que esta clase es un módulo de Dagger que provee dependencias.
@InstallIn(SingletonComponent::class) // Las dependencias estarán disponibles en el ámbito de la aplicación completa.
object AppModule {

    @Qualifier // Diferencia entre tipos de dependencias similares.
    @Retention(AnnotationRetention.BINARY)
    annotation class MovieDetailRepositoryRetrofit // Anotación personalizada para la implementación Retrofit del repositorio de detalles de películas.

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class MovieDetailRepositoryRoom // Anotación personalizada para la implementación Room del repositorio de detalles de películas.

    @Singleton // La instancia proporcionada será única en toda la aplicación.
    @Provides // Indica que el método siguiente proveerá una instancia de la dependencia especificada.
    fun getRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL) // URL base para las peticiones de Retrofit.
            .client(okHttpClient) // Cliente HTTP personalizado con interceptores.
            .addConverterFactory(GsonConverterFactory.create()) // Convertidor para la serialización de datos.
            .build()
    }

    @Singleton
    @Provides
    fun interceptorOkHttpClient(authInterceptor: AuthInterceptor): OkHttpClient {
        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY) // Interceptor para logging de las peticiones HTTP.
        return OkHttpClient
            .Builder()
            .addInterceptor(interceptor) // Agrega el interceptor de logging.
            .addInterceptor(authInterceptor) // Agrega el interceptor de autenticación.
            .build()
    }

    @Singleton
    @Provides
    fun moviePopularService(retrofit: Retrofit): MoviePopularService {
        return retrofit.create(MoviePopularService::class.java) // Crea una instancia del servicio para las películas populares.
    }

    @Singleton
    @Provides
    fun movieRepository(moviePopularService: MoviePopularService): IMoviePopularRepository {
        return MoviePopularRepositoryImpl(moviePopularService) // Implementación del repositorio para películas populares.
    }

    @MovieDetailRepositoryRetrofit
    @Provides
    @Singleton
    fun provideMovieDetailRepositoryRetrofit(moviePopularService: MoviePopularService): IMovieDetailRepository{
        return MovieDetailRepositoryRetrofitImpl(moviePopularService) // Implementación Retrofit del repositorio de detalles de películas.
    }

    @Singleton
    @Provides
    fun providerRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, MovieDataBase::class.java, MOVIE_DATA_BASE_NAME).build() // Construye la base de datos Room.

    @Singleton
    @Provides
    fun providerMovieDao(dataBase: MovieDataBase) = dataBase.getMovieDao() // Provee una instancia de MovieDao para acceder a la base de datos.

    @Singleton
    @Provides
    fun providerMovieRepository(movieDao: MovieDao): IMovieRepository {
        return MovieRepositoryImpl(movieDao) // Implementación del repositorio para películas.
    }

    @MovieDetailRepositoryRoom
    @Provides
    @Singleton
    fun provideMovieDetailRepositoryRoom(movieDao: MovieDao): IMovieDetailRepository{
        return MovieDetailRepositoryRoomImpl(movieDao) // Implementación Room del repositorio de detalles de películas.
    }

}
