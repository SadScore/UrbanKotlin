package Map

/**
 * Напишите функцию, которая получает на вход массив элементов типа К (Generic) и возвращает Map<K, Int>,
 * где K — значение из массива, а Int — количество вхождений в массив.
 * Т.е. массив val array = arrayOf(2, 4, 7, 1, 2, 4). Выходные данные: {1=1, 2=2, 4=2, 7=1}.
 */
fun main() {
    val array = arrayOf(2,4,7,1,2,4)
    println(countSomething(array))
    val wordArray = arrayOf("C++", "Java", "Kotlin", "Java", "Kotlin", "C#")
    println(countSomething(wordArray))


}

fun <K> countSomething(array: Array<K>): Map<K, Int> {
    val map: MutableMap<K, Int> = mutableMapOf()

    array.forEach { currentElement: K ->
        if (map[currentElement] == null) map[currentElement] = array.count {(currentElement == it)} }
    return map
}