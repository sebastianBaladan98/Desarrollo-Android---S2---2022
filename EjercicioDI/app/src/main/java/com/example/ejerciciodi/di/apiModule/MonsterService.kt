package com.example.ejerciciodi.di.apiModule

import com.example.ejerciciodi.model.Monsters
import retrofit2.Response
import retrofit2.http.GET

interface MonsterService {

    @GET("monsters")
    suspend fun getMonsters(): Response<Monsters>

}