package com.example.ejerciciodi.views.main.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejerciciodi.databinding.ActivityMainBinding
import com.example.ejerciciodi.di.viewModel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity() : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel
    }
}