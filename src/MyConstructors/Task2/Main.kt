package MyConstructors.Task2



/**
 * Дан набор из N чисел. Найти минимальный и максимальный из элементов данного набора и вывести их.
 */
fun main() {
    val listOfNumbers = listOf(7, 8, 9, 25, 6, 87, -78, 6)
    println(listOfNumbers.max())
    println(listOfNumbers.min())
    println("ИЛИ")
    println(findMax(listOfNumbers))
    println(findMin(listOfNumbers))
}
fun  findMax(listOfNumbers : List<Int>) : Int {
    var maxNumber = listOfNumbers [0]
    for (number in listOfNumbers) {
        if (number > maxNumber) {
            maxNumber = number
        }
    }
    return maxNumber
}
fun  findMin(listOfNumbers : List<Int>): Int {
    var minNumber = listOfNumbers [0]
    for (number in listOfNumbers) {
        if (number < minNumber) {
            minNumber = number
        }
    }
    return minNumber


}



