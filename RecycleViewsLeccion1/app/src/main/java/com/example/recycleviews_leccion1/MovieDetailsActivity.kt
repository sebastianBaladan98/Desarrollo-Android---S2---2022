package com.example.recycleviews_leccion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.toDrawable
import com.example.recycleviews_leccion1.data.Movie
import com.example.recycleviews_leccion1.databinding.ActivityMovieDetailsBinding

class MovieDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityMovieDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailsBinding.inflate( layoutInflater )
        setContentView( binding.root )

        val movie: Movie = intent.extras?.get("movie") as Movie

        binding.titulo.text = movie.nombre
        binding.genero.text = movie.genero
        binding.sinopsis.text = movie.sinopsis
        binding.duracion.text = movie.nombre
        binding.caratula.setImageDrawable( getDrawable( movie.caratula ) )

    }
}