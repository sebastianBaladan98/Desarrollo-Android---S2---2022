package com.example.arquitecturaretrofit.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.MessageDigest

object MarvelClient {

    val pubKey = "84c23dbd17b40dc0ae8096009cee2ae1"
    val privKey = "86fe60932198904a2109f642da84fce425a8b144"
    fun String.md5(): ByteArray = MessageDigest.getInstance("MD5").digest(this.toByteArray(Charsets.UTF_8))
    fun ByteArray.toHex() = joinToString(separator = "") { byte -> "%02x".format(byte) }

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://gateway.marvel.com:443/v1/public/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(ApiService::class.java)


}