package Map

/**
 * Создать data класс Person, в конструктор он принимает свойства имени, возраста и должности.
 * В главной функции создать personHashMap и заполнить его несколькими элементами,
 * где ключом будет целое число – порядковый номер, значением – объект Person.
 * Вывести полученную коллекцию в консоль.
 */
fun main() {
    val personHashMap = mapOf(
        1 to Person("Max", 26, "Engineer"),
        2 to Person("Helen", 32, "Doctor"),
        3 to Person("Sergei", 55, "Driver"),
        4 to Person("Den", 45, "Developer")
    )
    println(personHashMap)

}

data class Person(val name: String, val age: Int, val position: String)

