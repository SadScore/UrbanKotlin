package InnerClass.Task1

/**
 * Создать класс Human(человек). В нем создать несколько внутренних классов, например, head(голова),
 * legs(ноги), в каждом из классов напишите функции этой части тела.
 * В главной функции опишите модель человека, вызвав всю функциональность написанных классов.
 */
fun main() {
    val human = Human("Сергей")
    human.Head().toThink()
    human.Eyes().toLookAt()
    human.Legs().toRun()
}