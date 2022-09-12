package com.example.recycleviews_leccion1.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviews_leccion1.MovieDetailsActivity
import com.example.recycleviews_leccion1.data.Movie
import com.example.recycleviews_leccion1.R

class MovieAdapter( val context: Context,
                    private val movieList: List<Movie>,
                    val showCaratula: Boolean = true,
                    val showTitulo: Boolean = true,
                    val showSinopsis: Boolean = true ): RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    inner class ViewHolder( movieView: View ) : RecyclerView.ViewHolder( movieView ){

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
        val movie = movieList[position]

        holder.imageView.setImageResource(movie.caratula)
        holder.title.text = movie.nombre
        holder.description.text = movie.sinopsis

        holder.itemView.setOnClickListener {
            val intent: Intent = Intent( holder.itemView.context, MovieDetailsActivity::class.java )
            intent.putExtra("movie", movie)
            context.startActivity( intent )
        }

    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}