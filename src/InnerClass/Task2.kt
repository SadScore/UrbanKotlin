package InnerClass

/**
 * Дан строковый массив "Иванов", "Петров", "Сидоров", "Процветов", "Протасов".
 * Написать программу поиска и вывода на экран элементов массива по вводимым символам.
 */
fun main() {
    val arrayOfNames: Array<String> = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    println("Введите фамилию С БОЛЬШОЙ БУКВЫ которую хотите найти:")
    findName(readln(), arrayOfNames)
}
fun findName(name: String, array: Array<String>) {

    for (i in array) {
        if (i == name) {
            println("Фамилия: '$name' НАЙДЕНА в списке.")
            return
        }
    }
    println("Фамилия '$name' НЕ НАЙДЕНА в списке")

}

