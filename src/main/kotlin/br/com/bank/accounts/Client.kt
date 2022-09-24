package br.com.bank.accounts

import br.com.bank.employees.Authenticable

class Client (
    val name: String,
    val cpf: String,
    var adress: Adress,
    override val password: Int
): Authenticable{
    override fun toString(): String {
        return "Client(name='$name', cpf='$cpf', adress=$adress, password=$password)"
    }
}