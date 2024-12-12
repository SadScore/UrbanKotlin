package FunctionType

/**
 * Написать функцию, которая находит N-ю степень числа 10 с применением рекурсии.
 */
fun main() {
    println(nPowOfTen(3))
    println(nPowOfTen(-2))

}

fun nPowOfTen(n: Int): Double {
    if (n == 0) return 1.0
    if (n >= 1)  {
        return 10 * nPowOfTen(n - 1)
    }
    if (n <= 1) {
        return nPowOfTen(n + 1) / 10
    }
    return n.toDouble()

}


