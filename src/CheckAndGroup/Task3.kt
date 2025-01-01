package CheckAndGroup

/**
 * Дан список телефонов по году выпуска phoneToYear. Не забывайте он может выглядеть как map(ключ - значение),
 * но на самом деле внутри себя будет содержать объект Pair. Необходимо с группировать объекты по годам выпуска телефонов.
 */
fun main() {
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    val sortedPhoneToYear = phoneToYear.groupBy ({ pair -> pair.second}, {pair ->  pair.first})
    println(sortedPhoneToYear)
}