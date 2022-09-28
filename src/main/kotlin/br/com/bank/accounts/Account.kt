package br.com.bank.accounts

import br.com.bank.exception.insufficientFundsException
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

    fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
            println("Successful Withdraw")
        } else {
            println("Insufficient Funds")
            throw insufficientFundsException()
        }
    }

    fun transfer(value: Double, destination: Account) {
        if (balance >= value) {
            balance -= value
            destination.deposit(value)
            println("Successful Transfer")
        } else {
            println("Insufficient Funds")
            throw insufficientFundsException()
        }
    }
}