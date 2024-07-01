package com.cesarsandovaldev.kf.bootcampTypescript.JSaKT
fun main() {
val numeros = arrayOf(3,87,99,52,47,63,8,2)
val valor = sumaPares(numeros)
println(valor)
}

fun sumaPares (vuelta:Array<Int>):Int{
    var suma =0
    for (i in vuelta){
        if(i%2==0){
            suma+=i
        }
    }
    return suma
}
