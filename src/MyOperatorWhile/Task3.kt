package MyOperatorWhile

/**
 * Даны два целых числа A и B (A<B). Вывести в порядке возрастания все целые числа,
 * расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.
 */
fun main() {
    var A = 17
    var B = 35
    var count2 = 0
    println("Числа от $A до $B в порядке возрастания: ")
    while (A <= B){
        count2++
        print(" " + A )
        A++
    }
    println(" ")
    println("Всего чисел N = $count2")

}