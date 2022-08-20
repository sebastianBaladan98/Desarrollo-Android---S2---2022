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

        val manuel = personas[0]
        val gimena = personas[1]
        val norberto = personas[5]

        /*---------------------------Parte A---------------------------*/
        Log.v( TAG, "\nParte A / Prueba de la función esMayor()" )
        Log.v( TAG, esMayor(manuel).toString() ) //true
        Log.v( TAG, esMayor(gimena).toString() ) //false
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/

        /*---------------------------Parte B---------------------------*/
        Log.v( TAG, "\nParte B / Prueba de la función startsWithR()" )
        Log.v( TAG, startsWithR(manuel).toString() ) //false
        Log.v( TAG, startsWithR(gimena).toString() ) //true
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/

        /*---------------------------Parte C---------------------------*/
        Log.v( TAG, "\nParte C / Prueba de la función tieneProfesion()" )
        Log.v( TAG, manuel.tieneProfesion().toString() ) //true
        Log.v( TAG, norberto.tieneProfesion().toString() ) //false
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/

        /*---------------------------Parte D---------------------------*/
        Log.v( TAG, "\nParte D / Imprimiendo nombres y apellidos de las personas que son mayores, su nombre comience con R y tengan profesión" )
        Log.v( TAG, mayorConR_YProfesion(personas).toString() )
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/

        /*---------------------------Parte E---------------------------*/
        Log.v( TAG, "\nParte E / Prueba de la función areAllConditionsMet()" )
        val bettina = personas[2]
        Log.v( TAG, areAllConditionsMet( manuel, ::esMayor, startsWithR, Persona::tieneProfesion ).toString() ) //false
        Log.v( TAG, areAllConditionsMet( bettina, ::esMayor, startsWithR, Persona::tieneProfesion ).toString() ) //true
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/

        /*---------------------------Parte F---------------------------*/
        Log.v( TAG, "\nParte F / Igual a la parte D, pero haciendo uso del método areAllConditionsMet()" )
        var personasMayoresConR_YProf: List<Persona> = personas.filter {
                persona -> areAllConditionsMet( persona, ::esMayor, startsWithR, Persona::tieneProfesion )
        }
        Log.v( TAG, personasMayoresConR_YProf.toString() )
        Log.v( TAG, "---------------------------------\n" )
        /*-------------------------------------------------------------*/
    }

    //d
    private fun mayorConR_YProfesion(personas: List<Persona> ): List<Persona> {
        return personas.filter { p -> esMayor(p) and startsWithR(p) and (p.profesion != null)}
    }

    //e
    private fun areAllConditionsMet( p: Persona, fun1: (Persona) -> Boolean, fun2: (Persona) -> Boolean, fun3: (Persona) -> Boolean): Boolean{
        return fun1(p) and fun2(p) and fun3(p);
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


class Persona(
    private val nombre: String?,
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
