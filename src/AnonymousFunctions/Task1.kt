package AnonymousFunctions

/**
 * Написать анонимную функцию – поздравление с наступающим новым годом. Ее тип следующий (String, Int) -> String.
 * Где первый параметр имя, кого поздравляют, второй с каким годом поздравляют.
 * Эти аргументы должны вписываться в контекст поздравления, которое составлено в теле функции.
 */
fun main() {
    val congratulation = fun(name: String, year: Int): String = "Поздравляем вас $name c $year годом!"
    println(happyNewYear("Сергей", 2025, congratulation))
    val happyNewYear = fun (name: String, year: Int): String = "Поздравляем вас $name c $year годом!"
    println(happyNewYear("Михаил", 2025))

}

fun happyNewYear(name: String, year: Int, op: (String, Int) -> String): String {
    val result = op(name, year)
    return result
}

