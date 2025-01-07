package Sorting

/**
 * Дана матрица целых чисел размерностью 3х4. Проверить, являются ли внутренние массивы матрицы пилообразными,
 * т.е. рядом с элементом массива находятся соседи большие или меньшие его.
 * Необходимо вывести количество пилообразных массивов и сами массивы
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(16, 8, 15, 7),
        arrayOf(5, 5, 5, 5),
        arrayOf(321, 222, 2, 76)
    )
    var count = 0

    matrix.forEach {
        if (isSaw(it)) {
            count++
            println(it.contentToString())
        }
    }
    println("Всего пилообразных массивов в матрице: $count")
}
fun isSaw(array: Array<Int>): Boolean {

    for ((index, value) in array.withIndex()) {
        array.forEachIndexed { i, v -> if ((index == i + 1 || index == i - 1) && value == v) return false }
    }

    return true
}