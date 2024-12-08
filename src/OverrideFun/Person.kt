package OverrideFun

open class Person(val name: String, val age: Int,  ) {
    open var role: String = ""
    open val information: String
        get() = "Person{Name: $name, age: $age, role: $role}"

    open fun printInfo(){
        println(information)
    }
}
open class Employee(name: String, age: Int, ) : Person(name, age) {
override var role = ""
    set(value) {
        if (value.length > 1) field = value else field = "error"
    }
    override val information: String
        get() = super.information

    override fun printInfo() {
        super.printInfo()
    }
}


class Intern(name: String, age: Int) : Employee(name, age){
    override var role: String = "Стажер"
     override fun printInfo() {
        super.printInfo()
    }
}