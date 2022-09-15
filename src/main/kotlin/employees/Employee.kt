package employees

open class Employee(
    val name: String,
    val cpf: String,
    var salary: Double,
    val password: Int
) {
    open val type: Int = 0

    override fun toString(): String {
        return """
            |Name ${name} 
            |CPF ${cpf} 
            |Salary ${salary} 
            |Type ${type}""".trimMargin()
    }

    open fun bonus():Double {
       return when (type) {
            1 -> salary * 1.1
            2 -> salary * 1.2
            else -> salary
        }
    }

//    fun bonus(): Double {
//        return if (type == 0){
//            salary
//        } else if (type == 1){
//            salary * 0.1
//        } else {
//            salary * 0.2
//        }
//    }
}