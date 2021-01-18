package Kotlin_3_Intermediário

// COLLECTIONS - implementações de estrutura de dados com várias funções e podem ser mutáveis

fun main() {

    // COLLECTIONS LIST - implementações de estrutura de dados parecidas com Array, mas com mais funções e podem ser mutáveis

    val items = listOf("SP", "RJ", "SC")
    val numeros = mutableListOf(1, 2, 3)
    val mix = arrayListOf("SP", 1, 2, 3)

    var array = arrayListOf("Aline", "Ju", "Leo")

    array.add("John Wick")
    println(array)
    array.remove("John Wick")
    println(array)
    println(array.isEmpty())
    println(array.contains("Leo"))
    for(nome in array){
        println(nome)
    }

    // COLLECTIONS SET - não permite elementos duplicados e não necessariamente deixa na ordem

    var set = hashSetOf(1, 2, 4, 4, 12, 210)
    set.add(100)
    set.remove(4)

    for(item in set){
        println(item)
    }

    // COLLECTIONS MAP - implementação baseada em chave-valor

    var map = hashMapOf("Chave1" to 1, "Chave2" to 2, "Chave3" to 3) //usando apenas mapOf ele não seria mutável
    map.put("Chave4", 4)

    map.remove("Chave3")

    for (chave in map.keys){
        println("$chave:${map.get(chave)}")
    }



}