//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
fun main(args: Array<String>) {


    print("숫자 입력 : ")
    var num = readLine()!!.toInt()

    //var range = 1 .. num
    var numToOne = num downTo 1

    var oneToNum = numToOne.reversed()

    for(i in oneToNum)
        print("$i ")

    println("출발!")
}