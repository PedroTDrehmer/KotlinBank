package system

import employees.AdmEmployee

class InternalSystem {

    fun enter(admin: AdmEmployee, password: Int) {
        if(admin.authentication(password)){
            println("Welcome")
        } else{
            println("Error")
        }
    }
}