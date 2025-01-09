package OperationsBetweenCollections

/**
 * Создать список целых чисел. В новый список сохранить квадрат элементов старого списка с условием,
 * что исходный элемент меньше или равен 3.
 * Входной список: {1, 2, 3, 4, 5}. Выходные данные: [1, 4, 9]
 */
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val newNumbers = numbers.filter { it <= 3 }.map { it * it }
    println(newNumbers)
}