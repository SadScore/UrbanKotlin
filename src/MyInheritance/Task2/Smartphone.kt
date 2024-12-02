package MyInheritance.Task2

open class Smartphone {

    var model : String = ""
    var weight: Int = 0
    var storage: Int = 0
    var screen : Int = 0
    override fun toString(): String {
        return "Смартфон: модель смартфона - $model', вес смартфона = $weight г., встроенная память = $storage гб," +
                " размер экрана = $screen дюймов)"
    }


}