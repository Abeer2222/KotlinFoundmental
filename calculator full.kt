import kotlin.random.Random

fun main() {
    fun IntNumber(num: String): Int {
        try {
            return num.toInt()
        } catch (e: Exception) {
            return 0
        }
    }

    fun sum(n1: Int, n2: Int) {
        println("$n1 + $n2 = " + (n1 + n2))
    }

    fun subtraction(n1: Int, n2: Int) {
        println("$n1 - $n2 = " + (n1 - n2))
    }

    fun division(n1: Int, n2: Int) {
        println("$n1 / $n2 = " + ((n1 / n2).toFloat()))
    }

    fun multiplication(n1: Int, n2: Int) {
        println("$n1 * $n2 = " + (n1 * n2))
    }
    while (true) {
        print("Enter your first number: ")
        val num1 = IntNumber(readLine()!!)
        print("Enter the Operator: ")
        val operator = readLine()
        println("$num1 $operator")
        print("Enter your second number: ")
        val num2 = IntNumber(readLine()!!)
        when (operator) {
            "+" -> {
                sum(num1, num2)
                break
            }
            "*" -> {
                multiplication(num1, num2)
                break
            }
            "/" -> {
                division(num1, num2)
                break
            }
            "-" -> {
                subtraction(num1, num2)
                break
            }
        }

    }
}
