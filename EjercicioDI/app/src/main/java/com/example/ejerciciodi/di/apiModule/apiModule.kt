package com.example.ejerciciodi.di.apiModule

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val apiModule = module {
    singleOf(::ApiClient)
}