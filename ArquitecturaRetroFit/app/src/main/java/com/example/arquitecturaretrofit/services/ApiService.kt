package com.example.arquitecturaretrofit.services

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/characters")
    fun listCharacters(@Query("apiKey") apiKey: String)

}