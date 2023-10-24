fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var sum = 0
    for (i: Int in 1..5) {
        var score:Int = readln().toInt()
        if (score < 40) {
            score = 40
        }
        sum += score
    }
    println(sum/5)
}