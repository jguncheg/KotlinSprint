fun main() {
    val number1 = 5
    val number2 = 9
    println("Докажите что вы не бот решите задачу: $number1+$number2=?")
    val answer = readLine()!!.toInt()
    if (answer == number1 + number2)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен")


}