import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {

    val alex = Cliente(nome="Alex", cpf = "11122233344", senha = 123);
    val fran = Cliente(nome="Fran", cpf = "11122233366", senha = 231);

    val contaCorrente = ContaCorrente(titular = alex, numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = fran, numero = 1001)

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("senha do titular ${contaCorrente.titular.senha}")

    println("titular")
    println("nome do titular ${contaPoupanca.titular.nome}")
    println("cpf do titular ${contaPoupanca.titular.cpf}")
    println("senha do titular ${contaPoupanca.titular.senha}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("saldo conta corrente ${contaCorrente.saldo}")
    println("saldo conta poupanca ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println("saldo conta corrente ${contaCorrente.saldo}")
    println("saldo conta poupanca ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("saldo conta corrente apos transferir para poupanca ${contaCorrente.saldo}")
    println("saldo conta poupanca apos receber transferencia ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("saldo conta corrente apos receber transferencia ${contaCorrente.saldo}")
    println("saldo conta poupanca apos transferir para poupanca  ${contaPoupanca.saldo}")
}

