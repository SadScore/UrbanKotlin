package OverrideFun.Task1

open class Bird(val type: String, val wingSize: Double) {

    open var abilityToFly: Boolean = true
    val information: String
        get() = "Птица {Вид: $type, размер крыла: $wingSize см, умение летать: $abilityToFly }"

    open fun toEat() {
        println("Птица {Вид: $type} - ест еду!")
    }

    fun toFly() {
        if (abilityToFly == true) println("Птица $type полетела!") else println("Птица $type НЕ полетела!")
    }

    fun printInfo() {
        println(information)
    }

}