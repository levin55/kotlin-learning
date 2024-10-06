class Fraction(var numerator: Int, var denominator: Int) {

    fun toDouble(): Double{
        return numerator.toDouble()/denominator
    }

    private fun lcm(a: Int, b: Int): Int {
        return a * b / gcd(a,b)
    }

    private fun gcd(a: Int, b: Int): Int {
        var gcd = 1
        for(i in 2..kotlin.math.min(a, b)){
            if((a % i == 0) && (b % i == 0)){
                gcd = i
            }
        }
        return gcd
    }

    infix fun add(other: Fraction): String {
        var addlcm = lcm(denominator, other.denominator) // 20
        var addnumerator = numerator*(addlcm/denominator)
        var addothernumerator = other.numerator*(addlcm/other.denominator)

        return "${(addnumerator+addothernumerator)}/${addlcm}"
    }
    infix fun sub(other: Fraction): String {
        var addlcm = lcm(denominator, other.denominator) // 20
        var addnumerator = numerator*(addlcm/denominator)
        var addothernumerator = other.numerator*(addlcm/other.denominator)

        return "${(addnumerator-addothernumerator)}/${addlcm}"
    }
}

fun main(args: Array<String>) {
    var f1 = Fraction(3,4)
    var f2 = Fraction(1,10)
    //println(f1.toDouble())

    var f3 = f1.add(f2)
    var f4 = f1.sub(f2)
    var f5 = f1 add f2
    var f6 = f1 sub f2

    println(f3)
    println(f4)
    println(f5)
    println(f6)
}