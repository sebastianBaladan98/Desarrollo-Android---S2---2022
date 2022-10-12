package com.example.arquitecturaretrofit.services

import retrofit2.Retrofit
import retrofit2.create

object MarvelClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://gateway.marvel.com:443/v1/public")
        .build()

    val service = retrofit.create(ApiService::class.java)


}