package Sorting

/**
 * Создать класс Employee, в конструкторе передать свойства имени, возраста и зарплаты.
 * Создать список сотрудников, состоящий из 5 человек.
 * Написать функции сортировки по именам, возрасту и зарплате.
 */
fun main() {
    val listOfEmployee = listOf(
        Employee("Max", 27, 7800.78),
        Employee("Helen", 43, 17568.0),
        Employee("Alex", 21, 6570.5),
        Employee("John", 32, 4390.32),
        Employee("Marcus", 55, 8652.78)
    )
    val sortedEmployeeByName = listOfEmployee.sortedWith(compareBy { it.name })
    val sortedEmployeeByAge = listOfEmployee.sortedWith(compareBy { it.age })
    val sortedEmployeeBySalary = listOfEmployee.sortedWith(compareBy { it.salary })
    println("Сортировка по имени $sortedEmployeeByName")
    println("Сортировка по возрасту $sortedEmployeeByAge")
    println("Сортировка по зарплате $sortedEmployeeBySalary")

}

data class Employee(val name: String, val age: Int, val salary: Double) {
    override fun toString(): String {
        return "$name, возраст: $age, зарплата: $salary"
    }
}