package MyInterfaces

class Hospital(
    private val hospitalName: String,
    private val countDepartments: Int) : Printable {
    override fun printObjectInfo() {
        println("Больница: $hospitalName " +
        "количество отделений: $countDepartments")
    }


}