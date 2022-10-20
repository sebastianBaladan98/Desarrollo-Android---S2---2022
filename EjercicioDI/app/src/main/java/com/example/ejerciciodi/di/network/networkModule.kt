package com.example.ejerciciodi.di.network

import com.example.ejerciciodi.services.provideOkHttpClient
import com.example.ejerciciodi.services.provideRetrofit
import okhttp3.OkHttpClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


val networkModule = module {
    singleOf(::OkHttpClient) {
        provideOkHttpClient()
    }
    single {
        provideRetrofit(get())
    }
}
