package employees

class Analyst(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : Abstract(
    name,
    cpf,
    salary,
    password
){
    override val typeBonus: Int = 2
}