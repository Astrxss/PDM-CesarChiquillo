package com.example.laboratorio1

class Estudiante (
    var nombre: String,
    var carnet: String,
    var asignatura: String
)

fun mainEjercicio3(){
    val Ciclo01 = listOf(
        Estudiante("Juan", "20210001", "Programacion de Dispositivos Moviles"),
        Estudiante("María", "20210002", "Programacion de Dispositivos Moviles"),
        Estudiante("Carlos", "20210003", "Programacion de Dispositivos Moviles"),
        Estudiante("Ana", "20210004", "Analisis numerico"),
        Estudiante("Luis", "20210005", "Analisis numerico"),
        Estudiante("Sofía", "20210006", "Analisis numerico"),
        Estudiante("Pedro", "20210007", "Analisis numerico")
    )
     val EstudiantesDeMoviles = Ciclo01.filter { it.asignatura == "Programacion de Dispositivos Moviles" }
    println("Estudiantes de Programacion de Dispositivos Moviles: ")
    EstudiantesDeMoviles.forEach { println("Nombre: ${it.nombre} - Carnet ${it.carnet}") }
}