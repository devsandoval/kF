package com.cesarsandovaldev.kf

fun main() {

    val age1:Int = 40
    val age2:Int =20
    val pi:Float = 3.14f
    val name:String = "Cesar"

    println("SUMA")
    println(age1+age2)

    println("RESTA")
    println(age1-age2)

    println("MULTIPLICAR")
    println(age1*age2)

    println("DIVICION")
    println(age1/age2)

    println("RESTO")
    println(age1%age2)


    //convertir a int
    var examplesuma: Int = age2+pi.toInt()
    println(examplesuma)

    var stringconcatenada:String = "hola"
    println(stringconcatenada)
    stringconcatenada = "Hola mi nombre es $age1 y mi edad es $age1 años"
    println(stringconcatenada)
}