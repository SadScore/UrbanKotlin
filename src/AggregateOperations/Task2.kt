package AggregateOperations

/**
 * Дан список целых чисел. С помощью функции fold вывести элементы этой коллекции в строку.
 * Т.е. входной список: val numbers = listOf(1, 2, 3, 4). Выходные данные: 1234
 */
fun main() {
    val numbers = listOf(1, 2, 3, 4)
    val numbersString = numbers.fold("Выходные данные: ") {acc, i -> "$acc$i" }
    println(numbersString)
}