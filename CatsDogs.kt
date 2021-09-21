import kotlin.random.Random

fun main() {
    val catsList = listOf("Lili", "Meep", "Patchy", "Furball", "Snowball")
    val dogsList = listOf("Mike", "Spark", "Lai", "Kuma", "Kai")
    val ages = listOf(4, 9, 3, 5, 2, 6, 10, 1)

    abstract class Animal(val name: String) {
        val Animalname = name
        val AnimalAge = ages[Random.nextInt(ages.size)]
        abstract fun talk()
    }

    class Dog(name: String) : Animal(name) {
        override fun talk() {
            println("$Animalname : Woof - Age is : $AnimalAge")
        }
    }

    class Cat(name: String): Animal(name){
        override fun talk() {
            println("$Animalname : Meow - Age is : $AnimalAge")
        }
    }

    val dogList = arrayListOf<Dog>()
    val catList = arrayListOf<Cat>()

    for (i in dogsList.indices){
        dogList.add(Dog(dogsList[i]))

    }
    for (i in catsList.indices){
        catList.add(Cat(catsList[i]))

    }
    for(cat in catList){
        cat.talk()
        for(dog in dogList){
            if (dog.AnimalAge > cat.AnimalAge){
                dog.talk()
            }
        }
    }
}




