package com.example.ejerciciodi.di.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ejerciciodi.di.repositories.MonsterRepository
import com.example.ejerciciodi.model.Monsters
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainViewModel(private val monsterRepository: MonsterRepository): ViewModel() {

    private val monsters: MutableLiveData<Monsters> by lazy {
        MutableLiveData<Monsters>().also {
            loadMonsters()
        }
    }

    private fun loadMonsters() {
        viewModelScope.launch {
            val retrievedMonsters = monsterRepository.getMonsters()

            monsters.postValue(retrievedMonsters)
        }
    }

}