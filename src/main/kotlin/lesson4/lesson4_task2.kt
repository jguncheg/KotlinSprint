
fun main(){
    val kg = 20
    val liters = 80
    val kg2 = 50
    val liters2 = 100

    println("Груз весом $kg и объемом $liters соответствует категории 'Average': ${(kg >= 30 && kg<= 100) and (liters < 100)}\n" +
            "Груз весом $kg2 и объемом $liters2 соответствует категории 'Average': ${(kg2 >= 30 && kg2<= 100) and (liters2 <= 100)}")
}
