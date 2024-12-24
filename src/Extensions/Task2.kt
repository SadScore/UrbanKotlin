package Extensions

/**
 * Написать функцию расширения конкатенации строк.
 */
fun main() {
    val a: String = "WI"
    val b: String = "FI"
    println(a.concat(b))
}
fun String.concat(str: String) : String {
    return this + str
}