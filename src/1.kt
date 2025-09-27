import kotlin.random.Random

fun main() {


    val target = Random.nextInt(1, 50)
    println("Угадайте число от 1 до 50")

    while (true) {
        print("Введите число: ")
        val input = readln().toInt()
        when {
            input < target -> println("Загаданное число больше.")
            input > target -> println("Загаданное число меньше.")
            else -> {
                println("Поздравляю! Ты угадал число: $target")
                break
            }
        }
    }
}