import br.com.bank.accounts.Account
import br.com.bank.accounts.AccountChecking
import br.com.bank.accounts.AccountSavings
import br.com.bank.accounts.Client

fun main() {

    val Nina = Client(name = "Nina", cpf = "888", password = 123)

    val accountNina = AccountSavings(
        Nina, 101, 111
    )

    val Joao = Client(name = "Joao", cpf = "777", password = 123)

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

    println(accountNina)

}