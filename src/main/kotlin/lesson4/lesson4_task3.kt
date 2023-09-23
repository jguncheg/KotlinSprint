fun main() {

    val sunnyWheater:Boolean = true
    val openTent:Boolean = true
    val airWet:Int = 20
    val season:String = "winter"

    val conclusion = sunnyWheater == true && openTent == true && airWet == 20 && season != "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? :$conclusion" )
}