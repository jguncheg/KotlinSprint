fun main() {

    val numberOne = (1..100).random()
    val numberTwo = (1..100).random()

    println("Введите число от 1 до 100")
    val userNumber1 = readLine()!!.toInt()

    println("Введите второе число от 1 до 100")

    val userNumber2 = readLine()!!.toInt()
    if ((userNumber1 == numberOne || numberTwo == userNumber2) && (userNumber2 == numberOne || userNumber1 == numberTwo))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (userNumber1 == numberOne || numberTwo == userNumber2 || userNumber2 == numberOne || userNumber1 == numberTwo)
        println("Вы выиграли утешительный приз!")
    else println("Не повезло, попробуйте еще раз.")
    println("Выигрышные числа $numberOne и $numberTwo")

}