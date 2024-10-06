package challenges.ch04

fun main(args: Array<String>) {
    var original = arrayOf(1,2,3,4,5)

    var copy = Array(original.size) { 0 }

    for(i in 0 until (original.size)) {
        copy[i] = original[i]
    }

    for(v in copy)
        print("$v ")
}