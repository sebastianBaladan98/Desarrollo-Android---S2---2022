package com.example.recycleviews_leccion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviews_leccion1.adapters.MovieAdapter
import com.example.recycleviews_leccion1.data.Movie
import com.example.recycleviews_leccion1.databinding.ActivityHorizontalScrollBinding
import java.util.ArrayList

class HorizontalScrollActivity : AppCompatActivity() {
    lateinit var binding: ActivityHorizontalScrollBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalScrollBinding.inflate( layoutInflater )
        setContentView( binding.root )

        val movies: ArrayList<Movie> = intent.getParcelableArrayListExtra<Movie>("movies") as ArrayList<Movie>

        binding.recyclerView.layoutManager = LinearLayoutManager( this, LinearLayoutManager.HORIZONTAL, false )
        binding.recyclerView.adapter = MovieAdapter( this, movies, showSinopsis = false )
    }
}