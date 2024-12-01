package GetterSetter.Task1

/**
 * Написать класс «Банковская карта». В нем создать свойства номера карты и код карты.
 * В главной функции мы можем получить доступ к номеру карты, но не можем к коду.
 * Есть функция, которая описывает, что данные карты будут доступны после ввода пароля.
 */
class BankCard {
    constructor(cardNumber: Long) {
        this.cardNumber = cardNumber
    }

    var cardNumber: Long = 0
        private set(value) {
            if (value == 9999_9999_9999_9999) {
                field = value
                showInfo()
            } else {
                println("Некорректный номер карты")
                field = 0
            }

        }

    private var cardPin: String = ""
        private set(value) {
            if (value == "0000") {
                println("Пароль верный!")
                println("Денег у вас очень много! Работайте дальше!")
                field = value
            } else {
                println("Пароль неверен!")

            }

        }

    fun showInfo() {
        println("Данные карты будут доступны после ввода пароля!")
        for (i in 1..3) {

            println("Введите пароль. У вас ${4 - i} попытки")
            var pinCode: String = readln()
            if (pinCode == "0000") {
                cardPin = pinCode
                return
            }
            if (i == 3) {
                println("Ваша карта заблокирована")
                break
            }
        }
    }


}

