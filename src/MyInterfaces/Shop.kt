package MyInterfaces

class Shop(
    private val shopName: String,
    private val address: String
) : Printable {
    override fun printObjectInfo() {
        println("Магазин товаров $shopName "+
        "Адрес магазина: $address")
    }
}