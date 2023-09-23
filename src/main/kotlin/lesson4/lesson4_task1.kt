fun main() {

    val freeTableToday = 13
    val freeTableTomorrow = 9
    val compare: Boolean = ALL_PLACES > freeTableToday
    val compare2: Boolean = freeTableTomorrow < ALL_PLACES

    println("Доступность столиков на сегодня: $compare \nДоступность столиков на завтра: $compare2")


}

const val ALL_PLACES = 13
