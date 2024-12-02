package MyInheritance.Task2

/**
 * Создать классы Nokia и Sony.
 * Наследовать каждый из них от суперклассов Smartphone и IPhone.
 * Создать несколько свойств в суперклассах и функцию звонка.
 */
fun main() {
    val sony = Sony()
    sony.model = "А380"
    sony.weight = 300
    sony.screen = 8
    sony.storage = 512
    sony.toCall()
    println(sony.toString())
    println("---------------------")

    val nokia = Nokia()
    nokia.model = "CX789"
    nokia.weight = 278
    nokia.screen = 9
    nokia.storage = 128
    nokia.toCall()
    println(nokia.toString())
}