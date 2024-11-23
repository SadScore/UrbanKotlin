package MyArrays

/**
 * Дано целое число N(>0). Сформировать и вывести целочисленный массив размера N,
 * содержащий степени двойки от первой до N-й: 2,4,8,16,….
 */
fun main() {
    val N : Int = 5
    var array = Array(N) {2}
    for (i in 1..N){
        var currentNumber = 1
        for (j in 1..i) {
            currentNumber *= 2
        }
        array[i - 1] = currentNumber

    }
    println(array.contentToString())
}