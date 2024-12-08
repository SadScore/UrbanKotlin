package MyInterfaces

interface Condition {
    val ageForWork: Int
        get() = 18

    fun readyToWork(age: Int)
}