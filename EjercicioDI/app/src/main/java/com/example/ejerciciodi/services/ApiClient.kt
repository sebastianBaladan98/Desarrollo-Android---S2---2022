package com.example.ejerciciodi.services

import retrofit2.Retrofit

class ApiClient() {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://mhw-db.com/")
        .build()

    val monsterService = retrofit.create(MonsterService::class.java)

}