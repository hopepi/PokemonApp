package com.example.pokeapp.data.remote.response

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: StatX
) {
    val baseStat: Unit
}