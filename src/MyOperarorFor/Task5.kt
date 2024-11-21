package MyOperarorFor

/**
 * Дано целое число n = 20. Уменьшая его до 0, вывести на экран только четные числа.
 */
fun main() {
    for (n in 20 downTo 0 step 2) if (n != 0) println(n)
}