package ifOperator




fun main() {
    println("Первое задание: ")
    var a = 10
    if (a > 0) {
        println(++a)
    } else {
        println(a)
    }
    println("Второе задание: ")
    val a1 = 4
    val a2 = 45
    val a3 = -2
    val a4 = 8
    var shetchik = 0
    if (a1 > 0) {
        shetchik++
    }
    if (a2 > 0) {
        shetchik++
    }
    if (a3 > 0){
        shetchik++
    }
    if (a4 > 0) {
        shetchik++
    }
    println("Положительных чисел в наборе: " + shetchik)

    println("Третье задание: ")
    val b1 = 77
    val b2 = 45
    val b3 = if (b1 > b2) {
        println(b1)
    } else {
        println(b2)
    }
    println("Четвертое задание: ")
    val c1 = 5
    if (c1 == 1) println("Понедельник")
    if (c1 == 2) println("Вторник")
    if (c1 == 3) println("Среда")
    if (c1 == 4) println("Четверг")
    if (c1 == 5) println("Пятница")
    if (c1 == 6) println("Суббота")
    if (c1 == 7) println("Воскресенье")
    //1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»
    println("Пятое задание: ")
    val K = 5
    if (K == 1) {
        println("Плохо")
    } else if (K == 2) {
        println("Неудовлетворительно")
    }else if (K == 3) {
        println("Неудовлетворительно")
    }else if (K == 4) {
        println("Хорошо")
    }else if (K == 5) {
        println("Отлично")
    } else {
        println("ОШИБКА")
    }
    println("Шестое задание: ")

    val d1 : Double = 7.5
    val d2 : Double = 3.25
    val nomerDeistviy = 3
    if (nomerDeistviy == 1){
        println("Выбрано действие СЛОЖЕНИЕ: " + (d1+d2))
    }
    if (nomerDeistviy == 2){
        println("Выбрано действие ВЫЧИТАНИЕ: " + (d1-d2))
    }
    if (nomerDeistviy == 3){
        println("Выбрано действие УМНОЖЕНИЕ: " + (d1*d2))
    }
    if (nomerDeistviy == 4){
        println("Выбрано действие ДЕЛЕНИЕ: " + (d1/d2))
    }








}