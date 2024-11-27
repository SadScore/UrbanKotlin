package ReturnFunctions

/**
 * Напишите функцию, в которой проверяется созданный Вами массив целых чисел.
 * Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу и вернуть массив.
 */
fun main() {
    val array: Array<Int> = arrayOf(-2,1,-6,7,2,7,-77,5,-67,33,-2,54)
    println(array.contentToString())
    val newArray = findMinusAndPlusOne(array)
    println(newArray.contentToString())

}
fun findMinusAndPlusOne(array: Array<Int>) : Array<Int> {
    for (i in array.indices) {
        if (array[i] < 0) {
            array[i] = array[i] + 1
            continue
        }
    }
    return array
}

