package DataClass.Task1_1

/**
 * Написать программу по продаже билетов в кино. Пользователь покупает билет, в который заносятся данные названия фильма,
 * места и времени начала сеанса. Проданные билеты заносятся в массив архива.
 * По желанию можно вывести все проданные билеты на фильм.
 *
 */
data class Cinema(
    private var nameOfMovie: String = "",
    private var row: Int = 0,
    private var seat: Int = 0,
    private var time: String = ""
) {
    var arrayOfTickets: Array<Cinema> = arrayOf()


    fun buyTickets() {
        val newTicket = Cinema(nameOfMovie, row, seat, time)

        println("Добро пожаловать в VIP кинотеатр 'CinemaSeven'!!!")
        println("Какой фильм хотите посмотреть?")
        println(
            "Список фильмов:\n1. Разборка в суши-баре (боевик) \n2. Он - один и она - одна (ромком)" +
                    " \n3. Приключение Кота-летуна (мультфильм)"
        )
        val movie: String = readln()
        when (movie) {
            "1" -> {
                newTicket.nameOfMovie = "Разборка в суши-баре (боевик)"
                newTicket.choiceSeats()
                println(newTicket.yourChoiceMovie())

            }

            "2" -> {
                newTicket.nameOfMovie = "Он - один и она - одна (ромком)"
                newTicket.choiceSeats()
                println(newTicket.yourChoiceMovie())
            }

            "3" -> {
                newTicket.nameOfMovie = "Приключение Кота-летуна (мультфильм"
                newTicket.choiceSeats()
                println(newTicket.yourChoiceMovie())
            }

            else -> {
                println("В репертуаре нет такого фильма. Попробуйте снова...")
                anotherTicketIfMovieWrong()
            }
        }
        arrayOfTickets += newTicket
        anotherTicket()



    }
    private fun howManySell(){
        println("Хотите узнать сколько билет продано?")
        println("1. Да \n2. Нет")
        val answer: String = readln()
        if (answer == "1") {
            showInfo()
        }
        if (answer == "2"){
            println("Кинотеатр закрыт!")
        }

    }
    private fun anotherTicketIfMovieWrong(){
        anotherTicket()
    }

    private fun anotherTicket() {
        println("Хотите купить еще билет?")
        println("1. Да?, (Любое значение). Нет?")
        val answer: String = readln()
        if (answer == "1") {
            buyTickets()
        } else {
            println("Спасибо за покупку!")
            howManySell()
        }
    }

    private fun choiceSeats() {
        println("Выбор места: ")
        println("Выберите ряд: 1. Первый 2. Второй 3. Третий")

        val choiceRow: String = readln()
        when (choiceRow) {
            "1" -> row = 1
            "2" -> row = 2
            "3" -> row = 3
            else -> {
                println("Ряд выбран неверно. Попробуйте снова...")
                buyTickets()
            }

        }
        println("Выберите кресло: 1. Первое 2. Второе 3. Третье")
        val choiceSeat: String = readln()
        when (choiceSeat) {
            "1" -> seat = 1
            "2" -> seat = 2
            "3" -> seat = 3
            else -> {
                println("Кресло выбрано неверно. Попробуйте снова...")
                buyTickets()
            }
        }
        println("Выберите время: 1. 10:00 2. 14:00 3. 20:00")
        val choiceTime: String = readln()
        when (choiceTime) {
            "1" -> time = "10:00"
            "2" -> time = "14:00"
            "3" -> time = "20:00"
            else -> {
                println("Время выбрано неверно. Попробуйте снова...")
                buyTickets()
            }
        }



    }

    fun yourChoiceMovie(): String {
        return "Вы выбрали фильм :'$nameOfMovie', Ряд: $row, Место: $seat, Время сеанса: '$time')"
    }

    private fun showInfo() {
        println("Билетов продано ${arrayOfTickets.size}. \nСписок билетов ${arrayOfTickets.contentDeepToString()}")
    }


    private fun isRowSeatAndTimeEmpty (){
        TODO("Проверка куплено место или нет будет чуть позже...")

    }

    override fun toString(): String {
        return "Название фильма: '$nameOfMovie', Ряд: $row, Место: $seat, Время: '$time'"
    }

}

