package Clases.Concretas

import java.util.UUID

class Canterano(
    nombre: String,
    apellidos: String,
    edad: Int,
    activo: Boolean,
    numPartidos: Int,
    numGoles: Int
): Futbolistas(nombre, apellidos, edad, activo, numPartidos, numGoles) {
    val licencia: String
        get() = UUID.randomUUID().toString().replace("-", " ")

    fun obtenerBeca(){
        if(numPartidos >= 10)
            println("FELICIDADES. Has obtenido una beca")
        else
            println("Lo sentimos. No se le puede conceder la beca si tiene menos de 10 partidos")
    }

    override fun toString(): String = "${super.toString()} "

}