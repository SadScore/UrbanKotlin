package Set

import kotlin.collections.*

/**
 * Создать функцию removeDuplicates (collection: Collection<T>?), которая будет возвращать набор неповторяющихся элементов.
 * Обратите внимание, что в параметры функции передан элемент Collection параметризованного типа.
 */
fun main() {
    val numbers = listOf(1,1,2,5,6,6,8,8,9,45)
    val names = listOf("Max", "Max", "Alex", "Alex", "Kate", "Harry")

    println(removeDuplicates(numbers))
    println(removeDuplicates(names))
}

fun<T> removeDuplicates (collection: Collection<T>?) : Set<T> {
   return collection!!.toSet()
}


