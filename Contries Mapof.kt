fun main() {
    val countries = mutableMapOf<String, String>()
    for (i in 0..2) {
        var country = ""
        var capital = ""
        print("Enter a country:  ")
        country = readLine()!!
        print("Enter the capital:  ")
        capital = readLine()!!

        countries[country] = capital
    }

    for (i in countries) {
        println("${i.key}'s capital is ${i.value}.")
    }

}




