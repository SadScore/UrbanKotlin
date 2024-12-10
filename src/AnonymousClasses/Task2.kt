package AnonymousClasses

/**
 * Посчитать сумму элементов побочной диагонали матрицы 4х4.
 */
fun main() {
    val array: Array<Array<Int>> = arrayOf(
        arrayOf(5,1,1,7),
        arrayOf(1,5,7,1),
        arrayOf(1,7,5,1),
        arrayOf(7,1,1,5),
    )
    findSecondaryDiagonal(array)
}
fun findSecondaryDiagonal(array: Array<Array<Int>>){
    var sum = 0
    for (i in array.indices){
        sum += array[i][array[0].size - 1 - i]
    }
    println("Сумма побочной диагонали ровна: $sum")

}