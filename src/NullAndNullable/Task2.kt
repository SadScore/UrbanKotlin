package NullAndNullable

/**
 * Создайте функцию, которая возвращает сколько раз целое число может быть разделено на другое целое число
 * без остатка. Функция должна возвращать null, если результатом деления является не целое число.
 * Назовите функцию DivideIfWhole. Дополнительно написать решение, в случае,
 * когда нет ни одного деления без остатка – вывести ноль.
 * Рефакторинг сделать с применением оператора ?:
 */
fun main() {
    println(divisionWithoutRemainder(11, 5))
    println(divisionWithoutRemainder(25, 5))
    println(divideIfWhole(1, 2))
    println(divideIfWhole(19, 2))
}

fun divideIfWhole(a: Int, b: Int): Int {
    return divisionWithoutRemainder(a, b) ?: 0
}

fun divisionWithoutRemainder(a: Int, b: Int): Int? {
    return if ((a.toDouble() / b.toDouble()) % 2 == 0.0) return a / b else null


}
