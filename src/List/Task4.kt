package List

/**
 * Дан список целых чисел.
 * Вывести в консоль количество элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции count().
 */
fun main() {
    val array: ArrayList<Int> = arrayListOf(9, 5, 7, 3, 5, 6, 91, 65)
    println(array.count())
    println(myCount(array))
}
fun myCount(array: ArrayList<Int>) : Int {
    var count = 0
    for (i in array) count++
    return count
}