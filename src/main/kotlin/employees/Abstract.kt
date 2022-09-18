package employees

class Abstract(
    val name: String,
    val cpf: String,
    var salary: Double,
    val password: Int
) {

    open val typeBonus: Int = 0
}