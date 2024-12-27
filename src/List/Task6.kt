package List

/**
 * Дан список целых чисел.
 * Вывести в консоль сумму индексов элементов списка двумя способами: в ручную – через цикл,
 * с применением стандартной функции indices().
 */
fun main() {
    val array: ArrayList<Int> = arrayListOf(9, 5, 7, 3, 5, 6, 91, 65)
    println(mySumOfIndex(array))
    println(array.indices.sum())

}

fun mySumOfIndex(array: ArrayList<Int>): Int{
    var sumIndex = 0
    for (i in array.indices) {
        sumIndex+=i
    }
    return sumIndex
}
