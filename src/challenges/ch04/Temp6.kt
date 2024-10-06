package challenges.ch04

fun main(args: Array<String>) {

    var fiveToOne = 5 downTo 1
    //var i = 5

    for(k in 5 downTo 1) {
        for (i in k downTo 1) {
            print("*")
        }
        println()
    }
}