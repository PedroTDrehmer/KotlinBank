package accounts

class Account(
    val holder: String,
    val accountNumber: Int
) {
    var balance: Double = 0.0

    fun deposit(value: Double) {
        this.balance += value
    }

    fun withdraw(value: Double) {
        this.balance -= value
    }
}