package com.example.pokeapp.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.pokeapp.data.remote.response.Pokemon
import com.example.pokeapp.repository.PokemonRepository
import com.example.pokeapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}