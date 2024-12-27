package List

/**
 * Дан список целых чисел.
 * Вывести в консоль сумму элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции sum().
 */
fun main() {
    val array: ArrayList<Int> = arrayListOf(9, 5, 7, 3, 5, 6, 91, 65)
    println(array.sum())
    println(mySum(array))
}

fun mySum(array: ArrayList<Int>) : Int {
    var result = 0
    for (i in 0..<array.size) {
        result +=array[i]
    }
    return result
}
