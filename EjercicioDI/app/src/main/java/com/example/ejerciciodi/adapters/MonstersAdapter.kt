package com.example.ejerciciodi.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciodi.R
import com.example.ejerciciodi.model.Monsters

class MonstersAdapter(private val context: Context, private val monsters: Monsters) :
    RecyclerView.Adapter<MonstersAdapter.ViewHolder>() {

    inner class ViewHolder(monstersView: View) : RecyclerView.ViewHolder(monstersView) {

        val monsterName: TextView = monstersView.findViewById(R.id.monsterName)
        val monsterSpecies: TextView = monstersView.findViewById(R.id.monsterSpecies)
        val monsterType: TextView = monstersView.findViewById(R.id.monsterType)
        val container: ConstraintLayout = monstersView.findViewById(R.id.container)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.monster_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = monsters[position]

        holder.monsterName.text = item.name
        holder.monsterSpecies.text = item.species
        holder.monsterType.text = item.type
        holder.container.setOnClickListener {
            //abrir bottom sheet
        }
    }

    override fun getItemCount(): Int {
        return monsters.size
    }

}