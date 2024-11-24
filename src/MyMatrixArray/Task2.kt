package MyMatrixArray

/**
 *  Создать матрицу размером 3 х 5. Найти элемент в этом массиве, который является средним(медиана)
 */
fun main() {
    val matrix: Array<Array<Int>> = arrayOf(
        arrayOf(10, 87, 45),
        arrayOf(96, 11, 78),
        arrayOf(56, 80, 15),
        arrayOf(16, 23, 42),
        arrayOf(99, 50, 13)
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
    if (sortedArray.size % 2 == 0) {
        val midIndex1 = (sortedArray.size / 2) - 1
        val midIndex2 = sortedArray.size / 2
        println ("Медианное значение " + (sortedArray[midIndex1] + sortedArray[midIndex2]) / 2)
    } else {
        val midIndex = sortedArray.size / 2
       println("Медианное значение " + sortedArray[midIndex])
    }







}


