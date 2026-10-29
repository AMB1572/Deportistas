import Clases.Abstractas.DeportistaDeEquipo
import Clases.Concretas.Baloncestistas
import Clases.Concretas.Canterano
import Clases.Concretas.Futbolistas
import Clases.Concretas.Profesional

fun main(){
    val listaPersonas = mutableListOf<DeportistaDeEquipo>()
    // Profesional(nombre, apellidos, edad, activo, numPartidos, numGoles, club, salario)
    listaPersonas.add(Profesional("Sergio", "Navas Prieto", 29, true, 120, 5, "CD Bahía", 4000.0))
    listaPersonas.add(Profesional("Andrés", "Molina Cruz", 24, true, 60, 0, "Atlético Sur", 3200.0))

    // Canterano(nombre, apellidos, edad, activo, numPartidos, numGoles)
    listaPersonas.add(Canterano("Hugo", "Ramos Vidal", 17, true, 4, 1))
    listaPersonas.add(Canterano("Irene", "Castro Ortiz", 19, true, 12, 7))
    listaPersonas.add(Canterano("Nerea", "Blanco Paz", 20, true, 8, 2))

    // Baloncestistas(nombre, activo, numPartidos, peso, altura, puntosPorPartido)
    listaPersonas.add(Baloncestistas("Bruno", true, 80, 115, 2.13, 18.4))
    listaPersonas.add(Baloncestistas("Dani", true, 65, 92, 1.96, 21.7))
    listaPersonas.sortedBy { it.nombre }.forEach { println(it.nombre) }

    val listaFutbolistas = mutableListOf<Futbolistas>()
    listaFutbolistas.add(Profesional("Sergio", "Navas Prieto", 29, true, 120, 5, "CD Bahía", 4000.0))
    listaFutbolistas.add(Profesional("Andrés", "Molina Cruz", 24, true, 60, 0, "Atlético Sur", 3200.0))

    // Canterano(nombre, apellidos, edad, activo, numPartidos, numGoles)
    listaFutbolistas.add(Canterano("Hugo", "Ramos Vidal", 17, true, 4, 1))
    listaFutbolistas.add(Canterano("Irene", "Castro Ortiz", 19, true, 12, 7))
    listaFutbolistas.add(Canterano("Nerea", "Blanco Paz", 20, true, 8, 2))

    listaFutbolistas.find { it.nombre == "Sergio" }

    println(DeportistaDeEquipo.numDeportistas)

    listaFutbolistas.forEach {
        if(it.edad >= 18)
            println(it)
    }

    val baloncestistas1 = Baloncestistas("a", true, 48, 75, 1.75, 1.32)
    val baloncestistas2 = Baloncestistas("b", false, 34, 68, 1.66, 1.58)

    val listaBaloncesitas = mutableListOf<Baloncestistas>()
    listaBaloncesitas.add(baloncestistas1)
    listaBaloncesitas.add(baloncestistas2)


}