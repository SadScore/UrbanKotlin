package MyInheritance.Task1

open class Animal {
    var name : String = ""
    var weight : Int = 0

    fun toEat(){
        println("$name принимает пищу!")
    }

    override fun toString(): String {
        return "Животное кличка '$name', весом = $weight кг)"
    }

}