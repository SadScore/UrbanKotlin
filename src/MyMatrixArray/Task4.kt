package MyMatrixArray

/**
 * Дан набор целых чисел. Найти второе максимальное число.
 */
fun main() {
    val matrix = arrayOf(
        arrayOf(4, 76, 32),
        arrayOf(54, 65, 14),
        arrayOf(87, 45, 22)
    )
    var oneDArray: Array<Int> = Array((matrix.size * matrix[0].size)) { 1 }
    var index = 0
    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            oneDArray.set(index++, matrix[i][j])
        }
    }
    var sortedArray = oneDArray.sortedArray()
    println("Отсортированный список "+sortedArray.contentToString())
    var max = sortedArray.max()
    var maxIndex = sortedArray.indexOf(max)
    var max2 = sortedArray.get(maxIndex - 1)
    println("Второе максимальное значение = $max2")



}
