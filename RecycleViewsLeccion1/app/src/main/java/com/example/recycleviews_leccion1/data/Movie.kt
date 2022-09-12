package com.example.recycleviews_leccion1.data

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.DrawableRes
import coil.imageLoader
import coil.request.ImageRequest
import java.time.format.DateTimeFormatter

data class Movie(val nombre: String,
                 val duracion: Int,
                 val genero: String,
                 @DrawableRes val caratula: Int,
                 val sinopsis: String ): Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readString().toString(),
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeInt(duracion)
        parcel.writeString(genero)
        parcel.writeInt(caratula)
        parcel.writeString(sinopsis)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {

        val ACCION: String = "Acción"
        val AVENTURA: String = "Aventura"
        val DEPORTES: String = "Deportes"
        val SUPERHEROES: String = "Superheroes"
        val TERROR: String = "Terror"

        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}