package MyInheritance.Task1

/**
 * Создать суперкласс Animal(животное) со свойствами веса и имени.
 * Написать функцию, которая описывает прием пищи животного.
 * Наследовать от него подклассы Dog, Cat, используя все возможности суперкласса.
 * У каждого животного определить по одной своей функции.
 */
fun main() {
    val dog = Dog()
    dog.name = "Боб"
    dog.weight = 15
    dog.toRun()
    dog.toEat()
    println(dog.toString())
    println("----------------")
    val cat = Cat()
    cat.name = "Борис"
    cat.weight = 7
    cat.toPlay()
    cat.toEat()
    println(cat.toString())
}