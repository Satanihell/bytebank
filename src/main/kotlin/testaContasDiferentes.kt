fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Alex", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "Fran", numero = 1001)

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

