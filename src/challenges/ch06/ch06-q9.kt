import challenges.ch06.Rectangle

interface Shape{

    var area: Double
    var perimeter: Double

    //fun calculateArea(): Double
    //fun CalculatePerimeter(): Double
}

class Rectangle(val width: Double, val height: Double) : Shape{

    override var area: Double = width * height
    override var perimeter: Double = (width*2) + (height*2)

    /*override fun calculateArea(): Double {
        return width * height
    }
    override fun CalculatePerimeter(): Double {
        return (width*2) + (height*2)
    }*/
}

class Circle(val radius: Double) : Shape{

    override var area: Double = kotlin.math.PI*radius * radius
    override var perimeter: Double = kotlin.math.PI * radius * 2


    /*override fun calculateArea(): Double {
        return kotlin.math.PI*radius * radius
    }
    override fun CalculatePerimeter(): Double {
        return kotlin.math.PI * radius * 2
    }*/
}

fun main(args: Array<String>) {
    var r = Rectangle(10.0, 20.0)
    println(r.area)
    println(r.perimeter)
    var c = Circle(10.0)
    println(c.area)
    println(c.perimeter)
}