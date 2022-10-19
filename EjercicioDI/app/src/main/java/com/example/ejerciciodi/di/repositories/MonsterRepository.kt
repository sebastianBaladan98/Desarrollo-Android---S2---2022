package com.example.ejerciciodi.di.repositories

import com.example.ejerciciodi.model.Monsters
import com.example.ejerciciodi.services.ApiClient

class MonsterRepository {

    suspend fun getMonsters(): Monsters {
        val monsters = ApiClient.monsterService.getMonsters()
        if (monsters.isSuccessful) {
            return monsters.body()!!
        }
        return Monsters()
    }

}