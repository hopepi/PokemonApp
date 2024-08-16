package com.example.pokeapp.data.remote

import com.example.pokeapp.data.remote.response.Pokemon
import com.example.pokeapp.data.remote.response.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

// Bu arayüz, uygulamamızın Pokemon API'si ile iletişim kurmasını sağlıyor.
interface PokeApi {
    // "pokemon" endpoint'ine GET isteği yaparak Pokemon listesini alıyoruz
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit:Int, // Kaç adet Pokemon listeleneceğini belirleyen parametre.
        @Query("offset") offset:Int // Listelenmeye hangi noktadan başlanacağını belirten parametre.
    ) : PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name :String,
    ): Pokemon
}