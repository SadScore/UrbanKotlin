package AbstractClasses

/**
 * Единицы длины пронумерованы следующим образом: 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
 * Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в метрах (дробное число).
 * Найти длину отрезка в тех величинах, под номером которых они находятся.
 */
fun main() {
    println("Введите число в метрах:")
    val yourNumber: Double = readln().toDouble()
    println("Введите номер пункта единицы длины измерения: \n" +
            "1 — дециметр \n2 — километр \n3 — метр \n4 — миллиметр \n5 — сантиметр")
    val numberOfTransformation: Int = readln().toInt()
    when(numberOfTransformation) {
        1 -> println("Вы выбрали ДЕЦИМЕТР: \n$yourNumber метров = ${yourNumber * 10} дециметров")
        2 -> println("Вы выбрали КИЛОМЕТР: \n$yourNumber метров = ${yourNumber / 1000} километров")
        3 -> println("Вы выбрали МЕТРЫ: \n$yourNumber метров = ${yourNumber} метров")
        4 -> println("Вы выбрали МИЛЛИМЕТРЫ: \n$yourNumber метров = ${yourNumber * 1000} миллиметров")
        5 -> println("Вы выбрали САНТИМЕТРЫ: \n$yourNumber метров = ${yourNumber * 100} сантиметров")


    }
}