package com.example.recycleviews_leccion1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recycleviews_leccion1.data.Movie
import com.example.recycleviews_leccion1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    var movies: ArrayList<Movie> = arrayListOf(
        Movie("X-Men Apocalypse", 144, Movie.ACCION, R.drawable.x_men_apocalypse, "X-Men" ),
        Movie("X-Men Apocalypse", 144, Movie.ACCION, R.drawable.x_men_apocalypse, "X-Men" ),
        Movie("X-Men Apocalypse", 144, Movie.ACCION, R.drawable.x_men_apocalypse, "X-Men" ),
        Movie("X-Men Apocalypse", 144, Movie.ACCION, R.drawable.x_men_apocalypse, "X-Men" ),
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

        Movie("The Equalizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Equalizer" ),
        Movie("The Equalizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Equalizer" ),
        Movie("The Equalizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Equalizer" ),
        Movie("The Equalizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Equalizer" ),
        Movie("The Equalizer", 121, Movie.ACCION, R.drawable.the_equalizer, "Movie The Equalizer" ),

        Movie("Nobody", 132, Movie.ACCION, R.drawable.nobody, "Nobody" ),
        Movie("Nobody", 132, Movie.ACCION, R.drawable.nobody, "Nobody" ),
        Movie("Nobody", 132, Movie.ACCION, R.drawable.nobody, "Nobody" ),
        Movie("Nobody", 132, Movie.ACCION, R.drawable.nobody, "Nobody" ),
        Movie("Nobody", 132, Movie.ACCION, R.drawable.nobody, "Nobody" ),

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


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root )

        movies = this.movies.shuffled() as ArrayList<Movie>

        /* Botones */
        binding.verticalButton.setOnClickListener {
            val intent: Intent = Intent( this, VerticalScrollActivity::class.java )

            intent.putExtra( "movies" , movies )
            this.startActivity( intent )
        }

        binding.horizontalButton.setOnClickListener {
            val intent: Intent = Intent( this, HorizontalScrollActivity::class.java )

            intent.putExtra( "movies" , movies )
            this.startActivity( intent )
        }

        binding.gridButton.setOnClickListener {
            val intent: Intent = Intent( this, GridActivity::class.java )

            intent.putExtra( "movies" , movies )
            this.startActivity( intent )
        }




    }
}