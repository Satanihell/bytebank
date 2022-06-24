import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testaHOF

fun main() {

    testaHOF()
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("Taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111333222-55", senha = 1234), 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println(rendimentoMensal)
    }

    val rendimntoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulacao rendimento anual $rendimntoAnual")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estato = "SP"
        cep = "90876-123"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
