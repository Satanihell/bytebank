package br.com.alura.bytebank.teste

fun testaMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
    )
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let { println("Pedido $it") }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Numero do ${p.key}")
        println("Valor do ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(1, 100.0)
    println(pedidos)
    pedidos.putIfAbsent(1, 200.0)
    println(pedidos)
}