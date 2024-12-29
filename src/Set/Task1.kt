package Set

import MyInheritance.Task2.Sony

/**
 * Разбить созданный набор на две коллекции, чтобы в одной содержались четные элементы, в другой – нечетные.
 */
fun main() {
    val numbersSet = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    val evenNumber = numbersSet.filter { n -> n % 2 == 0 }
    println(evenNumber)
    val oddNumber = numbersSet.filter { n -> n % 2 != 0 }
    println(oddNumber)
    println("ИЛИ")
    println("Набор четных чисел ${numbersSet subtract oddNumber}")
}

