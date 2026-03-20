package com.example.laboratorio1

class Calculadora (
    val marca: String,
    val aniosDeVida: Int,
    var Precio: Double
){
    fun sumar(A: Double, B: Double){
        var Resultado = A+B
        println("El resultado $Resultado")
    }

    fun restar(A: Double,B: Double){
        var Resultado = A-B
        println("El resultado $Resultado")
    }

    fun dividir(A: Double,B: Double){
        if (B == 0.toDouble()){
            println("Error: No se puede dividir por cero")
            return
        }
        var Resultado = A/B
        println("El resultado $Resultado")
    }

    fun multiplicar(A: Double,B: Double){
        var Resultado = A*B
        println("El resultado $Resultado")
    }
}

fun mainEjercicio2(){
    val CalculadoraBase = Calculadora("Casio", 2, 3.90)

    CalculadoraBase.sumar(1.0,2.0)
    CalculadoraBase.multiplicar(5.0, 5.5)
    CalculadoraBase.restar(9.9,5.9)
    CalculadoraBase.dividir(9.6,7.8)
    CalculadoraBase.dividir(9.9,0.0)

}