package com.example.leccion3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val socioJoven: Socio = Socio("Diego", 1, Joven());
        val socioAdulto: Socio = socioJoven.copy(nombre = "Martín", numSocio = 2, categoria = Adulto())
        val socioJubilado: Socio = socioJoven.copy(nombre = "Roberto", numSocio = 3, categoria = Jubilado())
    }
}


//----------------------------------------Ejercicio 1----------------------------------------

class YouTuber(id: Int,
               private val nombre: String,
               private val seguidores: Int,
               private val videos: List<Video>): Influencer(id) {

    var esFamoso: Boolean = seguidores > 5000;

    fun presentacion(){
        Log.v("TAG", String.format("Hola soy %s. Tengo %d seguidores gracias a los %d" +
                " videos que he subido!!", nombre, seguidores, videos.size))
    }
    override fun publicar(): Unit {
        Log.v("TAG", String.format("Se ha publicado un video en YouTube") )
    }
}

class Video(var nombre: String,
            var duracion: Int,
            val tipo: Type) {
}
abstract class Type(){}
class Short(): Type() {}
class Long(): Type() {}

abstract class Influencer(val id: Int) {

    abstract fun publicar(): Unit;

}
//-------------------------------------------------------------------------------------------


//----------------------------------------Ejercicio 2----------------------------------------

data class Socio( var nombre: String, val numSocio: Int, var categoria: Category ): Entrenar {

    override fun correr() {
        if (categoria is Jubilado){
            Log.v("TAG", "Quién me mandó salir a correr")
            return
        }
        super.correr()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Socio

        if (nombre != other.nombre) return false
        if (numSocio != other.numSocio) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nombre.hashCode()
        result = 31 * result + numSocio
        result = 31 * result + categoria.hashCode()
        return result
    }
}

abstract class Category() {}
class Joven(): Category() {}
class Adulto(): Category() {}
class Jubilado(): Category() {}

interface Entrenar {

    fun correr() {
        Log.v("TAG", "Voy a correr")
    }

    fun caminar(){
        Log.v("TAG", "Arranco a caminar")
    }

    fun nadar(){
        Log.v("TAG", "A darse un chapuzón")
    }
}

//-------------------------------------------------------------------------------------------