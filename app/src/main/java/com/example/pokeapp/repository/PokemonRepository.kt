package com.example.pokeapp.repository

import com.example.pokeapp.data.remote.PokeApi
import com.example.pokeapp.data.remote.response.Pokemon
import com.example.pokeapp.data.remote.response.PokemonList
import com.example.pokeapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api : PokeApi
){
    suspend fun getPokemonList(limit : Int , offset: Int) : Resource<PokemonList>{
        val response = try {
            api.getPokemonList(limit,offset)
        }catch (e : Exception){
            return Resource.Error("Bulunamadı")
        }
        return  Resource.Success(response)
    }
    suspend fun getPokemonInfo(pokemonName : String) : Resource<Pokemon>{
        val response = try {
            api.getPokemonInfo(pokemonName)
        }catch (e : Exception){
            return Resource.Error("Bulunamadı")
        }
        return  Resource.Success(response)
    }
}