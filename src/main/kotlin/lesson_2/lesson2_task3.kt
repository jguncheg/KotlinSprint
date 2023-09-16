fun main() {

    val travelTime = 457
    val departureHours = 9
    val departureMinutes = 39

    val arrivalHours = (departureHours + (departureMinutes + travelTime) / 60)
    val arrivalMinutes = (departureMinutes + travelTime) % 60

    println("$arrivalHours:$arrivalMinutes")

}