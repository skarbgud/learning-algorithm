fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var burgers = mutableListOf<Int>()
    var beverages = mutableListOf<Int>()
    for (i: Int in 0..2) {
        burgers.add(readln().toInt())
    }
    for (i: Int in 0..1) {
        beverages.add(readln().toInt())
    }
    println(burgers.min() + beverages.min() - 50)
}