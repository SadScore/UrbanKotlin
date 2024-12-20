package Exceptions

fun main() {
    val personCatalog = PersonCatalog()
    personCatalog.greeting()
    personCatalog.addPersonScan()
    println(personCatalog.getPersonList().contentToString())
    println(personCatalog.getPersonAtIndex(7))


}

class PersonCatalog {

    class Person(val firstName: String, val secondName: String) {

        companion object {
            val EMPTY_PERSON = Person("Empty", "Empty")      // делаем "static" пустого пользователя
            const val ILLEGAL_SYMBOLS = "!@#$%^&*()_+={}[]\\|/<>?,.`~1234567890"
        }

        override fun toString(): String {
            return (if (firstName == EMPTY_PERSON.firstName || secondName == EMPTY_PERSON.secondName) "Empty Empty"
            else "Person: $firstName $secondName")
        }
    }

    private val listSize = 10

    private val list: Array<Person> = Array(listSize) { Person.EMPTY_PERSON }

    private fun addPerson(index: Int, firstName: String, secondName: String) {
        if (index >= list.size || index < 0) {
            throw PersonCatalogIndexOutOfBoundsException()
        }

        if (firstName.isBlank() || secondName.isBlank()) throw IllegalPersonPropertiesException()

        for (symbol in Person.ILLEGAL_SYMBOLS) {
            if (symbol in firstName || symbol in secondName) {
                throw IllegalPersonPropertiesException()
            }
        }

        if (list[index] != Person.EMPTY_PERSON) { // Если индексы СОВПАДАЮТ!
            println("You are rewriting Person with index = $index: ${list[index].firstName} ${list[index].secondName}.")
            list[index] = Person(firstName, secondName)
            println("Person rewrote successfully.")
        } else {
            list[index] = Person(firstName, secondName)
            println("Person wrote successfully.")
        }

    }

    fun getPersonList(): Array<Person> {
        return list
    }

    fun getPersonAtIndex(index: Int): Person {
        return list[index]
    }

    fun createList(list: Array<String>) {
        TODO("Немного не разобрался как реализовать этот метод..( ")
    }

    fun addPersonScan() { // пришлось костылять метод вместо createList(list: Array<String>) =(
        while (true) {
            println("Enter person's first name.")
            val firstName = readln()
            println("Enter person's second name.")
            val secondName = readln()
            println("What index do you want to place Person at?")
            val index = readln().toInt()

            try {
                addPerson(index, firstName, secondName)
            } catch (e: Exception) {
                when (e) {
                    is IllegalPersonPropertiesException, is PersonCatalogIndexOutOfBoundsException -> {
                        println(e.message)
                        println("Please, repeat.")
                    }

                }
            }

            println("Do you want to continue? No - for stop the program.")
            if (readln().lowercase() == "no") return

        }
    }

    fun greeting() {
        println("Person catalog created for $listSize persons")
    }
}


class PersonCatalogIndexOutOfBoundsException : ArrayIndexOutOfBoundsException() { // исключение - вне диапазона
    override val message: String
        get() = "Index of Person is out of range of list."
}

class IllegalPersonPropertiesException :
    IllegalArgumentException() { // исключение - пустая строка или содержит запрещенные символы
    override val message: String
        get() = "String is empty or contains illegal symbols."
}