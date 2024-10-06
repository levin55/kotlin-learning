class myTriple<FirstType,SecondType,ThirdType>(var first: FirstType, var second: SecondType, var third: ThirdType) {}

sealed class Quiz(val question: String)

enum class AnswerType { O, X  }

// OX 퀴즈
class OXQuiz(question : String, val answer: AnswerType) : Quiz(question)

// N지선다 퀴즈
class MultiChoiceQuiz(question : String, val answer: String, val choices: List<String>) : Quiz(question)

// 단답식 퀴즈
class ShortAnswerQuiz(question : String, val answer: String, val alternatives : List<String>?,
                      val sanitize : (String) -> String = { it.trim() }) : Quiz(question)

fun main (args: Array<String>) {

    var multi = listOf("seoul","대전","대구","부산")
    var alter1 = listOf("Apple")
    var alter2 = listOf("Kotlin")

    var answerCount = 0

    val quizzes = mutableListOf<Quiz>()
    quizzes.add(OXQuiz("1. 대한민국의 수도는 서울이다.",AnswerType.O))
    quizzes.add(OXQuiz("2. 미국의 수도는 뉴욕이다",AnswerType.X))
    quizzes.add(MultiChoiceQuiz("3. 대한민국의 수도는?","seoul",multi))
    quizzes.add(ShortAnswerQuiz("4. 사과를 뜻하는 영단어는?","apple",alter1))
    quizzes.add(ShortAnswerQuiz("5. JetBrain에서 만든 프로그래밍 언어는?",
        "kotlin",alter2))

    for(q in quizzes) {

        when(q){
            is OXQuiz ->{
                println(q.question)
                print("> ")
                if(readLine() == q.answer.toString()){
                    answerCount++
                    println("정답입니다.")
                }
                else{
                    println("오답입니다")
                }
            }
            is MultiChoiceQuiz ->{
                println(q.question)
                for(choice in 0..< q.choices.size){
                    println("${choice+1}. ${q.choices[choice]}")
                }
                print("> ")
                if(readLine()!!.toInt() == ((q.choices.indexOf(q.answer))+1)){
                    answerCount++
                    println("정답입니다.")
                }
                else{
                    println("오답입니다")
                }
            }
            is ShortAnswerQuiz ->{
                println(q.question)
                print("> ")
                val myAnswer = q.sanitize(readLine()!!)
                if(myAnswer == q.answer){
                    answerCount++
                    println("정답입니다.")
                }
                //val ifAlter = q.alternatives?.contains(myAnswer.toString()) == true
                else if(q.alternatives?.contains(myAnswer) == true) {
                    answerCount++
                    println("정답입니다.")
                }
                else {
                    println("오답입니다")
                }
            }
            else -> {}
        }

    }
    println("맞은 개수 : ${answerCount} / 총 문제 개수 : 5")

    val triple = myTriple(1,2.0,"Hello")

}