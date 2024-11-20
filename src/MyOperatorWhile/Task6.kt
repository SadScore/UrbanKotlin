package MyOperatorWhile

/**
 * За каждый месяц банк начисляет к сумме вклада 7% от суммы.
 * Напишите программу, в которой вычисляется конечная сумму вклада с учетом начисления процентов за каждый месяц.
 * Сумма вклада равна 350, количество месяцев – 9.
 */
fun main() {
    var percent : Double = 0.07
    var vklad : Double = 350.0
    var month = 0
    while (month++ < 9) {
        vklad += vklad * percent
    }
    println(vklad)

}