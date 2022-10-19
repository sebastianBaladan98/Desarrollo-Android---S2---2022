package com.example.ejerciciodi.di

import com.example.ejerciciodi.di.repositories.MonsterRepository
import com.example.ejerciciodi.di.viewModel.MainViewModel
import com.example.ejerciciodi.services.NetworkService
import com.example.ejerciciodi.services.provideOkHttpClient
import com.example.ejerciciodi.services.provideRetrofit
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit


val networkModule = module {
    singleOf(::OkHttpClient) {
        provideOkHttpClient()
    }
    single<Retrofit> {
        provideRetrofit(get())
    }
}

val repositoriesModule = module {
    singleOf(::MonsterRepository)
}

val viewModelModule = module {
    viewModelOf(::MainViewModel)
}

