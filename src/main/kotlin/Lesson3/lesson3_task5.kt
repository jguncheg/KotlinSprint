fun main() {
    val input = "D2-D4;0"

    val split = input.split("-",";")
    val from = split[0]
    val to = split [1]
    val move = split [2]
    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $move")
}