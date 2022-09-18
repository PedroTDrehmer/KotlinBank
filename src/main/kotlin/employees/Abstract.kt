package employees

abstract class Abstract(
    val name: String,
    val cpf: String,
    var salary: Double,
    val password: Int
) {
    abstract val typeBonus: Int
}