package GettingPartOfCollections

/**
 * Дан список строк. Найти строку максимальной длины.
 * Целесообразно использовать агрегатные операции.
 */
fun main() {
    val str = listOf("man", "woman", "list", "one", "cucumber", "pills", "tea")
    val result = str.maxByOrNull { it.length }
    println(result)
}