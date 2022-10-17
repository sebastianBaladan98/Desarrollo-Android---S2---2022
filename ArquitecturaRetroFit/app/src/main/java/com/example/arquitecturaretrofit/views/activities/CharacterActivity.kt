package com.example.arquitecturaretrofit.views.activities

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.arquitecturaretrofit.databinding.ActivityCharacterBinding
import com.example.arquitecturaretrofit.models.DTO.MarvelCharacterDTO

class CharacterActivity(val character: MarvelCharacterDTO) : AppCompatActivity() {

    private lateinit var binding: ActivityCharacterBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCharacterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadBackground(character.picUrl)
    }

    private fun loadBackground(url: String) {
        Glide.with(baseContext).load(url).listener(object :
            RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                binding.container.background = resource
                return false
            }

        }).preload()
    }
}