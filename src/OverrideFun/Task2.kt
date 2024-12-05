package OverrideFun

/**
 * Дан массив строк. Найти самое длинное слово в массиве и количество букв в этом слове.
 */
fun main() {

    val array = arrayOf("Птица", "Кофейный", "Вода", "Чай", "Автомобиль", "Джанго", "Ёж")
    var max: String = ""
    for (i in array) {
        if (i.length > max.length) {
            max = i
        }
    }
    println("В самом длинном слове '$max', ${max.length} букв")
}