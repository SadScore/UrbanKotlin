package MyInterfaces.Task1

class Ambulance(name: String, phone: String) : EmergencyService(name, phone), Printable {
    override fun descriptionAboutWhatServiceDoing() {
        println("$name оказывает первую медицинскую помощь и доставляет больных в больницу!")
    }

    override fun getDescription() {
        println("Номер $name: $phone ")
    }
}