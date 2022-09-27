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
        if (value > 0){
            balance += value
            println("Successful Deposit")
        } else {
            throw insufficientFundsException()
        }
    }

    open fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
            println("Successful Withdraw")
        } else {
            throw insufficientFundsException()
        }
    }

    open fun transfer(value: Double, destination: Account) {
        if (balance >= value) {
            balance -= value
            destination.deposit(value)
        } else {
            throw insufficientFundsException()
        }
    }
}