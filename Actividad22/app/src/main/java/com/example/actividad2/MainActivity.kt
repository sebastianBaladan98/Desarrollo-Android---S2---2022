package com.example.actividad2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ejercicio1()
        ejercicio2()
    }

    fun ejercicio1(){
        val mapa: Map<String, Int> = mapOf(
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
        println("Personas que tienen entre 28 y 42 años: " + parteA.keys.toString())

        //Parte B
        val parteB: Map<String, Int> = mapa.filterValues { value -> value > 42 }
        println("Personas que tienen más de 42 años: " + parteA.keys.toString())

        //Parte C
        val mapaOrdenado: Map<String, Int> = mapa.toSortedMap( compareBy<String> { it.length }.thenBy { it } )
        println(mapaOrdenado.keys)
    }

    fun ejercicio2() {
        val personas: List<Persona> = listOf(
            Persona("Manuel", "Gomez", 52, "Pintor"),
            Persona("Gimena", "Ferrando", 21, "Maestra"),
            Persona("Bettina", "Paz", 42, "Ingeniera"),
            Persona("Lorenzo", "Porto", 12, "Estudiante"),
            Persona("Gloria", "Camara", 29, "Abogada"),
            Persona("Norberto", "Araujo", 68, "Jubilado"),
            Persona("Omar", "Junin", 17, "Estudiante"),
            Persona("Tamara", "Nin", 34, "Escritora")
        )

        //Parte A
        val parteA: List<Persona> = personas.filter { persona -> persona.edad < 18}
        println("\nPersonas con menos de 18 años")
        println("-----------------------------\n")
        parteA.forEach { persona -> println( String.format("%s tiene %d años", persona.nombre, persona.edad) ) }

        //Parte B
        val parteB: List<Persona> = personas.filter { persona -> (persona.edad > 18) and (persona.edad < 60) }
        println("\nPersonas de entre 18 y 60 años")
        println("-----------------------------\n")
        parteB.forEach { persona -> println( String.format("%s %s tiene %d años y su profesión es %s",
            persona.nombre,
            persona.apellido,
            persona.edad,
            persona.profesion) ) }

        //Parte C
        val parteC: List<Persona> = personas.filter { persona -> persona.edad > 60 }
        println("\nPersonas mayores a 60 años")
        println("-----------------------------\n")
        parteC.forEach { persona -> println( String.format("%s %s tiene %d años",
            persona.nombre,
            persona.apellido,
            persona.edad) ) }

        //Parte D
        var elder: Persona = personas[0]
        personas.forEach { persona -> if ( persona.edad > elder.edad ) elder = persona }
        println( String.format("La persona de mayor edad es %s %s", elder.nombre, elder.apellido) )

        //Parte E
        var youngest: Persona = personas[0]
        personas.forEach { persona -> if ( persona.edad < youngest.edad ) youngest = persona }
        println( String.format("La profesión de la persona de menor edad es %s", youngest.profesion) )

        //Parte F
        var bettina: Persona = personas.find { persona -> persona.nombre == "Bettina" }!!
        println(String.format("Bettina tiene %s años", bettina.edad))
    }

    class Persona(val nombre: String, val apellido: String, val edad: Int, val profesion: String) {

    }
}