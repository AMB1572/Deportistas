package Clases.Concretas

import Clases.Abstractas.DeportistaIndividual
import Clases.Enum.Estilo

class Nadador(
    nombre: String,
    activo: Boolean,
    var numMedallas: Int,
    val esOlimpico: Boolean,
    val estilo: Estilo
) : DeportistaIndividual(nombre, activo) {

    override fun toString(): String = ""

}