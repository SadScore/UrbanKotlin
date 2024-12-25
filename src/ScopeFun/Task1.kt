package ScopeFun

/**
 * Создайте scope – функцию let, которая будет вызываться у строки.
 * В лямбда – выражении этой функции выводится в консоль сам объект и длина этой строки.
 */
fun main() {
    val str: String = "Старый Город"
    str.let { println("$str, Length: ${str.length}") }
}