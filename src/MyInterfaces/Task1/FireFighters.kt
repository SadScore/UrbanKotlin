package MyInterfaces.Task1

class FireFighters(name: String, phone: String) : EmergencyService(name, phone), Printable {
    override fun descriptionAboutWhatServiceDoing() {
        println("$name следит за пожарной безопасностью в городе!")
    }

    override fun getDescription() {
        println("Номер $name: $phone ")
    }
}