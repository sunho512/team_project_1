fun add(x: Double, y: Double): Double = x + y
fun subtract(x: Double, y: Double): Double = x - y
fun multiply(x: Double, y: Double): Double = x * y
fun divide(x: Double, y: Double): Double = x / y

fun main() {
    println("어서오십시오.")

    while (true) {
        try {
            print("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n")
            val expression = readLine()

            if (expression.equals("종료", ignoreCase = true)) {
                println("프로그램을 종료합니다.")
                break
            }

            val tokens = expression?.split(" ")
            if (tokens?.size != 3) {
                println("Invalid expression. Please try again.")
                continue
            }

            val num1 = tokens[0].toDouble()
            val operator = tokens[1]
            val num2 = tokens[2].toDouble()

            val result = when (operator) {
                "+" -> add(num1, num2)
                "-" -> subtract(num1, num2)
                "*" -> multiply(num1, num2)
                "/" -> divide(num1, num2)
                else -> {
                    println("Invalid operator. Please try again.")
                    continue
                }
            }

            println("Result: $result")
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter numeric values.")
        } catch (e: Exception) {
            println("Error: ${e.message}")
        }
    }
}