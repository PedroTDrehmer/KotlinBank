import accounts.Account

fun main() {

    val account1 = Account(
        holder = "Nina",
        accountNumber = 1000
    )
    account1.deposit(50.0)
    account1.withdraw(40.0)

    println("Holder ${account1.holder}")
    println("Account Number ${account1.accountNumber}")
    println("Account Balance ${account1.balance}")

}