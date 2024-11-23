package MyArrays

/**
 * Создать массив из 10 чисел с плавающей точкой. Найти произведение его элементов.
 */
fun main() {
    val numbers = doubleArrayOf(3.7, 7.5, 5.7, 8.9, 1.9, 2.8, 2.8, 7.9, 4.1, 6.4)
    var result: Double = 0.0
    for (i in numbers) {
        if (i == numbers[0]) {
            result = i
            continue
        }
        result *= i
    }
    println(result)
}