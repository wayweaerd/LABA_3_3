fun main() {
    print("Введите первое число, знак операции и второе число через пробел: ")
    val input = readln().split(" ")
    val symbol = input[1]
    val num1 = input[0].toDouble()
    val num2 = input[2].toDouble()
    var result = 0.0
    when (symbol) {
        "/" -> result = num1 / num2
        "*" -> result = num1 * num2
        "+" -> result = num1 + num2
        "-" -> result = num1 - num2
        else -> println("Неккоректный ввод")
    }
    println("$num1 $symbol $num2 = $result")
}
