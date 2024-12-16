package LambdaExpressions

/**
 * Напишите программу, которая реализует лямбда-выражение для работы с массивом целых чисел таким образом,
 * что его четные элементы делятся на 2, нечетные – умножаются на 3.
 */
fun main() {
    val transformer: (Array<Int>) -> Array<Int> = { array ->
        array::forEachIndexed { i, n ->
            if (i % 2 == 0) array[i] = n / 2
            else array[i] = n * 3
        }
        array

    }
    val array = arrayOf(-2, 4, -5, 4, 5, 6, 7, -1, 78, 2)
    println(transformer(array).contentToString())

}

