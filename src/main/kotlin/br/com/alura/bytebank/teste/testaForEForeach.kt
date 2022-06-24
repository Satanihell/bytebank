package br.com.alura.bytebank.teste

fun testaForEForeach() {
    val salarios: DoubleArray = doubleArrayOf(1200.50, 2300.0, 8000.0)
    val aumento = 1.1

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }
    println(salarios.contentToString())
}
