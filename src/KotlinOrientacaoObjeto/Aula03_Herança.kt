package KotlinOrientacaoObjeto

// HERANÇA - ajuda a estruturar o software estabelecendo uma relação Pai-Filho

open class Veiculo(open var cor: String, open var ano: Int, open var modelo: String){
    fun acelerar(){
        println("Acelerando o $modelo")
    }
}

class Carro(override var cor: String, override var ano: Int, override var modelo: String): Veiculo(cor, ano, modelo){

    fun abrirPorta(){
        println("Abrindo a porta do $modelo")
    }
}

class Caminhao(override var cor: String, override var ano: Int, override var modelo: String, var capacidade: Long): Veiculo(cor, ano, modelo){

}

fun main() {
    val uno = Carro("Amarelo", 2018, "Uno")

    println("Carro: $uno")
    println("Carro: Cor ${uno.cor}, Ano ${uno.ano}, Modelo ${uno.modelo}")

    uno.abrirPorta()

    uno.acelerar()

    val scania = Caminhao("branco", 2015, "X78", 1000)
    println("Caminhao: Cor ${scania.cor}, Ano ${scania.ano}, Modelo ${scania.modelo}, Capacidade ${scania.capacidade}")

    scania.acelerar()
}