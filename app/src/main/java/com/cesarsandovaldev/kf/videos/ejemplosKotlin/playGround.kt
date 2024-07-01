package com.cesarsandovaldev.kf.videos.ejemplosKotlin

fun main() {

    var resultado = suma(1,4)
    println(resultado)
    var resta = restar (10,5)
    var multi = multiplicacion(5, 10)

    showMyage2(12)
    showName("cesar")
    println (resta)
    println (multi)

    comprarPan(100)

}

fun suma(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun imprimirHolaMundo(){
    println("Hola mundo")
}

fun showMyage2(currentAge: Int) {
    println("Mi edad es: $currentAge años")
}
fun showName(currentName: String) {
    println("Mi nombre es: $currentName")
}

fun restar(firstNumber: Int, secondNumber: Int): Int {
    return (firstNumber - secondNumber)
}

fun multiplicacion(num01: Int, num02:Int) = num01 * num02

fun comprarPan (presupuesto: Int):Int{
    val valor:Int = 800
    if (presupuesto >= valor){
        println("compraste")
    }else{
        println("no compraste")
    }
    return presupuesto
}