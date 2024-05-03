package com.alexis.moviesapp.data.core

import com.alexis.moviesapp.data.core.Constants.AUTHORIZATION // Importa la constante AUTHORIZATION.
import com.alexis.moviesapp.data.core.Constants.TOKEN // Importa la constante TOKEN.
import okhttp3.Interceptor // Importa la interfaz Interceptor de OkHttp.
import okhttp3.Response // Importa la clase Response de OkHttp.
import javax.inject.Inject // Importa la anotación Inject de javax para la inyección de dependencias.

// Define una clase AuthInterceptor que implementa la interfaz Interceptor.
class AuthInterceptor @Inject constructor() : Interceptor {

    // Sobrescribe el método intercept para interceptar las peticiones HTTP.
    override fun intercept(chain: Interceptor.Chain): Response {
        // Crea una nueva petición añadiendo el encabezado de autorización con el token.
        val request = chain.request().newBuilder().header(AUTHORIZATION, TOKEN).build()
        // Continúa con la cadena de peticiones HTTP y devuelve la respuesta.
        return chain.proceed(request)
    }
}
