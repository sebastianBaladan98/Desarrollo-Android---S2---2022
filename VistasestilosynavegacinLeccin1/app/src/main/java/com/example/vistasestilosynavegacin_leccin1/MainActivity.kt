package com.example.vistasestilosynavegacin_leccin1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vistasestilosynavegacin_leccin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}