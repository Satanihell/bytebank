package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase()
//    println(enderecoEmMaiusculo)

    Endereco(logradouro = "Rua Vergueiro", numero = 3185)
    run {
        println("execução do run sem extensão")
    }

    val endereco = Endereco()
//        .also { println("Criando endereço") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })

}