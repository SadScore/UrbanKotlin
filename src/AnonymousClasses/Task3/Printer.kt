package AnonymousClasses.Task3

abstract class Printer(val type: String, val printerCapacity: Int) {
    abstract fun toWork()
    abstract fun printPhoto()
    abstract fun printDoc()
    abstract fun printerInfo()

}