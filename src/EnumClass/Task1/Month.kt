package EnumClass.Task1

class Month {

    fun whichSeasonYouWant() {
        println("Чтобы узнать СЕЗОН - введите название месяца на РУССКОЙ языке:")
        val month: String = readln().uppercase()
        when (month) {
            "ДЕКАБРЬ", "ЯНВАРЬ", "ФЕВРАЛЬ" -> {
                println("Месяц $month принадлежит сезону: " + Seasons.WINTER.seasonsRU)
                toContinue()
            }
            "МАРТ", "АПРЕЛЬ", "МАЙ" -> {
                println("Месяц $month принадлежит сезону: " + Seasons.SPRING.seasonsRU)
                toContinue()
            }
            "ИЮНЬ", "ИЮЛЬ", "АВГУСТ" -> {
                println("Месяц $month принадлежит сезону: " + Seasons.SUMMER.seasonsRU)
                toContinue()
            }

            "СЕНТЯБРЬ", "ОКТЯБРЬ", "НОЯБРЬ" -> {
                println("Месяц $month принадлежит сезону: " + Seasons.AUTUMN.seasonsRU)
                toContinue()
            }

            else -> {
                println("Такого месяца нет. Попробуйте снова...")
                toContinue()

            }

        }


    }

    private fun toContinue() {
        println(
            "Желаете продолжить или закончить программу:\n" +
                    "1. Продолжить; 2. Закончить программу."
        )
        val answer: String = readln()
        if (answer == "1") {
            whichSeasonYouWant()
        }
        else if (answer == "2") {
            println("Программа прекратила работу.")
            return
        }
        else {
            println("Неверное значение. Попробуй снова...")
            toContinue()

        }

    }
}



