fun main(args: Array<String>) {
    val countries = arrayOf("한국", "미국", "일본", "중국", "러시아")
    val cities = arrayOf("s", "w", "t", "b", "m")

    val selectedIdx = kotlin.random.Random.nextInt(5)

    println("${countries[selectedIdx]} 의 수도는? ")
    var str = readLine()!!
    if (str == cities[selectedIdx]) {
        println("정답입니다.")
    } else if (str != cities[selectedIdx]) {
        println("오답입니다. (정답 : ${cities[selectedIdx]})")
    }
}