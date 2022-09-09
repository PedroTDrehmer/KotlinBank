package accounts

class Account(
    val holder: String,
    val agency: Int,
    var balance: Double
) {

    fun deposit(value: Double) {
        balance += value
    }

    fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
        }
    }

    fun transfer(value: Double, destination: Account): Boolean {
        if (balance >= value) {
            balance -= value
            destination.deposit(value)
            return true
        }
        return false
    }
}