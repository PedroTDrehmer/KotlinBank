package system

import employees.AuthenEmployee

class InternalSystem {

    fun enter(admin: AuthenEmployee, password: Int) {
        if(admin.authentication(password)){
            println("Welcome")
        } else{
            println("Error")
        }
    }
}