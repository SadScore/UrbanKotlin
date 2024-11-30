package MyConstructors.Task5

/**
 * Создайте класс Car. В классе есть конструктор с параметрами массы, скорости.
 * В классе с функцией main создайте экземпляр этого класса и задайте там параметры в конструктор.
 * Напишите функции движения и остановки автомобиля.
 */
class Car(val weight: Int, val speed: Int) {

    fun carStopOrDrive(){
        if (speed < 0) {
            println("Скорость автомобиля не может быть отрицательной")
        }
        if (speed == 0) {
            println("Автомобиль стоит")
        } else {
            println("Автомобиль весом $weight кг. едет со скоростью $speed км/ч")
        }
    }

}