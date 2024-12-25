package ScopeFun.Task2

import ScopeFun.PersonTwo

/**
 * Создать класс City, в конструкторе передается название города и population(население).
 * В главной функции создать его экземпляр, в конструктор передать название, через функцию apply
 * объекту назначить население в любом количестве.
 * Всю информацию об объекте, созданного City вывести в консоль.
 */
data class City(var cityName: String, var population: Int?) {
    fun getPopulation(_population: Int): City = apply { population = _population }
    override fun toString(): String {
        return "Информация о городе: \nНазвание города - $cityName \nНаселение = $population чел."
    }


}