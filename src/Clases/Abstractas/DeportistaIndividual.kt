package Clases.Abstractas

import Interfaces.IDeportistas

abstract class DeportistaIndividual(val nombre: String, var activo: Boolean): IDeportistas {
    override val tipo: String
        get() = "Deportista individual"

    override fun alimentar() = "$nombre está comiendo"
    override fun calentar() = "$nombre está calentando"
    override fun competir() = "$nombre está calentando"
    override fun descansar() = "$nombre está descansando"
    override fun entrenar() = "$nombre está entrenando"

    override fun retirarse(): String {
        if (!activo)
            return "El deportista ya se ha retirado"
        else {
            activo = false
            return "El deportista $nombre se retira"
        }
    }
}