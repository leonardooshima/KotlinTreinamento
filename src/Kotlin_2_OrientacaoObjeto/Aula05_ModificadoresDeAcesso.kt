package Kotlin_2_OrientacaoObjeto

// MODIFICADORES DE ACESSO - determinam a visibilidade de classes, objetos, interfaces, construtores, funções e propriedades

open class Animal{
    private var nome = "Marie"
    protected var ano = 2014
    internal var tipo = "Mamifero"
    var patas = 4
}

class Cachorro: Animal(){

    fun descobrirIdade(){
        println("A idade é " + (2021 - ano))
    }

}

fun main() {
    val marie = Cachorro()
    marie.descobrirIdade()
    println(marie.tipo)
    println(marie.patas)

}