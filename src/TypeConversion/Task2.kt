package TypeConversion

/**
 * Написать функцию, которая проверяет чем, является вводимый аргумент строкой,
 * числом, числом с плавающей точкой, символом. Ввод должен быть таким: «Это строка».
 */
fun main() {
    checkTypeAny(1)
    checkTypeAny(1.9)
    checkTypeAny('K')
    checkTypeAny("Urban")
    println(checkTypeT(1))
    println(checkTypeT(1.2))
    println(checkTypeT('o'))
    println(checkTypeT("Urban"))

}

fun checkTypeAny(input: Any){
    if (input is Int) println("Это целое число!")
    if (input is Double) println("Это числом с плавающей точкой!")
    if (input is Char) println("Это символ!")
    if (input is String) println("Это Строка!")
}

fun <T> checkTypeT(input: T): String {
    return when (input) {
        is Int -> "Это целое число!"
        is Double -> "Это число с плавающей точкой!"
        is Char -> "Это символ!"
        else -> "Это строка!"
    }
}
