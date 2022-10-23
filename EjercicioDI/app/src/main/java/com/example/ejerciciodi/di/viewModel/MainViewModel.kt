package com.example.ejerciciodi.di.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ejerciciodi.di.repositories.MonsterRepository
import com.example.ejerciciodi.model.Monsters
import kotlinx.coroutines.launch

class MainViewModel(private val monsterRepository: MonsterRepository) : ViewModel() {

    private val monsters: MutableLiveData<Monsters> by lazy {
        MutableLiveData<Monsters>().also {
            loadMonsters()
        }
    }

    @JvmName("getMonsters1")
    fun getMonsters(): MutableLiveData<Monsters> {
        return this.monsters
    }

    private fun loadMonsters() {
        viewModelScope.launch {
            val retrievedMonsters = monsterRepository.getMonsters()

            monsters.postValue(retrievedMonsters)
        }
    }

}