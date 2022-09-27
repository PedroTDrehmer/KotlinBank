import br.com.bank.accounts.*

fun main () {

    var enderecoNina = Adress()

    val Nina = Client(
        name = "Nina",
        cpf = "888",
        password = 123,
        adress = enderecoNina
    )

    val accountNina = AccountSavings(
        Nina, 101
    )

    val Maia = Client(
        name = "Maia",
        cpf = "777",
        password = 123,
        adress = Adress()
    )

    val accountMaia = AccountSavings(
        Maia, 101
    )


    println(accountMaia.balance)

    accountMaia.deposit(10.0)






/*

  println(accountNina.holder.adress.city)
    println(Nina)

    println(accountMaia.holder)
    println(accountMaia)

    val Joao = Client(
        name = "Joao",
        cpf = "777",
        password = 123
    )

    val accountJoao = AccountChecking(
        Joao, 101, 222
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
*/
}