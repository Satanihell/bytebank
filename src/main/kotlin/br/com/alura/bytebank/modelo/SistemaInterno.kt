package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        } else{
            println("Falha na autentificacao")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado(this)
        } else{
            println("Falha na autentificacao")
        }
    }

    fun pagamento(){
        println("Realizando pagamento")
    }
}