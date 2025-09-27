import kotlin.random.Random

fun main() {
    println(Random.nextInt())

    println(Random.nextLong())
    println(Random.nextFloat())
    println(Random.nextDouble())

    Random.nextInt(100)
    Random.nextInt(1, 100)
    Random.nextLong(100)
    Random.nextLong(1,100)
    Random.nextDouble(5.0)
    Random.nextDouble(0.0,5.0)

    val target = Random.nextInt(1,100)
    println("Угадайте число от 1 до 100")

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