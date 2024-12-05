package OverrideFun.Task1

class Penguin(type: String, wingSize: Double) : Bird(type, wingSize) {
    override var abilityToFly: Boolean = false
    override fun toEat() {
        println("Птица $type ест рыбу!")
    }
}