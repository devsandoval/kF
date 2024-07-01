package com.cesarsandovaldev.kf.practicas

fun main() {

    var auto = vehiculo ("rojo", "ferrary", 100000, 300, 2022)
    var lancha= vehiculo("azul", "toro negro", 500, 200, 2023)

    auto.encender()
}

class vehiculo (var color: String, var marca: String, var valor: Int, var velocidad: Int, var modelo: Int){

    fun encender() {
        println("el ${this.marca} esta prendido")
    }
    fun acelerar() {
        println("0 a 100")
    }
    fun frenar() {
        println("frenado")
    }
}