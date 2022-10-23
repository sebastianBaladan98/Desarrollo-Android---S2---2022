package com.example.ejerciciodi.di.repositories

import com.example.ejerciciodi.di.apiModule.ApiClient
import com.example.ejerciciodi.model.Monsters

class MonsterRepository(private val apiClient: ApiClient) {

    suspend fun getMonsters(): Monsters {
        val monsters = apiClient.monsterService.getMonsters()
        if (monsters.isSuccessful) {
            return monsters.body()!!
        }
        return Monsters()
    }

}