package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Livro
import br.com.alura.bytebank.modelo.Prateleira

fun testaListas() {
    val livro1 = Livro(
        titulo = "Titulo1",
        autor = "Autor1",
        anoPublicacao = 1991,
    )

    val livro2 = Livro(
        titulo = "Titulo2",
        autor = "Autor2",
        anoPublicacao = 1982,
        editora = "Editora 2"
    )

    val livro3 = Livro(
        titulo = "Titulo3",
        autor = "Autor3",
        anoPublicacao = 1973,
    )

    val livro4 = Livro(
        titulo = "Titulo4",
        autor = "Autor4",
        anoPublicacao = 1964,
        editora = "Editora 4"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Titulo5",
            autor = "Autor5",
            anoPublicacao = 1955,
            editora = "Editora 5"
        )
    )

    livros.add(
        Livro(
            titulo = "Titulo5",
            autor = "Autor5",
            anoPublicacao = 1950,
            editora = "Editora X"
        )
    )

    livros.add(
        Livro(
            titulo = "Titulo11",
            autor = "Autor1",
            anoPublicacao = 1950,
            editora = "Editora X"
        )
    )

    livros.imprimeComMarcadores()

    livros.remove(livro3)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }.imprimeComMarcadores()

    val titulos = livros
        .filter { it.autor == "Autor5" }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
    println(titulos)


    val listaComNulos: MutableList<Livro?> = mutableListOf(livro1, null, livro2, livro3, livro4, null)
    listaComNulos.imprimeComMarcadores()

    livros.groupBy { it.editora ?: "Editora Desconhecida" }.forEach { (editora, livros) ->
        println("$editora: ${livros.joinToString { it.titulo }}")
    }

    val listaLivrosPrateleira: MutableList<Livro> = mutableListOf(livro2, livro1, livro4, livro3)
    val prateleira = Prateleira(genero = "Literaruta", livros = listaLivrosPrateleira)


    val porAutor = prateleira.organizarPorAutor()
    val porAno = prateleira.organizarPorAnoPublicacao()
    println("Autor")
    println(porAutor.hashCode())
    porAutor.imprimeComMarcadores()
    println("Ano")
    println(porAno.hashCode())
    porAno.imprimeComMarcadores()
}

fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println(" #### Lista de Livros #### \n$textoFormatado")
}
