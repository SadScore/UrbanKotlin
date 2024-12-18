package GenericClassAndFun.Task2

/**
 * Создать класс параметризованный класс Person, у которого свойство номера телефона в конструкторе может передаваться
 * по – разному, как в виде числа, так и в виде строки.
 * Создать Два экземпляра Person, поле телефона заполнить у первого числами, у второго строкой.
 * Вывести полученную информацию о них. Person: name = имя, phone = телефон
 */
fun main() {
    val personOne = Person("Михаил", 88005553567)
    val personTwo = Person("Мария", "88005553876")
    println(personOne.toString())
    println(personTwo.toString())
}