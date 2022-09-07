package com.example.recycleviews_leccion1

import androidx.annotation.DrawableRes

data class Movie(val nombre: String,
                 val duracion: Int,
                 val genero: String,
                 @DrawableRes val caratula: Int,
                 val sinopsis: String ) {

    companion object {
        val ACCION: String = "Acción"
        val AVENTURA: String = "Aventura"
        val DEPORTES: String = "Deportes"
        val SUPERHEROES: String = "Superheroes"
        val TERROR: String = "Terror"
    }
}