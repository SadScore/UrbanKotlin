package AnonymousClasses

/**
 * Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 */
fun main() {
    val array: Array<String> = arrayOf("когда", "над", "пустошами", "вновь", "взойдёт", "луна")
    findLongestWord(array)
}

fun findLongestWord(array: Array<String>) {
    var longestWord: String = ""
    for (i in array) {
        if (i.length > longestWord.length) {
            longestWord = i
        }
    }
    println("Самое длинное слово '${longestWord.uppercase()}' состоит из ${longestWord.length} букв!")
}