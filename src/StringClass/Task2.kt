package StringClass

/**
 * Нужно осуществить проверку номера телефона.
 * Он должен начинаться с +7 и содержать 10 цифр, не считая +7.
 * Если телефон верно введен, выведите true, иначе false.
 */

fun main() {
    println(isNumberCorrect("+77777777777")) // true
    println(isNumberCorrect("+7777777758")) // false

}

fun isNumberCorrect(phoneNumber: String): Boolean {
    if (phoneNumber.startsWith('+') && phoneNumber[1] == '7' && phoneNumber.length == 12) return true else return false
}