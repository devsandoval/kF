package com.cesarsandovaldev.kf.JSaKT

/*
Crear una función que reciba un array de palabras y devuelva true si todas las palabras terminan con la letra "a"
y false si al menos una palabra no termina con la letra "a".
Usa el método endsWith() de string para resolverlo.
*/

fun main() {
    val palabras = arrayOf("Cesar", "Abril", "Orion", "Mia", "Simona", "Robin", "Rudy","Orion", "Leon")
    if (letraA(palabras)){
        println("todos terminan con la letra a")
    }else{
        println("NO todos terminan con la letra a")
    }
}

fun letraA(nombres: Array<String>): Boolean {
    return nombres.all { it.endsWith("a", ignoreCase = true) }
}