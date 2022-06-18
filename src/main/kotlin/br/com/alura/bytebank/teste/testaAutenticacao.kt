import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "11122233344",
        salario = 1000.0,
        senha = 123
    )

    val diretor = Diretor(
        nome = "Fran",
        cpf = "11122233355",
        salario = 10000.0,
        senha = 321,
        plr = 100.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "11122233377",
        senha = 231
    )

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(gerente, 123)
    sistemaInterno.entra(diretor, 321)
    sistemaInterno.entra(cliente, 231)


}