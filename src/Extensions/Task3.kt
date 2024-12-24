package Extensions

/**
 * Написать функцию расширения определения последнего индекса в строке.
 */
fun main() {
    val a: String = "Extensions"
    println(a.lastIndex)

}

val String.lastIndex: Int
    get() = length - 1
