package ComplexTask

/**
 * Дано число n. Написать программу, которая проверяет, является ли оно простым.
 */
fun main() {
    val n : Int = 73 // Любимое 21-е простое число Шелдона Купера из "Теории большого взрыва" =)
    var isProstoe : Boolean = true
    if (n > 2) {
        for (i in 2..n / 2 + 1) {
            if (n % i == 0) {
                isProstoe = false
                break
            }
        }
    }
    println(if (isProstoe) "Число $n простое" else "Число $n не является простым")
}