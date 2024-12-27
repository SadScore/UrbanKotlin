package InfixFun.Task3

/**
 * Создать data класс Point(точка), характеризующее место объекта. Написать две инфиксные функции, расширяющие этот класс.
 * Они характеризуют расположение одной точки относительно другой – isAbove() – описывает ситуацию, когда одна точка выше другой,
 * isRightOf – описывает ситуацию, когда одна точка правее другой.
 * В функции main создать два объекта Point и сравнить их расположение, применив вышеуказанные функции.
 */
data class Point(val point: Int) {
    infix fun isAbove(pointTwo: Point) {
        if (this.point == pointTwo.point) {
            println("$point и ${pointTwo.point} на одном уровне!")
        } else if (pointTwo.point < this.point) {
            println("$point выше $pointTwo")
        } else {
            println("$point ниже $pointTwo")
        }
    }

    infix fun isRightOf(pointTwo: Point) {
        if (this.point == pointTwo.point) {
            println("$point и ${pointTwo.point} на одном уровне!")
        } else if (pointTwo.point < this.point) {
            println("$point правее $pointTwo")
        } else {
            println("$point левее $pointTwo")
        }
    }

    override fun toString(): String {
        return "$point"
    }


}

fun main() {
    val pointOne = Point(20)
    val pointTwo = Point(10)

    pointOne isAbove pointTwo
    pointOne isRightOf pointTwo

}
