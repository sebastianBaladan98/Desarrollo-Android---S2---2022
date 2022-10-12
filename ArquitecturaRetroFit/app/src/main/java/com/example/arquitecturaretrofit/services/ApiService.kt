package com.example.arquitecturaretrofit.services

import com.example.arquitecturaretrofit.models.CharacterResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("characters")
    fun listCharacters(@Query("apikey") apiKey: String,
                       @Query("ts") ts: String,
                       @Query("hash") hash: String,
                       @Query("name") name: String? = null): Call<CharacterResponse>

}