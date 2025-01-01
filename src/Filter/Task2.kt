package Filter

/**
 * Дан map, в которой элементы содержат ключ целое число, значения имена.
 * Отфильтруйте по значениям, оканчивающимся на букву «а».
 */
fun main() {
    val names = mapOf(
        1 to "Alex",
        2 to "Helena",
        3 to "Misha",
        4 to "Max"
    )
    val filteredNames = names.filter { (_, value) -> value.endsWith("a") }
    println(filteredNames)
}
