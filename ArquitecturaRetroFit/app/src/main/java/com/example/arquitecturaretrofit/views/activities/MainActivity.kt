package com.example.arquitecturaretrofit.views.activities

import android.content.Context
import android.os.Build
import android.os.Bundle
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.arquitecturaretrofit.databinding.ActivityMainBinding
import com.example.arquitecturaretrofit.models.DTO.MarvelCharacterDTO
import com.example.arquitecturaretrofit.viewModel.MainActivityViewModel
import com.example.arquitecturaretrofit.views.adapters.MarvelCharacterAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val model: MainActivityViewModel by viewModels()
        model.getCharacters().observe(this) { chars ->
            /*No funciona, no se puede ver el recyclerView*/
//            Blurry.with(this).radius(25).sampling(3).animate().onto(binding.container)
            loadCharacters(this, chars);
        }
    }

    private fun loadCharacters(context: Context, chars: List<MarvelCharacterDTO>) {
        val recyclerView = binding.itemsRecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MarvelCharacterAdapter(context, chars)
    }

}