fun main() {

   // val vinNum = (1..100).random()  Запасной вариант с неизвестными выигрышными числами выпадающими рандомно
   // val vinNum2 = (1..100).random()

    println("Введите число от 1 до 100")

    val userNum = readLine()!!.toInt()
    val vinNum = 78
    val vinNum2 = 74

    println("Введите второе число от 1 до 100")

    val userNum2 = readLine()!!.toInt()

    if ((userNum == vinNum && userNum2 == vinNum2) || (userNum == vinNum2 && userNum2 == vinNum))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((userNum == vinNum || userNum2 == vinNum2) || (userNum == vinNum2 || userNum2 == vinNum))
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")

    println("Призовые числа $vinNum и $vinNum2")
}



