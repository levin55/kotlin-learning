fun String.sayHelloTo(to: String, times: Int) {
    for (i in 1..times) {
        println("${this}가 ${to}에게 인사")
    }
}
fun main(args: Array<String>) {
    val name = "김홍두"

    name.sayHelloTo("너",2)
}