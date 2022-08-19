package com.example.leccion2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ejecutarEjercicios()
    }

    private fun ejecutarEjercicios(){

        val TAG = "TAG"

        val personas = listOf<Persona>(
            Persona("Manuel", "Gomez", 52, "Pintor", "Uruguay"),
            Persona("Gimena", "Ramos", 12, "Estudiante", pais = null),
            Persona("Bettina", "Romero", 42, "Ingeniera", "Estados Unidos"),
            Persona("Lorenzo", "Porto", edad = null,profesion = "Estudiante", pais = null),
            Persona("Gloria", "Camara", 29, "Abogada", "Inglaterra"),
            Persona("Norberto", "Rodriguez", 32, profesion = null, pais = null),
            Persona("Luis", "Torres", 17, "Estudiante", pais = null),
            Persona("Tamara", "Nin", edad = null,profesion = "Escritora", pais = "Brasil")
        )

        val manuel = personas.get(0)
        val gimena = personas.get(1)
        val norberto = personas.get(5)

        /*---------------------------Parte A---------------------------*/
        Log.v( TAG, "\n Parte A / Prueba de la función esMayor()" )
        Log.v( TAG, esMayor(manuel).toString() ) //true
        Log.v( TAG, esMayor(gimena).toString() ) //true
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/

        /*---------------------------Parte B---------------------------*/
        Log.v( TAG, "\n Parte B / Prueba de la función startsWithR()" )
        Log.v( TAG, startsWithR(manuel).toString() ) //false
        Log.v( TAG, startsWithR(gimena).toString() ) //true
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/

        /*---------------------------Parte C---------------------------*/
        Log.v( TAG, "\n Parte C / Prueba de la función tieneProfesion()" )
        Log.v( TAG, manuel.tieneProfesion().toString() ) //true
        Log.v( TAG, norberto.tieneProfesion().toString() ) //false
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/

        /*---------------------------Parte D---------------------------*/
        Log.v( TAG, "\n Parte D / Imprimiendo nombres y apellidos de las personas que son mayores, su nombre comience con R y tengan profesión" )
        Log.v( TAG, mayorConR_YProfesion(personas).toString() )
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/




        Log.v("TAG", "Personas mayores de edad con profesión" + mayorConR_YProfesion(personas).toString())

        val personaPrueba = personas.get(0);
        Log.v("TAG", String.format("¿%s %s es mayor?: %b", personaPrueba.nombre,
            personaPrueba.apellido,
            esMayor(personaPrueba)))

        val bettina = personas.get(2)
        Log.v("TAG", "¿Betinna cumple las 3 condiciones?: " + areAllConditionsMet(bettina, ::esMayor, startsWithR, Persona::tieneProfesion))
    }

    //d
    private fun mayorConR_YProfesion(personas: List<Persona> ): List<Persona> {
        return personas.filter { p -> esMayor(p) and startsWithR(p) and (p.profesion != null)}
    }

    //e
    private fun areAllConditionsMet( p: Persona, fun1: (Persona) -> Boolean, fun2: (Persona) -> Boolean, fun3: () -> Boolean): Boolean{
        return fun1(p) and fun2(p) and p.tieneProfesion();
    }

    //b
    val startsWithR: ( Persona ) -> Boolean = { it.apellido?.lowercase()?.startsWith('r') ?: false };

    //a
    private fun esMayor( p: Persona): Boolean{
        if ( p.edad != null ){
            return p.edad > 18;
        }
        return false;
    }

}


class Persona(val nombre: String?,
              val apellido: String?,
              val edad: Int?,
              val profesion: String?,
              val pais: String?){
    override fun toString(): String {
        return "$nombre $apellido"
    }
}

//c
private fun Persona.tieneProfesion() = this.profesion != null;
