package com.cesarsandovaldev.kf.videos.ejemplosKotlin

var gg: String = "Good Game"
fun main() {
    showMyage(12)
    sumar(25, 76)
    variablesNumericas()
}

fun variablesNumericas() {
    //Integer
    val integerExample: Int = 42
    //Long
    val longExample: Long = 45568787676
    //Float
    val floatExample: Float = 3.14f
    //Double
    val doubleExample: Double = 3.14159265359

    val age1: Int = 40
    val age2: Int = 20
    val pi: Float = 3.14f
    val name: String = "Cesar"

    println("SUMA")
    println(age1 + age2)

    println("RESTA")
    println(age1 - age2)

    println("MULTIPLICAR")
    println(age1 * age2)

    println("DIVICION")
    println(age1 / age2)

    println("RESTO")
    println(age1 % age2)


    //convertir a int
    var examplesuma: Int = age2 + pi.toInt()
    println(examplesuma)
}

fun variableBollean() {
    //VARIABLES BOOLEANA
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
}

fun variablesAlfanumerias() {
    //VARIABLES AlFANUMERICAS
    //Char
    val charExample: Char = '@'
    //String
    val stringExample: String = "esto es un String"
}

fun showMyage(currentAge: Int) {
    println("Mi edad es: $currentAge años")
}

fun sumar(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}