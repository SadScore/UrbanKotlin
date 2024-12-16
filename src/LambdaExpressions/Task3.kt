package LambdaExpressions

/**
 * Дан массив произвольного набора чисел. Отфильтруйте его, чтобы в нем остались только положительные числа.
 */
fun main() {
    val myNumbers = arrayOf(-2, 4, -5, 4, 5, 6, 7, -1, 78, 2)
    val filtered = myNumbers.filter { it >= 0 }.toString()
    println(filtered)

}