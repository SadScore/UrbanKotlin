package StringClass

/**
 * Дана строка «kotlin2024course». Подсчитать количество содержащихся в ней цифр
 */
fun main() {
    val str = "kotlin2024course"
findIntInString(str)
}

fun findIntInString(str: String) {
    println(str.count() { it.isDigit() })
}