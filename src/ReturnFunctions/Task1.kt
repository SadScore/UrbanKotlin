package ReturnFunctions

/**
 * Написать функцию, на вход которой поступает массив из произвольного количества элементов.
 * Данная функция проверяет, если в массиве локальные минимумы и возвращает число локальных минимумов.
 * (локальный минимум – это когда два соседних элемента больше того, что между ними, например, 5,2,7).
 */


fun main() {
    val array: Array<Int> = arrayOf(2,1,6,7,2,7,77,5,67,33,2,54)
    val count = findLocalMinimals(array)
    println(count)


}

fun findLocalMinimals(array: Array<Int>) : Int {
    var prevElement: Int
    var currentElement: Int
    var nextElement: Int


    var countOfLocalMinimals = 0

    for (i in 1 until array.size - 1) {
        prevElement = array[i - 1]
        currentElement = array[i]
        nextElement = array[i + 1]
        if (currentElement < prevElement && currentElement < nextElement) {
            countOfLocalMinimals += 1
        }

    }

    return countOfLocalMinimals
}
