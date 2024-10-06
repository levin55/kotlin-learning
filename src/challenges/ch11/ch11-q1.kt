import java.io.File

fun main(args: Array<String>){
    val f1 = File("E:/wikibook-learn-kotlin/src/challenges/ch11/calc.txt")

    var result = 0.0
    var lines = f1.readLines() // 0,1,2
    var i = 1

        if(lines[0] == "+"){
            while(i<lines.size) {
                result += lines[i].toDouble()
                i++
            }
        }
        if(lines[0] == "-"){
            while(i<lines.size) {
                result += lines[i].toDouble()
                i++
            }
        }
        if(lines[0] == "*"){
            while(i<lines.size) {
                result += lines[i].toDouble()
                i++
            }
        }
        if(lines[0] == "/"){
            while(i<lines.size) {
                result += lines[i].toDouble()
                i++
            }
        }

    println(result)
}