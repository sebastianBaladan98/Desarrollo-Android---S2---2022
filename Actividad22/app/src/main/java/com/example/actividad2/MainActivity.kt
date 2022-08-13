package com.example.actividad2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ejercicio1(){
        val mapa: MutableMap<String, Int> = mutableMapOf(
            "Jorge Pérez" to 26,
            "Alberto Rodríguez" to 30,
            "Norma Pirez" to 42,
            "Tomás Lorenzo" to 12,
            "Alejandra Romero" to 29,
            "Juan Gonzalez" to 68,
            "Alberto Trochon" to 17,
            "Juan Batista" to 34,
        )
        //Parte A
        val parteA: Map<String, Int> = mapa.filterValues { value -> (value > 28) and (value < 42) }

        //Parte B
        val parteB: Map<String, Int> = mapa.filterValues { value -> value > 42 }

        //Parte C
        val names = mapa.keys;
        names.sortedWith(Comparator( (val1, val2) -> ))
    }
}