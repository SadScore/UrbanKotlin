package GettingPartOfCollections

/**
 * Дан список строк: {"one", "two", "three"}.
 * Необходимо получить и вывести в консоль список вида: [o, n, e, t, w, o, t, h, r, e, e].
 * Целесообразно использовать функции map(), flattaen().
 */
fun main() {
    val str = listOf("one", "two", "three")
    val result = str.map { it.toCharArray().toList()}.flatten()
    println(result)

}
