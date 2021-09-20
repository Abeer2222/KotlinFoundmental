import kotlin.collections.List as List1

fun main() {
    val Countries = ArrayList<ArrayList<String>>()

    for (i in 1..3) {
        var userCountry = ""
        var userCity = ""

        print("Enter Country $i: ")
        userCountry = readLine()!!
        print("the capital city of $userCountry is: ")
        userCity = readLine()!!
        Countries.add(arrayListOf(userCountry, userCity))
    }
    println("The List of the countries and their capitals: ")
    for (i in Countries) {
        if (i.isNotEmpty()) {
            println("${i[0]}'s capital  is ${i[1]}.")
        }
    }
}



