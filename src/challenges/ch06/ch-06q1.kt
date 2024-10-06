class Point2(val x:Double, val y:Double){

    fun calculateDistanceFrom(other: Point2): Double {

        var result:Double = kotlin.math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y))

        return result
    }
}

fun main(args: Array<String>) {
    val p1 = Point2(0.0,0.0)
    val p2 = Point2(5.0,5.0)

    println(p1.calculateDistanceFrom(p2))
}