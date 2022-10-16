package com.example.arquitecturaretrofit.views.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arquitecturaretrofit.R
import com.example.arquitecturaretrofit.models.DTO.MarvelCharacterDTO

class MarvelCharacterAdapter(
    private val context: Context,
    private val characters: List<MarvelCharacterDTO>
) :
    RecyclerView.Adapter<MarvelCharacterAdapter.ViewHolder>() {

    inner class ViewHolder(marvCharView: View) : RecyclerView.ViewHolder(marvCharView) {
        val image: ImageView = marvCharView.findViewById(R.id.image)
        val name: TextView = marvCharView.findViewById(R.id.name)
        val description: TextView = marvCharView.findViewById(R.id.description)
        val container: ConstraintLayout = marvCharView.findViewById(R.id.container)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.marvel_char_main_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = characters[position]

        Glide.with(context).load(item.picUrl).placeholder(R.drawable.ic_launcher_background)
            .into(holder.image);
        holder.name.text = item.name
        holder.description.text = item.desc
        holder.container.setOnClickListener {
            //TODO implement
        }
    }

    override fun getItemCount(): Int {
        return characters.size
    }

}