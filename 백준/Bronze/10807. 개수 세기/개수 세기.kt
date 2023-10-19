fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val size = readln().toInt()
    val map = readln().split(" ").map { it.toInt() }
    var num = readln().toInt()
    var cnt = 0
    map.forEach {i -> if (i==num) cnt++}
    println(cnt)
}