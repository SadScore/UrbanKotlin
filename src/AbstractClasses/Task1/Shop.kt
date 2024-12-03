package AbstractClasses.Task1

abstract class Shop(val openTime : String, val closeTime: String) {

    abstract fun hireEmployee(numberOfPeople: Int)
    abstract fun fireEmployee(numberOfPeople: Int)

    open fun workingTime(){
        println("Магазин отрывается в $openTime, закрывается в $closeTime")
    }

}