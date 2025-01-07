package Sorting

/**
 * Дана матрица целых чисел размерностью 3х4. Отсортировать ее строки по возрастанию.
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(16, 8, 15, 7),
        arrayOf(77, 32, 5, 90),
        arrayOf(321, 222, 2, 76)
    )
    matrix.forEach { it.sort() }
    println(matrix.contentDeepToString())
}