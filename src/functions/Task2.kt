package functions

/**
 * Написать функцию, которая принимает два целых числа a и b (a<b).
 * Она вычисляет произведение всех целых чисел от a до b включительно.
 */
fun main() {
sumFromAtoB(7, 8)
}

fun sumFromAtoB(a : Int, b : Int){
    if (a<b) {
        var result = 0
        for (i in a..b){
            result += i
        }
        println(result)
    } else {
        println("$a >= $b переделай")
    }
}