import employees.AuthenEmployee
import employees.Manager
import system.InternalSystem

fun main() {

    val managerNelson = Manager(
        name = "Nelson",
        cpf = "800.150.755-09",
        salary = 1250.0,
        password = 1234
    )
    
    InternalSystem().enter(managerNelson, 1234)

    managerNelson.authentication(1234)

}
