import employees.AdmEmployee
import employees.Manager

fun main() {

    val employeeNelson = Manager(
        name = "Nelson",
        cpf = "800.150.755-09",
        salary = 1250.0,
        password = 1234
    )
    println(employeeNelson)
    println(employeeNelson.authentication(password = 1234))


}
