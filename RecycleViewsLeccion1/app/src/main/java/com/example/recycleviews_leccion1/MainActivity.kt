package com.example.recycleviews_leccion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val movies: List<Movie> = listOf(
        Movie("X-Men Apocalypse", 144, Movie.Companion.ACCION, 1, "X-Men" ),
        Movie("X-Men Apocalypse", 144, Movie.Companion.ACCION, 1, "X-Men" ),
        Movie("X-Men Apocalypse", 144, Movie.Companion.ACCION, 1, "X-Men" ),
        Movie("X-Men Apocalypse", 144, Movie.Companion.ACCION, 1, "X-Men" ),
        Movie("X-Men Apocalypse", 144, Movie.Companion.ACCION, 1, "X-Men" ),

        Movie("El Camino", 122, Movie.Companion.ACCION, 1, "Breaking Bad" ),
        Movie("El Camino", 122, Movie.Companion.ACCION, 1, "Breaking Bad" ),
        Movie("El Camino", 122, Movie.Companion.ACCION, 1, "Breaking Bad" ),
        Movie("El Camino", 122, Movie.Companion.ACCION, 1, "Breaking Bad" ),
        Movie("El Camino", 122, Movie.Companion.ACCION, 1, "Breaking Bad" ),

        Movie("Now you see me 2", 130, Movie.Companion.AVENTURA, 1, "Now you see me 2" ),
        Movie("Now you see me 2", 130, Movie.Companion.AVENTURA, 1, "Now you see me 2" ),
        Movie("Now you see me 2", 130, Movie.Companion.AVENTURA, 1, "Now you see me 2" ),
        Movie("Now you see me 2", 130, Movie.Companion.AVENTURA, 1, "Now you see me 2" ),
        Movie("Now you see me 2", 130, Movie.Companion.AVENTURA, 1, "Now you see me 2" ),

        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.Companion.AVENTURA, 1, "Goku unlocks SSG" ),
        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.Companion.AVENTURA, 1, "Goku unlocks SSG" ),
        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.Companion.AVENTURA, 1, "Goku unlocks SSG" ),
        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.Companion.AVENTURA, 1, "Goku unlocks SSG" ),
        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.Companion.AVENTURA, 1, "Goku unlocks SSG" ),

        Movie("Concussion", 123, Movie.Companion.DEPORTES, 1, "A movie about American Football" ),
        Movie("Concussion", 123, Movie.Companion.DEPORTES, 1, "A movie about American Football" ),
        Movie("Concussion", 123, Movie.Companion.DEPORTES, 1, "A movie about American Football" ),
        Movie("Concussion", 123, Movie.Companion.DEPORTES, 1, "A movie about American Football" ),
        Movie("Concussion", 123, Movie.Companion.DEPORTES, 1, "A movie about American Football" ),

        Movie("Hulk", 138, Movie.Companion.SUPERHEROES, 1, "A movie about the Marvel superhero, The Hulk" ),
        Movie("Hulk", 138, Movie.Companion.SUPERHEROES, 1, "A movie about the Marvel superhero, The Hulk" ),
        Movie("Hulk", 138, Movie.Companion.SUPERHEROES, 1, "A movie about the Marvel superhero, The Hulk" ),
        Movie("Hulk", 138, Movie.Companion.SUPERHEROES, 1, "A movie about the Marvel superhero, The Hulk" ),
        Movie("Hulk", 138, Movie.Companion.SUPERHEROES, 1, "A movie about the Marvel superhero, The Hulk" ),

        Movie("The Ecualizer", 121, Movie.Companion.ACCION, 1, "Movie The Ecualizer" ),
        Movie("The Ecualizer", 121, Movie.Companion.ACCION, 1, "Movie The Ecualizer" ),
        Movie("The Ecualizer", 121, Movie.Companion.ACCION, 1, "Movie The Ecualizer" ),
        Movie("The Ecualizer", 121, Movie.Companion.ACCION, 1, "Movie The Ecualizer" ),
        Movie("The Ecualizer", 121, Movie.Companion.ACCION, 1, "Movie The Ecualizer" ),

        Movie("Nobody", 32, Movie.Companion.ACCION, 1, "Nobody" ),
        Movie("Nobody", 32, Movie.Companion.ACCION, 1, "Nobody" ),
        Movie("Nobody", 32, Movie.Companion.ACCION, 1, "Nobody" ),
        Movie("Nobody", 32, Movie.Companion.ACCION, 1, "Nobody" ),
        Movie("Nobody", 32, Movie.Companion.ACCION, 1, "Nobody" ),

        Movie("Venom", 97, Movie.Companion.SUPERHEROES, 1, "Venom" ),
        Movie("Venom", 97, Movie.Companion.SUPERHEROES, 1, "Venom" ),
        Movie("Venom", 97, Movie.Companion.SUPERHEROES, 1, "Venom" ),
        Movie("Venom", 97, Movie.Companion.SUPERHEROES, 1, "Venom" ),
        Movie("Venom", 97, Movie.Companion.SUPERHEROES, 1, "Venom" ),

        Movie("Hannibal", 131, Movie.Companion.TERROR, 1, "Serial killer Hannibal" ),
        Movie("Hannibal", 131, Movie.Companion.TERROR, 1, "Serial killer Hannibal" ),
        Movie("Hannibal", 131, Movie.Companion.TERROR, 1, "Serial killer Hannibal" ),
        Movie("Hannibal", 131, Movie.Companion.TERROR, 1, "Serial killer Hannibal" ),
        Movie("Hannibal", 131, Movie.Companion.TERROR, 1, "Serial killer Hannibal" ),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}