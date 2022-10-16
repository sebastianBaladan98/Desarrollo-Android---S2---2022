package com.example.arquitecturaretrofit.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.arquitecturaretrofit.databinding.ActivityCharacterBinding
import com.example.arquitecturaretrofit.models.DTO.MarvelCharacterDTO

class CharacterActivity(val character: MarvelCharacterDTO) : AppCompatActivity() {

    private lateinit var binding: ActivityCharacterBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Glide.with(baseContext).asDrawable().load(character.picUrl).into()
    }
}