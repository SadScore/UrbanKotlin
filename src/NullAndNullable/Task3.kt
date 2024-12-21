package NullAndNullable

/**
 * Дан массив строк array = arrayOf("Привет","как", null, "дела"). Создать новый массив,
 * который будет состоять из элементов массива array, которые не являются null.
 * Вывести их в консоль.
 */
fun main() {
    val array: Array<String?> = arrayOf("Привет","как", null, "дела")

    println(arrayWithOutNull(array).contentToString())
}

fun arrayWithOutNull(array: Array<String?>) : Array<Any> {
    var sortedArray: Array<Any> = arrayOf(array.filterNotNull()) //Idea сама предложила.)
    return sortedArray
}