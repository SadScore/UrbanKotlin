package GenericClassAndFun.Task2

class Person<T> (val name: String, val phoneNumber: T) {

    override fun toString(): String {
        return "Person: name = ${name}, phone = ${phoneNumber}"
    }


}
