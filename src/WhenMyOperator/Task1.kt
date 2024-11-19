package WhenMyOperator

/**
 * Домашнее задание по теме "Оператор When"
 * Цель: Написать программу на языке Kotlin для работы с оператором When
 * 1) Дан порядковый номер месяца года. Нужно написать программу, которая будет выводить
 * на экран время года и название месяца. Пример вывода: «Зима: Январь.»
 *
 *
 *
 * Примечания:
 * - Для вывода значений на экран используйте функцию println().
 */
fun main() {
    println("Первое задание: ")
    val month = 12
    when (month) {
        12, 1, 2 -> {
            print("Зима: ")
            if (month == 12) println("Декабрь")
            if (month == 1) println("Январь")
            if (month == 2) println("Февраль")
        }
        3, 4, 5 -> {
            print("Весна: ")
            if (month == 3) println("Март")
            if (month == 4) println ("Апрель")
            if (month == 5) println ("Май")
        }
        6, 7, 8 -> {
            print("Лето: ")
            if (month == 6) println("Июнь")
            if (month == 7) println ("Июль")
            if (month == 8) println ("Август")
        }
        9, 10, 11 -> {
            print("Осень: ")
            if (month == 9) println("Сентябрь")
            if (month == 10) println ("Октябрь")
            if (month == 11) println ("Ноябрь")
        }
        else -> println("Нет такого месяца")
        }


    }


















