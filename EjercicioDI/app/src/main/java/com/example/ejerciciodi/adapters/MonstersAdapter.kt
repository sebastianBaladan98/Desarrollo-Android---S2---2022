package com.example.ejerciciodi.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejerciciodi.R
import com.example.ejerciciodi.di.MonsterBottomSheet
import com.example.ejerciciodi.model.Monsters

class MonstersAdapter(
    private val fragmentManager: FragmentManager,
    private val monsters: Monsters
) :
    RecyclerView.Adapter<MonstersAdapter.ViewHolder>(), Filterable {

    private val displayedMonsters = ArrayList(monsters)

    inner class ViewHolder(monstersView: View) : RecyclerView.ViewHolder(monstersView) {

        val monsterName: TextView = monstersView.findViewById(R.id.monsterName)
        val monsterSpecies: TextView = monstersView.findViewById(R.id.monsterSpecies)
        val monsterType: TextView = monstersView.findViewById(R.id.monsterType)
        val container: ConstraintLayout = monstersView.findViewById(R.id.container)
        val favIcon: ImageButton = monstersView.findViewById(R.id.favIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.monster_view, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = displayedMonsters[position]

        holder.monsterName.text = item.name
        holder.monsterSpecies.text = "Species: ${item.species}"
        holder.monsterType.text = "Type: ${item.type}"
        holder.container.setOnClickListener {
            MonsterBottomSheet(item).show(fragmentManager, MonsterBottomSheet.TAG)
        }
        holder.favIcon.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        if (item.isFavorite) {
            holder.favIcon.setImageResource(R.drawable.ic_baseline_favorite_24)
        }

        holder.favIcon.setOnClickListener {
            if (item.isFavorite) {
                holder.favIcon.setImageResource(R.drawable.ic_baseline_favorite_border_24)
                item.isFavorite = false
            } else {
                holder.favIcon.setImageResource(R.drawable.ic_baseline_favorite_24)
                item.isFavorite = true
            }
        }
    }

    override fun getItemCount(): Int {
        return displayedMonsters.size
    }

    override fun getFilter(): Filter {
        return monsterFilter
    }

    private val monsterFilter = object : Filter() {
        override fun performFiltering(constraint: CharSequence?): FilterResults {
            val filteredMonsters = Monsters()
            val output = FilterResults()
            if (constraint!!.trim() == "") {
                filteredMonsters.addAll(monsters)
                output.values = filteredMonsters
                return output
            }
            monsters.forEach { monster ->
                if (monster.name.contains(constraint, false)) {
                    filteredMonsters.add(monster)
                }
            }
            output.values = filteredMonsters
            return output
        }

        override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
            displayedMonsters.clear()
            if (results != null) {
                displayedMonsters.addAll(results!!.values as Monsters)
            }
            notifyDataSetChanged()
        }

    }
}