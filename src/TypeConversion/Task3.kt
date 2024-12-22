package TypeConversion

/**
 * Написать функцию, которая на вход принимает типизированный параметр.
 * Если это будет целое число, то в консоль вывести сумму вводимого числа и единицы,
 * если строка - сумму длины строки и единицы, если массив целых чисел - сумму элементов массива.
 */
fun main() {
    println(sumNumOrLength(4))
    println(sumNumOrLength("Hello"))
    val array: Array<Int> = arrayOf(1,5,7,8,9,8)
    println(sumNumOrLength(array))
}

fun <T> sumNumOrLength(a: T): Int {
    return when {
        a is Int -> a + 1
        a is String -> a.length + 1
        a as? Array<Int> != null -> a.sum()
        else -> 0
    }
}

