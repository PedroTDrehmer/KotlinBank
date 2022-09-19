package employees

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
) : AdmEmployee(
    name,
    cpf,
    salary,
    password
) {
    override val typeBonus: Int = 2
}