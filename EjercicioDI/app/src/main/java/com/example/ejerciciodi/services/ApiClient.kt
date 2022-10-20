package com.example.ejerciciodi.services

import retrofit2.Retrofit

class ApiClient(retrofit: Retrofit) {

    val monsterService = retrofit.create(MonsterService::class.java)

}