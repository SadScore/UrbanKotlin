package Set

/**
 * Дан массив целых чисел. Нужно переместить все нули в конец массива, сохранив порядок остальных элементов.
 * Т.е. исходный массив 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0 Результат: 6, 2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0
 */
fun main() {
    val array: Array<Int> = arrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)

    println(sortedZero(array).contentToString())


}

fun sortedZero(array: Array<Int>): Array<Int> {
    var numbers: Array<Int> = arrayOf()
    var zeros: Array<Int> = arrayOf()
    array.forEach { if (it == 0) zeros += it else numbers += it }
    val result = numbers + zeros
    return result


}
