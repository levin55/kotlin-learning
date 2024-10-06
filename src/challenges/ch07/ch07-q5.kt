fun String.countSpace(): Int {

    var count=0
    for(space in this){
        if(space == ' '){
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    println("Hello World".countSpace())
    println("Hello W o r l d Kotlin".countSpace())
}