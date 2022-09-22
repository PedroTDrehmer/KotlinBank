package Clients

import Authenticable

class Client (
    val name: String,
    val cpf: String,
    override val password: Int
): Authenticable