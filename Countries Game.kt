import kotlin.random.Random

fun main() {
    class Country( name: String, capital: String) {
        val name=name
        val capital = capital
        fun print(){
            println("$name's capital is $capital")
        }
    }
    val countries= listOf(Country("Saudi Arabia","Riyadh"),Country("Egypt","Cairo"),
        Country("Spain","Madrid"),Country("France","Paris"),
        Country("Kuwait","Kuwait"),Country("UA","Abu dhabi"),
        Country("Qatar","Doha"),
        Country("UK","London"),
        Country("USA","D.C.")
        ,Country("Cuba","Havana"))

    //for(c in countries.indices)
    var j=0
        while(j< 3) {
            val randomNum = Random.nextInt(countries.size)
            
        }
        

}




