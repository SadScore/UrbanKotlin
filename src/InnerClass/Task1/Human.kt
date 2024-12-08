package InnerClass.Task1

class Human(val name: String) {

    inner class Head{
        fun toThink(){
            println("Голова человека по имени $name думает куда бежать!")
        }
    }
    inner class Eyes(){
        fun toLookAt(){
            println("Глаза человека по имени $name смотрят в даль!")
        }
    }
    inner class Legs{
        fun toRun(){
            println("Ноги человека по имени $name бегут куда глаза глядят!")
        }

    }
}