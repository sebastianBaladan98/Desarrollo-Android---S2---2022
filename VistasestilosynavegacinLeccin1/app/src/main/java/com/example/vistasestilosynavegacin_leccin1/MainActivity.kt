package com.example.vistasestilosynavegacin_leccin1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.vistasestilosynavegacin_leccin1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root )
        binding.loginButton.setOnClickListener {
            login()
        }

    }

    private fun login() {
        val email: String = binding.emailInput.text.toString()
        val password: String = binding.passwordInput.text.toString()

        if ( email.contains("@test.com") and password.equals("Password123")) {
            //Navegar a otra activity
            Log.v( "TAG", "Credenciales correctas" )
        } else {
            Toast.makeText( this, "Credenciales incorrectas", Toast.LENGTH_SHORT ).show()
        }
    }
}