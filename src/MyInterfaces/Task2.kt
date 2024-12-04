package MyInterfaces

/**
 * Даны целые положительные числа A и B. Найти их наибольший общий делитель (НОД),
 * используя алгоритм Евклида: НОД(A,B) = НОД(B, A mod B), если B≠0; НОД(A, 0) = A.
 */
fun main() {
    findCommonSubtraction(72, 27)
}

//Алгоритм Евклида
fun findCommonSubtraction(a: Int, b: Int) {
    var a = a
    var b = b
    while (b != 0) {
        var с = b
        b = a % b
        a = с;
    }
    println("Наибольший общий делитель для = $a")

}
