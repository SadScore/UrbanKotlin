package OverrideFun

import java.util.ArrayList

/**
 * Дана строка «ПриВет, кАк деЛа».
 * Необходимо найти символы, находящиеся в верхнем регистре, вывести их и посчитать их количество
 */
fun main() {

    val s1: String = "ПриВет, кАк деЛа"
    val s2: CharArray = s1.uppercase().toCharArray()
    val s3: CharArray = s1.toCharArray()
    val result: ArrayList<Char> = arrayListOf()
    var count: Int = 0
    for (i in s2) {
        for (j in s3) {
            if (i == j && i != ',' && i != ' ') {
                result.add(i)
                count++
            }
        }
    }
    println("Символы в верхнем регистре: ${result.toString()} их у нас $count штук!")


}