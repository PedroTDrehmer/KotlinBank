package employees

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
    ) : Employee(name, cpf, salary, password) {

    override val typeBonus: Int = 2

}