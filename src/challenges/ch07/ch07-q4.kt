class Fraction1(var numerator: Int, var denominator: Int) {
     override fun toString(): String {
         return "$numerator/$denominator"
     }
}

fun main(args: Array<String>) {
    var f1 = Fraction1(3,4)
    var f2 = Fraction1(1,10)

    println(f1)
    println(f2)
}