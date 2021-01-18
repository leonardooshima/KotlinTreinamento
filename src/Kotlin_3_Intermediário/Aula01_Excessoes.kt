package Kotlin_3_Intermediário

import java.lang.Exception

// EXCEÇÕES - todas as classes de exceção são descecndentes da classe throwable

fun main() {

    try{
        print("Digite um numero: ")
        val numero: Int = readLine()!!.toInt()
        val divisao: Int = 100 / numero
        println("A divisão é $divisao")
    } catch (e: Exception){
        println("Erro: ${e.message}")
    } finally {
        println("Programa finalizado")
    }
}