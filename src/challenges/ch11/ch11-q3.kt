package special


import java.io.File
import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.io.Serializable
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


data class Diary(var content: String) : Serializable

fun main(args: Array<String>){

    val formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss")
    val now = LocalDateTime.now().format(formatter)

    // 파일 경로 및 이름 설정
    val filePath = "E:/wikibook-learn-kotlin/src/challenges/ch11/diary_$now.bin"
    val f1 = File(filePath)
    f1.createNewFile()

    val oos = ObjectOutputStream(FileOutputStream(f1))

    while(true){
        print("> ")
        val line = readLine()!!

        if(line == "/quit")
            break
        else if(line == "/clear"){
            f1.forEachLine {
                f1.writeText("")
            }
            continue
        }
        else{ // 텍스트일 때

            oos.writeObject(Diary(line))
            //f1.appendText(line)
            //f1.appendText("\n")
            println("\"${line}\" 입력 완료.")
        }
    }
    oos.flush()
    oos.close()
}