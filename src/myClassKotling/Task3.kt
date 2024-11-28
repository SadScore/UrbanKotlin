package myClassKotling

/**
 * Даны переменная с плавающей точкой, равная 5,87. Необходимо привести ее к целочисленному типу.
 */
fun main() {
    makeItInteger(5.87)

    println("ИЛИ")

    var a: Double = 5.87
    println(a.toInt())

}
fun makeItInteger(a: Double) {
    var b = a
    while (b > 0) {
        var result = b - 1
        b = result
    }

    println(((b * -1) + a).toInt())


}