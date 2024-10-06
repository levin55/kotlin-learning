package challenges.ch06

interface Calculable1{

    fun calculate (x: Double, y: Double): Double
}

class Add1 : Calculable1{
    override fun calculate (x: Double, y: Double): Double {
        return x + y
    }
}
class Sub1 : Calculable1{
    override fun calculate(x: Double, y: Double): Double {
        return x - y
    }
}

fun doCalculation(calculable1: Calculable1,x:Double,y:Double):Double{
    return calculable1.calculate(x,y)
}

fun main(args: Array<String>) {

    var add = Add1()
    var sub = Sub1()

    var res1 = doCalculation(add,3.0,4.0)
    var res2 = doCalculation(sub,10.0,4.0)

    println(res1)
    println(res2)
}