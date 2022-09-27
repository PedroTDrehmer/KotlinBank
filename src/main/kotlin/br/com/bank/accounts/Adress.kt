package br.com.bank.accounts

data class Adress (
    var city: String = "",
    var complement: String = ""
){
    override fun toString(): String {
        return """
            Adress(city='$city', 
            complement='$complement')
            """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Adress //Cast

        if (city != other.city) return false
        if (complement != other.complement) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + complement.hashCode()
        return result
    }

}
