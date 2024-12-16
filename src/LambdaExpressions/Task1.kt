package LambdaExpressions

/**
 * Напишите функцию, которая запускает лямбду print() столько раз сколько будет указано в параметре count.
 * Например, чтобы передаваемое сообщение в print() выводилось count раз.
 */
fun main() {
    val print = { println("4, 8, 15, 16, 23, 42") }
    repeatFun(print, 2)

}

fun repeatFun(op: () -> Unit, count: Int) {
    repeat(count) {
        op()
    }
}