package AbstractClasses.Task1

class Pyaterochka(openTime : String, closeTime: String): Shop(openTime, closeTime) {
    override fun hireEmployee(numberOfPeople: Int) {
        println("Магазин 'Пятерочка' нанял в свои магазины $numberOfPeople сотрудников")
    }

    override fun fireEmployee(numberOfPeople: Int) {
        println("Магазин 'Пятерочка' уволил из своих магазинов $numberOfPeople сотрудников")
    }

    override fun workingTime() {
        println("Магазин 'Пятерочка' отрывается в $openTime, закрывается в $closeTime")
    }
}