package GenericConstraints.Task2

class GenericMethod {
    fun <T> isItIncluded(something: T, array: Array<T>) : Boolean {
        return array.contains(something)
    }

}