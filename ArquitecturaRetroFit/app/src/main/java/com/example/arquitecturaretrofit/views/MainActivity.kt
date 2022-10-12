package com.example.arquitecturaretrofit.views

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.arquitecturaretrofit.databinding.ActivityMainBinding
import com.example.arquitecturaretrofit.services.MarvelClient
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

        thread {
            val ts = DateTimeFormatter.ISO_INSTANT.format(Instant.now())
            val hash = (ts.toString()+privKey+pubKey).md5().toHex()
            val characters = MarvelClient.service.listCharacters(pubKey, ts, hash)

            val response = characters.execute().body()

            if (response != null) {
                Log.v("TAG", "Response = $response")
            }
            finish()
        }
    }
}