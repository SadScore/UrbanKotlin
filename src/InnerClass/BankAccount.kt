package InnerClass

class BankAccount(private var sum: Int) {

    fun display(){
        println("Sum = $sum")
    }
    inner class Transaction{
        fun pay(s: Int) {
            sum -= s
            display()
        }
    }
}