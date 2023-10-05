package lesson6


fun main() {
    println("Регистрация:\nПридумайте логин")
    val login = readLine()

    println("Придумайте  пароль")
    val pass = readLine()

    do {
        println("Авторизация:\nВведите логин")
        val loginConfirm = readLine()

        println("Введите пароль")
        val passConfirm = readLine()

        if ((pass == passConfirm) && (loginConfirm == login))
            println("Авторизация прошла успешно")
        else
            println("Неверный логин или пароль.\n")
    } while ((pass != passConfirm) || (loginConfirm != login))

}