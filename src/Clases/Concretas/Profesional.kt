package Clases.Concretas

class Profesional(
    nombre: String,
    apellidos: String,
    edad: Int,
    activo: Boolean,
    numPartidos: Int,
    numGoles: Int,
    val club: String,
    val salario: Double
): Futbolistas(nombre, apellidos, edad, activo, numPartidos, numGoles) {

    val salarioBruto: Double
        get() = salario + (300*numGoles)

    val salarioNeto: Double
        get() = (salarioBruto*0.24) + (salarioBruto*0.635)

    override fun toString(): String = "${super.toString()} "
}