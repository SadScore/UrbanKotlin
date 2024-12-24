package Extensions

/**
 * Написать функцию расширения возведения в квадрат целого числа.
 */
fun main() {
    val a = 7

    println(a.getSquare())

}

fun Int.getSquare(): Int {
    return this * this



}