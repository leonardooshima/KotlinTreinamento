package KotlinOrientacaoObjeto

// INTERFACE - contrato entre uma classe e o mundo exterior, deve fornecer o comportamento especificado por essa interface

interface Dirigivel{
    fun acelerar(velocidade: Long)
}

interface Carregavel{
    fun carregar(quantidade: Int)
}

open class Veiculo2(open var cor: String, open var ano: Int, open var modelo: String)

class Carro2(override var cor: String, override var ano: Int, override var modelo: String): Veiculo2(cor, ano, modelo), Dirigivel{

    fun abrirPorta(){
        println("Abrindo a porta do $modelo")
    }

    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade km/h")
    }
}

class Caminhao2(override var cor: String, override var ano: Int, override var modelo: String, var capacidade: Long): Veiculo2(cor, ano, modelo), Dirigivel, Carregavel{
    override fun acelerar(velocidade: Long) {
        println("Acelerando o $modelo a $velocidade km/h")
    }

    override fun carregar(quantidade: Int) {
        println("Carregando o caminhão com $quantidade toneladas")
    }

}

fun main() {
    val uno: Dirigivel = Carro2("Amarelo", 2018, "Uno")

    println("Carro: $uno")

    uno.acelerar(60)

    // especificando a interface dirigivel vc so tem acesso as funcoes do dirigivel

    val scania: Dirigivel = Caminhao2("branco", 2015, "X78", 1000)

    scania.acelerar(40)

    // especificando a interface carregavel vc so tem acesso as funcoes do carregavel

    val scania2: Carregavel = Caminhao2("branco", 2015, "X78", 1000)

    scania2.carregar(40)

    // não especificando vc tem acesso a todas as funcoes

    val scania3 = Caminhao2("branco", 2015, "X78", 1000)

    scania3.acelerar(40)
    scania3.carregar(40)


}