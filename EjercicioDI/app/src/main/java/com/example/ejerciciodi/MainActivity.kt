package com.example.ejerciciodi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciodi.databinding.ActivityMainBinding
import com.example.ejerciciodi.di.viewModel.MainViewModel
import com.example.ejerciciodi.services.ApiClient

class MainActivity( viewModel: MainViewModel ) : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}