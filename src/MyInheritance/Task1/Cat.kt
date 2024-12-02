package MyInheritance.Task1

class Cat: Animal() {

    fun toPlay(){
        println("Кот по кличке $name играет с бантиком")

    }

    override fun toString(): String {
        return "Кот кличка '$name', весом = $weight кг)"
    }

}