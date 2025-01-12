package Suspend

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope {
    println("Загрузка начата...")
    listOf(
        launch { downloadData(personList) },
        launch { downloadData(weatherList) },
        launch { downloadData(randoms) }
    ).joinAll()

    println("Данные загружены.")

    println("Список personList: $personList")
    println("Список weatherList: $weatherList")
    println("Список randoms: $randoms")

    println("Программа завершена!")
}

private suspend fun <T> downloadData(list: List<T>) = coroutineScope {
    list.forEach {
        delay(1000L)
        println(it)
    }
}


data class Person(val name: String, val age: Int)
data class Weather(
    val cityName: String,
    val description: String,
    val temp: Double
)

val personList = listOf(
    Person("Сергей", 27),
    Person("Иван", 43),
    Person("Ярослав", 19),
    Person("Михаил", 45)
)

val weatherList = listOf(
    Weather("Оренбург", "дождь", 20.5),
    Weather("Екатеринбург", "солнечно", 25.6),
    Weather("Самара", "гроза", 15.0),
    Weather("Тольятти", "солнечно", 25.7),
)

val randomValue = { (1 + (Math.random() * 99)).toInt() }
val randoms = List(10) { randomValue() }