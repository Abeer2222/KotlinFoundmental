fun main() {
    val Movies = arrayListOf<String>()
    var n: Int = 1
    fun Enter() {
        for (m in 1..3) {
            print("Enter movie $n: ")
            Movies.add(readLine()!!)
            n++
        }
    }
Enter()
    while (true) {
        println("you want to add more than ${Movies.size} movies? (Y/N)?")
        val more = readLine()
        if (more != "Y" && more != "y") {
            break
        } else Enter()
    }
    println("Your Movies List: ")
    println(Movies)

}
