package MyOperarorFor

/**
 * Необходимо вывести на консоль такую последовательность чисел: 1 2 4 8 16 32 64 128 256 512
 */
fun main() {
    for (i in 0..9) {
        var n = 1;
        repeat(i) {
            n *= 2
        }
        println(n)
    }

}