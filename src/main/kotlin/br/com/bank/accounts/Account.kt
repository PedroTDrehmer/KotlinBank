package br.com.bank.accounts

import br.com.bank.test.totalAccounts

abstract class Account(
    val holder: Client,
    val agency: Int
) {
    var balance: Double = 0.0
        protected set

    init {
        println("Creating Account")
        totalAccounts++
    }

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