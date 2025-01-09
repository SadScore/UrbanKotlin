package OperationsBetweenCollections

/**
 * Дан массив строк, содержащий название месяцев. Посчитать общее количество символов, содержащееся во всех строковых элементах.
 * Выходные данные: {"Jan", "Feb", "Mar", "Apr", "May"}. Выходные данные: 15.
 */
fun main() {
    val month = listOf("Jan", "Feb", "Mar", "Apr", "May")

    val numbersOfLetters = month.fold(0){sum: Int, n: String -> sum + n.length}
    println(numbersOfLetters)
}