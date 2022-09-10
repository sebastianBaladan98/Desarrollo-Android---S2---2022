package com.example.recycleviews_leccion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviews_leccion1.adapters.MovieAdapter
import com.example.recycleviews_leccion1.data.Movie
import com.example.recycleviews_leccion1.databinding.ActivityVerticalScrollBinding

class VerticalScrollActivity : AppCompatActivity() {

    lateinit var binding: ActivityVerticalScrollBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalScrollBinding.inflate( layoutInflater )
        setContentView( binding.root )

        val movies: ArrayList<Movie> = intent.extras?.getSerializable("movies") as ArrayList<Movie>

        binding.recyclerView.layoutManager = LinearLayoutManager( this )
        binding.recyclerView.adapter = MovieAdapter( this, movies, showSinopsis = false )

    }
}