package com.example.recycleviews_leccion1

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviews_leccion1.adapters.MovieAdapter
import com.example.recycleviews_leccion1.data.Movie


class MainActivity : AppCompatActivity() {

    val movies: List<Movie> = listOf(
        Movie("X-Men Apocalypse", 144, Movie.ACCION, R.drawable.x_men_apocalypse, "X-Men" ),

        Movie("El Camino", 122, Movie.ACCION, R.drawable.el_camino, "Breaking Bad" ),
        Movie("El Camino", 122, Movie.ACCION, R.drawable.el_camino, "Breaking Bad" ),
        Movie("El Camino", 122, Movie.ACCION, R.drawable.el_camino, "Breaking Bad" ),
        Movie("El Camino", 122, Movie.ACCION, R.drawable.el_camino, "Breaking Bad" ),
        Movie("El Camino", 122, Movie.ACCION, R.drawable.el_camino, "Breaking Bad" ),

        Movie("Now you see me 2", 130, Movie.AVENTURA, R.drawable.now_you_see_me_2, "Now you see me 2" ),
        Movie("Now you see me 2", 130, Movie.AVENTURA, R.drawable.now_you_see_me_2, "Now you see me 2" ),
        Movie("Now you see me 2", 130, Movie.AVENTURA, R.drawable.now_you_see_me_2, "Now you see me 2" ),
        Movie("Now you see me 2", 130, Movie.AVENTURA, R.drawable.now_you_see_me_2, "Now you see me 2" ),
        Movie("Now you see me 2", 130, Movie.AVENTURA, R.drawable.now_you_see_me_2, "Now you see me 2" ),

        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.AVENTURA, R.drawable.dbz_battle_of_gods, "Goku unlocks SSG" ),
        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.AVENTURA, R.drawable.dbz_battle_of_gods, "Goku unlocks SSG" ),
        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.AVENTURA, R.drawable.dbz_battle_of_gods, "Goku unlocks SSG" ),
        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.AVENTURA, R.drawable.dbz_battle_of_gods, "Goku unlocks SSG" ),
        Movie("Dagon Ball Z: Battle of Gods", 105, Movie.AVENTURA, R.drawable.dbz_battle_of_gods, "Goku unlocks SSG" ),

        Movie("Concussion", 123, Movie.DEPORTES, R.drawable.concussion, "A movie about American Football" ),
        Movie("Concussion", 123, Movie.DEPORTES, R.drawable.concussion, "A movie about American Football" ),
        Movie("Concussion", 123, Movie.DEPORTES, R.drawable.concussion, "A movie about American Football" ),
        Movie("Concussion", 123, Movie.DEPORTES, R.drawable.concussion, "A movie about American Football" ),
        Movie("Concussion", 123, Movie.DEPORTES, R.drawable.concussion, "A movie about American Football" ),

        Movie("Hulk", 138, Movie.SUPERHEROES, R.drawable.hulk, "A movie about the Marvel superhero, The Hulk" ),
        Movie("Hulk", 138, Movie.SUPERHEROES, R.drawable.hulk, "A movie about the Marvel superhero, The Hulk" ),
        Movie("Hulk", 138, Movie.SUPERHEROES, R.drawable.hulk, "A movie about the Marvel superhero, The Hulk" ),
        Movie("Hulk", 138, Movie.SUPERHEROES, R.drawable.hulk, "A movie about the Marvel superhero, The Hulk" ),
        Movie("Hulk", 138, Movie.SUPERHEROES, R.drawable.hulk, "A movie about the Marvel superhero, The Hulk" ),

        Movie("The Ecualizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Ecualizer" ),
        Movie("The Ecualizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Ecualizer" ),
        Movie("The Ecualizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Ecualizer" ),
        Movie("The Ecualizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Ecualizer" ),
        Movie("The Ecualizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Ecualizer" ),

        Movie("Nobody", 32, Movie.ACCION, R.drawable.nobody, "Nobody" ),
        Movie("Nobody", 32, Movie.ACCION, R.drawable.nobody, "Nobody" ),
        Movie("Nobody", 32, Movie.ACCION, R.drawable.nobody, "Nobody" ),
        Movie("Nobody", 32, Movie.ACCION, R.drawable.nobody, "Nobody" ),
        Movie("Nobody", 32, Movie.ACCION, R.drawable.nobody, "Nobody" ),

        Movie("Venom", 97, Movie.SUPERHEROES, R.drawable.venom, "Venom" ),
        Movie("Venom", 97, Movie.SUPERHEROES, R.drawable.venom, "Venom" ),
        Movie("Venom", 97, Movie.SUPERHEROES, R.drawable.venom, "Venom" ),
        Movie("Venom", 97, Movie.SUPERHEROES, R.drawable.venom, "Venom" ),
        Movie("Venom", 97, Movie.SUPERHEROES, R.drawable.venom, "Venom" ),

        Movie("Hannibal", 131, Movie.TERROR, R.drawable.hannibal, "Serial killer Hannibal" ),
        Movie("Hannibal", 131, Movie.TERROR, R.drawable.hannibal, "Serial killer Hannibal" ),
        Movie("Hannibal", 131, Movie.TERROR, R.drawable.hannibal, "Serial killer Hannibal" ),
        Movie("Hannibal", 131, Movie.TERROR, R.drawable.hannibal, "Serial killer Hannibal" ),
        Movie("Hannibal", 131, Movie.TERROR, R.drawable.hannibal, "Serial killer Hannibal" ),

    )

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager( this )
        recyclerView.adapter = MovieAdapter( movies )
    }
}