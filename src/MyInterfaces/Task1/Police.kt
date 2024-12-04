package MyInterfaces.Task1

class Police(name: String, phone: String) : EmergencyService(name, phone), Printable {
    override fun descriptionAboutWhatServiceDoing() {
        println("$name следит за порядком в городе!")
    }

    override fun getDescription() {
        println("Номер $name: $phone ")
    }
}