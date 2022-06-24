package br.com.alura.bytebank.modelo

fun ListaDeLivros() {

    val livro1 = Livro(
        titulo = "Titulo1",
        autor = "Autor1",
        anoPublicacao = 1991,
        editora = "Editora 1"
    )

    val livro2 = Livro(
        titulo = "Titulo2",
        autor = "Autor2",
        anoPublicacao = 1992,
        editora = "Editora 2"
    )

    val livro3 = Livro(
        titulo = "Titulo3",
        autor = "Autor3",
        anoPublicacao = 1993,
        editora = "Editora 3"
    )

    val livro4 = Livro(
        titulo = "Titulo4",
        autor = "Autor4",
        anoPublicacao = 1994,
        editora = "Editora 4"
    )

    val livros : MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)
    livros.add(
        Livro(
            titulo = "Titulo5",
            autor = "Autor5",
            anoPublicacao = 1995,
            editora = "Editora 5"
        )
    )

    println(livros)
}