import employees.Employee
import employees.Manager

fun main() {

    val employeeNelson = Employee(
       name = "Nelson",
       cpf =  "800.150.755-09",
       salary =  1250.0,
       password =  1234
    )

    val managerFran = Manager(
        name = "Fran",
        cpf =  "999.777.555-09",
        salary =  2000.0,
        password = 654
    )

    if(managerFran.authentication(password = 654)){
        println("Correct Password")
    } else  {
        println("Wrong Password")
    }

    println(employeeNelson)
    println("BONUS ${employeeNelson.bonus()}")
    println()
    println(managerFran)
    println("BONUS ${managerFran.bonus()}")
}