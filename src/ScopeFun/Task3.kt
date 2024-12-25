package ScopeFun

/**
 * Дан массив целых чисел.
 * С помощью scope – функции with вывести в консоль данный массив, количество элементов массива, сумму элементов массива.
 */
fun main() {
    val array: Array<Int> = arrayOf(4,8,15,16,23,42)
    with(array) {
        forEach { n -> print("$n ") }
        println("\nРазмер массива: ${array.size}")
        println("Сумма = ${sum(array)}")

    }

}
fun sum(array: Array<Int>) : Int{
    var result = 0
    for (i in array) {
        result += i
    }
    return result
}