package Filter

/**
 * Дан map, в которой элементы содержат ключ целое число, значения имена.
 * Отфильтруйте ее по значению ключа, допустим, менее значения равного 5.
 */
fun main() {
    val names = mapOf(
        3 to "Den",
        5 to "Helen",
        2 to "Max",
        6 to "Vance",
        1 to "John",
        )
    val filteredNames = names.filter { (key) -> key < 5 }
    println(filteredNames)
}