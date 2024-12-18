package StringClass

/**
 * Нужно осуществить проверку номера телефона.
 * Он должен начинаться с +7 и содержать 10 цифр, не считая +7.
 * Если телефон верно введен, выведите true, иначе false.
 */

fun main() {
    println(isNumberCorrect("+77777777777")) // true
    println(isNumberCorrect("+7777777758")) // false
    println(isNumberCorrect("+7777777758yh")) // false

}

fun isNumberCorrect(phoneNumber: String): Boolean {
    if (isOnlyDigits(phoneNumber)) {
        if (phoneNumber.startsWith('+') && phoneNumber[1] == '7' && phoneNumber.length == 12) return true else return false
    }
    return false
}
fun isOnlyDigits(str: String): Boolean {
        return str.removeRange(0..1).all { it.isDigit() }
}