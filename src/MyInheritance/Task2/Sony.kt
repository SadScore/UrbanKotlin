package MyInheritance.Task2

class Sony: IPhone() {
    override fun toString(): String {
        return "Смартфон Sony: модель смартфона - $model', вес смартфона = $weight г., встроенная память = $storage гб," +
                " размер экрана = $screen дюймов)"
    }

}