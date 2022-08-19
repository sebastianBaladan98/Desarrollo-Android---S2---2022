package com.example.leccion3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    class Video(nombre: String, duracion: Int, tipo: String)

    class YouTuber(nombre: String, seguidores: Int, videos: List<Video>) {
        var esFamoso: Boolean = seguidores > 5000;

        fun presentacion(){
            Log.v("TAG", String.format("Hola soy %s. Tengo %d seguidores gracias a los videos" +
                    "que he subido!!"))
        }
    }
}