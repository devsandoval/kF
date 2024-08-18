package com.cesarsandovaldev.kf.practicas

fun main() {

    var auto = vehiculo("rojo", "ferrary", 100000, 300, 2022, encendido = true)
    var lancha = vehiculo("azul", "toro negro", 500, 200, 2023, encendido = false)

    auto.encender()
    lancha.encender()
}

class vehiculo(
    var color: String,
    var marca: String,
    var valor: Int,
    var velocidad: Int,
    var modelo: Int,
    var encendido: Boolean
) {

    fun encender() {
        if (encendido) {
            println("el ${this.marca} ya esta prendido! no se puede volver a prender")
        }else{
            println("EL ${this.marca} esta encedido")
        }

    }

    fun acelerar() {
        println("0 a 100")
    }

    fun frenar() {
        println("frenado")
    }
}