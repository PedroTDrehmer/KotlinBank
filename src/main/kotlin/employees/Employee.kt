package employees

open class Employee(
    val name: String,
    val cpf: String,
    var salary: Double,
    val type: Int
) {

    fun bonus(): Double {
        return when (type) {
            0 -> salary
            1 -> salary * 0.1
            else -> salary * 0.2
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