package challenges.ch04

fun main(args: Array<String>) {
    val nums = arrayOf(7,5,7,8,9,1,2,3)
    var largest = nums[0]

    var idx = 0
    for(num in nums) {
        if(largest < nums[idx]) {
            largest = nums[idx]
        }
        idx++
    }

    println(largest)
}