package MyArrays

/**
 * Создать массив из 8 целых чисел. Найти среднее арифметическое его элементов.
 */
fun main() {
    val numbers = arrayOf<Int>(4, 8, 15, 16, 23, 42, 4, 8)
    println(numbers.sum() / numbers.size)
}