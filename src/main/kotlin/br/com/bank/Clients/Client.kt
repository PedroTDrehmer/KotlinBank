package br.com.bank.Clients

import br.com.bank.employees.Authenticable

class Client (
    val name: String,
    val cpf: String,
    override val password: Int
): Authenticable