package AggregateOperations

/**
 * Создать data класс Player, который характеризует игрока с именем, количеством заработанных очков и выигранных денег.
 * Создать список таких игроков с произвольными данными в конструкторе.
 * Посчитать и вывести в консоль общее количество очков и выигранных денег.
 */
fun main() {

    val listOfPlayers = listOf(
        Player("Max", 7000, 78998.99),
        Player("Helen", 10500, 10777.5),
        Player("Alex", 1500, 765.18),
        Player("Vlad", 900, 101.01),
    )

    val sumOfScore = listOfPlayers.sumOf { it.score }
    val sumOfMoney = listOfPlayers.sumOf { it.money }
    println("Sum of score: $sumOfScore")
    println("Sum of money: $sumOfMoney")

}
data class Player(val name: String, val score: Int, val money: Double)