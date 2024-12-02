package VisibilityModifiers.Task1

/**
 * Создать класс Registration с полями email и password. Для этого свойства email написать геттер,
 * который возвращает значение этого поля в верхнем регистре. Для поля password написать сеттер, который контролирует,
 * чтобы длина пароля была не менее 6 символов, иначе выводит сообщение, что не соответствует его длина.
 * Замечание:
 * Смотрите, насчет первого задания нам надо все же определить и повторить что есть сеттер и геттер...
 * геттер не может выводить в консоль данные какие-то, он их возвращает
 * Сеттер же, в свою очередь, создан для сеттинга, значит в этот метод мы передаем данные и их присваиваем тому свойству, которое сеттим
 * Попробуйте поправить первый номер
 */
class Registration {

    constructor(email: String, password: Int) {
        this.email = email
        this.password = password

    }

    private var email: String
        get() = field.uppercase()
    private var password: Int = 0
        set(value) = if (value.toString().length < 6) {
            field = value
            println("Пароль < шести символов.")

        } else {
            println("Пароль соответствует требованиям")
            println(toString())
        }


    override fun toString(): String {
        return "Registration(email='$email')"
    }

}