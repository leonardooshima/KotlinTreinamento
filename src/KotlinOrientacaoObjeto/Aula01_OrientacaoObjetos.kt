package KotlinOrientacaoObjeto

// OBJETOS - blocos de programa com algumas funcionalidades e estados para representar situações que encontramos na vida real
/* CLASSES - um protótipo a partir da qual as instâncias são criadas e fornecem uma maneira limpa para modelar o estado e o
comportamento de objetos no mundo real, a partir de uma classe criamos vários objetos*/
// Ex: Classe - carro . Objetos: carro vermelho, carro amarelo, carro rapido, carro da policia
// PROPRIEDADES - características da modelagem de Orientação a Objetos

class Car{
    var cor: String = "Amarelo"
    var ano: Int = 2017
    var modelo: String = "Fox"
}

fun main() {
    val uno = Car()
    uno.ano = 2018
    uno.modelo = "Uno"

    println("Carro: $uno")
    println(uno.ano)
    println(uno.cor)
    println(uno.modelo)

    val mercedes = Car()
    mercedes.cor = "Preta"
    mercedes.ano = 2010
    mercedes.modelo = "C13"

    println("Mercedes: Cor ${mercedes.cor}, Ano ${mercedes.ano}, Modelo ${mercedes.modelo}")
}