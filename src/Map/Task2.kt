package Map

import Set.sortedZero
import StringClass.findIntInString

/**
 * Дан map val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна").
 * Написать функцию, удаляющую элементы по введенному с клавиатуры значению.
 * Т.е., если набрали «Петр» коллекция должна стать такого вида {1=Иван, 3=Лида, 5=Анна}
 */
fun main() {
    val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")

    people.removeFromMap()
}

fun MutableMap<Int, String>.removeFromMap() {
    println(this)
    println("Введите значение которое хотите удалить из списка выше: ")
    val elementToRemove = readln()
    for (i in 0..this.size) {
        if (this[i] == elementToRemove) {
            this.remove(i)
        }
    }
    println(this)



}