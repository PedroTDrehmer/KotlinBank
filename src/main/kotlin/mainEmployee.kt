import employees.Employee
import employees.Manager

fun main() {

    val employeeNelson = Employee(
       name = "Nelson",
       cpf =  "800.150.755-09",
       salary =  1250.0,
       password =  1234
    )

    println(employeeNelson)
    println("BONUS ${employeeNelson.bonus()}")

    val managerFran = Manager(
        name = "Fran",
        cpf =  "999.777.555-09",
        salary =  2000.0,
        password = 654
    )

    println(managerFran)
    println("BONUS ${managerFran.bonus()}")

    if(managerFran.authentication(password = 654)){
        println("Correct Password")
    } else  {
        println("Wrong Password")
    }

    val bonus = managerFran.bonus()

    println(bonus)
}