package OverrideFun.Task1

class Owl(type: String, wingSize: Double) : Bird(type, wingSize) {
    override var abilityToFly: Boolean = true
    override fun toEat() {
        println("Птица {Вид: $type} - ест мышь!")
    }


}