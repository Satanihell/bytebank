package br.com.alura.bytebank.teste

fun testeOperacoesAgregadoras() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    val maiorIdade = idades.maxOf { it }
    println("Maior: $maiorIdade")

    val menorIdade = idades.minOf { it }
    println("Maior: $menorIdade")

    val media: Double = idades.average()
    println("Media: $media")

    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno e maior de idade? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores $maiores")

    val busca = idades.find { it > 18 }
    println("Busca: $busca")
}
