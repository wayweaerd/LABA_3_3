fun main() {
    val input = readln()
    var count = 0

    when (input) {
        "а" -> count++
        "о" -> count++
        "у" -> count++
        "э" -> count++
        "и" -> count++
        "ы" -> count++
        "е" -> count++
        "ё" -> count++
        "ю" -> count++
        "я" -> count++
    }

    println(count)
}