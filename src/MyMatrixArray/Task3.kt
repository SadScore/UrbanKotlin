package MyMatrixArray

/**
 * Дана матрица размером 5 х 5. Заполнить ее единицами в таком   порядке
 * 0 0 0 0 0
 * 0 0 0 0 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
fun main() {
    val matrix: Array<Array<Int>> = Array(5) { Array(5) { 0 } }
    for (k in 0 until matrix.size) {
        for (i in k until matrix[0].size - k)
            matrix[matrix.size - 1 - k][matrix[0].size - 1 - i] = 1
    }
    for (i in matrix.indices) {
        for (j in matrix.indices) {
            print("${matrix[i][j]}")
        }
        println()
    }

}
