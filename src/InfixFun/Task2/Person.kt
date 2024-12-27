package InfixFun.Task2

/**
 * Написать класс Person. В конструктор он принимает свойство имени. Внутри класса есть инфиксная функция say,
 * которая будет передавать сообщение объекта этого класса, переданное в параметр.
 * Сообщение внутри функции выводится с помощью println.
 */
class Person(val name: String) {
    infix fun say(str: String) = println("$name сказал: \"$str\"")
}

fun main() {
    val person = Person("Александр")
    person say "Привет"
}