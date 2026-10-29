package Interfaces

interface IDeportistas {
    val tipo: String
    fun calentar(): String
    fun entrenar(): String
    fun competir(): String
    fun alimentar(): String
    fun descansar(): String
    fun retirarse(): String
}