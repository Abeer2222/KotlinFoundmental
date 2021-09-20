
fun main() {
    fun IntNumber(num: String): Int{
        try {
            return num.toInt()
        }catch (e: Exception){
            return 0
        }
    }

    fun sum(n1: Int, n2: Int): Int{
        return n1 + n2
    }

    while(true){
        print("Enter your first number: ")
        val num1 = IntNumber(readLine()!!)
        print("Enter your second number: ")
        val num2 = IntNumber(readLine()!!)

        println("$num1 + $num2 = "+sum(num1, num2))

        print("Would you like to add more numbers? (Y/N) >> ")
        val agein = readLine()
        if(agein != "Y" && agein != "y"){
            break
        }
    }
}
