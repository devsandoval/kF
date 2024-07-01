package com.cesarsandovaldev.kf.videos.ejemplosKotlin

fun main(){
        var name:String? = "Gata Mia"

        println(name?.get(3) ?:  "Es nulo")
    }