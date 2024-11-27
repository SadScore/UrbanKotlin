package functions

/**
 * Написать функцию возведения числа a в степень n.
 */
fun main() {
    myExponentiation(10, 7)
}

fun myExponentiation(a: Int, n: Int) {
    var result = 1

    if (n == 0) {
        println(result)
    } else if (n < 0) {
        
        println("Пока умеем возводить только в положительную степень. Ждите новой версии приложения!")
    } else {
        repeat(n) { result *= a }
        println(result)
    }


}