fun main() {
    val kg = 20
    val liters = 80
    val kg2 = 50
    val liters2 = 100
    val minKg = 30
    val maxKG = 100

    println(
        "Груз весом $kg и объемом $liters соответствует категории 'Average': ${(kg >= minKg && kg <= maxKG) and (liters < 100)}\n" +
                "Груз весом $kg2 и объемом $liters2 соответствует категории 'Average': ${(kg2 >= minKg && kg2 <= maxKG) and (liters2 < 100)}"
    )
}
