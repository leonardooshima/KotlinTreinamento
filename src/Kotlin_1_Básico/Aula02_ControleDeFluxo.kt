package Kotlin_1_Básico

fun main() {

    // IF/ELSE

    var idade = 15

    if(idade<18){
        println("Não pode beber nem tirar carta")
    } else if (idade < 21){
        println("Não pode beber, mas pode tirar carta")
    } else{
        println("Pode beber e tirar carta")
    }

    var str = if (idade < 18) "Menor de idade" else "Maior de idade"
    println(str)


    // WHEN

    var opcao = 1

    when (opcao){
        1 -> println("Conta corrente")
        2 -> println("Conta poupança")
        3 -> println("Cartão de crédito")
        else -> {
            println("Nenhuma opção encontrada!")
            println("Fale com nossos atendentes!")
        }
    }

    var opcaoSel = when (opcao){
        1 -> "Conta corrente"
        2 -> "Conta poupança"
        3 -> "Cartão de crédito"
        else -> {
            println("Nenhuma opção encontrada!")
            println("Fale com nossos atendentes!")
            "Nenhuma opção encontrada"
        }
    }

    println("Opção selecionada: $opcao - $opcaoSel")


    // WHILE

    var contador = 1

    while (contador <= 5){
        println("Contador: $contador")
        contador++
    }


    // FOR

    for (item in 1..5){
        println("Item: $item")
    }

    for (i in 1..5) println("I = $i")

}