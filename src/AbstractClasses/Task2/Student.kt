package AbstractClasses.Task2

class Student(name: String, surname: String, age: Int, private val numberOfGroup : Int) :
    Person(name, surname, age) {
    override fun toWakeUp(wakeUpTime: String) {
        println("Студент $name $surname группы номер $numberOfGroup, проснулся в $wakeUpTime")
    }

    override fun toCall(nameOfAbonent: String) {
        println("Студент $name $surname группы номер $numberOfGroup звонит абоненту $nameOfAbonent ")
    }

    override fun toUseTransport() {
        println("Студент $name $surname группы номер $numberOfGroup едет на Автобусе.")
    }

    override fun infoPerson() {
        println("Информация о студенте: \nИмя и фамилия: $name $surname, возраст студента $age, группы номер $numberOfGroup")
    }
}