package br.com.alura.bytebank.modelo

class Endereco (
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estato: String = "",
    var cep: String = "",
    var complemento: String = ""
    ){

    override fun toString(): String {
        return """Endereco(logradouro='$logradouro',
            | numero=$numero,
            | bairro='$bairro', 
            | cidade='$cidade', 
            | estato='$estato', 
            | cep='$cep', 
            | complemento='$complemento')""".trimMargin()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estato != other.estato) return false
        if (cep != other.cep) return false
        if (complemento != other.complemento) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estato.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result
    }

    fun completo(): String {
        return """
$logradouro, - $numero, $bairro - $estato
$cep
$complemento
        """.trimIndent()
    }


}
