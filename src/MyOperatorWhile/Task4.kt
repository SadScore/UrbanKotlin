package MyOperatorWhile

/**
 * Дано целое число N (>0). Используя операции деления нацело и взятия остатка от деления,
 * вывести все его цифры, начиная с самой правой.
 */
fun main() {
    var N = 1997
    while (N > 0) {
        print(" " + N % 10)
        N /= 10
    }
}