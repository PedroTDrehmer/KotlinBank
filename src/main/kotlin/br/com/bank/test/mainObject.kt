package br.com.bank.test

import br.com.bank.employees.Authenticable

fun main (){

// criar objetos anonimos,
// estrutura de objeto sem criar uma classe

    val fran = object : Authenticable{
        val name: String = "Fran"
        val cpf: String = "111.111.111-11"
        override val password: Int = 123

        fun authenticable(password: Int) = this.password == password
    }
}