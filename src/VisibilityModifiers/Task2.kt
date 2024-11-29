package VisibilityModifiers

/**
 * Написать функцию поиска четных чисел двумерного массива размерностью 4 х 4.
 */
val matrix = arrayOf(
    arrayOf(10, 11, 25, 9),
    arrayOf(16, 2, 3, 48),
    arrayOf(767, 766, 33, 78),
    arrayOf(222, 111, 245, 244),
)

fun main() {

    val onlyEvenOfMatrix = findEvenNumbersInMatrix(matrix)
    println(onlyEvenOfMatrix.toString())
}
fun findEvenNumbersInMatrix(matrix: Array<Array<Int>>): ArrayList<Int> {
    fun isEven(number: Int) = number % 2 == 0
    val arrayEven: ArrayList<Int> = ArrayList()
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            if (isEven(matrix[i][j])) arrayEven.add(matrix[i][j])
        }
    }
    return arrayEven
}