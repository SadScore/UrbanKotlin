package AnonymousFunctions

/**
 * Создать массив целых чисел произвольного размера. Написать анонимную функцию isEven, проверяющую число на четность,
 * она возвращает логический тип. Написать функцию checkArrayElement
 * проверки массива и его элементов на четность, она на вход принимает массив и вторым параметром анонимную функцию типа isEven.
 */
fun main() {
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)
    val isEven = fun(a: Int): Boolean {
        if (a % 2 != 0) return false
        return true
    }
    println(checkArrayElement(array, isEven).contentToString())

}

fun checkArrayElement(array: Array<Int>, op: (Int) -> Boolean): Array<Int> {
    var result: Array<Int> = arrayOf()
    for (number in array) {
        if (op(number)) result += number
    }
    return result

}

