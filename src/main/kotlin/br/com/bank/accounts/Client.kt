package br.com.bank.accounts

import br.com.bank.employees.Authenticable

class Client (
    val name: String,
    val cpf: String,
    var adress: Adress = Adress(),
    override val password: Int
): Authenticable