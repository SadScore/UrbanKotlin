package Extensions

import kotlin.math.sqrt

/**
 * Написать функцию получения квадратного корня из целого числа.
 */
fun main() {
    val a: Int = 121
    val b: Int = 81

    println(a.sqrt())
    println(b.sqrt())

}
fun Int.sqrt(): Int {
    return sqrt(this.toDouble()).toInt()

}
