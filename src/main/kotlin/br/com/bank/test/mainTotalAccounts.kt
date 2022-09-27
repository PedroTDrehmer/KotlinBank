package br.com.bank.test

import br.com.bank.accounts.AccountSavings
import br.com.bank.accounts.Adress
import br.com.bank.accounts.Client

var totalAccounts = 0

fun main(){

//    mainAccount()

    var adressAlex = Adress()

    val Alex = Client(
        name = "Alex",
        cpf = "555",
        password = 123,
        adress = adressAlex
    )

    val accountAlex = AccountSavings(
        Alex, 101
    )

    println(totalAccounts)
}