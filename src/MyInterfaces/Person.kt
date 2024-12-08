package MyInterfaces

abstract class Person(val firstName: String, val lastName: String, val age: Int){
    abstract fun startAction()
    abstract fun finishAction()
}

