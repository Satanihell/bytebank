import br.com.alura.bytebank.modelo.*
fun main() {

    val fran = object : Autenticavel{
        val nome: String = "Fran"
        val cpf: String = "11122233344"
        val senha: Int = 123

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, senha = 1000)


    val alex = Cliente(nome="Alex", cpf="", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero=1000)
    val contaCorrente = ContaCorrente(titular = alex, numero=1000)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}