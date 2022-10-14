package com.example.arquitecturaretrofit.viewModel

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.arquitecturaretrofit.models.CharacterResponse
import com.example.arquitecturaretrofit.services.MarvelClient
import com.example.arquitecturaretrofit.services.MarvelClient.md5
import com.example.arquitecturaretrofit.services.MarvelClient.toHex
import java.time.Instant
import java.time.format.DateTimeFormatter
import kotlin.concurrent.thread

@RequiresApi(Build.VERSION_CODES.O)
class MainActivityViewModel: ViewModel() {

    private val characters: MutableLiveData<CharacterResponse> by lazy {
        MutableLiveData<CharacterResponse>().also {
            loadCharacters()
        }
    }

    fun getCharacters(): LiveData<CharacterResponse> {
        return characters
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun loadCharacters(){
        thread {
            val ts = DateTimeFormatter.ISO_INSTANT.format(Instant.now())
            val hash = (ts.toString()+MarvelClient.privKey+MarvelClient.pubKey).md5().toHex()
            val characters = MarvelClient.service.listCharacters(MarvelClient.pubKey, ts, hash)

            val response = characters.execute().body()

            if (response != null) {
                //https://developer.android.com/topic/libraries/architecture/viewmodel#kotlin
                this.characters.postValue(response)
            }
        }
    }

}