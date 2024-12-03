package AbstractClasses.Task2

abstract class Person(val name: String, val surname: String, val age: Int) {

    abstract fun toWakeUp(wakeUpTime: String)
    abstract fun toCall(nameOfAbonent : String)
    abstract fun toUseTransport()

    open fun infoPerson(){
        println("Информация о человеке: \nИмя: $name, Фамилия: $surname, Возраст $age")
    }

}