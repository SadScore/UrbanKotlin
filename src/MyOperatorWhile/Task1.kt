package MyOperatorWhile

/**
 * Пользователь вводит с клавиатуры число.
 * Требуется посчитать факториал числа. Например, если введено 3, факториал числа 1*2*3 = 6
 */
fun main() {
    var result = 1
    var count = 0
    println("Введите число: ")
    var input = readln().toInt()
    while (count++ != input) {
        result *= count

    }
    println(result)
}