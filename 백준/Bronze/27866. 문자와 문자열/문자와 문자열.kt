fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val str = readln()
    val position = readln().toInt()
    println(str[position-1])
}