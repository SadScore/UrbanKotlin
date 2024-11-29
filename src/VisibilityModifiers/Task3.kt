package VisibilityModifiers

/**
 * Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16 включительно.
 */
fun main() {
    val matrix = Array(4){Array(4) {0}}
    loadArrayBySixteens(matrix)
    println(matrix.contentDeepToString())
}

fun loadArrayBySixteens(matrix: Array<Array<Int>>) {
    var counter = 1
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            matrix[i][j] = counter++
        }
    }
}