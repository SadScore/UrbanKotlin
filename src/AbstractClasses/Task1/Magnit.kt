package AbstractClasses.Task1

class Magnit(openTime : String, closeTime: String): Shop(openTime, closeTime) {

    override fun hireEmployee(numberOfPeople: Int) {
        println("Магазин 'Магнит' нанял в свои магазины $numberOfPeople сотрудников")
    }

    override fun fireEmployee(numberOfPeople: Int) {
        println("Магазин 'Магнит' уволил из своих магазинов $numberOfPeople сотрудников")
    }

    override fun workingTime() {
        println("Магазин 'Магнит' отрывается в $openTime, закрывается в $closeTime")
    }
}