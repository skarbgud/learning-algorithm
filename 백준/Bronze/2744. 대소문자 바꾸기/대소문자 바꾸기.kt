fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    var strArr = readln().toString().toList()
    for (str in strArr) {
        if (str.isLowerCase()) {
            print(str.uppercase())
        } else {
            print(str.lowercase())
        }
    }
}