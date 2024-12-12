package Delegation

/**
 * Написать программу перевода числа из двоичной системы в десятичную систему счисления.
 */
fun main() {
    getDecimalNumber("0001011101001101")
}

fun getDecimalNumber(binary: String) {
    var result = 0L
    for (i in 0..binary.length - 1) {
        val currentDigit = binary[binary.length - 1 - i].digitToInt()
        result += pow(2, i) * currentDigit
    }
    println(result)
}

fun pow(n: Int, i: Int): Int {
    var result = 1
    repeat(i) { result *= n }
    return result
}
