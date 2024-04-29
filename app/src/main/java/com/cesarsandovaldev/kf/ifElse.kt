fun main() {
    //ifBasico()
    ifAnidado()
}

fun ifAnidado(){
    val animal = "perro"
    if (animal == "perro"){
        println("es un perrito")
    } else if (animal == "gato"){
        println("es un gatito")
    }else if (animal == "pajaro"){
        println("es un pajarito")
    }
    else{
        println("no es un animal de la lista")
    }
}
fun ifBasico () {
    val name = "cesar"

    if (name == "cesar"){
        println("El nombre es es correcto es: $name")
    }
    else{
        println("El nombre no es correcto es: $name")
    }
}