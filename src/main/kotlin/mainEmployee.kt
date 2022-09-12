import employees.Employee

fun main() {

    val employee1 = Employee(
        "Nelson",
        "80015075509",
        1250.0,
        0
    )

    println("""
        |Name ${employee1.name} 
        |CPF ${employee1.cpf} 
        |Salary ${employee1.salary} 
        |Type ${employee1.type}""".trimMargin())
}