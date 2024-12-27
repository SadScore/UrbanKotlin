package List

/**
 * Дан список целых чисел. Вывести в консоль первый элемент списка двумя способами:
 * обратившись по индексу, через стандартную функцию first().
 */

fun main() {
    val array: ArrayList<Int> = arrayListOf(9,5,7,3,5,6,91)
    println(array[0])
    println(array.first)
}