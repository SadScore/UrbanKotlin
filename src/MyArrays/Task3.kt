package MyArrays

/**
 * Дан массив размерностью size. Вывести в том же порядке все четные числа из данного набора и количество K таких чисел.
 */
fun main() {
    val size : Int = 10
    var K : Int = 0

    var array = Array(size) {0}

    array[0] = 3
    array[1] = 4
    array[2] = 7
    array[3] = 4
    array[4] = 13
    array[5] = 15
    array[6] = 18
    array[7] = 21
    array[8] = 24
    array[9] = 28

    for (i in array) {
        if (i % 2 ==0) {
            print("$i ")
            K++
        }
    }
    println("Четных чисел в массиве = $K")
}