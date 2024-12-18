package GenericClassAndFun

/**
 * Написать функцию вывода в консоль переменных разных типов данных.
 * Вторым параметром в функции будет тип Char и будет представлять то, во что будет оборачиваться переменная параметризованного типа,
 * поступающая на вход в качестве первого параметра. Например, переменная Int должна оборачиваться в фигурные скобки.
 * Пример ввода данных и полученного результата должен быть таким:
 */
fun main() {
    val a: Int = 777
    val b: String = "Приветствую!"
    val c: List<Int> = listOf(7, 4, 1997)
    val d: Char = '+'
    printInConsole(a, '(')
    printInConsole(b, '[')
    printInConsole(c, '"')
    printInConsole(d, '{')


}

fun<T> printInConsole(t: T, frame: Char) {
    when(frame) {
        '(' -> println("(${t})")
        '[' -> println("[${t}]")
        '{' -> println("{${t}}")
        '"' -> println("$frame${t}$frame")
        else -> println("Ничего не произошло...")
    }
}