fun main() {

    val holder: String = "Account Owner"
    val accountNumber: Int = 1000
    var balance: Double = 0.0

    println("Holder $holder")
    println("Account Number $accountNumber")
    println("Account Balance $balance")

    when {
        balance > 0.0 -> println("Positive")
        balance == 0.0 -> println("Neutral")
        else -> println("Negative")
    }
}