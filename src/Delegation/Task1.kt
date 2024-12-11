package Delegation

/**
 * Написать программу перевода числа из десятичной системы в двоичную систему счисления.
 */
fun main() {
    getBinaryNumber(678)

}


fun getBinaryNumber(decimalNumber: Int) {
    var decimalNumber = decimalNumber
    var array: Array<Int> = arrayOf()
    while (decimalNumber > 0) {
        val zeroOrOne = decimalNumber % 2
        decimalNumber /= 2
        array += zeroOrOne

    }
    for (i in array.reversedArray()) print(i)
}
