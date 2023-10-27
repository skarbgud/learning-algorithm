fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var nums: List<Int> = readln().split(" ").map { it.toInt() }.sorted()
    println(nums[1])
}