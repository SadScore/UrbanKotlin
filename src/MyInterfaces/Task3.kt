package MyInterfaces

/**
 * Дан набор целых чисел. Найти второе максимальное число
 */
fun main() {
    val array = arrayOf(14, 18, 5, 78, 93, 17, 88, 43, 44, 26, 42)

    var sortedArray = array.sortedArray()
    println("Отсортированный список " + sortedArray.contentToString())
    var max = sortedArray.max()
    var maxIndex = sortedArray.indexOf(max)
    var max2 = sortedArray.get(maxIndex - 1)
    println("Второе максимальное значение = $max2")
}