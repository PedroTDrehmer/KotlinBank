import accounts.Account

fun main() {

    val account1 = Account(
        holder = "Nina",
        accountNumber = 1000
    )

    println("Holder ${account1.holder}")
    println("Account Number ${account1.accountNumber}")
    println("Account Balance ${account1.balance}")

//    when {
//        balance > 0.0 -> println("Positive")
//        balance == 0.0 -> println("Neutral")
//        else -> println("Negative")
//    }
}