package ComplexTask

/**
 * Даны два целых числа a и b (a<b). Найти сумму квадратов всех целых чисел от a до b включительно.
 */
fun main() {
    val a = 78
    val b = 99
    var sum: Int = 0

    for (i in a..b) {
        sum += i * i
    }
    println(sum)
}