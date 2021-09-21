//*Functions*\\
    //Arguments/Parameters
    fun greet(name: String){
    println("Hello $name")
    }
    greet("Fred")
    //With 2 types
    fun greet(type: Int, name: String){
    //to RETURN var (): Int or : Boolean
    fun add(num1: Int, num2: Int): Int{
        return num1 + num2}


//*Lists and Arrays*\\
        val myList = listOf("Car", 15, false, 19, "Bike")
        val myArray = arrayOf("Car", 15, false, 19, "Bike")
        //Lists are immutable, can't change
        //Arrays are mutable
    //both Lists and Arrays have fixed sizes
    myList.size //Length

//*ArrayLists*\\
        val shoppingList = arrayListOf<Int>()//Or <Any,String..>
        shoppingList.add(1)
        shoppingList.add(5555)
        shoppingList[0] = "Butter" //By index
        shoppingList.remove(6788)//Remove

        for(item in shoppingList){
            println(item)        }
    //Array index
        println("${shoppingList[0]}")
        shoppingList.sort()
        shoppingList.sum()
        shoppingList.remove(shoppingList[0])

//*2D ArrayList*\\
        val credentials = arrayListOf<ArrayList<String>>()
        credentials.add(ArrayList(arrayListOf("user1", "12345")))
        credentials.add(ArrayList(arrayListOf("user2", "password")))
        credentials.add(ArrayList(arrayListOf("Bob", "00000")))
        println(credentials[2][0])  // --> Bob
        println(credentials[0][1])  // --> 12345

    //To add input to the 2d array
        var userCountry = ""
        var userCity = ""
        print("Enter Country $i: ")
        userCountry = readLine()!!
        print("the capital city of $userCountry is: ")
        userCity = readLine()!!
        Countries.add(arrayListOf(userCountry, userCity))
