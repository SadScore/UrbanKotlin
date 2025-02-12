package myClassKotling.Task1

/**
 * Создать класс вертолет со свойствами название(имя), взлетный вес, скорость полета, максимальная высота полета.
 * В классе с методом main создать экземпляр этого класса, например, alligator, свойствам задать конкретные значения.
 * Вывести в консоль строку: «Спроектировали вертолет с названием… скоростью полета… весом… высотой полета…»
 */
class Helicopter {
    var name : String = ""
    var weight : Int = 0
    var speed : Int = 0
    var maxHeight : Int = 0
    fun showInfo(){
        println("Спроектировали вертолет с названием $name скоростью полета $speed км/ч весом $weight кг " +
                "высотой полета $maxHeight метров")
    }
}