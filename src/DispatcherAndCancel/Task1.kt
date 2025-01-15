package DispatcherAndCancel

import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

data class Person(val name: String, val salary: Double) {
    override fun toString(): String {
        return "Имя: $name, зарплата: $salary"
    }
}

val personList: MutableList<Person> = mutableListOf()
val resultList: MutableMap<Person, Int> = mutableMapOf()

class PersonManager() {
    fun addPerson(person: Person) {
        personList += person
    }
    fun addPersonDialog() {
        println("Введите имя сотрудника:")
        val name = readln()
        println("Введите зарплату сотрудника:")
        val salary = readln().toDouble()
        addPerson(Person(name, salary))
    }
    suspend fun addPassword(person: Person) {
        val password = IntRange(100_000, 999_999).random()
        delay(500L)
        resultList.put(person, password)

    }
    suspend fun readDataPersonList() = resultList.forEach {
        delay(1000L)
        println("Сотрудник: ${it.key} пароль: ${it.value}")

    }
}



suspend fun main() = coroutineScope {
    println("Программа работы с базой данных сотрудников")
    delay(1000)
    println("Добавить сотрудника:\n1.Да\n2.Нет")
    var isAddingPerson = getAnswer()
    while (isAddingPerson) {
        PersonManager().addPersonDialog()
        println("Добавить сотрудника:\n1.Да\n2.Прочитать базу данных")
        isAddingPerson = getAnswer()
    }
    val creatingMapJob = launch {
        for (person in personList) {
            PersonManager().addPassword(person)
        }
        PersonManager().readDataPersonList()
    }

    val cancelingJob = launch {
        println("Для завершения программы введите \"0\":")
        val answer = readln()
        if (answer == "0") {
            creatingMapJob.cancel()
        }
    }
    creatingMapJob.join()
    cancelingJob.cancelAndJoin()
    println("Завершение полной работы")
}

fun getAnswer(): Boolean {
    while (true) {
        val answer = readln()
        if (answer.lowercase() == "да" || answer == "1") return true
        else if (answer.lowercase() == "нет" || answer == "2") return false
        else {
            println("Некорректный ввод")
        }
    }
}

