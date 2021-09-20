fun main() {
    val countries = listOf<String>("Saudi Arabia", "France", "Kuwait")
    val capitals = arrayListOf<String>()

    for(i in countries.indices){
        print("${countries[i]}'s capital city is ")
        val answer:String = readLine()!!
        capitals.add(answer)
    }
    println("The List of the countries and their capitals: ")
    for(i in countries.indices){
        println("country: ${countries[i]}  Capital city: ${capitals[i]}")
    }
}
