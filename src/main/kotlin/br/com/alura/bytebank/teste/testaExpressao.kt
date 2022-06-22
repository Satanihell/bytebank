package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaComExpressao() {
    println("início main")
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversao")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        0.0
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor invalido")
    }
    testaPilha()
    println("fim main")
}