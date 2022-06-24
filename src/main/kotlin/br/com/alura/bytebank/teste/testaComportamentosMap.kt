package br.com.alura.bytebank.teste


fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 30.0),
        Pair(2, 44.0),
        3 to 50.0,
        4 to 70.0,
        5 to 150.0,
        6 to 200.0
    )

    val valorPedido = pedidos.get(0)
    println(valorPedido)

    val mensagem: Double = pedidos.getOrElse(0, {
        0.0
    })
    println(mensagem)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    println(pedidos.values)
    for (valor in pedidos.values) {
        println("Valor do pedido $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(6, 5))
    println(pedidos)

//    pedidos.putAll(listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    pedidos += listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}