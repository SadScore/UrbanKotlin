package InnerClass

class Student(val name: String) : University(), University.Information {
    val estimations: Array<Estimation> = arrayOf()
    override val nameOfUniversity: String = "МГУ"


    class Estimation(val lesson: String, val estimation: String){
        override fun toString(): String {
            return "Урок='$lesson', оценка='$estimation')"

        }
    }
    override fun printInfo() {
        println("Студент университета ${nameOfUniversity}: $name ")
    }
}