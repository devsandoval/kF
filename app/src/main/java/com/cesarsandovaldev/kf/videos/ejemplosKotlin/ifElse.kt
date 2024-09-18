package com.cesarsandovaldev.kf.videos.ejemplosKotlin

fun main() {
    //ifBasico()
    ifAnidado()
    boo()
    comprobacionEdad()
    ifMultipleOR()
}

fun ifAnidado() {
    val animal = "perro"
    if (animal == "perro") {
        println("es un perrito")
    } else if (animal == "gato") {
        println("es un gatito")
    } else if (animal == "pajaro") {
        println("es un pajarito")
    } else {
        println("no es uno de los animal esperados")
    }
}

fun ifBasico() {
    val name = "cesar"

    if (name == "cesar") {
        println("El nombre es es correcto es: $name")
    } else {
        println("El nombre no es correcto es: $name")
    }
}

fun boo() {
    var dia = true
    if (dia) println("es de dia")
    if (!dia) println("es de noche")
}

fun comprobacionEdad() {
    var edad: Int = 18
    var permiso = false
    var imhappy = true
    if (edad >= 18 && permiso && imhappy) { //condicional && and
        println("Puedo beber cerveza")
    }
}

fun ifMultipleOR() {
    var pet = "cat"
    var isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy)) { //condicional || or
        print("Es un gato o un perro feliz")
    }
}