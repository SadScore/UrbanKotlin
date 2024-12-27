package List

/**
 * Дан список целых чисел. Вывести в консоль среднее арифметическое элементов списка двумя способами:
 * в ручную – через цикл, с применением стандартной функции average().
 */
fun main() {
    val array: ArrayList<Int> = arrayListOf(9, 5, 7, 3, 5, 6, 91, 65)
    println(myAverage(array))
    println(array.average())

}

fun myAverage(array: ArrayList<Int>) : Double {
    var result = 0
    for (i in array) {
        result += i
    }
    return result / (array.size).toDouble()
}
