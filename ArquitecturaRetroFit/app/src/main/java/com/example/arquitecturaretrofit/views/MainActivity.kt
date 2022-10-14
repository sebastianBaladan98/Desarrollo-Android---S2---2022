package com.example.arquitecturaretrofit.views

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.lifecycle.Observer
import com.example.arquitecturaretrofit.databinding.ActivityMainBinding
import com.example.arquitecturaretrofit.models.CharacterResponse
import com.example.arquitecturaretrofit.services.MarvelClient
import com.example.arquitecturaretrofit.viewModel.MainActivityViewModel
import java.security.MessageDigest
import java.time.Instant
import java.time.format.DateTimeFormatter
import kotlin.concurrent.thread
import kotlin.text.Charsets.UTF_8

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate( layoutInflater )

        setContentView( binding.root )

        val model: MainActivityViewModel by viewModels()
        model.getCharacters().observe(this) { chars ->
            Log.v("TAG", chars.data.count.toString())
        }
    }
}