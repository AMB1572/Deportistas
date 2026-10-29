package Clases.Abstractas

import Interfaces.IDeportistas

abstract class DeportistaDeEquipo(val nombre: String, var activo: Boolean, val numPartidos: Int): IDeportistas{
    companion object{
        var numDeportistas = 0
    }

    init {
        numDeportistas++
    }

    override val tipo: String
        get() = "Deportista de equipo"

    override fun alimentar() = "$nombre está comiendo"
    override fun calentar() = "$nombre está calentando"
    override fun competir() = "$nombre está calentando"
    override fun descansar() = "$nombre está descansando"
    override fun entrenar() = "$nombre está entrenando"

    override fun retirarse(): String {
        if (!activo)
            return "El deportista ya se ha retirado"
        else{
            activo=false
            return "El deportista $nombre se retira"
        }
    }
}
