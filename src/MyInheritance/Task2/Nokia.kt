package MyInheritance.Task2

class Nokia: IPhone() {
    override fun toString(): String {
        return "Смартфон Nokia: модель смартфона - $model', вес смартфона = $weight г., встроенная память = $storage гб," +
                " размер экрана = $screen дюймов)"
    }
}