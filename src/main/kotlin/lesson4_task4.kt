fun main() {
    val traningDay = 4
    val arms = traningDay%2== 1
    val legs = traningDay%2== 0
    val bask = traningDay%2 == 0
    val press = traningDay%2 == 1


    println(" Упражнения для рук: $arms \n Упражнения для ног: $legs \n Уп" +
            "ражнения для спины: $bask \n Упражнения для пресса: $press")

}