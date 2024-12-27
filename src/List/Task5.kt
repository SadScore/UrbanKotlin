package List

import ScopeFun.sum

/**
 * Дан список целых чисел. Вывести в консоль сумму двух последних элементов списка двумя способами:
 * в ручную – через цикл, с применением стандартной функции takeLast().
 */
fun main() {
    val array: ArrayList<Int> = arrayListOf(9, 5, 7, 3, 5, 6, 91, 65)
    println(takeSumOfTwoLast(array))
    println(array.takeLast(2).sum())
}
fun takeSumOfTwoLast(array: ArrayList<Int>): Int {
    var sum = 0
    for (i in 0..<array.size) {
        if (i == array.size - 1 || i == array.size - 2)
            sum +=array[i]
    }
    return sum
}