package com.example.laboratorio1

class Computadora(
    var RAM: Int,
    var CPU: String,
    var GPU: String,
    var TarjetaMadre: String,
    var SistemaOperativo: String,
    var Almacenamiento: Int
){
    var encendida: Boolean = false

    fun encender (){
        if (encendida == false){
            encendida = true
            println("Encendiendo Computadora")
        } else {
            println("La computadora ya esta encedida")
        }
    }

    fun apagar () {
        if (encendida == true){
            encendida = false
            println("apagando Computadora")
        } else {
            println("La computadora ya esta apagada")
        }
    }

    val ProgramasInstalados = listOf("Notion 2026", "Facebook 2024", "VsCode 2026", "Spotify 2026", "Google 2025")

    fun Programas(){
        println("Programas: ")
        ProgramasInstalados.forEach { println(" -$it") }
    }
    val ProgramasFiltrado = ProgramasInstalados.filter { it.contains("2026") }

    fun programasde2026() {
        println("Programas de 2026: ")
        ProgramasFiltrado.forEach { println(" -$it") }
    }

    fun cambiarRam (nuevaRam: Int) {
        RAM = nuevaRam
    }

    fun cambiarCPU (nuevaCPU: String){
        CPU = nuevaCPU
    }

    fun cambiarGPU (nuevaGPU: String){
        GPU = nuevaGPU
    }

    fun cambiarTarjetaMadre (nuevaTarjetaMadre: String){
        TarjetaMadre = nuevaTarjetaMadre
    }

    fun cambiarSistemaOperativo (nuevoSistemaOperativo: String){
        SistemaOperativo = nuevoSistemaOperativo
    }

    fun cambiarAlmacenamiento (nuevoAlmacenamiento: Int){
        Almacenamiento = nuevoAlmacenamiento
    }

    fun informacionPC (){
        println("Memorio RAM: $RAM GB")
        println("GPU: $GPU")
        println("Tarjeta Madre: $TarjetaMadre")
        println("Sistema Operativo: $SistemaOperativo")
        println("Memoria: $Almacenamiento GB")
    }


}


fun mainEjercicio1() {
    val miPc = Computadora(8, "Intel i5", "NVIDIA GTX 1650", "ASUS", "Windows 10", 512)
    miPc.encender()
    miPc.encender()
    miPc.informacionPC()
    miPc.cambiarRam(16)
    miPc.cambiarCPU("Ryzen 9900U")
    miPc.cambiarGPU("NVIDIA RTX 5090 Ti")
    miPc.cambiarTarjetaMadre("ASUS PRO MAX")
    miPc.cambiarSistemaOperativo("Ubuntu")
    miPc.cambiarAlmacenamiento(5000)
    miPc.informacionPC()
    miPc.Programas()
    miPc.programasde2026()
    miPc.apagar()
    miPc.apagar()
}

