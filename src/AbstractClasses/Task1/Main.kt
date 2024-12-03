package AbstractClasses.Task1

/**
 * Написать абстрактный класс Shop(магазин). Написать несколько свойств класса,
 * две абстрактные функции и одну обычную, характеризующих работу магазина.
 * Создать два класса наследника магазин Magnit и Pyaterochka. Написать реализацию функций.
 */
fun main() {

    val magnit = Magnit("8:00", "22:00")
    magnit.workingTime()
    magnit.fireEmployee(67)
    magnit.hireEmployee(106)
    println("-------------------------------")

    val pyaterochka = Pyaterochka("8:30", "23:00")
    pyaterochka.workingTime()
    pyaterochka.fireEmployee(16)
    pyaterochka.hireEmployee(179)


}