package MyInheritance.Task1

class Dog: Animal() {
    fun toRun(){
        println("Собака по кличке $name бежит за машиной")
    }

    override fun toString(): String {
        return "Собака кличка '$name', весом = $weight кг)"
    }


}