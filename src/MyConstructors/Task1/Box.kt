package MyConstructors.Task1

/**
 * Создать класс Box(коробка), у которого есть свойства width, height, depth. Написать функцию вычисления объёма коробки
 * в классе Box. В классе с функцией main создать экземпляр класса Box,
 * в конструктор класса передать свойства, задать им значения,
 * вызвать функцию вычисления объема и вывести его на экран.
 */
class Box(var width : Int, var height : Int, var depth : Int) {
    fun volumeBox() {
        println("Объем коробки равен: ${width * height * depth}")
    }
}