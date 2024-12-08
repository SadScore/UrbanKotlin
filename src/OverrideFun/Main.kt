package OverrideFun

fun main() {
val person = Person("Sergei", 29)
    person.role = "Developer"
    person.printInfo()

    val employee = Employee("Ivan", 32)
    employee.role = "s"
    person.printInfo()

    val intern = Intern("Alex", 22)
    intern.printInfo()

}