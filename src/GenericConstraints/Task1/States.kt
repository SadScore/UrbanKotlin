package GenericConstraints.Task1

/**
 * Создать обобщенный класс States, который содержит функцию getAverage(), возвращающую
 * среднее значение массива чисел. Класс имеет ограничение, работать может только с числовыми значениями, T:Number.
 */
class States<T>() where T: Number {
    fun <T : Number> getAverage(array: Array<T>) : Double {
        var sum = 0.0
        array.forEach { sum += it.toDouble() }
        return sum / 2



    }

}



