package WhenMyOperator

/**
 * 4) Даны две переменные a = 8, b = 5. Написать алгоритм, при котором a = 5, b = 8.
 */

fun main() {
    println("1) ")
    var a = 8
    var b = 5
    var c = 0
    println("a = $a b = $b")
    c = a
    a = b
    b = c
    println("a = $a b = $b")
    println("2) ")
    var a1 = 8
    var b1 = 5

    println("a1 = $a1, b1 = $b1")
    a1 = a1 + b1
    b1 = a1 - b1
    a1 = a1 - b1
    println("a1 = $a1, b1 = $b1")
}
