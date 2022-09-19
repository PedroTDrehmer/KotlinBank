package employees

abstract class AdmEmployee(
    name: String,
    cpf: String,
    salary: Double,
    private val password: Int
) : AbstractEmployee(
    name,
    cpf,
    salary
) {
//    val typeBonus: Int = 0

    override fun toString(): String {
        return """
            |Name ${name} 
            |CPF ${cpf} 
            |Salary ${salary} 
            |Type Bonus ${typeBonus}
            |Password ${password}""".trimMargin()
    }

    open fun authentication(password: Int): Boolean {
        if (this.password == password) {
            println("Correctly Password")
            return true
        }
        println("Wrong Password")
        return false
    }
}