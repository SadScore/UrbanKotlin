package MyOperatorWhile

/**
 * Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, …, 10 кг конфет
 */
fun main() {
    var candyKillo = 120
    var input = 0

    while (input++ < 10) {
        println("Стоимость $input кг. конфет = " + input * candyKillo)
    }
}