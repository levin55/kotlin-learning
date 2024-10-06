fun excludeChar(str:String,arr:Array<Char>):String {

    var start = str
    val tempArray = arrayOfNulls<Int>(20)
    var arrayIdx = 0
    var result = ""

    for(idx in 0..<arr.size) {
        for (i in 0..<start.length) {
            if (start[i] == arr[idx]) {
                tempArray[arrayIdx] = i
                arrayIdx++
            }
        }
    } // tempArray에 같은 문자가 있는 문자열의 인덱스를 0부터 순서대로 저장

    for(p in 0..<start.length) {
        if(p !in tempArray)  // 0,2,3중 하나가 있으면 추가x
           result += start[p] // 0,2,3번쨰 문자 중 해당되는게 아니면 결과값에 더하기
    }
    return result
}

fun main(args: Array<String>) {
    var str1 = excludeChar("Hello", arrayOf('H','l'))
    println(str1)
    var str2 = excludeChar("Hello world", arrayOf('H','w','o'))
    println(str2)
}