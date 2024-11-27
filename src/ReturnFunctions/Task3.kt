package ReturnFunctions

/**
 * Дана матрица размера M×N и целое число K (1≤K≤M). Вывести элементы K-й строки данной матрицы
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(4, 8, 15, 16, 23),
        arrayOf(42, 1997, 4, 7, 15),
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(0, 1, 0, 1, 0),
        arrayOf(5, 7, 5, 7, 5)

    )
    val k = 1

    printRowOfMatrix(k, matrix)
}
fun printRowOfMatrix(numberOfRow: Int, matrix: Array<Array<Int>>) {
    println(matrix[numberOfRow].contentDeepToString())
}