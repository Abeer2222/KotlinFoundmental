import kotlin.random.Random

fun main() {
    class Country(val name: String,val capital: String) {
        fun print() {
            println("$name's capital is $capital")
        }
    }

    val countries = listOf(
        Country("Saudi Arabia", "Riyadh"), Country("Egypt", "Cairo"),
        Country("Spain", "Madrid"), Country("France", "Paris"),
        Country("Kuwait", "Kuwait"), Country("UA", "Abu dhabi"),
        Country("Qatar", "Doha"),
        Country("UK", "London"),
        Country("USA", "D.C."), Country("Cuba", "Havana")
    )

    //for(c in countries.indices)
    //var j=0
    var q = 0
    var score = 0
    while (true) {
        val randomCourtny = countries[Random.nextInt(countries.size)]
        println("What is the capital of ${randomCourtny.name}?")
        q++
        val answer = readLine()!!
        if (answer == randomCourtny.capital) {
            println("Right Answer!!")
            score++
        } else {
            println("Wrong Answer :(")
            println("Actually!!")
            randomCourtny.print()
            println("-------------------------------")
        }
        if (q >= 3) {
            println("You're score: $score ")
            q = 0
            score = 0
            print("do you want another chance? (Y/N)")
            val chance= readLine()!!
            if (chance.uppercase() != "Y") {
                println("Game Over")
                break
            }
        }
    }
}

