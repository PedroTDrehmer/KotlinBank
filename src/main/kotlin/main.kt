import accounts.Account

fun main() {

    val account1 = Account(
        "Nina", 1000, 0.0
    )

    val account2 = Account(
        "Joao", 1000, 0.0
    )
    account1.deposit(50.0)
    account1.withdraw(40.0)

    if(account1.transfer(5.0, account2)){
        println("transfer successful ")
    }else{
        println("fail")
    }

    println("Holder ${account1.holder} Account Balance ${account1.balance}")
    println("Holder ${account2.holder} Account Balance ${account2.balance}")

}