package br.com.alura.bytebank.teste

fun testaRange() {
    print("Range: ")
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    print("Step: ")
    val numerosPares = 0..10 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    print("Step reverso: ")
    val numerosReversos = 10 downTo 0 step 1
    for (numeroReverso in numerosReversos) {
        print("$numeroReverso ")
    }

    print("Intervalo: ")
    val intervalo = 1500.0..5000.0
    val salario = 6000.0
    if (salario in intervalo) {
        print("Esta dentro do intervalo")
    } else {
        print("Esta fora do intervalo")
    }

    print("Intervalo com letras: ")
    val alfabeto = 'a'..'z'
    val letra = 'k'
    if (letra in alfabeto) {
        print("Esta dentro do intervalo")
    } else {
        print("Esta fora do intervalo")
    }
}