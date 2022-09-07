package com.example.recycleviews_leccion1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviews_leccion1.data.Movie
import com.example.recycleviews_leccion1.R

class MovieAdapter(private val movieList: List<Movie> ): RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    class ViewHolder( movieView: View ) : RecyclerView.ViewHolder( movieView ){
        val imageView: ImageView = movieView.findViewById(R.id.poster)
        val title: TextView = movieView.findViewById(R.id.movieTitle)
        val description: TextView = movieView.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from( parent.context )
            .inflate(R.layout.movie_view_design, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = movieList[position]

        holder.imageView.setImageResource(ItemsViewModel.caratula)
        holder.title.text = ItemsViewModel.nombre
        holder.description.text = ItemsViewModel.sinopsis
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}