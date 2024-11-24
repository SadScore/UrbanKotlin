package MyMatrixArray

/**
 * Найти минимальный элемент в целочисленном массиве размера 3 х 3
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(91, 89, 90),
        arrayOf(55, 99, 90),
        arrayOf(67, 17, 10)
    )
    var min = matrix[0][0]
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] < min) {
                min = matrix[i][j]
            }
        }
    }
    println(min)
}
