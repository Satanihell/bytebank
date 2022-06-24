package br.com.alura.bytebank.modelo

data class Prateleira (
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro>{
        livros.sortedBy { it.autor }
        return livros
    }

    fun organizarPorAnoPublicacao(): List<Livro>{
        livros.sortedBy { it.anoPublicacao }
        return livros
    }
}