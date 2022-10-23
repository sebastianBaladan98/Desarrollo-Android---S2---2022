package com.example.ejerciciodi.di.apiModule

import retrofit2.Retrofit

class ApiClient(retrofit: Retrofit) {

    val monsterService: MonsterService = retrofit.create(MonsterService::class.java)

}