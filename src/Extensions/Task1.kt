package Extensions

/**
 * Написать функцию расширения возведения в квадрат целого числа.
 */
fun main() {
    val a = 7

    println(a.square())

}

fun Int.square(): Int {
    return this * this



}