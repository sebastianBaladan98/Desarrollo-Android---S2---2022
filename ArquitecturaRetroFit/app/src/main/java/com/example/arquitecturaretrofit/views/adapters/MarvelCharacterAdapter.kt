package com.example.arquitecturaretrofit.views.adapters

import android.content.Context
import android.os.Build
import android.text.Html
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arquitecturaretrofit.R
import com.example.arquitecturaretrofit.models.DTO.MarvelCharacterDTO
import com.google.android.material.card.MaterialCardView

class MarvelCharacterAdapter(
    private val context: Context,
    private val characters: List<MarvelCharacterDTO>
) :
    RecyclerView.Adapter<MarvelCharacterAdapter.ViewHolder>() {

    inner class ViewHolder(marvCharView: View) : RecyclerView.ViewHolder(marvCharView) {
        val image: ImageView = marvCharView.findViewById(R.id.image)
        val name: TextView = marvCharView.findViewById(R.id.name)
        val description: TextView = marvCharView.findViewById(R.id.description)
        val comicApps: TextView = marvCharView.findViewById(R.id.comicApps)
        val seriesApps: TextView = marvCharView.findViewById(R.id.seriesApps)
        val container: ConstraintLayout = marvCharView.findViewById(R.id.container)
        val card: MaterialCardView = marvCharView.findViewById(R.id.card)
        var isExpanded = false

        init {
            TransitionManager.beginDelayedTransition(card, ChangeBounds().setDuration(200));
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.marvel_char_main_view, parent, false)

        return ViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = characters[position]

        Glide.with(context).load(item.picUrl).placeholder(R.drawable.ic_launcher_background)
            .into(holder.image);
        holder.name.text = item.name
        holder.description.text = item.desc
        holder.comicApps.text =
            Html.fromHtml("<b>Comic Apps: </b> ${item.comicApps}", Html.FROM_HTML_MODE_LEGACY)
        holder.seriesApps.text =
            Html.fromHtml("<b>Series Apps: </b> ${item.seriesApps}", Html.FROM_HTML_MODE_LEGACY)

        holder.description.visibility = View.GONE
        holder.comicApps.visibility = View.GONE
        holder.seriesApps.visibility = View.GONE
        holder.container.setOnClickListener {
            Log.v("TAG", "${holder.description.text}")
            var visibility = View.VISIBLE
            if (holder.isExpanded) visibility = View.GONE
            holder.description.visibility = visibility
            holder.comicApps.visibility = visibility
            holder.seriesApps.visibility = visibility
            holder.isExpanded = !holder.isExpanded
        }
    }

    override fun getItemCount(): Int {
        return characters.size
    }

}