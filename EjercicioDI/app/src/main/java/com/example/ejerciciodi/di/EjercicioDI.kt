package com.example.ejerciciodi.di

import android.app.Application
import com.example.ejerciciodi.di.apiModule.apiModule
import com.example.ejerciciodi.di.network.networkModule
import com.example.ejerciciodi.di.repositories.repositoriesModule
import com.example.ejerciciodi.di.viewModel.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class EjercicioDI : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@EjercicioDI)
            modules(
                listOf(
                    repositoriesModule,
                    viewModelModule,
                    networkModule,
                    apiModule
                )
            )
        }
    }

}