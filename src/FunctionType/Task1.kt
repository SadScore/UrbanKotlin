package FunctionType

/**
 * Написать программу, которая будет вычислять факториал числа с применением рекурсии.
 */
fun main() {
    println(findFactorial(3))


}

fun findFactorial(int: Int): Int {
    return if (int == 0) 1 else int * findFactorial(int - 1)
}







