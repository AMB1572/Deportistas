package Clases.Concretas

import Clases.Abstractas.DeportistaDeEquipo

open class Futbolistas(
    nombre: String,
    val apellidos: String,
    val edad: Int,
    activo: Boolean,
    numPartidos: Int,
    val numGoles: Int,
    var DNI: String = "00000001A"
): DeportistaDeEquipo(nombre, activo, numPartidos) {

    init {
        require(edad >= 0) {println("La edad no puede ser negativa")}
    }

    override fun toString(): String = "Nombre: $nombre. Apellidos: $apellidos"
}