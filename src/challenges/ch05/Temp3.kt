import kotlin.random.Random

fun rollDice2(): Int = Random.nextInt(6)+1

fun main(args: Array<String>) {
    var num = rollDice2()
    println(num)
}
