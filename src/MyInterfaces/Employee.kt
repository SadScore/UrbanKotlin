package MyInterfaces

class Employee(firstName: String,
               lastName: String,
               age: Int,
               private val salary: Int) : Person(firstName, lastName, age), Printable {
    override fun startAction() {
        println("Рабочий $firstName $lastName начал работу")
    }

    override fun finishAction() {
        println("Рабочий $firstName $lastName закончил работу")
    }

    override fun printObjectInfo() {
        println("Рабочий $firstName $lastName, возрастом $age, получает зарплату = $salary")
    }
}