package EnumClass

/**
 * Дана строка «Шумоизоляция». Посчитать количество повторяющихся символов.
 */
fun main() {
    val string: String = "Шумоизоляция"
   findRepeatLatter(string)

}

fun findRepeatLatter(string: String) {
    val array: CharArray = string.toCharArray()
    var charArray: Array<String> = arrayOf()
    for (i in array) {
        var count: Int = 0
        for (j in array) {
            if (i == j) {
                count++
            }
        }
        if (count > 1) {
            val s = "Символов '$i' = $count штуки!"
            if (s !in charArray) charArray += s
        }

    }
    println(charArray.contentToString())
}
