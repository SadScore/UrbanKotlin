package Filter

/**
 * Дан map, в которой элементы содержат ключ целое число, значения имена.
 * Отфильтруйте по значениям, Начинающимся на букву «Г».
 */
fun main() {
    val names = mapOf(
        1 to "Генадий",
        2 to "Елена",
        3 to "Глеб",
        4 to "Михаил"
    )
    val filteredNames = names.filter { (_, value) -> value.startsWith("Г") }
    println(filteredNames)
}