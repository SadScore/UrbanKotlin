package CheckAndGroup

/**
 *  Дан список слов в произвольном порядке по алфавиту.
 *  Необходимо сгруппировать элементы по первому символу.
 */
fun main() {
    val list = listOf("автобус", "привет", "кот", "дом", "море", "книга", "окно", "лодка", "улыбка", "песня",
        "велосипед", "солнце", "компьютер", "телефон", "школа", "дерево", "машина", "кошка", "река", "небо", "торт")

    val sorted = list.groupBy { it[0] }.toSortedMap()
    println(sorted)
}