package GenericClassAndFun

/**
 * Написать функцию print(), которая на вход может принимать различные типы.
 * Вызвать эту функцию несколько раз, поместив аргументы разных типов.
 */
fun main() {
    print("Привет")
    print(2)
    print(arrayOf(18,2,3,4,5).contentToString())
    print(arrayOf('F','U','N').contentToString())
    print(true)

}

fun <T> print(something: T) {
    println(something)
}