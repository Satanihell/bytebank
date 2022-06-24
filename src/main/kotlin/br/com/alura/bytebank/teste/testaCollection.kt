package br.com.alura.bytebank.teste

fun testaCollection() {
    val banco = BancoDeNomes()
    val nomesSalvos = banco.nomes
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {


    val nomes: Collection<String> get() = dados.toList()
    fun salva(nome: String){
        dados.add(nome)
    }
    companion object {
        private val dados = mutableListOf<String>()
    }
}
fun testaColecao() {
    val nomes: MutableList<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)

    println("Tem nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da colecao ${nomes.size}")
}
