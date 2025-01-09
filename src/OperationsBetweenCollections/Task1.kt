package OperationsBetweenCollections

/**
 * Дан список строк произвольного размера. Вывести в консоль список, внутри которого располагаются данные элементы,
 * но каждый элемент представлен в реверсивном виде.
 * Входной список: {"one", "two", "three"}. Выходные данные: [eno, owt, eerht].
 */
fun main() {
    val numbers = listOf("one", "two", "three")

    val reversedNumbers = numbers.map { it.reversed() }
    println(reversedNumbers)
}