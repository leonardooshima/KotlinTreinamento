package Kotlin_2_OrientacaoObjeto

// DATA CLASSES - classes que não fazem nada, apenas carregam dados de um lado para o outro

class Livro(val titulo: String, val autor: String, val ano: Int)

data class DataLivro(val titulo: String, val autor: String, val ano: Int)

fun main() {

    val livro = Livro("Livro do leo", "Leonardo Oshima", 2020)
    val dataLivro = DataLivro("Livro do leo", "Leonardo Oshima", 2020)

    val livro2 = Livro("Livro do leo", "Leonardo Oshima", 2020)
    val dataLivro2 = DataLivro("Livro do leo", "Leonardo Oshima", 2020)

    println(livro)
    println(dataLivro)

    println("Livro igual? " + livro.equals(livro2))
    println("Livro igual? " + dataLivro.equals(dataLivro2))
}