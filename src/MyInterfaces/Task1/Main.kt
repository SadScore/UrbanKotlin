package MyInterfaces.Task1

fun main() {
    val fireFighters = FireFighters("Пожарная служба", "01")
    fireFighters.descriptionAboutWhatServiceDoing()
    fireFighters.getDescription()
    getLine("-")
    val police = Police("Полиция", "02")
    police.descriptionAboutWhatServiceDoing()
    police.getDescription()
    getLine("-")
    val ambulance = Ambulance("Скорая помощь", "03")
    ambulance.descriptionAboutWhatServiceDoing()
    ambulance.getDescription()

}
fun getLine(sample: String){
    for (i in 0..60) {
        print(sample)
    }
    println()
}