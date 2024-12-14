package HighorderFunctions

/**
 * Написать функции изменения числа: одна – увеличение числа на единицу, вторая – умножение на два.
 * Написать функцию высшего порядка, которая на вход принимает массив целых чисел и вторым параметром
 * функцию, принимающую число и возвращающая число. Функция высшего порядка будет возвращать измененный массив, который будет получаться за счет вызова внутри нее у этого массива функции map,
 * внутри которой будет вызываться функция изменения числа.
 */
fun main() {
    val array = arrayOf(4,8,15,16,23,42)

    println(array.contentToString())
    println(actionForEachElement(array, ::addOneTo))
    println(actionForEachElement(array, ::doubleOf))
}

fun addOneTo(n: Int) = n + 1

fun doubleOf(n: Int) = n * 2

fun actionForEachElement(array: Array<Int>, function: (Int) -> Int) = array.map(function)
