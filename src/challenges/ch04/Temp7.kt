package challenges.ch04

fun main(args: Array<String>) {

    var pp = 1 .. 5 step 2
    for(i in pp) {
        for(k in 1..i) {
            print("*")
        }
        println()
    }
}