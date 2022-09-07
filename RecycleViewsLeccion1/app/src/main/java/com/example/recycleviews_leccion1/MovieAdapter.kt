package com.example.recycleviews_leccion1

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movieList: List<Movie> ): RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    class ViewHolder( movieView: View ) : RecyclerView.ViewHolder( movieView ){
        val imageView: ImageView = movieView.findViewById( R.id.poster )
        val title: TextView = movieView.findViewById( R.id.movieTitle )
        val description: TextView = movieView.findViewById( R.id.description )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}