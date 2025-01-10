package GettingPartOfCollections

/**
 * Дан список целых чисел от 1 до 20 включительно. Посчитать сумму первых 7 чисел списка.
 * Целесообразно использовать функции take(), sum().
 */
fun main() {
    val numbers = (1..20).toList()
    println(numbers.take(7).sum())
}