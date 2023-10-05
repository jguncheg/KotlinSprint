fun main() {
    println("Введите имя пользователя.")
    val login = readLine()
    if (login == LOGIN) {
        println("Введите пароль")
    } else {
        println("Зарегистрируйтесь")
        return
    }
    val password = readLine()
    if (password == PASS) {
        println("Добро пожаловать ")
    } else {
        println("Ошибка")
    }
}
const val LOGIN = "Zaphod"
const val PASS = "PanGalactic"
