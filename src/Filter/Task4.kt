package Filter

/**
 * Дан map prizeMap, описывающий ключом порядковый номер сотрудника, значение характеризует процент премии сотруднику.
 * Отфильтровать исходный map с таким расчетом, чтобы получить данные сотрудников,
 * чей порядковый номер оканчивается на «5» и процент премии больше 20.
 */
fun main() {
    val prizeMap = mapOf(
        "25" to 30,
        "32" to 35,
        "44" to 25,
        "55" to 50,
        "66" to 10,
        "75" to 5,
    )
    val filteredPrizeMap = prizeMap.filter { (key, value) -> key.endsWith("5") && value > 20 }
    println(filteredPrizeMap)
}