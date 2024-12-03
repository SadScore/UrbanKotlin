package AbstractClasses.Task2

class Employee(name: String, surname: String, age: Int, private val postInCompany: String, private val salary: Double) :
    Person(name, surname, age) {
    override fun toWakeUp(wakeUpTime: String) {
        println("Работник $name $surname проснулся в $wakeUpTime")
    }

    override fun toCall(nameOfAbonent: String) {
        println("Работник $name $surname звонит абоненту $nameOfAbonent")
    }

    override fun toUseTransport() {
        println("Работник $name $surname в должности $postInCompany, едет на такси.")
    }

    override fun infoPerson() {
        println("Информация о работника:\nИмя и Фамилия: $name $surname; возраст: $age; Должность: $postInCompany; " +
                "зарплата: $salary долларов")
    }
}