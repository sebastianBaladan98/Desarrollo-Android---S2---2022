package com.example.vistasestilosynavegacin_leccin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vistasestilosynavegacin_leccin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root )
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.loginButton.setOnClickListener {  }
    }
}