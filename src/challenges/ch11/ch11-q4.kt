import java.io.File

fun main(args: Array<String>){
    val f1 = File("E:/wikibook-learn-kotlin/src/challenges/ch11/diary_20240919_190141.txt")

    if(f1.exists()) {
        var fileText = f1.readText()
        println(fileText)
    }
    else{

    }
}