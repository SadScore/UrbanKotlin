package MyOperarorFor

/**
 * Даны два числа a и b. Найти их среднее арифметическое.
 */
fun main() {
    val a = 18
    val b = 44
    val min: Int
    val max: Int
    if (a < b) {
        min = a
        max = b
    } else {
        min = b
        max = a
    }

    var j = max
    for (i in min..max) {
        if (i >= j) {
            println("Среднее арфиметическое равноо $j")
            break
        }
        j--
    }


}




