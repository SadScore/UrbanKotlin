package StringClass

/**
 * Дана строка. Вывести символы, составляющие эту строку, но в обратном порядке.
 */
fun main() {
    reversString("Urban")

}

fun reversString(str: String) {
     str.reversed().forEach { n -> println(n) }
}