package AbstractClasses.Task2

/**
 * Написать абстрактный класс Person. В конструкторе передать несколько свойств, например, имени, фамилии, возраста.
 * Написать абстрактные функции, характеризующие деятельность объекта класса и одну или несколько обычных.
 * Создать два класса наследника Student и Employee. Написать реализацию функций.
 */
fun main() {
val student = Student("Максим", "Круть", 21, 3)
    student.toWakeUp("6:31")
    student.toCall("Борис")
    student.toUseTransport()
    student.infoPerson()
    println("-------------------------------")
    val employee = Employee("Борис", "Бритва", 43, "Технический Директор", 8759.56)
    employee.toWakeUp("7:30")
    employee.toCall("Николай")
    employee.toUseTransport()
    employee.infoPerson()


}