import kotlin.math.abs

fun Double.toPair():Pair<Int,Double> {

    var num = 0

    while(num < this) { // this는 1.5    4 > 3.14
        //if(num >= this) break

        num++
    }

    return Pair(num-1,abs(this-(num-1)))
}

fun main(args: Array<String>) {
    var d1 = 1.5
    var d2 = 3.14159
    println(d1.toPair())
    println(d2.toPair())
}