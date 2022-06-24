package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaHOF() {
    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })

    val sistema = SistemaInterno()
    sistema.entraReceiver(autenticavel, senha = 1234, autenticado = {
        pagamento()
    })


    soma(5,5, resultado = { valor ->
        println(valor)
    })
    somaReceiver(10,10, resultado = {
        println(this)
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    println("Antes da soma")
    resultado(a+b)
    println("Depois da soma")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit){
    println("Antes da soma")
    val total = a + b
    total.resultado()
    println("Depois da soma")
}