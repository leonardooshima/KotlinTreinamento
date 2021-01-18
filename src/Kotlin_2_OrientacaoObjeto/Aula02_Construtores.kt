package Kotlin_2_OrientacaoObjeto

// CONSTRUTORES - servem para inicializar as propriedades sempre que criamos um objeto de uma determinada classe

//class Car2(cor: String, ano: Int, modelo: String){
//    var cor: String
//    var ano: Int
//    var modelo: String
//
//    init {
//        this.cor = cor
//        this.ano = ano
//        this.modelo = modelo
//    }
//
//    fun acelerar(){
//        println("Acelerando o $modelo")
//    }
//}

// OU

class Car2(var cor: String, var ano: Int, var modelo: String){
    fun acelerar(){
        println("Acelerando o $modelo")
    }
}

fun main() {
    val uno = Car2("Amarelo", 2018, "Uno")

    println("Carro: $uno")
    println("Uno: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")
    uno.acelerar()

    val mercedes = Car2("Preta", 2010, "C13")

    println("Mercedes: Cor ${mercedes.cor}, Ano ${mercedes.ano}, Modelo ${mercedes.modelo}")
    mercedes.acelerar()
}