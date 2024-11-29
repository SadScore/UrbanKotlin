package VisibilityModifiers.Task1

/**
 * Создать класс Registration с полями email и password. Для этого свойства email написать геттер,
 * который возвращает значение этого поля в верхнем регистре. Для поля password написать сеттер, который контролирует,
 * чтобы длина пароля была не менее 6 символов, иначе выводит сообщение, что не соответствует его длина.
 */
class Registration(email : String, password : Int) {
    private var email : String = email
    private var password : Int = password

    fun getEmail() = println(email.uppercase())
    fun setPassword () {
        if (password.toString().length < 6) {
            println("Пароль < шести символов.")

        } else {
            println("Пароль соответствует требованиям")
        }
    }


}