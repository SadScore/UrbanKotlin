package MyConstructors.Task4

/**
 * Дано целое число. Вывести его строку-описание вида «отрицательное четное число»,
 * «отрицательное нечетное число» «нулевое число»,
 * «положительное нечетное число», «положительное четное число».
 * int a = 34
 * à «положительное четное число»
 */
fun main() {
    println(descriptionOfNumbers(-57))
}
fun descriptionOfNumbers(a : Int) : String{
    var d1 : String
    var d2 : String
    var d3 = "число"
    when {
        a < 0 -> d1 = "отрицательное"
        a > 0 -> d1 = "положительное"
        else -> d1 = "нулевое"
    }
    when {
        a % 2 == 0 -> d2 = "четное"
        a % 2 != 0 -> d2 = "нечетное"
        else -> d2 = ""
    }
    return "$d1 $d2 $d3"
}