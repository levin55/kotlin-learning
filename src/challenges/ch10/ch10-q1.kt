fun <T> List<T>.myFilter(condition:(T)->Boolean): List<T> {
    val result = mutableListOf<T>()
    for(item in this) {
        if(condition(item)) {
            result.add(item)
        }
    }
    return result
}

fun main(args: Array<String>) {

    val result1 = listOf("Hello", "Banana", "World", "Hole").myFilter {
        it.length == 5 || it.startsWith("H")
    }
    println(result1)
    val result2 = listOf(1, 2, 3, 4, 5, 6).myFilter {
        it % 2 == 0
    }
    println(result2)
}

    /*val names = listOf("이황","김철수","신사임당","이영희","길동","김영수")


    val lengthList = mutableListOf<Int>()

    for(item in names){
        lengthList.add(item.length)
    }
    println(lengthList)

    val kimList = mutableListOf<String>()

    for(item in names){
        if(item.startsWith("김"))
            kimList.add(item)
    }
    println(kimList)

    val twoLengthList = mutableListOf<String>()

    for(item in names){
        if(item.length == 2)
            twoLengthList.add(item)
    }
    println(twoLengthList)

    val threeLengthNameList = mutableListOf<String>()
    var counter = 0

    for(item in names){
        if(item.length == 3)
            counter++
    }
    println(counter)
} */