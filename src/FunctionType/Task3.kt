package FunctionType

/**
 * Дан массив val array = arrayOf(1, 2, 3, 4, 5, 6, 7).
 * Написать функцию, которая будет увеличивать элемент массива на единицу, находящийся через одну позицию.
 * Т.е. массив на выходе будет такой [2, 2, 4, 4, 6, 6, 8].
 */
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)

    println(plusOneEverySecondNumber(array))
}

fun plusOneEverySecondNumber(array: Array<Int>) : String {
    var array2: Array<Int> = arrayOf()
    for (i in array.indices) {
        if (i % 2 == 0) {
            array2 += array[i] + 1
        } else {
            array2 += array[i]
        }

    }
    return array2.contentDeepToString()
}