package GenericConstraints.Task2

/**
 * Создать класс по имени GenericMethod и обобщенную функцию внутри класса по имени isItIncluded().
 * Функция isItIncluded() определяет, является ли объект членом массива. Он может быть использован с
 * любым типом объектов и массивов до тех пор,
 * пока массив содержит объекты, совместимые с типом искомого объекта.
 */
fun main() {
    val array = arrayOf<Any>("Hello", 8, 89.8f, '+', 1_000_000L, "123", false)

    val genericMethod = GenericMethod()
    println(genericMethod.isItIncluded(2, array))// false
    println(genericMethod.isItIncluded('+', array))// true
    println(genericMethod.isItIncluded(true, array)) // false



}
