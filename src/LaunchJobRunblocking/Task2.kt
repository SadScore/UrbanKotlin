package LaunchJobRunblocking

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val lazyJob = launch(start = CoroutineStart.LAZY) {
        println("Произошел ленивый запуск")
    }
    val end = launch(start = CoroutineStart.LAZY) {
        println("Программа завершена")
    }
    println("Начало программы")

    launch {
        for (i in 1..4) {
            delay(1000L)
            println(i)
            if (i == 2) lazyJob.start()
        }
        end.start()

    }
    Unit

}