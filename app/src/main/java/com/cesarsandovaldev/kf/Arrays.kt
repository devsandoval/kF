package com.cesarsandovaldev.kf

import kotlin.math.sin

fun main() {
    val diasSemanales =
        arrayOf("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo")

    println(diasSemanales[0])

    println(diasSemanales.size)

    if (diasSemanales.size >= 8) {
        println("tamaño 8")
    } else {
        println("exede el tamaño")
    }

    val names = arrayOf("Antonio", "Tania", "Vera", "Óscar", "Tomás")
    for (i in 0..<names.size) println(getFamilyMember(names[i]))
}

//Bucles

fun getFamilyMember(name: String) = when (name) {
    "Antonio" -> "Dad"
    "Tania" -> "Mum"
    "Vera" -> "Daughter"
    "Óscar" -> "Son"
    else -> "Not a family member"
}