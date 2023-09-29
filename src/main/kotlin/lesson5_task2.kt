fun main() {
    println("Введите свой год рождения")

    val userBirthdayYear = readLine()!!.toInt()
    val thisYear = 2023
    if (thisYear - userBirthdayYear >= AGE)
        println("Показать экран со скрытым контентом")
    else println("Доступ ограничен")

}

const val AGE = 18