package LaunchJobRunblocking

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() = coroutineScope  {
    try {
        println("Программа покупки продуктов")
        delay(1000L)
        println("Купить товар:\n1.Да\n2.Нет")

        val answer = readln()
        when (answer) {
            "Да" -> buyProduct()
            "Нет" -> delayBuy()
            else -> throw Exception("Данные введены неверно!")
        }
    } finally {
        println("До свидания")
    }
    Unit
}

suspend fun buyProduct() = coroutineScope {
    launch {
        println("Оплата продукта началась")
        delay(2000L)
        println("Сканирование и обработка...")
        delay(2000L)
        println("Покупка оплачена.")
    }


}

suspend fun delayBuy() = coroutineScope {
    println("Отмена покупки...")
    delay(2000L)
    println("Покупка отменена.")
}