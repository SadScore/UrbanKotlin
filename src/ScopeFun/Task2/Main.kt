package ScopeFun.Task2

fun main() {
    val city = City("Оренбург", 0)
    city.getPopulation(750_000)
    println(city.toString())
    println("-------------------------------------")
    val cityTwo = City("Тольятти", 0)

    cityTwo.apply { this.population = 650_000 }
        .let { println("${it.cityName} : ${it.population} чел.") }
}

