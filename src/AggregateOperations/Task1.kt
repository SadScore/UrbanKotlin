package AggregateOperations

/**
 * Дан список целых чисел. Необходимо найти сумму его элементов начиная с 3 заканчивая 9.
 */
fun main() {
    val numbers = listOf(1, 2, 0, 0, 0, 0, 0, 0, 0, 3, 4, 5, 6, 7, 8, 9)

    val sumNumbers = numbers.foldIndexed(0) {i, sum, v -> if (i in 2..8) sum + v else sum }
    println(sumNumbers)

}