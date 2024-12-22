package TypeConversion

/**
 * Дана строка, содержащая в себе значение 12.3. Преобразовать ее в целое число, число с плавающей точкой,
 * число в двоичной системе представления и вывести в консоль. Для части преобразований, например,
 * в двоичное представление, необходимо сделать несколько преобразований, чтобы целое число перевести в двоичное.
 */
fun main() {
    val str = "12.3"
    val num: Int = str.toDouble().toInt()
    val doub: Double = str.toDouble()
    val decimal = str.toDouble().toInt().toString(2)
    println("$str, $num, $doub, $decimal")
}
