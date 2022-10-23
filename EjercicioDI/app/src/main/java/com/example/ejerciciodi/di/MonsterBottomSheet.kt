package com.example.ejerciciodi.di

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ejerciciodi.databinding.MonsterBottomSheetBinding
import com.example.ejerciciodi.model.MonstersItem
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MonsterBottomSheet(private val monster: MonstersItem) : BottomSheetDialogFragment() {

    companion object {
        const val TAG = "ModalBottomSheet"
    }

    private lateinit var binding: MonsterBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(layoutInflater, container, savedInstanceState)
        binding = MonsterBottomSheetBinding.inflate(layoutInflater)
        assignValues(monster)
        return binding.root
    }

    private fun assignValues(monster: MonstersItem) {
        binding.monsterNameBottomSheet.text = monster.name
        binding.monsterSpeciesBottomSheet.text = monster.species
        binding.monsterDescriptionBottomSheet.text = monster.description
        binding.monsterTypeBottomSheet.text = monster.type
        binding.favIndicator.visibility = View.INVISIBLE
        if (monster.isFavorite) {
            binding.favIndicator.visibility = View.VISIBLE
        }
    }

}