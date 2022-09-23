import br.com.bank.accounts.Account

fun main() {

    val accountNina = Account(
        "Nina", 1000, 0.0
    )

    val accountJoao = Account(
        "Joao", 1000, 0.0
    )
    accountNina.deposit(50.0)
    accountNina.withdraw(40.0)

    if(accountNina.transfer(5.0, accountJoao)){
        println("transfer successful ")
    }else{
        println("fail")
    }

    println("Holder ${accountNina.holder} Account Balance ${accountNina.balance}")
    println("Holder ${accountJoao.holder} Account Balance ${accountJoao.balance}")

    println(accountNina)

}