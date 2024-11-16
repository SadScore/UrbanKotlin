package myOperators

/**
 * Домашнее задание по теме "Операторы в Kotlin"
 * Цель: Написать программу на языке Kotlin для работы с переменными и типами данных.
 * Дана сторона квадрата a. Найти его периметр P=4∗a.
 * Дана сторона квадрата a. Найти его площадь S=a*a
 * Даны стороны прямоугольника a и b. Найти его площадь S=a∗b и периметр P=2∗(a+b).
 * Дан диаметр окружности d. Найти ее длину L=π∗d. В качестве значения π использовать константу 3.14.
 * Дано расстояние L в сантиметрах. Используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).
 * Даны целые положительные числа A и B (A>B). На отрезке длины A размещено максимально возможное количество отрезков длины B
 * (без наложений). Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
 * Примечания:
 * - Для вывода значений на экран используйте функцию println().
 * Пример результата выполнения программы:
 * P = 25 | S = 30 | L=40 | A=50
 */
const val PI = 3.14
fun main() {
    val a = 7
    val b = 10
    val d = 5
    val squareP = 4 * a
    val squareS = a * a
    val rectangleS = a * b
    val rectangleP = 2*(a+b)
    val cercleL : Double = PI * d

    val l : Int = 100_000
    val wholeL = l / 100

    val A = 187
    val B = 17
    val wholeAB = A / B

    println("Периметр и площадь квадрата: P = " + squareP + " | S = " + squareS)
    println("Периметр и площадь прямоугольника: P = " + rectangleP + " | S = " + rectangleS)
    println("Длинна круга = " + cercleL)
    println("Колличество полныъ метров в длинне " + l + " см. Равно = " + wholeL + " м.")
    println("Максимальное число полных отрезков В на отрезке А = " + wholeAB)






}
