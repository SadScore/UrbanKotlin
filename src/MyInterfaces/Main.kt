package MyInterfaces

fun main() {
    getLine("-")
    val shop = Shop("Магнит", "Москва")
    shop.printObjectInfo()
    getLine("-")
    val hospital = Hospital("Дьякова", 65)
    hospital.printObjectInfo()
    getLine("-")
    val employee = Employee("Сергей", "Неязов", 98, 7888)
    employee.startAction()
    employee.finishAction()
    employee.printObjectInfo()
    getLine("-")
    val student = Student("Иван", "Иванович", 19)
    student.startAction()
    student.finishAction()
    student.printObjectInfo()
    student.readyToWork(student.age)
    getLine("-")
}

fun getLine(sample: String){
    for (i in 0..60) {
        print(sample)
    }
    println()
}



















