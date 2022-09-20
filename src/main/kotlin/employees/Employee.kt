package employees

abstract class Employee(
    val name: String,
    val cpf: String,
    var salary: Double,
) {
    open val typeBonus: Int = 0

    override fun toString(): String {
        return """
            |Name ${name} 
            |CPF ${cpf} 
            |Salary ${salary} 
            |Type Bonus ${typeBonus}""".trimMargin()
    }

    open fun bonus():Double {
       return when (typeBonus) {
            1 -> salary * 1.1
            2 -> salary * 1.2
            else -> salary
        }
    }
}