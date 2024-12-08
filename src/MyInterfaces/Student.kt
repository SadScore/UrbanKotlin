package MyInterfaces

class Student(firstName: String, lastName: String, age: Int) : Person(firstName, lastName, age), Printable, Condition  {
    override fun startAction() {
        println("Учебная деятельность студента $firstName $lastName началась")
    }

    override fun finishAction() {
        println("Студент $firstName $lastName закончил учиться.")
    }

    override fun printObjectInfo() {
        println("Студент $firstName $lastName возраст: $age")
    }

    override fun readyToWork(age: Int) {
        if (age >= ageForWork) println("Может работать") else println("Не может работать!")
    }
}