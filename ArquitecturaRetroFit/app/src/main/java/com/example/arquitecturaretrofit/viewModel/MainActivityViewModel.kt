package com.example.arquitecturaretrofit.viewModel

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.arquitecturaretrofit.models.DTO.MarvelCharacterConverter
import com.example.arquitecturaretrofit.models.DTO.MarvelCharacterDTO
import com.example.arquitecturaretrofit.models.Result
import com.example.arquitecturaretrofit.services.MarvelClient
import com.example.arquitecturaretrofit.services.MarvelClient.md5
import com.example.arquitecturaretrofit.services.MarvelClient.toHex
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.concurrent.thread

@RequiresApi(Build.VERSION_CODES.O)
class MainActivityViewModel : ViewModel() {

    private val characters: MutableLiveData<List<MarvelCharacterDTO>> by lazy {
        MutableLiveData<List<MarvelCharacterDTO>>().also {
            loadCharacters()
        }
    }

    fun getCharacters(): LiveData<List<MarvelCharacterDTO>> {
        return characters
    }

    private fun loadCharacters() {
        thread {
            //Relocate
            val ts = DateTimeFormatter.ISO_INSTANT.format(Instant.now())
            val hash = (ts.toString() + MarvelClient.privKey + MarvelClient.pubKey).md5().toHex()
            val characters = MarvelClient.service.listCharacters(MarvelClient.pubKey, ts, hash)
            //
            
            val response = characters.execute().body()

            if (response != null) {
                val charactersDTO = LinkedList<MarvelCharacterDTO>()
                //https://developer.android.com/topic/libraries/architecture/viewmodel#kotlin
                response.data.results.forEach { result: Result ->
                    run {
                        val char = MarvelCharacterConverter.toMarvelCharacter(result)
                        charactersDTO.add(char)
                    }
                }
                this.characters.postValue(charactersDTO)
            }
        }
    }

}