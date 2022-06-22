package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

private fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "Predio")
    println(enderecoNulo?.logradouro?.length)

    enderecoNulo?.let { endereco: Endereco ->
        println(endereco.logradouro.length)
        val tamanhaComplemento: Int =
            endereco.complemento?.length ?: throw IllegalStateException("Complemento nao poe ser vazio")
        println(tamanhaComplemento)
    }
}
