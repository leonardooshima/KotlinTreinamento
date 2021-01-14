fun main() {
    println("Ola mundo")

    // EXEMPLOS DE VARIÁVEL MUTÁVEL
    var str1 = "Palavra"
    var contador1: Int = 1234
    var nome1: String = "Leonardo"

    // EXEMPLOS DE VARIÁVEL IMUTÁVEL
    val str2 = "Palavra"
    val contador2: Int = 1234
    val nome2: String = "Leonardo"

    /* NÃO É POSSÍVEL CRIAR UMA VARIÁVEL NULA
       var str: String = null */
    var str: String? = null
    str = "Leozito"
    // Quando a variável pode ser nula ele precisa checar como ela esta antes de ver o length
    str?.length
    /* Voce pode forçar ele passar mesmo assim e correr o risco de dar um nullPointerException
    str!!.length */



}