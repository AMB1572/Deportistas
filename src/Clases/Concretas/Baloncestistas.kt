package Clases.Concretas

import Clases.Abstractas.DeportistaDeEquipo

class Baloncestistas(
    nombre: String,
    activo: Boolean,
    numPartidos: Int,
    val peso: Int,
    val altura: Double,
    val puntosPorPartido: Double
): DeportistaDeEquipo(nombre, activo, numPartidos) {
    val puntos: Int
        get() = (numPartidos * puntosPorPartido).toInt()

    override fun toString(): String = "Nombre $nombre, activo: $activo ($numPartidos partidos). $peso kg, $altura m, $puntos puntos totales"
}