package com.example.recycleviews_leccion1.data

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Movie(val nombre: String,
                 val duracion: Int,
                 val genero: String,
                 @DrawableRes val caratula: Int,
                 val sinopsis: String ): Serializable {

    companion object {
        val ACCION: String = "Acción"
        val AVENTURA: String = "Aventura"
        val DEPORTES: String = "Deportes"
        val SUPERHEROES: String = "Superheroes"
        val TERROR: String = "Terror"
    }
}