package InnerClass

/**
 * Создать массив целых чисел, в котором есть два нулевых элемента, не идущих подряд.
 * Посчитать количество элементов, которые находятся между нолями.
 */
fun main() {
    val array: Array<Int> = arrayOf(7, 6, 9, 0, 64, 45, 156, 77, 95, 0, 5417, 8765)
    findNumbersBetweenZero(array)

}

fun findNumbersBetweenZero(array: Array<Int>) {
    var firsIndex: Int = 0
    var secondIndex: Int = 0
    //Находим индекс ПЕРВОГО нуля
    for (i in 0..array.size) {
        if (array[i] == 0) {
            firsIndex = i
            break
        }
    }
    // Находим индекс ВТОРОГО нуля
    for (j in firsIndex + 1 .. array.size) {
        if (array[j] == 0) {
            secondIndex = j
            break
        }

    }

    println("Между двумя нулями ${secondIndex - firsIndex - 1} элементов.")

}