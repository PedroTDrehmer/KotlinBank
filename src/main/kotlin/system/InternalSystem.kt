package system

import Authenticable

class InternalSystem {


    fun enter(nome: Authenticable, password: Int): Boolean {
        if (nome.password == password) {
            println("CORRECTLY PASSWORD")
            return true
        }
        println("WRONG PASSWORD")
        return false
    }
}