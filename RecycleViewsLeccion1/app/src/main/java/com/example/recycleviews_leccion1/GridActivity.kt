package com.example.recycleviews_leccion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recycleviews_leccion1.adapters.MovieAdapter
import com.example.recycleviews_leccion1.data.Movie
import com.example.recycleviews_leccion1.databinding.ActivityGridBinding

class GridActivity : AppCompatActivity() {

    lateinit var binding: ActivityGridBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridBinding.inflate( layoutInflater )
        setContentView( binding.root )

        val movies: ArrayList<Movie> = intent.extras?.getSerializable("movies") as ArrayList<Movie>

        binding.recyclerView.layoutManager = GridLayoutManager( this, 3 )
        binding.recyclerView.adapter = MovieAdapter( this, movies, showSinopsis = false )

    }
}