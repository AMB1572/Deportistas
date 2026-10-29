package Clases.Concretas

import Clases.Abstractas.DeportistaDeEquipo

class Waterpolistas(
    nombre: String,
    activo: Boolean,
    numPartidos: Int,
    val numMedallas: Int
): DeportistaDeEquipo(nombre, activo, numPartidos) {

    fun addMedallas(medallas: Int){
        require(medallas in 1..3)
    }

    override fun toString(): String = ""

}