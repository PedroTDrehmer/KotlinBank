package employees

import Authenticable

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    override val password: Int
) : AuthenEmployee(
    name,
    cpf,
    salary,
    password
), Authenticable{


    override val typeBonus: Int = 2

}