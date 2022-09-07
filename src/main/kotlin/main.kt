import accountOwners.Owner

fun main() {

    val owner1 = Owner(
        holder = "Nina",
        accountNumber = 1000
    )

    println("Holder ${owner1.holder}")
    println("Account Number ${owner1.accountNumber}")
    println("Account Balance ${owner1.balance}")

//    when {
//        balance > 0.0 -> println("Positive")
//        balance == 0.0 -> println("Neutral")
//        else -> println("Negative")
//    }
}