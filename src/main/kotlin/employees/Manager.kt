package employees

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    type: Int,
    password: Int
): Employee (name, cpf, salary, type, password) {

    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}