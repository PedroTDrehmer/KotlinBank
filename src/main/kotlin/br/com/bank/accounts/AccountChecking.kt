package br.com.bank.accounts

class AccountChecking(
    holder: Client,
    agency: Int,
) : Account(
    holder,
    agency,

) {

    override fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value - 1.0
        }
    }

    override fun transfer(value: Double, destination: Account): Boolean {
        if (balance >= value) {
            balance -= value - 1.0
            destination.deposit(value)
            return true
        }
        return false
    }

}