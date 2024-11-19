package WhenMyOperator

/**
 * 2) Дана переменная с плавающей точкой. Написать программу, которая округляет эту переменную до целого числа.
 */
fun main() {
    var a : Double = 7.999997
    var ostatok : Double = a % 1
    var result : Double
    when {
        ostatok < 0.5 -> result = a - ostatok
        else -> result = a + (1 - ostatok)
    }
    println(result)


}
