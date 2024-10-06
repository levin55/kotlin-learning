import kotlin.random.Random

fun rollDice(): Int {
    return Random.nextInt(6)+1
}

fun main(args: Array<String>) {
    var num = rollDice()
    println(num)
}
