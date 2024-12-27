package InfixFun

/**
 * Написать четыре инфиксных функции: сложения, вычитания, умножения и деления.
 * В функции main применить их для разных операндов, результат вывести в консоль
 */
fun main() {
    val a: Double = 10.0
    val b: Double = 4.5

    println(a sum b)
    println(a dec b)
    println(a mul b)
    println(a div b)

}

infix fun Double.sum(a: Double): Double {
    return this + a
}

infix fun Double.dec(a: Double): Double {
    return this - a
}

infix fun Double.mul(a: Double): Double {
    return this * a
}

infix fun Double.div(a: Double): Double {
    return this / a
}

