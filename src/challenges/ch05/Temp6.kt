fun filterCount(vararg nums:Int,lam: (Int)->Boolean): Int {

    var count = 0
    for (num in nums) {
        if(lam(num) == true)
            count++
    }
    return count  // 조건에 부합하는 숫자의 갯수를 반환하도록 만들기
}
fun main(args: Array<String>) {
    var count1 = filterCount(1,2,3,4,5,6,7,8,9,10){
        (it % 2) == 0
    }
    println(count1)
    var count2 = filterCount(1,2,3,4,5,6,7,8,9,10){
        it >= 3
    }
    println(count2)
}