package Clases.Concretas

import Clases.Abstractas.DeportistaDeMotor
import Clases.Enum.NivelRiesgo

class Piloto(
    comoConduce: String,
    nombre: String,
    activo: Boolean,
    val categoria: String,
    val vehiculo: String,
    val nivelRiesgo: NivelRiesgo,
    val puedeSeguro: Boolean = false
): DeportistaDeMotor(comoConduce, nombre, activo) {

    override fun competir(): String {
        if(nivelRiesgo != NivelRiesgo.ALTO || puedeSeguro)
            return "$nombre puede competir"
        else
            return "$nombre no puede competir"
    }

    override fun toString(): String = ""
}