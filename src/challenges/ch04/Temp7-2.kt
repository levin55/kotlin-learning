package challenges.ch04

fun main(args: Array<String>) {

    //var pp = 1 .. 5 step 2
    for(i in 1 .. 5) {
        for(k in 1..i) {
            if(k%2 == 1)
                continue
            print("*")
        }
        println()
    }
}