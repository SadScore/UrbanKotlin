package GenericConstraints.Task1

fun main() {
    val array = arrayOf<Number>(7, 4.0, 8.0, 15.7f, 5.0, 10, 70000L, 8.0f, 1)
    val states = States<Number>()
    println(states.getAverage(array))
}