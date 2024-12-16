package LambdaExpressions

/**
 * Напишите программу, реализующую лямбда-выражение для вычисления среднего арифметического списка чисел.
 */
fun main() {
    val array = arrayOf(2,5,6,7,2,8,1)
    val average: Double = array.fold(0.0) {a, b -> a + b} / array.size
    println("Среднее арифметическое: $average")
}
