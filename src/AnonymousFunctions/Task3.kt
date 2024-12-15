package AnonymousFunctions

/**
 * Напишите анонимную функцию для объединения двух строк и возврата результата.
 */
fun main() {
    val concString = fun (a: String, b: String) = "$a $b"
    println(concString("Demolition", "Ranch"))

}