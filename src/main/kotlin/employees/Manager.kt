package employees

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: Int
    ) : Employee(name, cpf, salary, password) {

    override val type: Int = 2
    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}