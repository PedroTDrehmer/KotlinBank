package br.com.bank.accounts

abstract class Account(
    val holder: Client,
    val agency: Int,
    val number: Int
) {
    var balance: Double = 0.0
        protected set

    fun deposit(value: Double) {
        balance += value
    }

    open fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
        }
    }

    open fun transfer(value: Double, destination: Account): Boolean {
        if (balance >= value) {
            balance -= value
            destination.deposit(value)
            return true
        }
        return false
    }
}