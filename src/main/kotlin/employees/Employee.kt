package employees

abstract class Employee(
    val name: String,
    val cpf: String,
    var salary: Double,
    val password: Int
) {
    open val typeBonus: Int = 0

    override fun toString(): String {
        return """
            |Name ${name} 
            |CPF ${cpf} 
            |Salary ${salary} 
            |Type Bonus ${typeBonus}
            |Password ${password}""".trimMargin()
    }

    open fun bonus():Double {
       return when (typeBonus) {
            1 -> salary * 1.1
            2 -> salary * 1.2
            else -> salary
        }
    }

    fun authentication(password: Int): Boolean {
        if (this.password == password) {
            return true
        }
        return false
    }
}