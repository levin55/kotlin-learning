import kotlin.math.PI

fun calculateCircleArea(radius: Double): Double {

    var result = PI*radius*radius
    return result
}

fun main(args: Array<String>) {
    var area = calculateCircleArea(10.0)
    println(area)
}