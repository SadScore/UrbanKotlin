package Channels



import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlin.system.measureTimeMillis

suspend fun main() {
    val time = measureTimeMillis {
        var stringResult = ""
        var charList : List<Char> = listOf()
        coroutineScope {
            val channelOne = getList(toStringList(Storage().text))
            val channelTwo = modifiedLists(channelOne)
            channelTwo.consumeEach {
                stringResult += it
            }
            charList = stringResult.toCharArray().toList()
        }
        println(charList)
    }
    println("Затрачено времени на получение данных: $time")
}

//  не получается написать modifiedList (ошибка метод перегружен)... А с другим названием работает.
fun CoroutineScope.modifiedLists(channel: ReceiveChannel<String>): ReceiveChannel<String> = produce {
    channel.consumeEach {
        if (it.isNotBlank()) send(it[0].uppercase())
    }
}

