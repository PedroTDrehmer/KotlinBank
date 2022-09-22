package employees

import Authenticable

abstract class AuthenEmployee(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : Employee(
    name,
    cpf,
    salary
), Authenticable