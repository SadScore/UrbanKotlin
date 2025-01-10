package GettingPartOfCollections

/**
 * Дан список целых чисел от 1 до 20 включительно.
 * Посчитать количество четных чисел списка, начиная с 5 элемента до конца списка.
 * Целесообразно использовать функции drop(), count().
 */
fun main() {
    val numbers = (1..20).toList()
    println(numbers.drop(4).count{it % 2 == 0})
}