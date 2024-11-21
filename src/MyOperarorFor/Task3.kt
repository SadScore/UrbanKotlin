package MyOperarorFor

/**
 * Даны координаты двух противоположных вершин прямоугольника: (x1,y1), (x2,y2).
 * Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.
 */
fun main() {

        val x1 = 2
        val y1 = 7
        val x2 = 77
        val y2 = 66

        val a = x2 - x1
        val b = y2 - y1

        val perimeter = (a + b) * 2
        val square = a * b

    println("Периметр = $perimeter")
    println("Площадь = $square")

}