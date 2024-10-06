import java.io.File
import java.io.FileInputStream
import java.io.ObjectInput
import java.io.ObjectInputStream
import special.Diary

fun main(args: Array<String>){
    val f1 = File("E:/wikibook-learn-kotlin/src/challenges/ch11/diary_20240919_205119.bin")

    val ois = ObjectInputStream(FileInputStream(f1))

    val p1FromFile = ois.readObject() as Diary
    val p2FromFile = ois.readObject() as Diary

    ois.close()

    println("p1FromFile: $p1FromFile")
    println("p2FromFile: $p2FromFile")

//    if(f1.exists()) {
//        var fileText = f1.readText()
//        println(fileText)
//    }
//    else{
//
//    }


}