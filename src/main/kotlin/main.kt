import accountOwners.Owner

fun main() {

    val nina = Owner()

    println("Holder ${nina.holder}")
    println("Account Number ${nina.accountNumber}")
    println("Account Balance ${nina.balance}")

//    when {
//        balance > 0.0 -> println("Positive")
//        balance == 0.0 -> println("Neutral")
//        else -> println("Negative")
//    }
}