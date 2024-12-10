package AnonymousClasses.Task3

import java.sql.SQLOutput
import kotlin.concurrent.thread

/**
 * Написать абстрактный класс Printer со своими свойствами и функциями. В функции main создать несколько объектов Printer.
 */
fun main() {
    val canon = object : Printer("Canon", 450) {
        override fun toWork() {
            if (printerCapacity >= 500) println("Принтер $type работает.") else println(
                "Принтер не работает! загрузите еще" +
                        " ${500 - printerCapacity} листов бумаги."
            )

        }

        override fun printDoc() {
            println("--------------")
            println("Принтер $type печатает документ!")
        }

        override fun printPhoto() {
            println("--------------")
            println("Принтер $type печатает фото!")
        }

        override fun printerInfo() {
            println("--------------")
            println("Принтер: $type \nВместимость лотка для бумаги: $printerCapacity")
        }
    }
    canon.toWork()
    canon.printDoc()
    canon.printPhoto()
    canon.printerInfo()

    val hp = object : Printer("HP", 750) {
        override fun toWork() {
            var paper: Int = 650
            println("Принтер $type напечатал:")
            for (i in 1..paper) {
                if (i % 25 == 0) {
                    printPhoto()
                } else {
                    printDoc()
                }
                println(" напечатана $i страница.")
            }
        }

        override fun printPhoto() {
            println("Напечатана фотография!")
        }

        override fun printDoc() {
            println("Напечатан документ!")
        }
        override fun printerInfo() {

            println("\n--------------")
            println("Принтер: $type \nВместимость лотка для бумаги: $printerCapacity")
        }

    }
    hp.toWork()
    hp.printerInfo()
}