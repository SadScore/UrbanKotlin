package GettingPartOfCollections

/**
 * Написать класс Product с полями название и количество в конструкторе.
 * Создать список продуктов, состоящий из нескольких объектов класса.
 * Посчитать общее количество продуктов, имеющихся на складе (в списке).
 * Целесообразно использовать функции map(), fold().
 */
fun main() {
    val listOfProduct = listOf(
        Product("Банан", 20),
        Product("Ананас", 15),
        Product("Апельсин", 90),
        Product("Яблоко", 45),
    )
    val countOfProduct = listOfProduct.fold(0) {sum, product -> sum + product.count}
    println(countOfProduct)
    val countOfProductTwo = listOfProduct.map { it.count }.sum()
    println(countOfProductTwo)

}

data class Product(val name: String, val count: Int)