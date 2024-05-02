fun main() {

    getMonth(2)
    print(getSemester(5))
}

fun getMonth(month: Int) {
    when (month) {
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> {
            print("Noviembre")
            print("Noviembre")
        }

        12 -> print("Diciembre")
        else -> print("No es un mes válido")

    }
}

fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> print("Primer trimeste")
        4, 5, 6 -> print("Segundo trimeste")
        7, 8, 9 -> print("Tercer trimeste")
        10, 11, 12 -> print("Cuarto trimeste")
        else -> print("No es un mes válido")
    }
}

fun getSemester(month: Int) = when(month){ //de esta forma retornamos sin poner return abajo ni explisitar el tipo de variable a retornar
    in 1..6 ->  "Primer semestre"
    in 7..12 ->   "Segundo semestre"
    !in 1..12 -> "Semestre no válido"
    else ->  "dawda"
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("holiwi")
    }
}