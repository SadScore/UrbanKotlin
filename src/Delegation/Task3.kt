package Delegation
/**
 * Написать программу, которая проверяет, является ли слово палиндромом.
 */
fun main() {
    println(isPalindrome("доВоД"))
    println(isPalindrome("автоМобиль"))
    println(isPalindrome("Локомотив"))
    println(isPalindrome("шАлаш"))
    println(isPalindrome("Манекенам"))

}

fun isPalindrome(s: String) : Boolean {
    if (s.uppercase().reversed().equals(s.uppercase())) return true else return false

}