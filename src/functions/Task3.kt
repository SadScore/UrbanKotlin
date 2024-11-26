package functions

/**
 * Написать функцию, которая принимает два целых числа a и b.
 * Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.
 */
fun main() {
findCommonSubtraction(18, 6)
}
//Алгоритм Евклида
fun findCommonSubtraction(a : Int, b: Int){
    var a = a
    var b = b
    while (b != 0) {
        var с = b
        b = a % b
        a = с;
    }
    println("Наибольший общий делитель для = $a")

}

