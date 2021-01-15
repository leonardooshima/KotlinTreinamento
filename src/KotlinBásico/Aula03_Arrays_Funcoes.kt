package KotlinBásico

import java.util.*

fun main() {
    // ARRAY - armazena número fixo de valores

    var array = arrayOf("SP", "RJ", "PR")

    println(array[1])

    array[0] = "RJ"
    array[1] = "SP"

    println(array[1])

    var mix = arrayOf(1, "String", 3)

    var inteiros = intArrayOf(1, 2, 3)

    for(inteiros in inteiros){
        println("Inteiro: $inteiros")
    }

    for((index, inteiros) in inteiros.withIndex()){
        println("Index: $index - Inteiro: $inteiros")
    }

    var outrosEstados = arrayOf("PA", "BA", "SC")

    var todosEstados = array + outrosEstados

    for (estado in todosEstados){
        println("Estado: $estado")
    }

    var str = "Uma String"
    println(str[2])


    // FUNÇÕES

    olaMundo()
    println(queHorasSao())

    var total = soma(10, 12)
    println("Total: $total")

}

fun olaMundo(){
    println("Ola mundo!")
}

fun queHorasSao(): Date{
    return Date()
}

fun soma(a: Int, b: Int): Int{
    return a + b
}